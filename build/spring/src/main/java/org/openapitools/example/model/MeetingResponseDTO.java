package org.openapitools.example.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ミーティングの結果情報
 */

@Schema(name = "MeetingResponseDTO", description = "ミーティングの結果情報")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-02T20:56:31.515614+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class MeetingResponseDTO {

  private Integer id;

  private String title;

  private String detail;

  private Long openerId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate eventDate;

  private String startTime;

  private String endTime;

  public MeetingResponseDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MeetingResponseDTO(Integer id, String title, String detail, Long openerId, LocalDate eventDate, String startTime, String endTime) {
    this.id = id;
    this.title = title;
    this.detail = detail;
    this.openerId = openerId;
    this.eventDate = eventDate;
    this.startTime = startTime;
    this.endTime = endTime;
  }

  public MeetingResponseDTO id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * ID
   * @return id
   */
  @NotNull 
  @Schema(name = "id", description = "ID", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public MeetingResponseDTO title(String title) {
    this.title = title;
    return this;
  }

  /**
   * title
   * @return title
   */
  @NotNull 
  @Schema(name = "title", description = "title", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public MeetingResponseDTO detail(String detail) {
    this.detail = detail;
    return this;
  }

  /**
   * detail
   * @return detail
   */
  @NotNull 
  @Schema(name = "detail", description = "detail", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("detail")
  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public MeetingResponseDTO openerId(Long openerId) {
    this.openerId = openerId;
    return this;
  }

  /**
   * 開催者ID
   * @return openerId
   */
  @NotNull 
  @Schema(name = "openerId", description = "開催者ID", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("openerId")
  public Long getOpenerId() {
    return openerId;
  }

  public void setOpenerId(Long openerId) {
    this.openerId = openerId;
  }

  public MeetingResponseDTO eventDate(LocalDate eventDate) {
    this.eventDate = eventDate;
    return this;
  }

  /**
   * 開催日
   * @return eventDate
   */
  @NotNull @Valid 
  @Schema(name = "eventDate", example = "Fri Jul 21 09:00:00 JST 2017", description = "開催日", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("eventDate")
  public LocalDate getEventDate() {
    return eventDate;
  }

  public void setEventDate(LocalDate eventDate) {
    this.eventDate = eventDate;
  }

  public MeetingResponseDTO startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * 開始時間
   * @return startTime
   */
  @NotNull 
  @Schema(name = "startTime", example = "1700", description = "開始時間", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("startTime")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public MeetingResponseDTO endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * 終了時間
   * @return endTime
   */
  @NotNull 
  @Schema(name = "endTime", example = "1800", description = "終了時間", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("endTime")
  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeetingResponseDTO meetingResponseDTO = (MeetingResponseDTO) o;
    return Objects.equals(this.id, meetingResponseDTO.id) &&
        Objects.equals(this.title, meetingResponseDTO.title) &&
        Objects.equals(this.detail, meetingResponseDTO.detail) &&
        Objects.equals(this.openerId, meetingResponseDTO.openerId) &&
        Objects.equals(this.eventDate, meetingResponseDTO.eventDate) &&
        Objects.equals(this.startTime, meetingResponseDTO.startTime) &&
        Objects.equals(this.endTime, meetingResponseDTO.endTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, detail, openerId, eventDate, startTime, endTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeetingResponseDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    openerId: ").append(toIndentedString(openerId)).append("\n");
    sb.append("    eventDate: ").append(toIndentedString(eventDate)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

