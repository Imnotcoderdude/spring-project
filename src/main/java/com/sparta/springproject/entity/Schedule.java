// Schedule.java
package com.sparta.springproject.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Schedule {
    private Long id;
    private String title;
    private String content;
    private String userName;
    private String password;
    private String date;

    public Schedule(String title, String content, String userName, String password, String date) {
        this.title = title;
        this.content = content;
        this.userName = userName;
        this.password = password;
        this.date = date;
    }
}
