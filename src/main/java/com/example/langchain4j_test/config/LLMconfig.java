package com.example.langchain4j_test.config;

import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.openai.OpenAiChatModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class LLMConfig
{
    @Value("${llm.doubao.api-key}" )
    private String apiKey;

    @Value("${llm.doubao.model-name}")
    private String modelName;

    @Value("${llm.doubao.base-url}")
    private String baseUrl;

    @Bean(name = "doubao")
    public ChatModel Doubao()
    {
        return OpenAiChatModel.builder()
                .apiKey(System.getenv(apikey)) // model id
                .modelName(modelName)
                .baseUrl(baseUrl)
                .build();
    }
}