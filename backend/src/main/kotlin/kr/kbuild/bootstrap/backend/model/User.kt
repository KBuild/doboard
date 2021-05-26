package kr.kbuild.bootstrap.backend.model

import java.io.Serializable
import javax.persistence.*

@Entity
@Table(name = "user")
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,
    @Column(name = "name", nullable = false)
    var name: String = "",
    @Column(name = "password", nullable = false)
    var password: String = ""
) : Serializable