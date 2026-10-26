
package com.portfolio;
import org.springframework.web.bind.annotation.*;
record Greet(String message){}
@RestController
public class HelloController{
  @GetMapping("/health") public String health(){ return "ok"; }
  @GetMapping("/greet/{name}") public Greet greet(@PathVariable String name){ return new Greet("Hello, "+name); }
}
