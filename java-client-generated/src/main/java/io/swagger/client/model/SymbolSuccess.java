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
 * SymbolSuccess
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-11-12T11:41:14.871156054Z[GMT]")

public class SymbolSuccess {
  @SerializedName("Symbol")
  private String symbol = null;

  @SerializedName("SymbolName")
  private String symbolName = null;

  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("Exchange")
  private Integer exchange = null;

  @SerializedName("ExchangeName")
  private String exchangeName = null;

  @SerializedName("BisCategory")
  private String bisCategory = null;

  @SerializedName("TotalMarketValue")
  private Double totalMarketValue = null;

  @SerializedName("TotalStocks")
  private Double totalStocks = null;

  @SerializedName("TradingUnit")
  private Double tradingUnit = null;

  @SerializedName("FiscalYearEndBasic")
  private Integer fiscalYearEndBasic = null;

  @SerializedName("PriceRangeGroup")
  private String priceRangeGroup = null;

  @SerializedName("KCMarginBuy")
  private Boolean kcMarginBuy = null;

  @SerializedName("KCMarginSell")
  private Boolean kcMarginSell = null;

  @SerializedName("MarginBuy")
  private Boolean marginBuy = null;

  @SerializedName("MarginSell")
  private Boolean marginSell = null;

  @SerializedName("UpperLimit")
  private Double upperLimit = null;

  @SerializedName("LowerLimit")
  private Double lowerLimit = null;

  @SerializedName("Underlyer")
  private String underlyer = null;

  @SerializedName("DerivMonth")
  private String derivMonth = null;

  @SerializedName("TradeStart")
  private Integer tradeStart = null;

  @SerializedName("TradeEnd")
  private Integer tradeEnd = null;

  @SerializedName("StrikePrice")
  private Double strikePrice = null;

  @SerializedName("PutOrCall")
  private Integer putOrCall = null;

  @SerializedName("ClearingPrice")
  private Double clearingPrice = null;

  public SymbolSuccess symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * 銘柄コード
   * @return symbol
  **/
  @Schema(description = "銘柄コード")
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public SymbolSuccess symbolName(String symbolName) {
    this.symbolName = symbolName;
    return this;
  }

   /**
   * 銘柄名
   * @return symbolName
  **/
  @Schema(description = "銘柄名")
  public String getSymbolName() {
    return symbolName;
  }

  public void setSymbolName(String symbolName) {
    this.symbolName = symbolName;
  }

  public SymbolSuccess displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * 銘柄略称&lt;br&gt;※株式・先物・オプション銘柄の場合のみ
   * @return displayName
  **/
  @Schema(description = "銘柄略称<br>※株式・先物・オプション銘柄の場合のみ")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public SymbolSuccess exchange(Integer exchange) {
    this.exchange = exchange;
    return this;
  }

   /**
   * 市場コード&lt;br&gt;※株式・先物・オプション銘柄の場合のみ &lt;table&gt;   &lt;thead&gt;       &lt;tr&gt;           &lt;th&gt;定義値&lt;/th&gt;           &lt;th&gt;説明&lt;/th&gt;       &lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;       &lt;tr&gt;           &lt;td&gt;1&lt;/td&gt;           &lt;td&gt;東証&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;3&lt;/td&gt;           &lt;td&gt;名証&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;5&lt;/td&gt;           &lt;td&gt;福証&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;6&lt;/td&gt;           &lt;td&gt;札証&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;2&lt;/td&gt;           &lt;td&gt;日通し&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;23&lt;/td&gt;           &lt;td&gt;日中&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;24&lt;/td&gt;           &lt;td&gt;夜間&lt;/td&gt;       &lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt;
   * @return exchange
  **/
  @Schema(description = "市場コード<br>※株式・先物・オプション銘柄の場合のみ <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>1</td>           <td>東証</td>       </tr>       <tr>           <td>3</td>           <td>名証</td>       </tr>       <tr>           <td>5</td>           <td>福証</td>       </tr>       <tr>           <td>6</td>           <td>札証</td>       </tr>       <tr>           <td>2</td>           <td>日通し</td>       </tr>       <tr>           <td>23</td>           <td>日中</td>       </tr>       <tr>           <td>24</td>           <td>夜間</td>       </tr>   </tbody> </table>")
  public Integer getExchange() {
    return exchange;
  }

  public void setExchange(Integer exchange) {
    this.exchange = exchange;
  }

  public SymbolSuccess exchangeName(String exchangeName) {
    this.exchangeName = exchangeName;
    return this;
  }

   /**
   * 市場名称&lt;br&gt;※株式・先物・オプション銘柄の場合のみ
   * @return exchangeName
  **/
  @Schema(description = "市場名称<br>※株式・先物・オプション銘柄の場合のみ")
  public String getExchangeName() {
    return exchangeName;
  }

  public void setExchangeName(String exchangeName) {
    this.exchangeName = exchangeName;
  }

