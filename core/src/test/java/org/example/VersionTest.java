package org.example;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class VersionTest {

  @Test
  void coreVersionIsNotNull() {
    assertThat(Version.id).isNotNull();
  }
}