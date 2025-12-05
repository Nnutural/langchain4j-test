package com.example.langchain4j_test.config;

import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.openai.OpenAiChatModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class LLMConfig
{
    @Bean(name = "doubao")
    public ChatModel Doubao()
    {
        return OpenAiChatModel.builder()
                .apiKey(System.getenv("5cf34f76-814f-49ee-b84a-3515620ae78b")) // model id
                .modelName("Doubao-Seed-1.6-lite")
                .baseUrl("https://ark.cn-beijing.volces.com/api/v3/")
                .build();
    }
}