  public SymbolSuccess bisCategory(String bisCategory) {
    this.bisCategory = bisCategory;
    return this;
  }

   /**
   * 業種コード名&lt;br&gt;※株式銘柄の場合のみ &lt;table&gt;   &lt;thead&gt;       &lt;tr&gt;           &lt;th&gt;定義値&lt;/th&gt;           &lt;th&gt;説明&lt;/th&gt;       &lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;       &lt;tr&gt;           &lt;td&gt;0050&lt;/td&gt;           &lt;td&gt;水産・農林業&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;1050&lt;/td&gt;           &lt;td&gt;鉱業&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;2050&lt;/td&gt;           &lt;td&gt;建設業&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;3050&lt;/td&gt;           &lt;td&gt;食料品&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;3100&lt;/td&gt;           &lt;td&gt;繊維製品&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;3150&lt;/td&gt;           &lt;td&gt;パルプ・紙&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;3200&lt;/td&gt;           &lt;td&gt;化学&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;3250&lt;/td&gt;           &lt;td&gt;医薬品&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;3300&lt;/td&gt;           &lt;td&gt;石油・石炭製品&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;3350&lt;/td&gt;           &lt;td&gt;ゴム製品&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;3400&lt;/td&gt;           &lt;td&gt;ガラス・土石製品&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;3450&lt;/td&gt;           &lt;td&gt;鉄鋼&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;3500&lt;/td&gt;           &lt;td&gt;非鉄金属&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;3550&lt;/td&gt;           &lt;td&gt;金属製品&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;3600&lt;/td&gt;           &lt;td&gt;機械&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;3650&lt;/td&gt;           &lt;td&gt;電気機器&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;3700&lt;/td&gt;           &lt;td&gt;輸送用機器&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;3750&lt;/td&gt;           &lt;td&gt;精密機器&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;3800&lt;/td&gt;           &lt;td&gt;その他製品&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;4050&lt;/td&gt;           &lt;td&gt;電気・ガス業&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;5050&lt;/td&gt;           &lt;td&gt;陸運業&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;5100&lt;/td&gt;           &lt;td&gt;海運業&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;5150&lt;/td&gt;           &lt;td&gt;空運業&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;5200&lt;/td&gt;           &lt;td&gt;倉庫・運輸関連業&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;5250&lt;/td&gt;           &lt;td&gt;情報・通信業&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;6050&lt;/td&gt;           &lt;td&gt;卸売業&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;6100&lt;/td&gt;           &lt;td&gt;小売業&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;7050&lt;/td&gt;           &lt;td&gt;銀行業&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;7100&lt;/td&gt;           &lt;td&gt;証券、商品先物取引業&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;7150&lt;/td&gt;           &lt;td&gt;保険業&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;7200&lt;/td&gt;           &lt;td&gt;その他金融業&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;8050&lt;/td&gt;           &lt;td&gt;不動産業&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;9050&lt;/td&gt;           &lt;td&gt;サービス業&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;9999&lt;/td&gt;           &lt;td&gt;その他&lt;/td&gt;       &lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt;
   * @return bisCategory
  **/
  @Schema(description = "業種コード名<br>※株式銘柄の場合のみ <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>0050</td>           <td>水産・農林業</td>       </tr>       <tr>           <td>1050</td>           <td>鉱業</td>       </tr>       <tr>           <td>2050</td>           <td>建設業</td>       </tr>       <tr>           <td>3050</td>           <td>食料品</td>       </tr>       <tr>           <td>3100</td>           <td>繊維製品</td>       </tr>       <tr>           <td>3150</td>           <td>パルプ・紙</td>       </tr>       <tr>           <td>3200</td>           <td>化学</td>       </tr>       <tr>           <td>3250</td>           <td>医薬品</td>       </tr>       <tr>           <td>3300</td>           <td>石油・石炭製品</td>       </tr>       <tr>           <td>3350</td>           <td>ゴム製品</td>       </tr>       <tr>           <td>3400</td>           <td>ガラス・土石製品</td>       </tr>       <tr>           <td>3450</td>           <td>鉄鋼</td>       </tr>       <tr>           <td>3500</td>           <td>非鉄金属</td>       </tr>       <tr>           <td>3550</td>           <td>金属製品</td>       </tr>       <tr>           <td>3600</td>           <td>機械</td>       </tr>       <tr>           <td>3650</td>           <td>電気機器</td>       </tr>       <tr>           <td>3700</td>           <td>輸送用機器</td>       </tr>       <tr>           <td>3750</td>           <td>精密機器</td>       </tr>       <tr>           <td>3800</td>           <td>その他製品</td>       </tr>       <tr>           <td>4050</td>           <td>電気・ガス業</td>       </tr>       <tr>           <td>5050</td>           <td>陸運業</td>       </tr>       <tr>           <td>5100</td>           <td>海運業</td>       </tr>       <tr>           <td>5150</td>           <td>空運業</td>       </tr>       <tr>           <td>5200</td>           <td>倉庫・運輸関連業</td>       </tr>       <tr>           <td>5250</td>           <td>情報・通信業</td>       </tr>       <tr>           <td>6050</td>           <td>卸売業</td>       </tr>       <tr>           <td>6100</td>           <td>小売業</td>       </tr>       <tr>           <td>7050</td>           <td>銀行業</td>       </tr>       <tr>           <td>7100</td>           <td>証券、商品先物取引業</td>       </tr>       <tr>           <td>7150</td>           <td>保険業</td>       </tr>       <tr>           <td>7200</td>           <td>その他金融業</td>       </tr>       <tr>           <td>8050</td>           <td>不動産業</td>       </tr>       <tr>           <td>9050</td>           <td>サービス業</td>       </tr>       <tr>           <td>9999</td>           <td>その他</td>       </tr>   </tbody> </table>")
  public String getBisCategory() {
    return bisCategory;
  }

