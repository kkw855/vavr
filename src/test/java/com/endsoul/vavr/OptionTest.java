package com.endsoul.vavr;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.vavr.control.Option;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class OptionTest {
  @Test
  @DisplayName("생성")
  void of() {
    assertEquals(Option.of(null), Option.none());
    assertEquals(Option.of(10), Option.some(10));
  }
}
