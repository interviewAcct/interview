package hammerhead.interview.main;

import hammerhead.interview.service.RouteService;

import java.util.Arrays;

public class RouteServiceApplication {

    public static void main(String[] args){
        RouteService routeService = new RouteService();

        switch(args[0].toLowerCase()) {
            case "allroutes":
                routeService.printAllRoutes();
                break;
            case "uniqueroutes":
                routeService.printUniqueRoutes();
                break;
            case "routesbyuser" :
                routeService.printAllRoutesByUser(args[1]);
                break;
            case "routesbyservice" :
                routeService.printAllRoutesByService(args[1], Arrays.copyOfRange(args, 2, args.length));
                break;
        }
    }
}
