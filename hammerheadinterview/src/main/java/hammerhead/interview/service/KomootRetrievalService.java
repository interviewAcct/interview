package hammerhead.interview.service;

import hammerhead.interview.service.pojo.Routes;

import java.util.List;
import java.util.stream.Collectors;

public class KomootRetrievalService extends RouteRetrievalService{

    private final static String KOMOOT_YAML_FILE = "hammerheadinterview/src/main/resources/KomootRoutes.yaml";

    public KomootRetrievalService(){
        super(KOMOOT_YAML_FILE);
    }

    public Routes retrieveRoutes(String id) {
        Routes routes = super.getRoutes();
        List<String> idRoutes = routes.getRoutes().stream().map(str-> id + str + id).collect(Collectors.toList());
        routes.setRoutes(idRoutes);
        return routes;
    }
}
