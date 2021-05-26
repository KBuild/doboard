package kr.kbuild.bootstrap.backend.service

import kr.kbuild.bootstrap.backend.model.User
import kr.kbuild.bootstrap.backend.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository: UserRepository) {
    fun findById(id: Long) = userRepository.findById(id).orElse(null)
    fun findAll() = userRepository.findAll()
    fun save(user: User) = userRepository.save(user)
    fun delete(id: Long) = userRepository.deleteById(id)
}