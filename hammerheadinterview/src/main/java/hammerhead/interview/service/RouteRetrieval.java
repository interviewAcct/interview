package hammerhead.interview.service;

import hammerhead.interview.service.pojo.Routes;

public interface RouteRetrieval {

    Routes getRoutes();
    Routes retrieveRoutes(String id);
}
