package com.bigdecimal.yorpat;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
@Import(TestcontainersConfiguration.class)
public class UserControllerIntegrationTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void givenEmailInGetUserRequestParam_responseShouldInlcudeUserAsJsonAnd200ok() throws Exception {
        mockMvc.perform(get("/user").param("by", "phone_number").param("value", "07043759865"))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json"))
                .andExpect(jsonPath("$.firstName").value("Phinehas"))
                .andExpect(jsonPath("$.lastName").value("Amos"))
                .andExpect(jsonPath("$.role").value("admin"))
                .andExpect(jsonPath("$.userIsLoggedIn").value(false));
    }
}
