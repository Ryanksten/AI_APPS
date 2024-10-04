package com.example.automation.service;

import org.openqa.selenium.WebDriver;

public abstract class AiWebsiteImpl implements AiWebsite {

    protected WebDriver webDriver;

    public AiWebsiteImpl(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    @Override
    public String sendPrompt(String prompt) {
        // General logic for sending a prompt
        return "";
    }
}
