package org.example.cicdtest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class CiCdTestApplicationTests {

    @Test
    void contextLoads() {
        assertThat(true).isTrue();
    }

}
