package hammerhead.interview.service;

import hammerhead.interview.service.pojo.Routes;
import hammerhead.interview.service.mapper.YamlMapper;

import java.util.List;
import java.util.stream.Collectors;

public class StravaRouteRetrievalService implements RouteRetrieval{

    private YamlMapper yamlMapper;
    private String yamlFile = "hammerheadinterview/src/main/resources/StravaRoutes.yaml";

    public StravaRouteRetrievalService(){
        this.yamlMapper = new YamlMapper();
    }

    public Routes retrieveRoutes() {
        Routes routes = yamlMapper.mapRoutes(yamlFile);
        return routes;
    }

    public Routes retrieveRoutes(String id) {
        Routes routes = yamlMapper.mapRoutes(yamlFile);
        List<String> idRoutes = routes.getRoutes().stream().map(str-> id + str).collect(Collectors.toList());
        routes.setRoutes(idRoutes);
        return routes;
    }
}
