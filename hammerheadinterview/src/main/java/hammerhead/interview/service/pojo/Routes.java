package hammerhead.interview.service.pojo;

import java.util.ArrayList;
import java.util.List;

public class Routes {

    private List<String> routes;

    public Routes(){
        this.routes = new ArrayList<String>();
    }

    public void setRoutes(List<String> routes){
        this.routes = routes;
    }

    public List<String> getRoutes(){
        return this.routes;
    }
}
