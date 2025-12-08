package org.example.volume1.chapter4.ex7.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.example.volume1.chapter4.proxies", "org.example.volume1.chapter4.ex7.repositories",
                                "org.example.volume1.chapter4.ex7.services"})
public class ProjectConfiguration4_7 {
}
