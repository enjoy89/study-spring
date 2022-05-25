package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.order.AppConfig;

public class MemberApp {
    public static void main(String[] args) {
        // 회원 객체 생성 후 회원 가입 시킴
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        // 이미 가입된 회원을 찾아 동일한지 테스트
        Member findMember = memberService.findMember(1L);
        System.out.println("join member: " + member.getName());
        System.out.println("find member: " + findMember.getName());

    }
}
