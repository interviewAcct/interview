package hammerhead.interview.service;

import hammerhead.interview.service.pojo.Routes;
import java.util.List;
import java.util.stream.Collectors;

public class StravaRouteRetrievalService extends RouteRetrievalService{

    private final static String STRAVA_YAML_FILE = "hammerheadinterview/src/main/resources/StravaRoutes.yaml";

    public StravaRouteRetrievalService(){
        super(STRAVA_YAML_FILE);
    }

    public Routes retrieveRoutes(String id) {
        Routes routes = this.getRoutes();
        List<String> idRoutes = routes.getRoutes().stream().map(str-> id + str).collect(Collectors.toList());
        routes.setRoutes(idRoutes);
        return routes;
    }
}
