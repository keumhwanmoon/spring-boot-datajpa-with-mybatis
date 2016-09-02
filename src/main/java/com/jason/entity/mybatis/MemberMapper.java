package com.jason.entity.mybatis;

import com.jason.entity.Member;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author jason, Moon
 * @since 2016. 9. 2.
 */
@Mapper
public interface MemberMapper {
    @Select("Select * from Member")
    List<Member> findMember();

    @Insert("Insert into Member values (#{id}, #{name})")
    void insertMember(Member member);
}
