import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

public class greetingControllerTests {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testGreeting() {
        ResponseEntity<String> response = restTemplate.getForEntity("/greeting", String.class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals("Hello, World!", response.getBody());
    }

    public void testGreetingWithName() {
        ResponseEntity<String> response = restTemplate.getForEntity("/greeting?name=John", String.class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals("Hello, John!", response.getBody());
    }
}