  public void setBisCategory(String bisCategory) {
    this.bisCategory = bisCategory;
  }

  public SymbolSuccess totalMarketValue(Double totalMarketValue) {
    this.totalMarketValue = totalMarketValue;
    return this;
  }

   /**
   * 時価総額&lt;br&gt;※株式銘柄の場合のみ&lt;br&gt;追加情報出力フラグ：falseの場合、null
   * @return totalMarketValue
  **/
  @Schema(description = "時価総額<br>※株式銘柄の場合のみ<br>追加情報出力フラグ：falseの場合、null")
  public Double getTotalMarketValue() {
    return totalMarketValue;
  }

  public void setTotalMarketValue(Double totalMarketValue) {
    this.totalMarketValue = totalMarketValue;
  }

  public SymbolSuccess totalStocks(Double totalStocks) {
    this.totalStocks = totalStocks;
    return this;
  }

   /**
   * 発行済み株式数（千株）&lt;br&gt;※株式銘柄の場合のみ&lt;br&gt;追加情報出力フラグ：falseの場合、null
   * @return totalStocks
  **/
  @Schema(description = "発行済み株式数（千株）<br>※株式銘柄の場合のみ<br>追加情報出力フラグ：falseの場合、null")
  public Double getTotalStocks() {
    return totalStocks;
  }

  public void setTotalStocks(Double totalStocks) {
    this.totalStocks = totalStocks;
  }

  public SymbolSuccess tradingUnit(Double tradingUnit) {
    this.tradingUnit = tradingUnit;
    return this;
  }

   /**
   * 売買単位&lt;br&gt;※株式・先物・オプション銘柄の場合のみ
   * @return tradingUnit
  **/
  @Schema(description = "売買単位<br>※株式・先物・オプション銘柄の場合のみ")
  public Double getTradingUnit() {
    return tradingUnit;
  }

  public void setTradingUnit(Double tradingUnit) {
    this.tradingUnit = tradingUnit;
  }

  public SymbolSuccess fiscalYearEndBasic(Integer fiscalYearEndBasic) {
    this.fiscalYearEndBasic = fiscalYearEndBasic;
    return this;
  }

   /**
   * 決算期日&lt;br&gt;※株式銘柄の場合のみ&lt;br&gt;追加情報出力フラグ：falseの場合、null
   * @return fiscalYearEndBasic
  **/
  @Schema(description = "決算期日<br>※株式銘柄の場合のみ<br>追加情報出力フラグ：falseの場合、null")
  public Integer getFiscalYearEndBasic() {
    return fiscalYearEndBasic;
  }

  public void setFiscalYearEndBasic(Integer fiscalYearEndBasic) {
    this.fiscalYearEndBasic = fiscalYearEndBasic;
  }

  public SymbolSuccess priceRangeGroup(String priceRangeGroup) {
    this.priceRangeGroup = priceRangeGroup;
    return this;
  }

