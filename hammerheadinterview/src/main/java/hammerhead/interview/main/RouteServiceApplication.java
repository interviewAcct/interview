package hammerhead.interview.main;

import hammerhead.interview.service.RouteService;
import hammerhead.interview.validation.InputValidation;

public class RouteServiceApplication extends InputValidation{

    public static void main(String[] args){
        RouteService routeService = new RouteService();

        String appName = isValidAppChoice(args) ? args[0] : "";

        switch(appName.toLowerCase()) {
            case "allroutes":
                    routeService.printAllRoutes();
                    break;
            case "uniqueroutes":
                    routeService.printUniqueRoutes();
                    break;
            case "routesbyuser" :
                    if(isValidUserName(args)) {
                        routeService.printAllRoutesByUser(args[1]);
                    }
                    break;
            case "routesbyservice" :
                    String []serviceArray = retrieveValidServices(args);
                    if(isValidUserName(args) && serviceArray.length > 0) {
                        routeService.printAllRoutesByService(args[1], serviceArray);
                    }
                    break;
            default:
                    System.out.println("INVALID INPUT, PLEASE REFER TO README ON HOW TO CALL SERVICE");
        }
    }
}
