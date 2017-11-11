package ld.test.itemcenter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ldong on 2017/5/26.
 */

@Controller
@RequestMapping("/")
public class ItemCenterController {

    @RequestMapping("/hello")
    public String index() { return "indexItemCenter";}
}