   /**
   * 呼値グループ&lt;br&gt; ※株式・先物・オプション銘柄の場合のみ&lt;br&gt; ※各呼値コードが対応する商品は以下となります。&lt;BR&gt; 　株式の呼値の単位の詳細は [JPXページ](https://www.jpx.co.jp/equities/trading/domestic/07.html) をご覧ください。&lt;BR&gt; 　10000：株式(TOPIX500採用銘柄以外)　&lt;br&gt; 　10003：株式(TOPIX500採用銘柄)&lt;br&gt; 　10118 : 日経平均先物&lt;br&gt; 　10119 : 日経225mini&lt;br&gt; 　10318 : 日経平均オプション&lt;br&gt; 　10706 : ﾐﾆTOPIX先物&lt;br&gt; 　10718 : TOPIX先物&lt;br&gt; 　12122 : JPX日経400指数先物&lt;br&gt; 　14473 : NYダウ先物&lt;br&gt; 　14515 : 日経平均VI先物&lt;br&gt; 　15411 : グロース250先物&lt;br&gt; 　15569 : 東証REIT指数先物&lt;br&gt; 　17163 : TOPIXCore30指数先物&lt;br&gt; &lt;table&gt;   &lt;thead&gt;       &lt;tr&gt;           &lt;th&gt;呼値コード&lt;/th&gt;           &lt;th&gt;値段の水準&lt;/th&gt;           &lt;th&gt;呼値単位&lt;/th&gt;       &lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;       &lt;tr&gt;           &lt;td&gt;10000&lt;/td&gt;           &lt;td&gt;3000円以下&lt;/td&gt;           &lt;td&gt;1&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;10000&lt;/td&gt;           &lt;td&gt;5000円以下&lt;/td&gt;           &lt;td&gt;5&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;10000&lt;/td&gt;           &lt;td&gt;30000円以下&lt;/td&gt;           &lt;td&gt;10&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;10000&lt;/td&gt;           &lt;td&gt;50000円以下&lt;/td&gt;           &lt;td&gt;50&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;10000&lt;/td&gt;           &lt;td&gt;300000円以下&lt;/td&gt;           &lt;td&gt;100&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;10000&lt;/td&gt;           &lt;td&gt;500000円以下&lt;/td&gt;           &lt;td&gt;500&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;10000&lt;/td&gt;           &lt;td&gt;3000000円以下&lt;/td&gt;           &lt;td&gt;1000&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;10000&lt;/td&gt;           &lt;td&gt;5000000円以下&lt;/td&gt;           &lt;td&gt;5000&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;10000&lt;/td&gt;           &lt;td&gt;30000000円以下&lt;/td&gt;           &lt;td&gt;10000&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;10000&lt;/td&gt;           &lt;td&gt;50000000円以下&lt;/td&gt;           &lt;td&gt;50000&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;10000&lt;/td&gt;           &lt;td&gt;50000000円超&lt;/td&gt;           &lt;td&gt;100000&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;10003&lt;/td&gt;           &lt;td&gt;1000円以下&lt;/td&gt;           &lt;td&gt;0.1&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;10003&lt;/td&gt;           &lt;td&gt;3000円以下&lt;/td&gt;           &lt;td&gt;0.5&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;10003&lt;/td&gt;           &lt;td&gt;10000円以下&lt;/td&gt;           &lt;td&gt;1&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;10003&lt;/td&gt;           &lt;td&gt;30000円以下&lt;/td&gt;           &lt;td&gt;5&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;10003&lt;/td&gt;           &lt;td&gt;100000円以下&lt;/td&gt;           &lt;td&gt;10&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;10003&lt;/td&gt;           &lt;td&gt;300000円以下&lt;/td&gt;           &lt;td&gt;50&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;10003&lt;/td&gt;           &lt;td&gt;1000000円以下&lt;/td&gt;           &lt;td&gt;100&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;10003&lt;/td&gt;           &lt;td&gt;3000000円以下&lt;/td&gt;           &lt;td&gt;500&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;10003&lt;/td&gt;           &lt;td&gt;10000000円以下&lt;/td&gt;           &lt;td&gt;1000&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;10003&lt;/td&gt;           &lt;td&gt;30000000円以下&lt;/td&gt;           &lt;td&gt;5000&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;10003&lt;/td&gt;           &lt;td&gt;30000000円超&lt;/td&gt;           &lt;td&gt;10000&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;10118&lt;/td&gt;           &lt;td&gt;-&lt;/td&gt;           &lt;td&gt;10&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;10119&lt;/td&gt;           &lt;td&gt;-&lt;/td&gt;           &lt;td&gt;5&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;10318&lt;/td&gt;           &lt;td&gt;100円以下&lt;/td&gt;           &lt;td&gt;1&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;10318&lt;/td&gt;           &lt;td&gt;1000円以下&lt;/td&gt;           &lt;td&gt;5&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;10318&lt;/td&gt;           &lt;td&gt;1000円超&lt;/td&gt;           &lt;td&gt;10&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;10706&lt;/td&gt;           &lt;td&gt;-&lt;/td&gt;           &lt;td&gt;0.25&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;10718&lt;/td&gt;           &lt;td&gt;-&lt;/td&gt;           &lt;td&gt;0.5&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;12122&lt;/td&gt;           &lt;td&gt;-&lt;/td&gt;           &lt;td&gt;5&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;14473&lt;/td&gt;           &lt;td&gt;-&lt;/td&gt;           &lt;td&gt;1&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;14515&lt;/td&gt;           &lt;td&gt;-&lt;/td&gt;           &lt;td&gt;0.05&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;15411&lt;/td&gt;           &lt;td&gt;-&lt;/td&gt;           &lt;td&gt;1&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;15569&lt;/td&gt;           &lt;td&gt;-&lt;/td&gt;           &lt;td&gt;0.5&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;17163&lt;/td&gt;           &lt;td&gt;-&lt;/td&gt;           &lt;td&gt;0.5&lt;/td&gt;       &lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt;
   * @return priceRangeGroup
  **/
  @Schema(description = "呼値グループ<br> ※株式・先物・オプション銘柄の場合のみ<br> ※各呼値コードが対応する商品は以下となります。<BR> 　株式の呼値の単位の詳細は [JPXページ](https://www.jpx.co.jp/equities/trading/domestic/07.html) をご覧ください。<BR> 　10000：株式(TOPIX500採用銘柄以外)　<br> 　10003：株式(TOPIX500採用銘柄)<br> 　10118 : 日経平均先物<br> 　10119 : 日経225mini<br> 　10318 : 日経平均オプション<br> 　10706 : ﾐﾆTOPIX先物<br> 　10718 : TOPIX先物<br> 　12122 : JPX日経400指数先物<br> 　14473 : NYダウ先物<br> 　14515 : 日経平均VI先物<br> 　15411 : グロース250先物<br> 　15569 : 東証REIT指数先物<br> 　17163 : TOPIXCore30指数先物<br> <table>   <thead>       <tr>           <th>呼値コード</th>           <th>値段の水準</th>           <th>呼値単位</th>       </tr>   </thead>   <tbody>       <tr>           <td>10000</td>           <td>3000円以下</td>           <td>1</td>       </tr>       <tr>           <td>10000</td>           <td>5000円以下</td>           <td>5</td>       </tr>       <tr>           <td>10000</td>           <td>30000円以下</td>           <td>10</td>       </tr>       <tr>           <td>10000</td>           <td>50000円以下</td>           <td>50</td>       </tr>       <tr>           <td>10000</td>           <td>300000円以下</td>           <td>100</td>       </tr>       <tr>           <td>10000</td>           <td>500000円以下</td>           <td>500</td>       </tr>       <tr>           <td>10000</td>           <td>3000000円以下</td>           <td>1000</td>       </tr>       <tr>           <td>10000</td>           <td>5000000円以下</td>           <td>5000</td>       </tr>       <tr>           <td>10000</td>           <td>30000000円以下</td>           <td>10000</td>       </tr>       <tr>           <td>10000</td>           <td>50000000円以下</td>           <td>50000</td>       </tr>       <tr>           <td>10000</td>           <td>50000000円超</td>           <td>100000</td>       </tr>       <tr>           <td>10003</td>           <td>1000円以下</td>           <td>0.1</td>       </tr>       <tr>           <td>10003</td>           <td>3000円以下</td>           <td>0.5</td>       </tr>       <tr>           <td>10003</td>           <td>10000円以下</td>           <td>1</td>       </tr>       <tr>           <td>10003</td>           <td>30000円以下</td>           <td>5</td>       </tr>       <tr>           <td>10003</td>           <td>100000円以下</td>           <td>10</td>       </tr>       <tr>           <td>10003</td>           <td>300000円以下</td>           <td>50</td>       </tr>       <tr>           <td>10003</td>           <td>1000000円以下</td>           <td>100</td>       </tr>       <tr>           <td>10003</td>           <td>3000000円以下</td>           <td>500</td>       </tr>       <tr>           <td>10003</td>           <td>10000000円以下</td>           <td>1000</td>       </tr>       <tr>           <td>10003</td>           <td>30000000円以下</td>           <td>5000</td>       </tr>       <tr>           <td>10003</td>           <td>30000000円超</td>           <td>10000</td>       </tr>       <tr>           <td>10118</td>           <td>-</td>           <td>10</td>       </tr>       <tr>           <td>10119</td>           <td>-</td>           <td>5</td>       </tr>       <tr>           <td>10318</td>           <td>100円以下</td>           <td>1</td>       </tr>       <tr>           <td>10318</td>           <td>1000円以下</td>           <td>5</td>       </tr>       <tr>           <td>10318</td>           <td>1000円超</td>           <td>10</td>       </tr>       <tr>           <td>10706</td>           <td>-</td>           <td>0.25</td>       </tr>       <tr>           <td>10718</td>           <td>-</td>           <td>0.5</td>       </tr>       <tr>           <td>12122</td>           <td>-</td>           <td>5</td>       </tr>       <tr>           <td>14473</td>           <td>-</td>           <td>1</td>       </tr>       <tr>           <td>14515</td>           <td>-</td>           <td>0.05</td>       </tr>       <tr>           <td>15411</td>           <td>-</td>           <td>1</td>       </tr>       <tr>           <td>15569</td>           <td>-</td>           <td>0.5</td>       </tr>       <tr>           <td>17163</td>           <td>-</td>           <td>0.5</td>       </tr>   </tbody> </table>")
  public String getPriceRangeGroup() {
    return priceRangeGroup;
  }

