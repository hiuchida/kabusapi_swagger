package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.RegulationsResponseRegulationsInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RegulationsResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-06-30T15:11:33.432082584Z[GMT]")


public class RegulationsResponse   {
  @JsonProperty("Symbol")
  private String symbol = null;

  @JsonProperty("RegulationsInfo")
  @Valid
  private List<RegulationsResponseRegulationsInfo> regulationsInfo = null;

  public RegulationsResponse symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

  /**
   * 銘柄コード<br> ※対象商品は、株式のみ
   * @return symbol
   **/
  @Schema(description = "銘柄コード<br> ※対象商品は、株式のみ")
  
    public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public RegulationsResponse regulationsInfo(List<RegulationsResponseRegulationsInfo> regulationsInfo) {
    this.regulationsInfo = regulationsInfo;
    return this;
  }

  public RegulationsResponse addRegulationsInfoItem(RegulationsResponseRegulationsInfo regulationsInfoItem) {
    if (this.regulationsInfo == null) {
      this.regulationsInfo = new ArrayList<RegulationsResponseRegulationsInfo>();
    }
    this.regulationsInfo.add(regulationsInfoItem);
    return this;
  }

  /**
   * 規制情報
   * @return regulationsInfo
   **/
  @Schema(description = "規制情報")
      @Valid
    public List<RegulationsResponseRegulationsInfo> getRegulationsInfo() {
    return regulationsInfo;
  }

  public void setRegulationsInfo(List<RegulationsResponseRegulationsInfo> regulationsInfo) {
    this.regulationsInfo = regulationsInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegulationsResponse regulationsResponse = (RegulationsResponse) o;
    return Objects.equals(this.symbol, regulationsResponse.symbol) &&
        Objects.equals(this.regulationsInfo, regulationsResponse.regulationsInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, regulationsInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegulationsResponse {\n");
    
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    regulationsInfo: ").append(toIndentedString(regulationsInfo)).append("\n");
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
