package hammerhead.interview.service;

import hammerhead.interview.service.hammerhead.interview.routes.service.factory.RouteRetrievalFactory;
import hammerhead.interview.service.pojo.Routes;
import hammerhead.interview.service.constants.RouteServiceEnum;

import java.util.*;

public class RouteService {

    private RouteRetrievalFactory routeRetrievalFactory;
    public RouteService(){
        this.routeRetrievalFactory = new RouteRetrievalFactory();
    }

    public void printAllRoutes(){
        List<String> completeRouteList = new ArrayList<>();

        for(RouteServiceEnum route: RouteServiceEnum.values()){
            RouteRetrieval routeRetrieval = routeRetrievalFactory.retrieveService(route);
            Routes routes = routeRetrieval.retrieveRoutes();
            completeRouteList.addAll(routes.getRoutes());
        }

        System.out.println(completeRouteList);
    }

    public void printUniqueRoutes(){
        Set<String> completeRouteList = new HashSet<>();

        for(RouteServiceEnum route: RouteServiceEnum.values()){
            RouteRetrieval routeRetrieval = routeRetrievalFactory.retrieveService(route);
            Routes routes = routeRetrieval.retrieveRoutes();
            completeRouteList.addAll(routes.getRoutes());
        }

        System.out.println(completeRouteList);
    }

    public void printAllRoutesByUser(String id){
        List<String> completeRouteList = new ArrayList<>();

        for(RouteServiceEnum route: RouteServiceEnum.values()){
            RouteRetrieval routeRetrieval = routeRetrievalFactory.retrieveService(route);
            Routes routes = routeRetrieval.retrieveRoutes(id);
            completeRouteList.addAll(routes.getRoutes());
        }

        System.out.println(completeRouteList);
    }

    public void printAllRoutesByService(String id, String ... services){
        List<String> completeRouteList = new ArrayList<>();

        for(String str: services) {
            RouteServiceEnum routeServiceEnum = RouteServiceEnum.valueOf(str.toUpperCase());
            RouteRetrieval routeRetrieval = routeRetrievalFactory.retrieveService(routeServiceEnum);
            Routes routes = routeRetrieval.retrieveRoutes(id);
            completeRouteList.addAll(routes.getRoutes());
        }

        System.out.print(Arrays.toString(services));
        System.out.println(completeRouteList);
    }
}
