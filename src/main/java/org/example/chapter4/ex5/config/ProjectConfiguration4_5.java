package org.example.chapter4.ex5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.example.chapter4.ex5.proxy", "org.example.chapter4.repositories",
                                "org.example.chapter4.proxies", "org.example.chapter4.services"})
public class ProjectConfiguration4_5 {
}
