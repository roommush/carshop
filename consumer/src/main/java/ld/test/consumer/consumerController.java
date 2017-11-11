package ld.test.consumer;

import ld.test.itemcenterapi.ItemService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.context.support.XmlWebApplicationContext;

/**
 * Created by ldong on 2017/5/26.
 */

@Controller
@RequestMapping("/")
public class consumerController {

    @RequestMapping("/hello")
    public String index() { return "indexConsumer";}

    @RequestMapping("/car")
    @ResponseBody
    public String getCar() {
     //   ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext();

        ApplicationContext ctx = new ClassPathXmlApplicationContext("consumer-mvc-dispatcher-servlet.xml");
        // 根据 Spring 配置中的Bean ID “item” 获取订阅到的服务
        final ItemService itemService = ( ItemService ) ctx.getBean( "item" );
        // 调用服务 ItemService 的 getItemById 方法
        System.out.println("itemService.getItemById" + itemService.getItemById( 1111 ) );
        // 调用服务 ItemService 的 getItemByName 方法
        System.out.println("itemService.getItemByName" + itemService.getItemByName( "myname is le" ) );

        return itemService.toString() +  ": " + itemService.getItemById( 1111 ).toString();
    }

}
