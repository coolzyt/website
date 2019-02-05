package org.yuntao.website;

import org.apache.catalina.webresources.StandardRoot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SpringBootApplication
@Controller
public class WebsiteApplication {
    @RequestMapping("/")
    public String root(HttpServletRequest request, HttpServletResponse response) {
        return "index.html";
    }

    @RequestMapping("/index")
    public String index(HttpServletRequest request, HttpServletResponse response) {
        return "index.html";
    }

    @RequestMapping("/test")
    public String test(HttpServletRequest request, HttpServletResponse response) {
        return "test.html";
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context= SpringApplication.run(WebsiteApplication.class, args);
    }

}

