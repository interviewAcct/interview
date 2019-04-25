package hammerhead.interview.main;

import hammerhead.interview.service.RouteService;

import java.util.Arrays;

public class RouteServiceApplication {

    public static void main(String[] args){
        RouteService routeService = new RouteService();

        System.out.print("All routes: ");
        routeService.printAllRoutes();

        System.out.print("Unique routes: ");
        routeService.printUniqueRoutes();

        System.out.print("For user 42: ");
        routeService.printAllRoutesByUser("42");

        System.out.print("For user 42 services ");
        routeService.printAllRoutesByService("42", "Komoot", "RWGPS");
    }
}
