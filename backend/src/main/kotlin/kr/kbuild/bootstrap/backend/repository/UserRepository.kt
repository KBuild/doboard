package kr.kbuild.bootstrap.backend.repository

import kr.kbuild.bootstrap.backend.model.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<User, Long>