package hello.integration.oas.hello_docs_checker

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HelloDocsCheckerApplication

fun main(args: Array<String>) {
	runApplication<HelloDocsCheckerApplication>(*args)
}
