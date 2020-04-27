package com.github.randomComparisons

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SomeTests {

    @Test
    internal fun `demo test`() {
        assertThat(SomeClass().add(1, 1)).isEqualTo(2);
    }
}
