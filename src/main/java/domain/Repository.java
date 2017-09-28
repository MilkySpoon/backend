package domain;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import service.DataResource;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by keisogaw on 2017/09/10.
 */

@Component("repository")
public class Repository {

    // APIのURL
    private final String url = "";
    // RestTemplate
    private final RestTemplate rest = new RestTemplate();

    /**
     * APIを叩く
     * @return
     */
    private ResponseEntity<String> getInstagramAPI() {
        String endpoint = url;
        return rest.exchange(endpoint, HttpMethod.GET, null, String.class);
    }

    /**
     * 全件取得
     * @return
     */
    public List<DataResource> getAll() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<DataResource> dataResources = mapper.readValue(new File("UserData.json"), new TypeReference<List<DataResource>>() {});
        return dataResources;
    }

}