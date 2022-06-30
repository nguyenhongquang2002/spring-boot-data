package com.example.springdataboot;

import com.example.springdataboot.repository.AccountRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SpringdatabootApplication.class})
class SpringdatabootApplicationTests {

    @Autowired
    AccountRepository accountRepository;

    @Test
    public void testLinhTinh(){
        System.out.println("Hello");
    }

}
