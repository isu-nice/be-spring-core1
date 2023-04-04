package com.states.section2.week4.member;

public class MemberTest {
    public static void main(String[] args) {
        MemberService memberService = new MemberService();

        Member member = new Member(0L, "lucky@codestates.com", "Kimlucky", "010-1234-5678");
        memberService.createMember(member);

        Member currentMember = memberService.getMember(0L);

        System.out.println("회원가입한 유저 : " + member.getName());
        System.out.println("현재 첫번쨰 유저 : " + currentMember.getName());

        if (member.getName().equals(currentMember.getName())) {
            System.out.println("새롭게 가입한 사용자와 현재 사용자가 같습니다.");
        }

        memberService.deleteMember(0L);

        if (memberService.getMember(0L) == null) {
            System.out.println("회원 삭제가 정상적으로 완료되었습니다.");
        }

    }
}
