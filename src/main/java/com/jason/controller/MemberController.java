package com.jason.controller;

import com.jason.entity.Member;
import com.jason.entity.mybatis.MemberMapper;
import com.jason.repository.MemberRepository;
import org.apache.ibatis.session.SqlSession;
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

    @Autowired
    private SqlSession sqlSession;

    @RequestMapping(value = "/m/members")
    @ResponseBody
    public List<Member> findMembers() {
        return sqlSession.selectList("Member.selectList");
    }

    @RequestMapping(value = "/mx/members")
    @ResponseBody
    public List<Member> findMembersXML() {
        return memberMapper.findMember();
    }

    @RequestMapping(value = "/j/members")
    @ResponseBody
    public List<Member> findMemberJPA() {
        return memberRepository.findAll();
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
