package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

  @GetMapping("/hello")
  public String getCoreVersion() {
    return "core module version id is : %s".formatted(Version.id);
  }
}
