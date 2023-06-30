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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * OrderSuccess
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-06-30T15:08:23.587764301Z[GMT]")

public class OrderSuccess {
  @SerializedName("Result")
  private Integer result = null;

  @SerializedName("OrderId")
  private String orderId = null;

  public OrderSuccess result(Integer result) {
    this.result = result;
    return this;
  }

   /**
   * 結果コード&lt;br&gt;0が成功。それ以外はエラーコード。
   * @return result
  **/
  @Schema(example = "0", description = "結果コード<br>0が成功。それ以外はエラーコード。")
  public Integer getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }

  public OrderSuccess orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * 受付注文番号
   * @return orderId
  **/
  @Schema(example = "20200529A01N06848002", description = "受付注文番号")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderSuccess orderSuccess = (OrderSuccess) o;
    return Objects.equals(this.result, orderSuccess.result) &&
        Objects.equals(this.orderId, orderSuccess.orderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, orderId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderSuccess {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
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