  public void setPriceRangeGroup(String priceRangeGroup) {
    this.priceRangeGroup = priceRangeGroup;
  }

  public SymbolSuccess kcMarginBuy(Boolean kcMarginBuy) {
    this.kcMarginBuy = kcMarginBuy;
    return this;
  }

   /**
   * 一般信用買建フラグ&lt;br&gt;※trueのとき、一般信用(長期)または一般信用(デイトレ)が買建可能&lt;br&gt;※株式銘柄の場合のみ
   * @return kcMarginBuy
  **/
  @Schema(description = "一般信用買建フラグ<br>※trueのとき、一般信用(長期)または一般信用(デイトレ)が買建可能<br>※株式銘柄の場合のみ")
  public Boolean isKcMarginBuy() {
    return kcMarginBuy;
  }

  public void setKcMarginBuy(Boolean kcMarginBuy) {
    this.kcMarginBuy = kcMarginBuy;
  }

  public SymbolSuccess kcMarginSell(Boolean kcMarginSell) {
    this.kcMarginSell = kcMarginSell;
    return this;
  }

   /**
   * 一般信用売建フラグ&lt;br&gt;※trueのとき、一般信用(長期)または一般信用(デイトレ)が売建可能&lt;br&gt;※株式銘柄の場合のみ
   * @return kcMarginSell
  **/
  @Schema(description = "一般信用売建フラグ<br>※trueのとき、一般信用(長期)または一般信用(デイトレ)が売建可能<br>※株式銘柄の場合のみ")
  public Boolean isKcMarginSell() {
    return kcMarginSell;
  }

