// ScheduleController.java
package com.sparta.springproject.controller;

import com.sparta.springproject.dto.ScheduleRequestDto;
import com.sparta.springproject.dto.ScheduleResponseDto;
import com.sparta.springproject.entity.Schedule;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ScheduleController {

    private final Map<Long, Schedule> scheduleList = new HashMap<>();

    // 일정을 추가하는 api
    @PostMapping("/schedules")
    public ScheduleResponseDto createSchedule(@RequestBody ScheduleRequestDto requestDto) {
        // 요청 받은 데이터를 기반으로 Schedule 객체 생성
        Schedule schedule = new Schedule(requestDto);
        // 일정에 일정 고유번호 부여
        Long maxId = scheduleList.size() > 0 ? Collections.max(scheduleList.keySet()) + 1 : 1;
        schedule.setId(maxId);
        // 일정 추가
        scheduleList.put(schedule.getId(), schedule);
        return new ScheduleResponseDto(schedule);
    }

    // 전체 일정 조회 API
    @GetMapping("/schedules")
    public List<ScheduleResponseDto> getSchedules() {
        return scheduleList.values().stream()
                .map(ScheduleResponseDto::new).toList();
    }
}
