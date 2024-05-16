// ScheduleRequestDto.java
package com.sparta.springproject.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ScheduleRequestDto {
    private String title;
    private String content;
    private String userName;
    private String password;
    private String date;
}
