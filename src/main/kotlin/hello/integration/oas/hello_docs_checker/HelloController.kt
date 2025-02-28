package hello.integration.oas.hello_docs_checker

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {
    @GetMapping("/2/hello")
    fun hello(): String {
        return "Hello, world!"
    }
}
