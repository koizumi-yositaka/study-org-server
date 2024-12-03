package org.openapitools.example.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.example.model.InvalidParam;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * 不正リクエスト
 */

@Schema(name = "BadRequestError", description = "不正リクエスト")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-02T20:56:31.515614+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class BadRequestError {

  private String title = "BadRequest";

  private String detail = "リクエストが不正です。再度リクエストを送信してください";

  @Valid
  private List<@Valid InvalidParam> invalidParams = new ArrayList<>();

  public BadRequestError title(String title) {
    this.title = title;
    return this;
  }

  /**
   * エラータイトル
   * @return title
   */
  
  @Schema(name = "title", description = "エラータイトル", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public BadRequestError detail(String detail) {
    this.detail = detail;
    return this;
  }

  /**
   * 
   * @return detail
   */
  
  @Schema(name = "detail", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("detail")
  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public BadRequestError invalidParams(List<@Valid InvalidParam> invalidParams) {
    this.invalidParams = invalidParams;
    return this;
  }

  public BadRequestError addInvalidParamsItem(InvalidParam invalidParamsItem) {
    if (this.invalidParams == null) {
      this.invalidParams = new ArrayList<>();
    }
    this.invalidParams.add(invalidParamsItem);
    return this;
  }

  /**
   * Get invalidParams
   * @return invalidParams
   */
  @Valid 
  @Schema(name = "invalid-params", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("invalid-params")
  public List<@Valid InvalidParam> getInvalidParams() {
    return invalidParams;
  }

  public void setInvalidParams(List<@Valid InvalidParam> invalidParams) {
    this.invalidParams = invalidParams;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BadRequestError badRequestError = (BadRequestError) o;
    return Objects.equals(this.title, badRequestError.title) &&
        Objects.equals(this.detail, badRequestError.detail) &&
        Objects.equals(this.invalidParams, badRequestError.invalidParams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, detail, invalidParams);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BadRequestError {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    invalidParams: ").append(toIndentedString(invalidParams)).append("\n");
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

