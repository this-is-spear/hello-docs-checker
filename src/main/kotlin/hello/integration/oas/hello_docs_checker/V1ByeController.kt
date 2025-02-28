package hello.integration.oas.hello_docs_checker

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1")
class V1ByeController {
    @GetMapping("/bye")
    fun hello2(): String {
        return "Bye, developer!"
    }
}
