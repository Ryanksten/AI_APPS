package com.example.automation.service;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MetaAiWebsite extends AiWebsiteImpl {

    public MetaAiWebsite(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    public String sendPrompt(String prompt) {
        webDriver.get("https://ai.meta.com/");
        // Implement Meta AI-specific prompt logic
         String promptResponce = "hello";
        //promptResponce=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/main/div/div[2]/div/div/div[1]/div/div/div[2]"))).getText();
        System.out.println(promptResponce);
        //html/body/div[2]/main/div/div[2]/div/div/div[1]/div/div/div[2]/div
        //html/body/div[2]/main/div/div[2]/div/div/div[1]/div/div/div[4]/div[1]
        return promptResponce;
    }
}
