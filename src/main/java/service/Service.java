package service;

import domain.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

/**
 * Created by keisogaw on 2017/09/10.
 */

@RestController
@RequestMapping("service")
public class Service {

    @Autowired
    @Qualifier("manager")
    private Manager manager;

    /**
     * 全件取得
     * @return
     */
    @RequestMapping(value = "/input", method = RequestMethod.POST, produces = "application/json")
    public List<DataResource> getUserData() throws IOException {
        List<DataResource> dataResources = manager.getAll();
        return dataResources;
    }
}
