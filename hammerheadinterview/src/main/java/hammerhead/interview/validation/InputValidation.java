package hammerhead.interview.validation;

import hammerhead.interview.service.constants.ApplicationServices;
import hammerhead.interview.service.constants.RouteServiceEnum;

import java.util.HashSet;
import java.util.Set;

public class InputValidation {

    public static boolean isValidAppChoice(String[] args){
        if(args.length == 0 || args[0].isEmpty()) {
            return false;
        }

        boolean isValidService = false;
        String service = args[0].toUpperCase();

        for(ApplicationServices appService : ApplicationServices.values()) {
            isValidService = appService.equals(service);
            if(isValidService) {
                break;
            }
        }

        return isValidService;
    }

    public static boolean isValidUserName(String[] args){
        if(args.length < 2 || args[1].trim().isEmpty()) {
            System.out.println("INVALID USERNAME GIVEN, COULD NOT EXECUTE");
            return false;
        }
        return true;
    }

    public static String[] retrieveValidServices(String[] args){
        if(args.length < 3) {
            System.out.println("NO SERVICES GIVEN, COULD NOT EXECUTE");
            return new String[0];
        }

        Set<String> uniqueService = new HashSet<>();

        for(int i = 2; i < args.length; i++) {
            try {
                RouteServiceEnum.valueOf(args[i].toUpperCase());
                uniqueService.add(args[i]);
            } catch (IllegalArgumentException ex) {
                System.out.println("IGNORING INVALID SERVICE NAME " + args[i]);
            }
        }

        String[] retArray = new String[uniqueService.size()];

        return uniqueService.toArray(retArray);
    }
}
