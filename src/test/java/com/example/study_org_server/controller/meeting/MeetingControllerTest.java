package com.example.study_org_server.controller.meeting;

import com.example.study_org_server.security.SecurityConfig;
import com.example.study_org_server.security.service.AuthService;
import com.example.study_org_server.service.meeting.MeetingService;
import com.example.study_org_server.service.user.UserService;
import com.example.study_org_server.util.JwtUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.openapitools.example.model.MeetingForm;
import org.openapitools.example.model.MeetingResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.time.LocalDateTime;
import java.util.List;

import static com.example.study_org_server.util.TestUtil.asJsonString;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

@WebMvcTest(controllers = MeetingController.class)
@ExtendWith(MockitoExtension.class)
@Import(SecurityConfig.class)
class MeetingControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private ObjectMapper objectMapper;

    @MockBean
    private MeetingService meetingService;
    @MockBean
    private AuthService authService;
    @MockBean
    private UserService userService;
    @MockBean
    private JwtUtil jwtUtil;
    @MockBean
    private PasswordEncoder passwordEncoder;

    private static MeetingForm createMeeting;
    private final static String title="TITLE";
    private final static String detail="DETAIL";
    private final static Long openerId=1L;
    private final static Integer duration =30;
    private final static LocalDateTime datatime_1=LocalDateTime.of(2020,12,23,12,0);


    @BeforeAll
    public static void setup(){
        createMeeting = new MeetingForm();
        createMeeting.setTitle(title);
        createMeeting.setDetail(title);
        createMeeting.setOpenerId(openerId);
        createMeeting.setEventDate(datatime_1);
        createMeeting.setDurationMinutes(duration);

    }

    @Test
    @WithMockUser
    void meetingGet() throws Exception{
        List<MeetingResponseDTO> meetings = List.of(new MeetingResponseDTO(1,"X"));
        when(meetingService.findAllMeeting()).thenReturn(meetings);
        // Act & Assert
        mockMvc.perform(get("/meeting")
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk());
//                .andExpect(MockMvcResultMatchers.jsonPath("$.name").value("Table"));
    }

    @Test
    @WithMockUser
    void meetingPost() throws Exception{
        List<MeetingResponseDTO> meetings = List.of(new MeetingResponseDTO(1,"X"));
        doNothing().when(meetingService).reserveMeeting(any(MeetingForm.class));
        // Act & Assert
        mockMvc.perform(post("/meeting")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(asJsonString(createMeeting))
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isCreated());
//                .andExpect(MockMvcResultMatchers.jsonPath("$.name").value("Table"));
    }
    @Test
    @WithMockUser
    void meetingDelete() throws Exception{
        doReturn(new MeetingResponseDTO()).when(meetingService).findMeetingById(anyInt());
        doNothing().when(meetingService).deleteMeetingById(anyInt());
        // Act & Assert
        mockMvc.perform(delete("/meeting/1")
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isNoContent());
//                .andExpect(MockMvcResultMatchers.jsonPath("$.name").value("Table"));
        verify(meetingService,times(1)).deleteMeetingById(1);
    }

    @Test
    @WithMockUser
    void meetingDetailGet() throws Exception{
        var meetingResponse = new MeetingResponseDTO(1,"TITLE");
        doReturn(meetingResponse).when(meetingService).findMeetingById(anyInt());
        // Act & Assert
        mockMvc.perform(get("/meeting/1")
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
               .andExpect(MockMvcResultMatchers.jsonPath("$.title").value("TITLE"));
    }

    @Test
    @WithMockUser
    void meetingMeetingIdPut_ShouldSuccess() throws Exception{


        doReturn(new MeetingResponseDTO()).doReturn(new MeetingResponseDTO(1,"TITLE2"))
                .when(meetingService).findMeetingById(anyInt());
        doNothing().when(meetingService).updateMeeting(anyInt(),any(MeetingForm.class));
        mockMvc.perform(put("/meeting/1")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(asJsonString(createMeeting))
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.title").value("TITLE2"));

    }

}