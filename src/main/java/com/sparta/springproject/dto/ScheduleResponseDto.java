// ScheduleResponseDto.java
package com.sparta.springproject.dto;

import com.sparta.springproject.entity.Schedule;
import lombok.Getter;

@Getter
public class ScheduleResponseDto {
    private Long id;
    private String title;
    private String content;
    private String userName;
    private String password;
    private String date;

    public ScheduleResponseDto(Schedule schedule) {
        this.id = schedule.getId();
        this.title = schedule.getTitle();
        this.content = schedule.getContent();
        this.userName = schedule.getUserName();
        this.password = schedule.getPassword();
        this.date = schedule.getDate();
    }
}
