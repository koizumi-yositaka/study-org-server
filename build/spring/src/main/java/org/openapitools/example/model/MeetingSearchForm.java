package org.openapitools.example.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ミーティング登録用
 */

@Schema(name = "MeetingSearchForm", description = "ミーティング登録用")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-02T20:56:31.515614+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class MeetingSearchForm {

  private String searchWord;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate searchStartDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate searchEndDate;

  @Valid
  private List<Long> searchOpenerId = new ArrayList<>();

  public MeetingSearchForm searchWord(String searchWord) {
    this.searchWord = searchWord;
    return this;
  }

  /**
   * 検索文字
   * @return searchWord
   */
  
  @Schema(name = "searchWord", description = "検索文字", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("searchWord")
  public String getSearchWord() {
    return searchWord;
  }

  public void setSearchWord(String searchWord) {
    this.searchWord = searchWord;
  }

  public MeetingSearchForm searchStartDate(LocalDate searchStartDate) {
    this.searchStartDate = searchStartDate;
    return this;
  }

  /**
   * 検索開始
   * @return searchStartDate
   */
  @Valid 
  @Schema(name = "searchStartDate", description = "検索開始", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("searchStartDate")
  public LocalDate getSearchStartDate() {
    return searchStartDate;
  }

  public void setSearchStartDate(LocalDate searchStartDate) {
    this.searchStartDate = searchStartDate;
  }

  public MeetingSearchForm searchEndDate(LocalDate searchEndDate) {
    this.searchEndDate = searchEndDate;
    return this;
  }

  /**
   * 検索終了
   * @return searchEndDate
   */
  @Valid 
  @Schema(name = "searchEndDate", description = "検索終了", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("searchEndDate")
  public LocalDate getSearchEndDate() {
    return searchEndDate;
  }

  public void setSearchEndDate(LocalDate searchEndDate) {
    this.searchEndDate = searchEndDate;
  }

  public MeetingSearchForm searchOpenerId(List<Long> searchOpenerId) {
    this.searchOpenerId = searchOpenerId;
    return this;
  }

  public MeetingSearchForm addSearchOpenerIdItem(Long searchOpenerIdItem) {
    if (this.searchOpenerId == null) {
      this.searchOpenerId = new ArrayList<>();
    }
    this.searchOpenerId.add(searchOpenerIdItem);
    return this;
  }

  /**
   * 開催者IDList
   * @return searchOpenerId
   */
  
  @Schema(name = "searchOpenerId", description = "開催者IDList", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("searchOpenerId")
  public List<Long> getSearchOpenerId() {
    return searchOpenerId;
  }

  public void setSearchOpenerId(List<Long> searchOpenerId) {
    this.searchOpenerId = searchOpenerId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeetingSearchForm meetingSearchForm = (MeetingSearchForm) o;
    return Objects.equals(this.searchWord, meetingSearchForm.searchWord) &&
        Objects.equals(this.searchStartDate, meetingSearchForm.searchStartDate) &&
        Objects.equals(this.searchEndDate, meetingSearchForm.searchEndDate) &&
        Objects.equals(this.searchOpenerId, meetingSearchForm.searchOpenerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchWord, searchStartDate, searchEndDate, searchOpenerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeetingSearchForm {\n");
    sb.append("    searchWord: ").append(toIndentedString(searchWord)).append("\n");
    sb.append("    searchStartDate: ").append(toIndentedString(searchStartDate)).append("\n");
    sb.append("    searchEndDate: ").append(toIndentedString(searchEndDate)).append("\n");
    sb.append("    searchOpenerId: ").append(toIndentedString(searchOpenerId)).append("\n");
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

