package kr.kbuild.bootstrap.backend.service

import org.springframework.security.crypto.argon2.Argon2PasswordEncoder
import kr.kbuild.bootstrap.backend.model.User
import kr.kbuild.bootstrap.backend.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository: UserRepository) {
    fun findById(id: Long) = userRepository.findById(id).orElse(null)
    fun findAll() = userRepository.findAll()
    fun save(user: User) {
        val encoder = Argon2PasswordEncoder()
        val secureUser = user.copy(password = encoder.encode(user.password))
        userRepository.save(secureUser)
    } 
    fun delete(id: Long) = userRepository.deleteById(id)
}