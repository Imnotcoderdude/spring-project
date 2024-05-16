package com.sparta.springproject.entity;

import com.sparta.springproject.dto.ScheduleRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Schedule {
    private String title;
    private String content;
    private String userName;
    private String date;
    private Long passWord;

    public Schedule(ScheduleRequestDto requestDto) {
        this.title = requestDto.getTitle();
        this.content = requestDto.getContent();
        this.userName = requestDto.getUserName();
        this.date = requestDto.getDate();
        this.passWord = requestDto.getPassWord();
    }
}
