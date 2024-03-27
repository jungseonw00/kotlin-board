package com.study.kotlin.kotlin.service

import com.study.kotlin.kotlin.entity.Member
import com.study.kotlin.kotlin.entity.MemberResponse
import com.study.kotlin.kotlin.repository.MemberRepository
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service
import java.util.function.Function

@Transactional
@Service
class MemberService(
    private val memberRepository: MemberRepository
)