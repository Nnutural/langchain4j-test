package com.example.langchain4j_test.controller;

import dev.langchain4j.model.chat.ChatLanguageModel;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.Resource;

public class LowApiController {
    // @Resource(name = "doubao")
    // private ChatModel chatModelDoubao;

    private final ChatLanguageModel chatModel;

    // 使用 @Qualifier 注入名为 "doubao" 的 ChatModel Bean
    public ChatController(@Qualifier("doubao") ChatLanguageModel chatModel) {
        this.chatModel = chatModel;
    }

    @GetMapping("/chat")
    public String chat(@RequestParam(value = "message", defaultValue = "Hello, what is LangChain4j?") String message) {
        // 调用 LLM 并返回结果
        return chatModel.generate(message);
    }
}