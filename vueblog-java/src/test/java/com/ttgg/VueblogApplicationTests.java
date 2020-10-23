package com.ttgg;

import com.ttgg.entity.User;
import com.ttgg.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class VueblogApplicationTests {
    @Autowired
    private UserService userService;
    @Test
    void contextLoads() {
        User byId = userService.getById(1L);
        System.out.println(byId);
    }

}
