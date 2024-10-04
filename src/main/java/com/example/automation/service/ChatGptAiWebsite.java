package com.example.automation.service;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ChatGptAiWebsite extends AiWebsiteImpl {

    private WebDriverWait wait;

    public ChatGptAiWebsite(WebDriver webDriver) {
        super(webDriver);
        // Initialize WebDriverWait with a 10-second timeout
        this.wait = new WebDriverWait(webDriver, Duration.ofSeconds(50));
    }

    @Override
    public String sendPrompt(String prompt) {
        // Navigate to ChatGPT web page
        webDriver.get("https://chat.openai.com/");

        // Wait for the input field to be visible before interacting with it
        WebElement inputField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"prompt-textarea\"]/p")));
        inputField.sendKeys(prompt);
        String promptResponce = "hello";
        promptResponce=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/main/div/div[2]/div/div/div[1]/div/div/div[2]"))).getText();
        System.out.println(promptResponce);
        //html/body/div[2]/main/div/div[2]/div/div/div[1]/div/div/div[2]/div
        //html/body/div[2]/main/div/div[2]/div/div/div[1]/div/div/div[4]/div[1]
        return promptResponce;
        
    }
}
