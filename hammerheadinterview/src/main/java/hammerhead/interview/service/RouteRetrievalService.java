package hammerhead.interview.service;

import hammerhead.interview.service.pojo.Routes;
import hammerhead.interview.service.mapper.YamlMapper;

public abstract class RouteRetrievalService implements RouteRetrieval {

    private YamlMapper yamlMapper;
    private Routes routes;

    public RouteRetrievalService(String yamlFile){
        yamlMapper = new YamlMapper();
        routes = yamlMapper.mapRoutes(yamlFile);
    }

    public Routes getRoutes() {
        return routes;
    }
}
