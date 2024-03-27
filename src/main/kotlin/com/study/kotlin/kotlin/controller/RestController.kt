package com.study.kotlin.kotlin.controller

import com.study.kotlin.kotlin.entity.Member
import com.study.kotlin.kotlin.repository.MemberRepository
import com.study.kotlin.kotlin.service.MemberService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class RestController (
    private val memberService: MemberService,
    private val memberRepository: MemberRepository
) {

    @GetMapping("/hello")
    fun hello(): String {
        return "hello kotlin"
    }
}