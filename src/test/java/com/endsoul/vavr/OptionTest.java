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

  @Test
  void map() {
    assertEquals(Option.of(1).map(v -> v * 10).map(v -> v + 5), Option.some(15));
    assertEquals(
        Option.of("foo").flatMap(s -> Option.of((String) null)).map(s -> s.toUpperCase() + "bar"),
        Option.none());
  }
}