  public void setKcMarginSell(Boolean kcMarginSell) {
    this.kcMarginSell = kcMarginSell;
  }

  public SymbolSuccess marginBuy(Boolean marginBuy) {
    this.marginBuy = marginBuy;
    return this;
  }

   /**
   * 制度信用買建フラグ&lt;br&gt;※trueのとき制度信用買建可能&lt;br&gt;※株式銘柄の場合のみ
   * @return marginBuy
  **/
  @Schema(description = "制度信用買建フラグ<br>※trueのとき制度信用買建可能<br>※株式銘柄の場合のみ")
  public Boolean isMarginBuy() {
    return marginBuy;
  }

  public void setMarginBuy(Boolean marginBuy) {
    this.marginBuy = marginBuy;
  }

  public SymbolSuccess marginSell(Boolean marginSell) {
    this.marginSell = marginSell;
    return this;
  }

   /**
   * 制度信用売建フラグ&lt;br&gt;※trueのとき制度信用売建可能&lt;br&gt;※株式銘柄の場合のみ
   * @return marginSell
  **/
  @Schema(description = "制度信用売建フラグ<br>※trueのとき制度信用売建可能<br>※株式銘柄の場合のみ")
  public Boolean isMarginSell() {
    return marginSell;
  }

  public void setMarginSell(Boolean marginSell) {
    this.marginSell = marginSell;
  }

  public SymbolSuccess upperLimit(Double upperLimit) {
    this.upperLimit = upperLimit;
    return this;
  }

   /**
   * 値幅上限&lt;br&gt;※株式・先物・オプション銘柄の場合のみ
   * @return upperLimit
  **/
  @Schema(description = "値幅上限<br>※株式・先物・オプション銘柄の場合のみ")
  public Double getUpperLimit() {
    return upperLimit;
  }

  public void setUpperLimit(Double upperLimit) {
    this.upperLimit = upperLimit;
  }

  public SymbolSuccess lowerLimit(Double lowerLimit) {
    this.lowerLimit = lowerLimit;
    return this;
  }

   /**
   * 値幅下限&lt;br&gt;※株式・先物・オプション銘柄の場合のみ
   * @return lowerLimit
  **/
  @Schema(description = "値幅下限<br>※株式・先物・オプション銘柄の場合のみ")
  public Double getLowerLimit() {
    return lowerLimit;
  }

  public void setLowerLimit(Double lowerLimit) {
    this.lowerLimit = lowerLimit;
  }

  public SymbolSuccess underlyer(String underlyer) {
    this.underlyer = underlyer;
    return this;
  }

