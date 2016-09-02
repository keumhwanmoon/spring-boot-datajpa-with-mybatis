package com.jason.controller;

import com.jason.entity.Member;
import com.jason.entity.mybatis.MemberMapper;
import com.jason.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author jason, Moon
 * @since 2016. 9. 2.
 */
@Controller
public class MemberController {
    @Autowired
    private MemberMapper memberMapper;

    @Autowired
    private MemberRepository memberRepository;

    @RequestMapping(value = "/members")
    @ResponseBody
    public List<Member> findMembers() {
        return memberMapper.findMember();
    }

    @RequestMapping(value = "/m/insert")
    @ResponseBody
    public Member insert() {
        Member member = new Member(1L, "멤버1");
        memberMapper.insertMember(member);
        return member;
    }

    @RequestMapping(value = "/j/insert")
    @ResponseBody
    public Member insertj() {
        Member member = new Member(2L, "멤버2");
        memberRepository.save(member);
        return member;
    }
}
