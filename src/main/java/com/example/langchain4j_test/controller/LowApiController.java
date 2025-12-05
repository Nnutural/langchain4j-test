package com.example.langchain4j_test.controller;

import dev.langchain4j.model.chat.ChatModel;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chat")
public class LowApiController {

    private final ChatModel chatModel;

    // 使用 @Qualifier 注入名为 "doubao" 的 ChatModel Bean
    public LowApiController(@Qualifier("doubao") ChatModel chatModel) {
        this.chatModel = chatModel;
    }

    @GetMapping
    public String chat(@RequestParam(value = "message", defaultValue = "Hello, what is LangChain4j?") String message) {
        return chatModel.chat(message);
    }
}
