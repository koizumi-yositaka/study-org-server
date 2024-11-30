package com.example.study_org_server.repository;

import com.example.study_org_server.exception.MeetingNotFoundException;
import com.example.study_org_server.repository.meeting.MeetingRecord;
import com.example.study_org_server.repository.meeting.MeetingRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.Optional;

@MybatisTest
public class MeetingRepositoryTest {

    static LocalDateTime time_1 =LocalDateTime.of(2020,12,23,12,0);
    static LocalDateTime time_2 =LocalDateTime.of(2020,12,24,12,0);
    static LocalDateTime time_3 =LocalDateTime.of(2020,12,25,12,0);


    private static MeetingRecord meetingRecord_1 = new MeetingRecord(null,"TITLE_1","DETAIL_1",1L,time_1,30,"0" );
    private static MeetingRecord meetingRecord_2 = new MeetingRecord(null,"TITLE_2","DETAIL_2",1L,time_2,30,"0" );
    private static MeetingRecord meetingRecord_3 = new MeetingRecord(null,"TITLE_3","DETAIL_3",1L,time_3,30,"0");

    @Autowired
    private MeetingRepository meetingRepository;

    @Test
    public void findAllMeeting_ShouldReturnAll(){
        Assertions.assertEquals(5,meetingRepository.findAllMeetings().size());
    }


    @Test
    public void findMeetingsByOpenerId_ShouldReturnAll(){
        Assertions.assertEquals(2,meetingRepository.findMeetingsByOpenerId(1).size());
    }

    @Test
    public void findMeetingById_ShouldReturn(){
        Assertions.assertTrue(meetingRepository.findMeetingById(1).isPresent());
        Assertions.assertTrue(meetingRepository.findMeetingById(100).isEmpty());
    }
    //create
    @Test
    public void create_ShouldSuccess(){
        var currentMeetings= meetingRepository.findAllMeetings();
        int currentSize =currentMeetings.size();
        meetingRepository.create(meetingRecord_1);
        var afterInsertData= meetingRepository.findAllMeetings();
        Assertions.assertEquals(currentSize +1,afterInsertData.size());
        var lastData = afterInsertData.get(afterInsertData.size()-1);
        Assertions.assertEquals(meetingRecord_1.title(),lastData.title());
    }


    //delete
    @Test
    public void delete_ShouldSuccess(){
        var currentMeetings= meetingRepository.findAllMeetings();
        int currentSize =currentMeetings.size();
        if(currentSize >0){
            meetingRepository.deleteMeetingById(currentMeetings.get(currentSize-1).id());
        }else{
            Assertions.fail();
        }
        Assertions.assertEquals(currentSize-1,meetingRepository.findAllMeetings().size());
    }

    //update
    @Test
    public void put_shouldSuccess(){
        MeetingRecord firstElem =meetingRepository.findAllMeetings().stream().findFirst().orElseThrow(()-> new MeetingNotFoundException(""));
        int targetId=firstElem.id();
        meetingRepository.update(targetId,meetingRecord_2);
        MeetingRecord changedRecord = meetingRepository.findMeetingById(targetId).orElseThrow(()->new MeetingNotFoundException(""));
        Assertions.assertEquals(meetingRecord_2.title(),changedRecord.title());
        Assertions.assertEquals(meetingRecord_2.detail(),changedRecord.detail());

    }
    //update
    @Test
    public void put_partUpdate_shouldSuccess(){
        MeetingRecord firstElem =meetingRepository.findAllMeetings().stream().findFirst().orElseThrow(()-> new MeetingNotFoundException(""));
        int targetId=firstElem.id();
        MeetingRecord record = new MeetingRecord(targetId,"title_Changed",null,2L,time_3,30,"0",null,null);
        meetingRepository.update(targetId,record);
        MeetingRecord changedRecord = meetingRepository.findMeetingById(targetId).orElseThrow(()->new MeetingNotFoundException(""));
        Assertions.assertEquals(record.title(),changedRecord.title());
        Assertions.assertEquals(firstElem.detail(),changedRecord.detail());

    }


}
