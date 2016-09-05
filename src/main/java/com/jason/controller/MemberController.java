package com.jason.controller;

import com.jason.entity.Member;
import com.jason.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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
    MemberService memberService;

    @RequestMapping
    @ResponseBody
    public List<Member> findMembers() {
        return memberService.findMembers();
    }

    @RequestMapping(value = "/{name}")
    @ResponseBody
    public List<Member> findMembers(@PathVariable("name") String name) {
        return memberService.findMembers(name);
    }

    @RequestMapping(value = "/insertMember")
    @ResponseBody
    public void saveMember() throws Exception {

        Member member = new Member("멤버1");

        memberService.insertMember(member);
    }

    @RequestMapping(value = "/saveMember")
    @ResponseBody
    public Member insertMember() {
        Member member = new Member("멤버2");

        memberService.saveMember(member);

        return member;
    }
}
