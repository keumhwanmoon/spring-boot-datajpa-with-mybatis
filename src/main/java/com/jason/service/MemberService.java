package com.jason.service;

import com.jason.entity.Member;
import com.jason.mapper.MemberMapper;
import com.jason.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jason, Moon
 * @since 2016. 9. 5.
 */
@Service
public class MemberService {

    @Autowired
    MemberRepository repository;

    @Autowired
    MemberMapper mapper;

    public List<Member> findMembers() {
        return repository.findAll();
    }

    public Member saveMember(Member member) {
        return repository.save(member);
    }

    public void insertMember(Member member) {
        mapper.insertMember(member);
    }
}
