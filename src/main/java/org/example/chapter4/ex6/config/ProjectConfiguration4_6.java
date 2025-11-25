package org.example.chapter4.ex6.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.example.chapter4.ex6.proxy", "org.example.chapter4.repositories",
                                "org.example.chapter4.proxies", "org.example.chapter4.ex6.service"})
public class ProjectConfiguration4_6 {
}
