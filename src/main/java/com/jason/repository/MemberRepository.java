package com.jason.repository;

import com.jason.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author jason, Moon
 * @since 2016. 9. 2.
 */
@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}
