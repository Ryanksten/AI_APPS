package com.example.automation.controller;

import com.example.automation.service.BlackBox;
import com.example.automation.service.ChatGptAiWebsite;
import com.example.automation.service.GeminiAiWebsite;
import com.example.automation.service.MetaAiWebsite;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ai")
public class AiAutomationController {

    @Autowired
    private WebDriver webDriver;
    
    @PostMapping("/send-prompt")
    public String sendPrompt(@RequestParam String website, @RequestParam String prompt) {
        String promptResponce = "";

        switch (website.toLowerCase()) {
            case "chatgpt":
                promptResponce = new ChatGptAiWebsite(webDriver).sendPrompt(prompt);
                break;
            case "blackbox":
                promptResponce = new BlackBox(webDriver).sendPrompt(prompt);
                break;
            case "gemini":
                promptResponce = new GeminiAiWebsite(webDriver).sendPrompt(prompt);
                break;
            case "metaai":
                promptResponce = new MetaAiWebsite(webDriver).sendPrompt(prompt);
                break;
            default:
                return "Website not supported!";
        }

        return "Response from " + website + ": " + promptResponce;
    }
}
