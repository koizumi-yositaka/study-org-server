package com.example.study_org_server.service.meeting;

import com.example.study_org_server.repository.meeting.MeetingRecord;
import com.example.study_org_server.repository.meeting.MeetingRepository;
import lombok.RequiredArgsConstructor;
import org.openapitools.example.model.MeetingResponseDTO;
import org.openapitools.example.model.MeetingResponseDTOList;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MeetingService {
    private final MeetingRepository meetingRepository;

    public List<MeetingResponseDTO> findAllMeeting(){
//        MeetingResponseDTOList meetings=
//        return meetings.map(x -> new MeetingResponseDTO(x.id(),x.title())).toList();
        return meetingRepository.findAllMeeting().stream().map(x -> new MeetingResponseDTO(x.id(), x.title())).toList();
    }

}
