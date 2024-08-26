package kr.hs.dgsw.canbusserver.domain.user

import jakarta.persistence.*

@Entity
@Table(name = "user")
class User(

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    val identifier: String,

    val password: String,

    val email: String,

    val nickname: String,

    val profileImage: String? = null,

)
