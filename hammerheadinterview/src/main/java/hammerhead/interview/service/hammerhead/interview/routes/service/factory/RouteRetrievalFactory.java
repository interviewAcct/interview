package hammerhead.interview.service.hammerhead.interview.routes.service.factory;

import hammerhead.interview.service.KomootRouteRetrievalService;
import hammerhead.interview.service.RWGPSRouteRetrievalService;
import hammerhead.interview.service.RouteRetrieval;
import hammerhead.interview.service.StravaRouteRetrievalService;
import hammerhead.interview.service.constants.RouteServiceEnum;

public class RouteRetrievalFactory {

    public RouteRetrieval retrieveService(RouteServiceEnum routeServiceEnum){
        RouteRetrieval routeRetrieval = null;

        switch (routeServiceEnum) {
            case RWGPS:
                routeRetrieval = new RWGPSRouteRetrievalService();
                break;
            case KOMOOT:
                routeRetrieval = new KomootRouteRetrievalService();
                break;
            case STRAVA:
                routeRetrieval = new StravaRouteRetrievalService();
                break;
        }

        return routeRetrieval;
    }

}
