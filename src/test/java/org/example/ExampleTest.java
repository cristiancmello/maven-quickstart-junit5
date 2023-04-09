package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

/**
 * Unit Test example.
 */
public class ExampleTest {
    @Test
    void verifySum() {
        assertThat(Main.sum(2, 1)).isEqualTo(3);
    }
}
