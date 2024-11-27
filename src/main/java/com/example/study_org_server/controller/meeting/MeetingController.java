package com.example.study_org_server.controller.meeting;

import com.example.study_org_server.controller.MeetingApi;
import com.example.study_org_server.service.meeting.MeetingService;
import lombok.RequiredArgsConstructor;
import org.openapitools.example.model.MeetingResponseDTO;
import org.openapitools.example.model.MeetingResponseDTOList;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class MeetingController implements MeetingApi {
    private final MeetingService meetingService;
//    @Override
//    public ResponseEntity<MeetingResponseDTO> meetingGet() {
//        List<MeetingResponseDTO> meetings = meetingService.findAllMeeting();
//        return ResponseEntity.ok().body(meetings).;
//    }


    @Override
    public ResponseEntity<MeetingResponseDTOList> meetingGet() {
        List<MeetingResponseDTO> meetings = meetingService.findAllMeeting();
        return ResponseEntity.ok().body(new MeetingResponseDTOList(meetings));
    }
}
