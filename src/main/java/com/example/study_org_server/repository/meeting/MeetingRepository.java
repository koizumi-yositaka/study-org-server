package com.example.study_org_server.repository.meeting;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.openapitools.example.model.MeetingResponseDTOList;

import java.util.List;

@Mapper
public interface MeetingRepository {
    @Select("SELECT * FROM T_MEETING WHERE delete_flg != '1'")
    List<MeetingRecord> findAllMeeting();
}
