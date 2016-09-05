package com.jason.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author jason, Moon
 * @since 2016. 9. 2.
 */
@Entity
@Getter
@NoArgsConstructor
public class Member {

    public Member(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    private Long id;

    private String name;
}
