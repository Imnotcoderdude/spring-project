package com.sparta.springproject.dto;

import com.sparta.springproject.entity.Schedule;
import lombok.Getter;

@Getter
public class ScheduleResponseDto {
    private String title;
    private String content;
    private String userName;
    private String date;
    private Long passWord;

    public ScheduleResponseDto(Schedule schedule) {
        this.title = schedule.getTitle();
        this.content = schedule.getContent();
        this.userName = schedule.getUserName();
        this.date = schedule.getDate();
        this.passWord = schedule.getPassWord();
    }
}
