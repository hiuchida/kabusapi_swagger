package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import org.openapitools.jackson.nullable.JsonNullable;
import io.swagger.configuration.NotUndefined;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ErrorResponse
 */
@Validated
@NotUndefined
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2026-05-30T09:09:44.624556435Z[GMT]")


public class ErrorResponse   {
  @JsonProperty("Code")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer code = null;

  @JsonProperty("Message")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String message = null;


  public ErrorResponse code(Integer code) { 

    this.code = code;
    return this;
  }

  /**
   * エラーコード
   * @return code
   **/
  
  @Schema(example = "4001001", description = "エラーコード")
  
  public Integer getCode() {  
    return code;
  }



  public void setCode(Integer code) { 
    this.code = code;
  }

  public ErrorResponse message(String message) { 

    this.message = message;
    return this;
  }

  /**
   * [エラーメッセージ](../ptal/error.html#message)
   * @return message
   **/
  
  @Schema(example = "内部エラー", description = "[エラーメッセージ](../ptal/error.html#message)")
  
  public String getMessage() {  
    return message;
  }



  public void setMessage(String message) { 
    this.message = message;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorResponse errorResponse = (ErrorResponse) o;
    return Objects.equals(this.code, errorResponse.code) &&
        Objects.equals(this.message, errorResponse.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResponse {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
