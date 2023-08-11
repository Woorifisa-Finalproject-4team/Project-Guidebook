package com.example.backend.api;

import com.example.backend.repository.CalcualteRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
@WebMvcTest
class AddControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CalcualteRepository calcualteRepository;
    @Test
    @DisplayName("/toy/add 요청 시 num1+num2값의 결과를 전송한다.")
    void test() throws Exception {

        int expectResult = 3;
        mockMvc.perform(MockMvcRequestBuilders.post("/toy/add")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"num1\":\"1\",\"num2\":\"2\"}")
                )
                .andExpect(status().isCreated())
                .andDo(print());
    }


}