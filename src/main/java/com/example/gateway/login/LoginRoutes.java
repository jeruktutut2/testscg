package com.example.gateway.login;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gateway.webflux.ProxyExchange;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@Configuration
@RestController
public class LoginRoutes {

    @Value("${demo.host}")
    private String demoHost;

    @Value("${demo.port}")
    private String demoPort;

    @RequestMapping(method = RequestMethod.GET, value = "test")
    public Mono<ResponseEntity<byte[]>> getTest(ProxyExchange<byte[]> proxy) throws Exception {
        return proxy.uri("http://"+demoHost+":"+demoPort+"/test").get();
    }

    @RequestMapping(method = RequestMethod.GET, value = "home")
    public Mono<ResponseEntity<byte[]>> home(ProxyExchange<byte[]> proxy) throws Exception {
        return proxy.uri("http://"+demoHost+":"+demoPort+"/home").get();
    }

}
