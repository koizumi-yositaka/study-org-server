package com.example.study_org_server.repository;

import com.example.study_org_server.repository.meeting.MeetingRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

@MybatisTest
public class MeetingRepositoryTest {
    @Autowired
    private MeetingRepository meetingRepository;

    @Test
    public void findAllMeeting_ShouldReturnAll(){
        Assertions.assertEquals(3,meetingRepository.findAllMeetings().size());
    }


    @Test
    public void findMeetingsByOpenerId_ShouldReturnAll(){
        Assertions.assertEquals(1,meetingRepository.findMeetingsByOpenerId(1).size());
    }

    @Test
    public void findMeetingById_ShouldReturn(){
        Assertions.assertTrue(meetingRepository.findMeetingById(1).isPresent());
        Assertions.assertTrue(meetingRepository.findMeetingById(4).isEmpty());
    }
}
