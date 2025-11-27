package org.example.volume1.chapter4.ex5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.example.volume1.chapter4.ex5.proxy", "org.example.volume1.chapter4.repositories",
                                "org.example.volume1.chapter4.proxies", "org.example.volume1.chapter4.services"})
public class ProjectConfiguration4_5 {
}
