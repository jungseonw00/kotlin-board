package com.study.kotlin.kotlin.service;

import com.study.kotlin.kotlin.entity.Member;
import com.study.kotlin.kotlin.repository.MemberRepository;
import jakarta.transaction.Transactional;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Transactional
@Service
@RequiredArgsConstructor
public class JavaMemberService {
	private final MemberRepository memberRepository;

	public List<MemberResponse> findAll() {
		return memberRepository.findAll().stream().map(MemberResponse::new).toList();
	}

	@Data
	static class MemberResponse {
		private Long id;
		private String name;
		private int age;

		public MemberResponse(Member member) {
			this.id = member.getId();
			this.name = member.getName();
			this.age = member.getAge();
		}
	}
}
