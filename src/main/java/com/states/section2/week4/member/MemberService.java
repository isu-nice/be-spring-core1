package com.states.section2.week4.member;

public class MemberService {
    private final MemberRepository memberRepository = new MemberRepository();

    public void createMember(Member member) {
        memberRepository.postMember(member);
    }

    public Member getMember(Long memberId) {
        return memberRepository.getMember(memberId);
    }

    public void deleteMember(Long memberId) {
        memberRepository.deleteMember(memberId);
    }
}
