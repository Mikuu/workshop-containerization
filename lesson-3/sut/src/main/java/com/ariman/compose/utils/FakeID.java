package com.ariman.compose.utils;

import java.util.UUID;

public class FakeID {
  public static String getFakeUUID() {
    return UUID.randomUUID().toString().replace("-", "");
  }
}