   /**
   * 原資産コード&lt;br&gt;※先物・オプション銘柄の場合のみ &lt;table&gt;   &lt;thead&gt;       &lt;tr&gt;           &lt;th&gt;定義値&lt;/th&gt;           &lt;th&gt;説明&lt;/th&gt;       &lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;       &lt;tr&gt;           &lt;td&gt;NK225&lt;/td&gt;           &lt;td&gt;日経225&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;NK300&lt;/td&gt;           &lt;td&gt;日経300&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;GROWTH&lt;/td&gt;           &lt;td&gt;グロース250先物&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;JPX400&lt;/td&gt;           &lt;td&gt;JPX日経400&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;TOPIX&lt;/td&gt;           &lt;td&gt;TOPIX&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;NKVI&lt;/td&gt;           &lt;td&gt;日経平均VI&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;DJIA&lt;/td&gt;           &lt;td&gt;NYダウ&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;TSEREITINDEX&lt;/td&gt;           &lt;td&gt;東証REIT指数&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;TOPIXCORE30&lt;/td&gt;           &lt;td&gt;TOPIX Core30&lt;/td&gt;       &lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt;
   * @return underlyer
  **/
  @Schema(description = "原資産コード<br>※先物・オプション銘柄の場合のみ <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>NK225</td>           <td>日経225</td>       </tr>       <tr>           <td>NK300</td>           <td>日経300</td>       </tr>       <tr>           <td>GROWTH</td>           <td>グロース250先物</td>       </tr>       <tr>           <td>JPX400</td>           <td>JPX日経400</td>       </tr>       <tr>           <td>TOPIX</td>           <td>TOPIX</td>       </tr>       <tr>           <td>NKVI</td>           <td>日経平均VI</td>       </tr>       <tr>           <td>DJIA</td>           <td>NYダウ</td>       </tr>       <tr>           <td>TSEREITINDEX</td>           <td>東証REIT指数</td>       </tr>       <tr>           <td>TOPIXCORE30</td>           <td>TOPIX Core30</td>       </tr>   </tbody> </table>")
  public String getUnderlyer() {
    return underlyer;
  }

  public void setUnderlyer(String underlyer) {
    this.underlyer = underlyer;
  }

  public SymbolSuccess derivMonth(String derivMonth) {
    this.derivMonth = derivMonth;
    return this;
  }

   /**
   * 限月-年月&lt;br&gt;※「限月-年月」は「年(yyyy)/月(MM)」で表示します。&lt;br&gt;※先物・オプション銘柄の場合のみ
   * @return derivMonth
  **/
  @Schema(description = "限月-年月<br>※「限月-年月」は「年(yyyy)/月(MM)」で表示します。<br>※先物・オプション銘柄の場合のみ")
  public String getDerivMonth() {
    return derivMonth;
  }

  public void setDerivMonth(String derivMonth) {
    this.derivMonth = derivMonth;
  }

  public SymbolSuccess tradeStart(Integer tradeStart) {
    this.tradeStart = tradeStart;
    return this;
  }

   /**
   * 取引開始日&lt;br&gt;※先物・オプション銘柄の場合のみ
   * @return tradeStart
  **/
  @Schema(description = "取引開始日<br>※先物・オプション銘柄の場合のみ")
  public Integer getTradeStart() {
    return tradeStart;
  }

  public void setTradeStart(Integer tradeStart) {
    this.tradeStart = tradeStart;
  }

  public SymbolSuccess tradeEnd(Integer tradeEnd) {
    this.tradeEnd = tradeEnd;
    return this;
  }

   /**
   * 取引終了日&lt;br&gt;※先物・オプション銘柄の場合のみ
   * @return tradeEnd
  **/
  @Schema(description = "取引終了日<br>※先物・オプション銘柄の場合のみ")
  public Integer getTradeEnd() {
    return tradeEnd;
  }

  public void setTradeEnd(Integer tradeEnd) {
    this.tradeEnd = tradeEnd;
  }

  public SymbolSuccess strikePrice(Double strikePrice) {
    this.strikePrice = strikePrice;
    return this;
  }

   /**
   * 権利行使価格&lt;br&gt;※オプション銘柄の場合のみ
   * @return strikePrice
  **/
  @Schema(description = "権利行使価格<br>※オプション銘柄の場合のみ")
  public Double getStrikePrice() {
    return strikePrice;
  }

  public void setStrikePrice(Double strikePrice) {
    this.strikePrice = strikePrice;
  }

  public SymbolSuccess putOrCall(Integer putOrCall) {
    this.putOrCall = putOrCall;
    return this;
  }

   /**
   * プット/コール区分&lt;br&gt;※オプション銘柄の場合のみ &lt;table&gt;   &lt;thead&gt;       &lt;tr&gt;           &lt;th&gt;定義値&lt;/th&gt;           &lt;th&gt;説明&lt;/th&gt;       &lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;       &lt;tr&gt;           &lt;td&gt;1&lt;/td&gt;           &lt;td&gt;プット&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;2&lt;/td&gt;           &lt;td&gt;コール&lt;/td&gt;       &lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt;
   * @return putOrCall
  **/
  @Schema(description = "プット/コール区分<br>※オプション銘柄の場合のみ <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>1</td>           <td>プット</td>       </tr>       <tr>           <td>2</td>           <td>コール</td>       </tr>   </tbody> </table>")
  public Integer getPutOrCall() {
    return putOrCall;
  }

  public void setPutOrCall(Integer putOrCall) {
    this.putOrCall = putOrCall;
  }

  public SymbolSuccess clearingPrice(Double clearingPrice) {
    this.clearingPrice = clearingPrice;
    return this;
  }

