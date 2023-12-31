package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * 買気配数量4本目
 */
@Schema(description = "買気配数量4本目")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-06-30T15:11:33.432082584Z[GMT]")


public class BoardSuccessBuy4   {
  @JsonProperty("Price")
  private Double price = null;

  @JsonProperty("Qty")
  private Double qty = null;

  public BoardSuccessBuy4 price(Double price) {
    this.price = price;
    return this;
  }

  /**
   * 値段<br>※株式・先物・オプション銘柄の場合のみ
   * @return price
   **/
  @Schema(description = "値段<br>※株式・先物・オプション銘柄の場合のみ")
  
    public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public BoardSuccessBuy4 qty(Double qty) {
    this.qty = qty;
    return this;
  }

  /**
   * 数量<br>※株式・先物・オプション銘柄の場合のみ
   * @return qty
   **/
  @Schema(description = "数量<br>※株式・先物・オプション銘柄の場合のみ")
  
    public Double getQty() {
    return qty;
  }

  public void setQty(Double qty) {
    this.qty = qty;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoardSuccessBuy4 boardSuccessBuy4 = (BoardSuccessBuy4) o;
    return Objects.equals(this.price, boardSuccessBuy4.price) &&
        Objects.equals(this.qty, boardSuccessBuy4.qty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(price, qty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoardSuccessBuy4 {\n");
    
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    qty: ").append(toIndentedString(qty)).append("\n");
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
