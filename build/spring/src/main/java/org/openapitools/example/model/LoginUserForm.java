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
 * ログイン時のユーザー情報
 */

@Schema(name = "LoginUserForm", description = "ログイン時のユーザー情報")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-02T20:56:31.515614+09:00[Asia/Tokyo]", comments = "Generator version: 7.7.0")
public class LoginUserForm {

  private String email;

  private String password;

  public LoginUserForm() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LoginUserForm(String email, String password) {
    this.email = email;
    this.password = password;
  }

  public LoginUserForm email(String email) {
    this.email = email;
    return this;
  }

  /**
   * ログインEmail
   * @return email
   */
  @NotNull 
  @Schema(name = "email", description = "ログインEmail", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public LoginUserForm password(String password) {
    this.password = password;
    return this;
  }

  /**
   * パスワード
   * @return password
   */
  @NotNull 
  @Schema(name = "password", description = "パスワード", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginUserForm loginUserForm = (LoginUserForm) o;
    return Objects.equals(this.email, loginUserForm.email) &&
        Objects.equals(this.password, loginUserForm.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginUserForm {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

