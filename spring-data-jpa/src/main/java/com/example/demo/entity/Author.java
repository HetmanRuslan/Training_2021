package com.example.demo.entity;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "Author")
@Table(name = "author,")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idauthor;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String surname;
    @Column(nullable = false)
    private String birthday;
    @Column(nullable = false)
    private String sex;

    public Author(String name, String surname, String birthday, String sex) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.sex = sex;
    }

    public long getIdauthor() {
        return idauthor;
    }

    public void setIdauthor(long idauthor) {
        this.idauthor = idauthor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Author{" +
                "idauthor=" + idauthor +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthday=" + birthday +
                ", sex='" + sex + '\'' +
                '}';
    }
}
