
package com.portfolio;
import org.junit.jupiter.api.Test;import static org.assertj.core.api.Assertions.*;
import org.springframework.boot.test.context.SpringBootTest;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.boot.test.web.client.TestRestTemplate;import org.springframework.http.ResponseEntity;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HelloControllerTest{
 @Autowired TestRestTemplate rest;
 @Test void health(){ ResponseEntity<String> r = rest.getForEntity("/health", String.class); assertThat(r.getBody()).contains("ok"); }
}
