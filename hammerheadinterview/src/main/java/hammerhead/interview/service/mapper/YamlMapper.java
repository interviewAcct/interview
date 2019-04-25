package hammerhead.interview.service.mapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import hammerhead.interview.service.pojo.Routes;

import java.io.File;
import java.io.IOException;

public class YamlMapper {

    public Routes mapRoutes(String yamlFile) {
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        Routes routes = new Routes();

        try {
            routes = mapper.readValue(new File(yamlFile), Routes.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return routes;
    }
}
