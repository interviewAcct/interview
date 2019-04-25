package hammerhead.interview.service;

import hammerhead.interview.service.pojo.Routes;

public interface RouteRetrieval {

    Routes retrieveRoutes();
    Routes retrieveRoutes(String id);
}
