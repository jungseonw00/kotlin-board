package com.study.kotlin.kotlin.service

import com.study.kotlin.kotlin.entity.Member
import com.study.kotlin.kotlin.repository.MemberRepository
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Transactional
@Service
class MemberService(
    private val memberRepository: MemberRepository
) {

    fun save(name: String, age: Int, gender: String): Member {
        val member = Member(name = name, age = age, gender = gender)
        return memberRepository.save(member);
    }
}