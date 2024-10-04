package com.example.automation.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SeleniumConfig {

    @Bean
    public WebDriver webDriver() {
        // Set the path to the ChromeDriver binary
        System.setProperty("webdriver.chrome.driver", "C:\\VS CODE PROJECTS\\Chromedriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        return new ChromeDriver();
    }
}
