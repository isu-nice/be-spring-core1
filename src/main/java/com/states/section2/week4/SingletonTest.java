package com.states.section2.week4;

import com.states.section2.week4.member.MemberService;

public class SingletonTest {
    static DependencyConfig config = new DependencyConfig();

    static MemberService memberService1 = config.memberService();
    static MemberService memberService2 = config.memberService();

    public static void main(String[] args) {
        System.out.println("memberService1 = " + memberService1);
        System.out.println("memberService2 = " + memberService2);
    }
}
