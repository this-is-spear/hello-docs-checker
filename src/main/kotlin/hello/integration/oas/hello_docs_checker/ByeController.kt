package hello.integration.oas.hello_docs_checker

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ByeController {
    @GetMapping("/v1/bye")
    fun hello2(): String {
        return "Bye, developer!"
    }
}
