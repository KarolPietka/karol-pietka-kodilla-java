package com.kodilla.stream.forumUser;

import java.time.LocalDate;
import java.time.Year;

public class ForumUser {
    private final int userId;
    private final String user;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int posts;

    public ForumUser(final int userId, final String user, final char sex, final int yearOfBirth, final int monthOfBirth, final int dayOfBirth, final int posts) {
        this.userId = userId;
        this.user = user;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.posts = posts;
    }

    public int getUserId() {
        return userId;
    }

    public String getUser() {
        return user;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPosts() {
        return posts;
    }

    public int getAge() {
        return LocalDate.now().getYear()-getDateOfBirth().getYear();
    }



    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", user='" + user + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", posts=" + posts +
                '}';
    }
}
