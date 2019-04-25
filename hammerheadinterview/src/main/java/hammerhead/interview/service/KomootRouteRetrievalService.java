package hammerhead.interview.service;

import hammerhead.interview.service.pojo.Routes;
import hammerhead.interview.service.mapper.YamlMapper;

import java.util.List;
import java.util.stream.Collectors;

public class KomootRouteRetrievalService implements RouteRetrieval{

    private YamlMapper yamlMapper;
    private static final String yamlFile = "hammerheadinterview/src/main/resources/KomootRoutes.yaml";

    public KomootRouteRetrievalService(){
        this.yamlMapper = new YamlMapper();
    }

    public Routes retrieveRoutes() {
        Routes routes = yamlMapper.mapRoutes(yamlFile);
        return routes;
    }

    public Routes retrieveRoutes(String id) {
        Routes routes = yamlMapper.mapRoutes(yamlFile);
        List<String> idRoutes = routes.getRoutes().stream().map(str-> id + str + id).collect(Collectors.toList());
        routes.setRoutes(idRoutes);
        return routes;
    }
}
