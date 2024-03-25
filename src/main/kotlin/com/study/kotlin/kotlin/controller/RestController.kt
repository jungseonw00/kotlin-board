package com.study.kotlin.kotlin.controller

import com.study.kotlin.kotlin.entity.Member
import com.study.kotlin.kotlin.repository.MemberRepository
import com.study.kotlin.kotlin.service.MemberService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class RestController (
    private var memberService: MemberService
) {

    @GetMapping("/hello")
    fun hello(): Member {
        val member = Member(name = "seonwoo_jung", age = 20, gender = "남자")
        return memberService.save(member.name, member.age, member.gender)
    }
}