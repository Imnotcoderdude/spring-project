package com.sparta.springproject.dto;

import lombok.Getter;

@Getter
public class ScheduleRequestDto {
    private String title;
    private String content;
    private String userName;
    private String date;
    private Long passWord;
}
