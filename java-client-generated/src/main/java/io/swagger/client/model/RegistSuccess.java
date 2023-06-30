/*
 * kabuステーションAPI
 * # 定義情報   REST APIのコード一覧、エンドポイントは下記リンク参照     - [REST APIコード一覧](../ptal/error.html)
 *
 * OpenAPI spec version: 1.5
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.RequestRegisterSymbols;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * RegistSuccess
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-06-30T15:08:23.587764301Z[GMT]")

public class RegistSuccess {
  @SerializedName("RegistList")
  private List<RequestRegisterSymbols> registList = null;

  public RegistSuccess registList(List<RequestRegisterSymbols> registList) {
    this.registList = registList;
    return this;
  }

  public RegistSuccess addRegistListItem(RequestRegisterSymbols registListItem) {
    if (this.registList == null) {
      this.registList = new ArrayList<RequestRegisterSymbols>();
    }
    this.registList.add(registListItem);
    return this;
  }

   /**
   * 現在登録されている銘柄のリスト
   * @return registList
  **/
  @Schema(description = "現在登録されている銘柄のリスト")
  public List<RequestRegisterSymbols> getRegistList() {
    return registList;
  }

  public void setRegistList(List<RequestRegisterSymbols> registList) {
    this.registList = registList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegistSuccess registSuccess = (RegistSuccess) o;
    return Objects.equals(this.registList, registSuccess.registList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(registList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegistSuccess {\n");
    
    sb.append("    registList: ").append(toIndentedString(registList)).append("\n");
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