   /**
   * 清算値&lt;br&gt;※先物銘柄の場合のみ&lt;br&gt;追加情報出力フラグ：falseの場合、null
   * @return clearingPrice
  **/
  @Schema(description = "清算値<br>※先物銘柄の場合のみ<br>追加情報出力フラグ：falseの場合、null")
  public Double getClearingPrice() {
    return clearingPrice;
  }

  public void setClearingPrice(Double clearingPrice) {
    this.clearingPrice = clearingPrice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SymbolSuccess symbolSuccess = (SymbolSuccess) o;
    return Objects.equals(this.symbol, symbolSuccess.symbol) &&
        Objects.equals(this.symbolName, symbolSuccess.symbolName) &&
        Objects.equals(this.displayName, symbolSuccess.displayName) &&
        Objects.equals(this.exchange, symbolSuccess.exchange) &&
        Objects.equals(this.exchangeName, symbolSuccess.exchangeName) &&
        Objects.equals(this.bisCategory, symbolSuccess.bisCategory) &&
        Objects.equals(this.totalMarketValue, symbolSuccess.totalMarketValue) &&
        Objects.equals(this.totalStocks, symbolSuccess.totalStocks) &&
        Objects.equals(this.tradingUnit, symbolSuccess.tradingUnit) &&
        Objects.equals(this.fiscalYearEndBasic, symbolSuccess.fiscalYearEndBasic) &&
        Objects.equals(this.priceRangeGroup, symbolSuccess.priceRangeGroup) &&
        Objects.equals(this.kcMarginBuy, symbolSuccess.kcMarginBuy) &&
        Objects.equals(this.kcMarginSell, symbolSuccess.kcMarginSell) &&
        Objects.equals(this.marginBuy, symbolSuccess.marginBuy) &&
        Objects.equals(this.marginSell, symbolSuccess.marginSell) &&
        Objects.equals(this.upperLimit, symbolSuccess.upperLimit) &&
        Objects.equals(this.lowerLimit, symbolSuccess.lowerLimit) &&
        Objects.equals(this.underlyer, symbolSuccess.underlyer) &&
        Objects.equals(this.derivMonth, symbolSuccess.derivMonth) &&
        Objects.equals(this.tradeStart, symbolSuccess.tradeStart) &&
        Objects.equals(this.tradeEnd, symbolSuccess.tradeEnd) &&
        Objects.equals(this.strikePrice, symbolSuccess.strikePrice) &&
        Objects.equals(this.putOrCall, symbolSuccess.putOrCall) &&
        Objects.equals(this.clearingPrice, symbolSuccess.clearingPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, symbolName, displayName, exchange, exchangeName, bisCategory, totalMarketValue, totalStocks, tradingUnit, fiscalYearEndBasic, priceRangeGroup, kcMarginBuy, kcMarginSell, marginBuy, marginSell, upperLimit, lowerLimit, underlyer, derivMonth, tradeStart, tradeEnd, strikePrice, putOrCall, clearingPrice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SymbolSuccess {\n");
    
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    symbolName: ").append(toIndentedString(symbolName)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    exchangeName: ").append(toIndentedString(exchangeName)).append("\n");
    sb.append("    bisCategory: ").append(toIndentedString(bisCategory)).append("\n");
    sb.append("    totalMarketValue: ").append(toIndentedString(totalMarketValue)).append("\n");
    sb.append("    totalStocks: ").append(toIndentedString(totalStocks)).append("\n");
    sb.append("    tradingUnit: ").append(toIndentedString(tradingUnit)).append("\n");
    sb.append("    fiscalYearEndBasic: ").append(toIndentedString(fiscalYearEndBasic)).append("\n");
    sb.append("    priceRangeGroup: ").append(toIndentedString(priceRangeGroup)).append("\n");
    sb.append("    kcMarginBuy: ").append(toIndentedString(kcMarginBuy)).append("\n");
    sb.append("    kcMarginSell: ").append(toIndentedString(kcMarginSell)).append("\n");
    sb.append("    marginBuy: ").append(toIndentedString(marginBuy)).append("\n");
    sb.append("    marginSell: ").append(toIndentedString(marginSell)).append("\n");
    sb.append("    upperLimit: ").append(toIndentedString(upperLimit)).append("\n");
    sb.append("    lowerLimit: ").append(toIndentedString(lowerLimit)).append("\n");
    sb.append("    underlyer: ").append(toIndentedString(underlyer)).append("\n");
    sb.append("    derivMonth: ").append(toIndentedString(derivMonth)).append("\n");
    sb.append("    tradeStart: ").append(toIndentedString(tradeStart)).append("\n");
    sb.append("    tradeEnd: ").append(toIndentedString(tradeEnd)).append("\n");
    sb.append("    strikePrice: ").append(toIndentedString(strikePrice)).append("\n");
    sb.append("    putOrCall: ").append(toIndentedString(putOrCall)).append("\n");
    sb.append("    clearingPrice: ").append(toIndentedString(clearingPrice)).append("\n");
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
