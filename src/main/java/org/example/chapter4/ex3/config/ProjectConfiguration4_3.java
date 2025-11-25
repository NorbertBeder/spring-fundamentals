package org.example.chapter4.ex3.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.example.chapter4.ex3.service", "org.example.chapter4.repositories",
                                "org.example.chapter4.proxies"})
public class ProjectConfiguration4_3 {
}
