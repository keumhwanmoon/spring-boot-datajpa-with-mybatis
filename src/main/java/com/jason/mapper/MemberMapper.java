package com.jason.mapper;

import com.jason.entity.Member;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author jason, Moon
 * @since 2016. 9. 2.
 */
@Mapper
public interface MemberMapper {
    String INSERT_QUERY= "INSERT INTO MEMBER (name) VALUES(#{name})";

    @Insert(INSERT_QUERY)
    void insertMember(Member member);
}
