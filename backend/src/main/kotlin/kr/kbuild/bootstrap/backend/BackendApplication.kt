package kr.kbuild.bootstrap.backend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.KotlinVersion

@SpringBootApplication
@RestController
class BackendApplication {
	@GetMapping("/")
	fun getHello(): String {
	return "Kotlin Version: ${kotlin.KotlinVersion.CURRENT}"
	}
}

fun main(args: Array<String>) {
	runApplication<BackendApplication>(*args)
}
