package com.states.section2.week4;

import com.states.section2.week4.coffee.CoffeeRepository;
import com.states.section2.week4.coffee.CoffeeService;
import com.states.section2.week4.member.MemberRepository;
import com.states.section2.week4.member.MemberService;

public class DependencyConfig {
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    public MemberRepository memberRepository() {
        return new MemberRepository();
    }

    public CoffeeService coffeeService() {
        return new CoffeeService(coffeeRepository());
    }

    public CoffeeRepository coffeeRepository() {
        return new CoffeeRepository();
    }
}
