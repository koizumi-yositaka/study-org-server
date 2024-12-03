package org.openapitools.example.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.example.model.MeetingResponseDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ミーティングのリスト
 */

@Schema(name = "MeetingResponseDTOList", description = "ミーティングのリスト")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-02T20:56:31.515614+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class MeetingResponseDTOList {

  @Valid
  private List<@Valid MeetingResponseDTO> results = new ArrayList<>();

  public MeetingResponseDTOList() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MeetingResponseDTOList(List<@Valid MeetingResponseDTO> results) {
    this.results = results;
  }

  public MeetingResponseDTOList results(List<@Valid MeetingResponseDTO> results) {
    this.results = results;
    return this;
  }

  public MeetingResponseDTOList addResultsItem(MeetingResponseDTO resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

  /**
   * Get results
   * @return results
   */
  @NotNull @Valid 
  @Schema(name = "results", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("results")
  public List<@Valid MeetingResponseDTO> getResults() {
    return results;
  }

  public void setResults(List<@Valid MeetingResponseDTO> results) {
    this.results = results;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeetingResponseDTOList meetingResponseDTOList = (MeetingResponseDTOList) o;
    return Objects.equals(this.results, meetingResponseDTOList.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeetingResponseDTOList {\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

