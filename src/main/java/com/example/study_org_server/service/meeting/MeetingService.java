package com.example.study_org_server.service.meeting;

import com.example.study_org_server.repository.meeting.MeetingRepository;
import lombok.RequiredArgsConstructor;
import org.openapitools.example.model.MeetingResponseDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MeetingService {
    private final MeetingRepository meetingRepository;

    public List<MeetingResponseDTO> findAllMeeting(){
//        MeetingResponseDTOList meetings=
//        return meetings.map(x -> new MeetingResponseDTO(x.id(),x.title())).toList();
        return meetingRepository.findAllMeetings().stream().map(x -> new MeetingResponseDTO(x.id(), x.title())).toList();
    }

    public List<MeetingResponseDTO> findMeetingsByOpenerId(int openerId){
        return meetingRepository.findMeetingsByOpenerId(openerId).stream().map(x -> new MeetingResponseDTO(x.id(), x.title())).toList();
    }

    public MeetingResponseDTO findMeetingById(int id){
        return meetingRepository.findMeetingById(id).map(record -> new MeetingResponseDTO(record.id(), record.title())).orElseThrow(()-> new RuntimeException(""));
    }

}
