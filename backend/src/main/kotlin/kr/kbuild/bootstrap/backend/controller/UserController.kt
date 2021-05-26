package kr.kbuild.bootstrap.backend.controller

import kr.kbuild.bootstrap.backend.model.User
import kr.kbuild.bootstrap.backend.service.UserService
import org.springframework.web.bind.annotation.*

@RestController
class UserController(private val userService: UserService) {
    @GetMapping("/users")
    @ResponseBody
    fun index() = userService.findAll()

    @PostMapping("/users")
    fun create(@RequestBody user: User) = userService.save(user)
}