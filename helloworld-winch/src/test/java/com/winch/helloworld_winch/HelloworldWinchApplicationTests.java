package com.winch.helloworld_winch;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloworldWinchApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
    public void helloWorldTest() throws Exception {
        mockMvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello World!"));

}
