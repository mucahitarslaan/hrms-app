package com.mucahitarslan.hrms.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mucahitarslan.hrms.dto.request.RegisterRequest;
import com.mucahitarslan.hrms.dto.response.AuthenticationResponse;
import com.mucahitarslan.hrms.service.concretes.AuthenticationService;
import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Test;


import static org.mockito.Mockito.*;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.client.RequestMatcher;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher.*;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

@SpringBootTest
@AutoConfigureMockMvc
class AuthenticationControllerTest {

    @MockBean
    private AuthenticationService service;

    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    MockMvc mockMvc;

    @Test
    void itShouldRegister_WhenValidRegisterRequestBody() throws Exception {
        RegisterRequest request = new RegisterRequest(
                "mucahit@gmail.com",
                "123321"
        );

        AuthenticationResponse response = new AuthenticationResponse();
        response.setToken("1111111");

        when(service.register(request))
                .thenReturn(response);

            mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/auth/register")
                .contentType(MediaType.APPLICATION_JSON)
                .content(serializeJson(request)))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(any());

    }
    private String serializeJson(Object object) throws JsonProcessingException{
        return objectMapper.writeValueAsString(object);
    }


}