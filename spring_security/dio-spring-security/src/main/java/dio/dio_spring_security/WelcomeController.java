package dio.dio_spring_security;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping
    public String welcome() {
        return "Welcome to y Spring Boot WEB API";
    }

    @GetMapping("/users")
    @PreAuthorize("hasAnyRole('MANAGERS', 'users')")
    public String users() {

        return "Autorized user";
    }

    @GetMapping("/managers")
    @PreAuthorize("hasRole('MANAGERS')")
    public String managers() {
        return "Autorized manager";
    }

}
