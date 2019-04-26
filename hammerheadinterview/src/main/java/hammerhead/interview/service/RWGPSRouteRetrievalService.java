package hammerhead.interview.service;

import hammerhead.interview.service.pojo.Routes;
import java.util.List;
import java.util.stream.Collectors;

public class RWGPSRouteRetrievalService extends RouteRetrievalService{

    private final static String RWGPS_YAML_FILE = "hammerheadinterview/src/main/resources/RWGPSRoutes.yaml";

    public RWGPSRouteRetrievalService(){
        super(RWGPS_YAML_FILE);
    }

    public Routes retrieveRoutes(String id) {
        Routes routes = this.getRoutes();
        List<String> idRoutes = routes.getRoutes().stream().map(str->str + id).collect(Collectors.toList());
        routes.setRoutes(idRoutes);
        return routes;
    }
}
