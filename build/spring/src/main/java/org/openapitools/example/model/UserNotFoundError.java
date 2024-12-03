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
 * 対象のユーザが見つからない
 */

@Schema(name = "UserNotFoundError", description = "対象のユーザが見つからない")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-28T19:32:04.357025+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class UserNotFoundError {

  private String title = "User Not Found";

  private String detail = "ユーザが見つかりません";

  public UserNotFoundError() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UserNotFoundError(String title, String detail) {
    this.title = title;
    this.detail = detail;
  }

  public UserNotFoundError title(String title) {
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

  public UserNotFoundError detail(String detail) {
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
    UserNotFoundError userNotFoundError = (UserNotFoundError) o;
    return Objects.equals(this.title, userNotFoundError.title) &&
        Objects.equals(this.detail, userNotFoundError.detail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, detail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserNotFoundError {\n");
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

