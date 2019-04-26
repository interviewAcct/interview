package hammerhead.interview.service.constants;

public enum ApplicationServices {
    ALLROUTES("ALLROUTES"),
    UNIQUEROUTES("UNIQUEROUTES"),
    ROUTEBYUSER("ROUTESBYUSER"),
    ROUTESBYSERVICE("ROUTESBYSERVICE");

    private final String serviceName;

    ApplicationServices(String routesbyservice) {
        this.serviceName = routesbyservice;
    }

    public boolean equals(String str){
        return this.serviceName.equals(str);
    }
}
