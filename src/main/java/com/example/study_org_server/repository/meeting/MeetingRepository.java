package com.example.study_org_server.repository.meeting;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;

@Mapper
public interface MeetingRepository {
    @Select("SELECT * FROM T_MEETING WHERE delete_flg != '1'")
    List<MeetingRecord> findAllMeetings();

    @Select("SELECT * FROM T_MEETING WHERE id=#{id} and delete_flg != '1'")
    Optional<MeetingRecord> findMeetingById(int id);

    @Select("SELECT * FROM T_MEETING WHERE opener_id=#{openerId} and delete_flg != '1'")
    List<MeetingRecord> findMeetingsByOpenerId(int openerId);

}
