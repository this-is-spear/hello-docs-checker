package hello.integration.oas.hello_docs_checker

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v2")
class V2HelloController {
    @GetMapping("/hello")
    fun hello2(): String {
        return "Hello, world!"
    }
}
