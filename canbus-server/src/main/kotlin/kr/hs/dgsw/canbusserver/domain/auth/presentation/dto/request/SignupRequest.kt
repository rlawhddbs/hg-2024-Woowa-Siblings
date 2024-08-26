package kr.hs.dgsw.canbusserver.domain.auth.presentation.dto.request

import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Pattern

class SignupRequest(

    @field:Pattern(
        regexp = "^[a-zA-Z](?:[a-zA-Z\\d]{1,14})?$",
        message = "아이디가 올바르지 않아요 (영문 + 숫자 포함 1 ~ 14자)"
    )
    val identifier: String,

    @field:Pattern(
        regexp = "^(?=.*[A-Za-z])(?=.*\\d)([A-Za-z\\d@#$%^&+=!?*~]+){8,}$",
        message = "비밀번호가 올바르지 않아요 (영문 + 숫자 포함 8자 이상)"
    )
    val password: String,

    @field:Pattern(
        regexp = "^[^ ]{1,15}$",
        message = "닉네임이 올바르지 않아요 (1자 ~ 15자)"
    )
    val nickname: String,

    @field:Email(message = "올바른 형식의 이메일이여야 해요")
    val email: String,

)