package com.example.study_org_server.service.meeting;

import com.example.study_org_server.repository.meeting.MeetingRecord;
import com.example.study_org_server.repository.meeting.MeetingRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)

class MeetingServiceTest {
    @InjectMocks
    private MeetingService meetingService;

    @Mock
    private MeetingRepository meetingRepository;


    @Test
    void findAllMeeting() {
        when(meetingRepository.findAllMeetings()).thenReturn(List.of
                (
                        new MeetingRecord(1L,"AAA","",1L,"0",null,null),
                        new MeetingRecord(2L,"AAA","",1L,"0",null,null),
                        new MeetingRecord(3L,"AAA","",1L,"0",null,null)
                ));
        Assertions.assertEquals(3,meetingService.findAllMeeting().size());
        verify(meetingRepository,times(1)).findAllMeetings();
    }

    @Test
    void findMeetingsByOpenerId() {
        when(meetingRepository.findMeetingsByOpenerId(anyInt())).thenReturn(List.of
                (
                        new MeetingRecord(1L,"AAA","",2L,"0",null,null)
                )
        );
        Assertions.assertEquals(1,meetingService.findMeetingsByOpenerId(1).size());
        verify(meetingRepository,times(1)).findMeetingsByOpenerId(1);
    }
}