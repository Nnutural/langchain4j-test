package com.example.langchain4j_test.config;

import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.openai.OpenAiChatModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LLMConfig {

    @Value("${llm.doubao.api-key:${DOUBAO_API_KEY:}}")
    private String apiKey;

    @Value("${llm.doubao.model-name:${DOUBAO_MODEL_NAME:}}")
    private String modelName;

    @Value("${llm.doubao.base-url:https://ark.cn-beijing.volces.com/api/v3}")
    private String baseUrl;

    @Bean(name = "doubao")
    public ChatModel doubao() {
        return OpenAiChatModel.builder()
                .apiKey(apiKey)
                .modelName(modelName)
                .baseUrl(baseUrl)
                .build();
    }
}
