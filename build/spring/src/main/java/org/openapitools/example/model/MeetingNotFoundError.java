package org.openapitools.example.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * 対象のMeetingが見つからない
 */

@Schema(name = "MeetingNotFoundError", description = "対象のMeetingが見つからない")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-28T19:32:04.357025+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class MeetingNotFoundError {

  private String title = "Meeting Not Found";

  private String detail = "ユーザが見つかりません";

  public MeetingNotFoundError() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MeetingNotFoundError(String title, String detail) {
    this.title = title;
    this.detail = detail;
  }

  public MeetingNotFoundError title(String title) {
    this.title = title;
    return this;
  }

  /**
   * エラーのタイプ
   * @return title
   */
  @NotNull 
  @Schema(name = "title", description = "エラーのタイプ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public MeetingNotFoundError detail(String detail) {
    this.detail = detail;
    return this;
  }

  /**
   * エラーの詳細
   * @return detail
   */
  @NotNull 
  @Schema(name = "detail", description = "エラーの詳細", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("detail")
  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeetingNotFoundError meetingNotFoundError = (MeetingNotFoundError) o;
    return Objects.equals(this.title, meetingNotFoundError.title) &&
        Objects.equals(this.detail, meetingNotFoundError.detail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, detail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeetingNotFoundError {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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

