package org.example.volume1.chapter4.ex2.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.example.volume1.chapter4.ex2.service", "org.example.volume1.chapter4.repositories",
                                "org.example.volume1.chapter4.proxies"})
public class ProjectConfiguration4_2 {
}
