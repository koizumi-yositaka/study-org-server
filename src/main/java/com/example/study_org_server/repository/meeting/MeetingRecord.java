package com.example.study_org_server.repository.meeting;

import java.sql.Timestamp;


public record MeetingRecord(
        Long id,
        String title,
        String detail,
        Long openerId,
        String deleteFlg,
        Timestamp createdAt,
        Timestamp updatedAt
) {
}
