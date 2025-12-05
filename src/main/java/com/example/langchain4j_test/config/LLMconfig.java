package com.example.langchain4j_test.config;

import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.openai.OpenAiChatModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class LLMConfig
{
    @Bean(name = "doubao")
    public ChatModel chatModelDoubao()
    {
        return OpenAiChatModel.builder()
                .apiKey(System.getenv("doubao-seed-1-6-lite-251015")) // model id
                .modelName("Doubao-Seed-1.6-lite")
                    .baseUrl("https://ark.cn-beijing.volces.com/api/v3/")
                    .build();
    }
}