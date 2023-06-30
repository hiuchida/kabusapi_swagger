package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * WalletCashSuccess
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-06-30T15:11:33.432082584Z[GMT]")


public class WalletCashSuccess   {
  @JsonProperty("StockAccountWallet")
  private Double stockAccountWallet = null;

  @JsonProperty("AuKCStockAccountWallet")
  private Double auKCStockAccountWallet = null;

  @JsonProperty("AuJbnStockAccountWallet")
  private Double auJbnStockAccountWallet = null;

  public WalletCashSuccess stockAccountWallet(Double stockAccountWallet) {
    this.stockAccountWallet = stockAccountWallet;
    return this;
  }

  /**
   * 現物買付可能額<br> ※auマネーコネクトが有効の場合、auじぶん銀行の残高を含めた合計可能額を表示する<br> ※auマネーコネクトが無効の場合、auカブコム証券の可能額のみを表示する
   * @return stockAccountWallet
   **/
  @Schema(description = "現物買付可能額<br> ※auマネーコネクトが有効の場合、auじぶん銀行の残高を含めた合計可能額を表示する<br> ※auマネーコネクトが無効の場合、auカブコム証券の可能額のみを表示する")
  
    public Double getStockAccountWallet() {
    return stockAccountWallet;
  }

  public void setStockAccountWallet(Double stockAccountWallet) {
    this.stockAccountWallet = stockAccountWallet;
  }

  public WalletCashSuccess auKCStockAccountWallet(Double auKCStockAccountWallet) {
    this.auKCStockAccountWallet = auKCStockAccountWallet;
    return this;
  }

  /**
   * うち、auカブコム証券可能額
   * @return auKCStockAccountWallet
   **/
  @Schema(description = "うち、auカブコム証券可能額")
  
    public Double getAuKCStockAccountWallet() {
    return auKCStockAccountWallet;
  }

  public void setAuKCStockAccountWallet(Double auKCStockAccountWallet) {
    this.auKCStockAccountWallet = auKCStockAccountWallet;
  }

  public WalletCashSuccess auJbnStockAccountWallet(Double auJbnStockAccountWallet) {
    this.auJbnStockAccountWallet = auJbnStockAccountWallet;
    return this;
  }

  /**
   * うち、auじぶん銀行残高<br>※auマネーコネクトが無効の場合、「0」を表示する
   * @return auJbnStockAccountWallet
   **/
  @Schema(description = "うち、auじぶん銀行残高<br>※auマネーコネクトが無効の場合、「0」を表示する")
  
    public Double getAuJbnStockAccountWallet() {
    return auJbnStockAccountWallet;
  }

  public void setAuJbnStockAccountWallet(Double auJbnStockAccountWallet) {
    this.auJbnStockAccountWallet = auJbnStockAccountWallet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletCashSuccess walletCashSuccess = (WalletCashSuccess) o;
    return Objects.equals(this.stockAccountWallet, walletCashSuccess.stockAccountWallet) &&
        Objects.equals(this.auKCStockAccountWallet, walletCashSuccess.auKCStockAccountWallet) &&
        Objects.equals(this.auJbnStockAccountWallet, walletCashSuccess.auJbnStockAccountWallet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stockAccountWallet, auKCStockAccountWallet, auJbnStockAccountWallet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletCashSuccess {\n");
    
    sb.append("    stockAccountWallet: ").append(toIndentedString(stockAccountWallet)).append("\n");
    sb.append("    auKCStockAccountWallet: ").append(toIndentedString(auKCStockAccountWallet)).append("\n");
    sb.append("    auJbnStockAccountWallet: ").append(toIndentedString(auJbnStockAccountWallet)).append("\n");
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
