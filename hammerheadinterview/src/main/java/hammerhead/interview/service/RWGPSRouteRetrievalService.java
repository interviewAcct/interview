package hammerhead.interview.service;

import hammerhead.interview.service.pojo.Routes;
import hammerhead.interview.service.mapper.YamlMapper;

import java.util.List;
import java.util.stream.Collectors;

public class RWGPSRouteRetrievalService implements RouteRetrieval{

    private YamlMapper yamlMapper;
    private final String yamlFile = "hammerheadinterview/src/main/resources/RWGPSRoutes.yaml";

    public RWGPSRouteRetrievalService(){
        this.yamlMapper = new YamlMapper();
    }

    public Routes retrieveRoutes() {
        return yamlMapper.mapRoutes(yamlFile);
    }

    public Routes retrieveRoutes(String id) {
        Routes routes = yamlMapper.mapRoutes(yamlFile);
        List<String> idRoutes = routes.getRoutes().stream().map(str->str + id).collect(Collectors.toList());
        routes.setRoutes(idRoutes);
        return routes;
    }
}
