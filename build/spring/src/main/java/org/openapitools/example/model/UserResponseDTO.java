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
 * ログイン時の結果情報
 */

@Schema(name = "UserResponseDTO", description = "ログイン時の結果情報")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-02T20:56:31.515614+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class UserResponseDTO {

  private String role;

  private String email;

  public UserResponseDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UserResponseDTO(String role, String email) {
    this.role = role;
    this.email = email;
  }

  public UserResponseDTO role(String role) {
    this.role = role;
    return this;
  }

  /**
   * ROLE
   * @return role
   */
  @NotNull 
  @Schema(name = "role", description = "ROLE", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("role")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public UserResponseDTO email(String email) {
    this.email = email;
    return this;
  }

  /**
   * email
   * @return email
   */
  @NotNull 
  @Schema(name = "email", description = "email", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserResponseDTO userResponseDTO = (UserResponseDTO) o;
    return Objects.equals(this.role, userResponseDTO.role) &&
        Objects.equals(this.email, userResponseDTO.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserResponseDTO {\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

