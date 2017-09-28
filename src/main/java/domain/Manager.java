package domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import service.DataResource;

import java.io.IOException;
import java.util.List;

/**
 * Created by keisogaw on 2017/09/10.
 */

@Component("manager")
public class Manager {

    @Autowired
    private Repository repository;

    /**
     * 全件取得
     * @return
     */
    public List<DataResource> getAll() throws IOException {
        List<DataResource> dataResources = repository.getAll();
        return dataResources;
    }
}
