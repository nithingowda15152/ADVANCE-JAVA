package com.first;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.first") // specify package name for scanning
public class MyConfig {

    // bean definitions (if needed)

}