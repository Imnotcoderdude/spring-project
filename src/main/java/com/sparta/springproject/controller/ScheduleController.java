package com.sparta.springproject.controller;

import com.sparta.springproject.dto.ScheduleRequestDto;
import com.sparta.springproject.dto.ScheduleResponseDto;
import com.sparta.springproject.entity.Schedule;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api")
public class ScheduleController {
    // Map 자료구조를 사용해서 일정을 관리함.
    private final Map<Long, Schedule> ScheduleList = new HashMap<>();

    // createSchedule 메소드 제작.
    @PostMapping("/schedules")
    public ScheduleResponseDto createSchedule(@RequestBody ScheduleRequestDto requestDto) {
        Schedule schedule = new Schedule(requestDto);
        // id 값으로 일정을 구분하기 위해 maxId값을 찾아야함.
        // ScheduleList의 값이 아무것도 없다면 1부터 시작하고 만약 존재한다면 마지막 값의 +1을 하여라
        Long maxId = ScheduleList.size() > 0 ? Collections.max(ScheduleList.keySet()) + 1 : 1;
        // id에다가 maxId 저장
        schedule.setPassWord(maxId);
        // 데이터베이스에 저장
        ScheduleList.put(schedule.getPassWord(), schedule);

        // entity를 바로 저장하는 것이 아닌 responseDto로 전환
        ScheduleResponseDto ScheduleResponseDto = new ScheduleResponseDto(schedule);
        return ScheduleResponseDto;
    }
    // 제대로 저장됐는지 조회하는 api
    @GetMapping("/schedules")
    public List<ScheduleResponseDto> getSchedule() {
        List<ScheduleResponseDto> responseList = ScheduleList.values().stream().map(ScheduleResponseDto::new).toList();
        return responseList;
    }
}
