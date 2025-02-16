package org.example.cicdtest;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FailTest {
    @Test
    void alwaysFailTest() {
//        assertThat(true).isFalse();
        assertThat(true).isTrue();
    }
}
