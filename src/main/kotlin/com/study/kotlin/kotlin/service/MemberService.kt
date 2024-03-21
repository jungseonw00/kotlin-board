package com.study.kotlin.kotlin.service

import com.study.kotlin.kotlin.entity.Member
import com.study.kotlin.kotlin.repository.MemberRepository
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Transactional
@Service
class MemberService(
    private var memberRepository: MemberRepository
) {

    fun save(member: Member): Member {
        val member = Member(name = member.name, age = member.age, gender = member.gender)
        return memberRepository.save(member);
    }
}