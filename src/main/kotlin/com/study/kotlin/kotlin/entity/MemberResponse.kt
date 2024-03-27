package com.study.kotlin.kotlin.entity

import lombok.Data

@Data
data class MemberResponse(
    val id: Long,
    val name: String,
    val age: Int,
) {
}