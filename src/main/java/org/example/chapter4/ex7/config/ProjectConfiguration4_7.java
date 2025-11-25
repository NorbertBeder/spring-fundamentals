package org.example.chapter4.ex7.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.example.chapter4.proxies", "org.example.chapter4.ex7.repositories",
                                "org.example.chapter4.ex7.services"})
public class ProjectConfiguration4_7 {
}
