package com.study.kotlin.kotlin.repository

import com.study.kotlin.kotlin.entity.Member
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface MemberRepository : JpaRepository<Member?, Long?> {
}