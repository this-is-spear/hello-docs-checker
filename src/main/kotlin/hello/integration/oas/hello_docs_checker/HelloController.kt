package hello.integration.oas.hello_docs_checker

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {
    @GetMapping("/v1/hello")
    fun hello(): String {
        return "Hello, world!"
    }

    @GetMapping("/v2/hello")
    fun hello2(): String {
        return "Hello, developer!"
    }
}
