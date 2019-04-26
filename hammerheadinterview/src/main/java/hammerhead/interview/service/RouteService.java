package hammerhead.interview.service;

import hammerhead.interview.service.pojo.Routes;
import hammerhead.interview.service.constants.RouteServiceEnum;

import java.util.*;

public class RouteService {

    public void printAllRoutes(){
        System.out.print("All routes: ");
        List<String> completeRouteList = new ArrayList<>();

        for(RouteServiceEnum route: RouteServiceEnum.values()){
            RouteRetrieval routeRetrieval = route.getInstance();
            Routes routes = routeRetrieval.getRoutes();
            completeRouteList.addAll(routes.getRoutes());
        }

        System.out.println(completeRouteList);
    }

    public void printUniqueRoutes(){
        Set<String> completeRouteList = new HashSet<>();
        System.out.print("Unique routes: ");
        for(RouteServiceEnum route: RouteServiceEnum.values()){
            RouteRetrieval routeRetrieval = route.getInstance();
            Routes routes = routeRetrieval.getRoutes();
            completeRouteList.addAll(routes.getRoutes());
        }

        System.out.println(completeRouteList);
    }

    public void printAllRoutesByUser(String id){
        List<String> completeRouteList = new ArrayList<>();

        System.out.print("For user " + id + ": ");
        for(RouteServiceEnum route: RouteServiceEnum.values()){
            RouteRetrieval routeRetrieval = route.getInstance();
            Routes routes = routeRetrieval.retrieveRoutes(id);
            completeRouteList.addAll(routes.getRoutes());
        }

        System.out.println(completeRouteList);
    }

    public void printAllRoutesByService(String id, String ... services){
        List<String> completeRouteList = new ArrayList<>();

        System.out.print("For user " + id + " services ");
        for(String str: services) {
            RouteServiceEnum routeServiceEnum = RouteServiceEnum.valueOf(str.toUpperCase());
            RouteRetrieval routeRetrieval = routeServiceEnum.getInstance();
            Routes routes = routeRetrieval.retrieveRoutes(id);
            completeRouteList.addAll(routes.getRoutes());
        }

        System.out.print(Arrays.toString(services));
        System.out.println(completeRouteList);
    }
}
