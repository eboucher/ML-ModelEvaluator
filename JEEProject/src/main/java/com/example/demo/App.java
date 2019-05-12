package com.mastertheboss.springboot;

import java.util.List;

import com.mastertheboss.springboot.model.User;
import com.mastertheboss.springboot.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class App extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(applicationClass, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(applicationClass);
    }

    private static Class<App> applicationClass = App.class;
}

@RestController
@RequestMapping("/rest")
class HelloController {

    @Autowired
    private UserService userService;

    @RequestMapping("/find/{user}/{country}")
    String find(@PathVariable String user, @PathVariable String country) {

        return userService.getUser(user, country).toString();

    }

    @RequestMapping(value = "/findAll", headers = "Accept=application/json")
    List<User> findAll() {

        List<User> list = userService.findAll();
        return list;

    }

}