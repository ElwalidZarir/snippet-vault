package org.com.snippetvault

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SnippetVaultApplication

fun main(args: Array<String>) {
	runApplication<SnippetVaultApplication>(*args)
}
