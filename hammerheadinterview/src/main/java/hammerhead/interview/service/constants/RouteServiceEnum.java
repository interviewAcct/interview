package hammerhead.interview.service.constants;

import hammerhead.interview.service.*;

public enum RouteServiceEnum {


    STRAVA {
        public RouteRetrieval create(){
            return new StravaRouteRetrievalService();
        }
    },
    KOMOOT {
        public RouteRetrieval create() {
            return new KomootRetrievalService();
        }
    },
    RWGPS {
        public RouteRetrieval create() {
            return new RWGPSRouteRetrievalService();
        }
    };

    public RouteRetrieval create() {
        return null;
    }

    public RouteRetrieval getInstance() {
        return this.create();
    }

}
