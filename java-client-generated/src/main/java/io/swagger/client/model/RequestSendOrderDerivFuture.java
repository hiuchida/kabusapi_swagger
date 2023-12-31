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
import io.swagger.client.model.PositionsDeriv;
import io.swagger.client.model.RequestSendOrderDerivFutureReverseLimitOrder;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * RequestSendOrderDerivFuture
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-23T15:40:58.057448265Z[GMT]")

public class RequestSendOrderDerivFuture {
  @SerializedName("Password")
  private String password = null;

  @SerializedName("Symbol")
  private String symbol = null;

  @SerializedName("Exchange")
  private Integer exchange = null;

  @SerializedName("TradeType")
  private Integer tradeType = null;

  @SerializedName("TimeInForce")
  private Integer timeInForce = null;

  @SerializedName("Side")
  private String side = null;

  @SerializedName("Qty")
  private Integer qty = null;

  @SerializedName("ClosePositionOrder")
  private Integer closePositionOrder = null;

  @SerializedName("ClosePositions")
  private List<PositionsDeriv> closePositions = null;

  @SerializedName("FrontOrderType")
  private Integer frontOrderType = null;

  @SerializedName("Price")
  private Double price = null;

  @SerializedName("ExpireDay")
  private Integer expireDay = null;

  @SerializedName("ReverseLimitOrder")
  private RequestSendOrderDerivFutureReverseLimitOrder reverseLimitOrder = null;

  public RequestSendOrderDerivFuture password(String password) {
    this.password = password;
    return this;
  }

   /**
   * 注文パスワード
   * @return password
  **/
  @Schema(example = "xxxxxx", required = true, description = "注文パスワード")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public RequestSendOrderDerivFuture symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * 銘柄コード&lt;br&gt;※取引最終日に「先物銘柄コード取得」でDerivMonthに0（直近限月）を指定した場合、日中・夜間の時間帯に関わらず、取引最終日を迎える限月の銘柄コードを返します。取引最終日を迎える銘柄の取引は日中取引をもって終了となりますので、ご注意ください。
   * @return symbol
  **/
  @Schema(example = "165120019", required = true, description = "銘柄コード<br>※取引最終日に「先物銘柄コード取得」でDerivMonthに0（直近限月）を指定した場合、日中・夜間の時間帯に関わらず、取引最終日を迎える限月の銘柄コードを返します。取引最終日を迎える銘柄の取引は日中取引をもって終了となりますので、ご注意ください。")
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public RequestSendOrderDerivFuture exchange(Integer exchange) {
    this.exchange = exchange;
    return this;
  }

   /**
   * 市場コード &lt;table&gt;   &lt;thead&gt;       &lt;tr&gt;           &lt;th&gt;定義値&lt;/th&gt;           &lt;th&gt;説明&lt;/th&gt;       &lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;       &lt;tr&gt;           &lt;td&gt;2&lt;/td&gt;           &lt;td&gt;日通し&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;23&lt;/td&gt;           &lt;td&gt;日中&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;24&lt;/td&gt;           &lt;td&gt;夜間&lt;/td&gt;       &lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt;
   * @return exchange
  **/
  @Schema(required = true, description = "市場コード <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>2</td>           <td>日通し</td>       </tr>       <tr>           <td>23</td>           <td>日中</td>       </tr>       <tr>           <td>24</td>           <td>夜間</td>       </tr>   </tbody> </table>")
  public Integer getExchange() {
    return exchange;
  }

  public void setExchange(Integer exchange) {
    this.exchange = exchange;
  }

  public RequestSendOrderDerivFuture tradeType(Integer tradeType) {
    this.tradeType = tradeType;
    return this;
  }

   /**
   * 取引区分 &lt;table&gt;   &lt;thead&gt;       &lt;tr&gt;           &lt;th&gt;定義値&lt;/th&gt;           &lt;th&gt;説明&lt;/th&gt;       &lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;       &lt;tr&gt;           &lt;td&gt;1&lt;/td&gt;           &lt;td&gt;新規&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;2&lt;/td&gt;           &lt;td&gt;返済&lt;/td&gt;       &lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt;
   * @return tradeType
  **/
  @Schema(required = true, description = "取引区分 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>1</td>           <td>新規</td>       </tr>       <tr>           <td>2</td>           <td>返済</td>       </tr>   </tbody> </table>")
  public Integer getTradeType() {
    return tradeType;
  }

  public void setTradeType(Integer tradeType) {
    this.tradeType = tradeType;
  }

  public RequestSendOrderDerivFuture timeInForce(Integer timeInForce) {
    this.timeInForce = timeInForce;
    return this;
  }

   /**
   * 有効期間条件 &lt;table&gt;   &lt;thead&gt;       &lt;tr&gt;           &lt;th&gt;定義値&lt;/th&gt;           &lt;th&gt;説明&lt;/th&gt;       &lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;       &lt;tr&gt;           &lt;td&gt;1&lt;/td&gt;           &lt;td&gt;FAS&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;2&lt;/td&gt;           &lt;td&gt;FAK&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;3&lt;/td&gt;           &lt;td&gt;FOK&lt;/td&gt;       &lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt;  ※執行条件(FrontOrderType)、有効期限条件(TimeInForce)、市場コード(Exchange)で選択できる組み合わせは下表のようになります。               &lt;table&gt;   &lt;thead&gt;     &lt;tr&gt;       &lt;th rowspan&#x3D;\&quot;2\&quot;&gt;執行条件&lt;/th&gt;       &lt;th rowspan&#x3D;\&quot;2\&quot;&gt;有効期間条件&lt;/th&gt;       &lt;th colspan&#x3D;\&quot;3\&quot;&gt;市場コード&lt;/th&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;th&gt;日中&lt;/th&gt;       &lt;th&gt;夜間&lt;/th&gt;       &lt;th&gt;日通し&lt;/th&gt;     &lt;/tr&gt;   &lt;/thead&gt;      &lt;tbody&gt;     &lt;tr&gt;       &lt;td&gt;指値&lt;/td&gt;       &lt;td&gt;FAS&lt;/td&gt;       &lt;td&gt;●&lt;/td&gt;       &lt;td&gt;●&lt;/td&gt;       &lt;td&gt;●&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;指値&lt;/td&gt;       &lt;td&gt;FAK&lt;/td&gt;       &lt;td&gt;●&lt;/td&gt;       &lt;td&gt;●&lt;/td&gt;       &lt;td&gt;-&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;指値&lt;/td&gt;       &lt;td&gt;FOK&lt;/td&gt;       &lt;td&gt;●&lt;/td&gt;       &lt;td&gt;●&lt;/td&gt;       &lt;td&gt;-&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;成行&lt;/td&gt;       &lt;td&gt;FAK&lt;/td&gt;       &lt;td&gt;●&lt;/td&gt;       &lt;td&gt;●&lt;/td&gt;       &lt;td&gt;-&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;成行&lt;/td&gt;       &lt;td&gt;FOK&lt;/td&gt;       &lt;td&gt;●&lt;/td&gt;       &lt;td&gt;●&lt;/td&gt;       &lt;td&gt;-&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;逆指値（指値）&lt;/td&gt;       &lt;td&gt;FAK&lt;/td&gt;       &lt;td&gt;●&lt;/td&gt;       &lt;td&gt;●&lt;/td&gt;       &lt;td&gt;●&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;逆指値（成行）&lt;/td&gt;       &lt;td&gt;FAK&lt;/td&gt;       &lt;td&gt;●&lt;/td&gt;       &lt;td&gt;●&lt;/td&gt;       &lt;td&gt;-&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;引成&lt;/td&gt;       &lt;td&gt;FAK&lt;/td&gt;       &lt;td&gt;●&lt;/td&gt;       &lt;td&gt;●&lt;/td&gt;       &lt;td&gt;-&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;引指&lt;/td&gt;       &lt;td&gt;FAS&lt;/td&gt;       &lt;td&gt;●&lt;/td&gt;       &lt;td&gt;●&lt;/td&gt;       &lt;td&gt;-&lt;/td&gt;     &lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt;
   * @return timeInForce
  **/
  @Schema(required = true, description = "有効期間条件 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>1</td>           <td>FAS</td>       </tr>       <tr>           <td>2</td>           <td>FAK</td>       </tr>       <tr>           <td>3</td>           <td>FOK</td>       </tr>   </tbody> </table>  ※執行条件(FrontOrderType)、有効期限条件(TimeInForce)、市場コード(Exchange)で選択できる組み合わせは下表のようになります。               <table>   <thead>     <tr>       <th rowspan=\"2\">執行条件</th>       <th rowspan=\"2\">有効期間条件</th>       <th colspan=\"3\">市場コード</th>     </tr>     <tr>       <th>日中</th>       <th>夜間</th>       <th>日通し</th>     </tr>   </thead>      <tbody>     <tr>       <td>指値</td>       <td>FAS</td>       <td>●</td>       <td>●</td>       <td>●</td>     </tr>     <tr>       <td>指値</td>       <td>FAK</td>       <td>●</td>       <td>●</td>       <td>-</td>     </tr>     <tr>       <td>指値</td>       <td>FOK</td>       <td>●</td>       <td>●</td>       <td>-</td>     </tr>     <tr>       <td>成行</td>       <td>FAK</td>       <td>●</td>       <td>●</td>       <td>-</td>     </tr>     <tr>       <td>成行</td>       <td>FOK</td>       <td>●</td>       <td>●</td>       <td>-</td>     </tr>     <tr>       <td>逆指値（指値）</td>       <td>FAK</td>       <td>●</td>       <td>●</td>       <td>●</td>     </tr>     <tr>       <td>逆指値（成行）</td>       <td>FAK</td>       <td>●</td>       <td>●</td>       <td>-</td>     </tr>     <tr>       <td>引成</td>       <td>FAK</td>       <td>●</td>       <td>●</td>       <td>-</td>     </tr>     <tr>       <td>引指</td>       <td>FAS</td>       <td>●</td>       <td>●</td>       <td>-</td>     </tr>   </tbody> </table>")
  public Integer getTimeInForce() {
    return timeInForce;
  }

  public void setTimeInForce(Integer timeInForce) {
    this.timeInForce = timeInForce;
  }

  public RequestSendOrderDerivFuture side(String side) {
    this.side = side;
    return this;
  }

   /**
   * 売買区分 &lt;table&gt;   &lt;thead&gt;       &lt;tr&gt;           &lt;th&gt;定義値&lt;/th&gt;           &lt;th&gt;説明&lt;/th&gt;       &lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;       &lt;tr&gt;           &lt;td&gt;1&lt;/td&gt;           &lt;td&gt;売&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;2&lt;/td&gt;           &lt;td&gt;買&lt;/td&gt;       &lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt;
   * @return side
  **/
  @Schema(required = true, description = "売買区分 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>1</td>           <td>売</td>       </tr>       <tr>           <td>2</td>           <td>買</td>       </tr>   </tbody> </table>")
  public String getSide() {
    return side;
  }

  public void setSide(String side) {
    this.side = side;
  }

  public RequestSendOrderDerivFuture qty(Integer qty) {
    this.qty = qty;
    return this;
  }

   /**
   * 注文数量
   * @return qty
  **/
  @Schema(required = true, description = "注文数量")
  public Integer getQty() {
    return qty;
  }

  public void setQty(Integer qty) {
    this.qty = qty;
  }

  public RequestSendOrderDerivFuture closePositionOrder(Integer closePositionOrder) {
    this.closePositionOrder = closePositionOrder;
    return this;
  }

   /**
   * 決済順序&lt;br&gt;※ClosePositionOrderとClosePositionsはどちらか一方のみ指定可能。&lt;br&gt;※ClosePositionOrderとClosePositionsを両方指定した場合、エラー。 &lt;table&gt;   &lt;thead&gt;       &lt;tr&gt;           &lt;th&gt;定義値&lt;/th&gt;           &lt;th&gt;説明&lt;/th&gt;       &lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;       &lt;tr&gt;           &lt;td&gt;0&lt;/td&gt;           &lt;td&gt;日付（古い順）、損益（高い順）&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;1&lt;/td&gt;           &lt;td&gt;日付（古い順）、損益（低い順）&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;2&lt;/td&gt;           &lt;td&gt;日付（新しい順）、損益（高い順）&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;3&lt;/td&gt;           &lt;td&gt;日付（新しい順）、損益（低い順）&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;4&lt;/td&gt;           &lt;td&gt;損益（高い順）、日付（古い順）&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;5&lt;/td&gt;           &lt;td&gt;損益（高い順）、日付（新しい順）&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;6&lt;/td&gt;           &lt;td&gt;損益（低い順）、日付（古い順）&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;7&lt;/td&gt;           &lt;td&gt;損益（低い順）、日付（新しい順）&lt;/td&gt;       &lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt;
   * @return closePositionOrder
  **/
  @Schema(description = "決済順序<br>※ClosePositionOrderとClosePositionsはどちらか一方のみ指定可能。<br>※ClosePositionOrderとClosePositionsを両方指定した場合、エラー。 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>0</td>           <td>日付（古い順）、損益（高い順）</td>       </tr>       <tr>           <td>1</td>           <td>日付（古い順）、損益（低い順）</td>       </tr>       <tr>           <td>2</td>           <td>日付（新しい順）、損益（高い順）</td>       </tr>       <tr>           <td>3</td>           <td>日付（新しい順）、損益（低い順）</td>       </tr>       <tr>           <td>4</td>           <td>損益（高い順）、日付（古い順）</td>       </tr>       <tr>           <td>5</td>           <td>損益（高い順）、日付（新しい順）</td>       </tr>       <tr>           <td>6</td>           <td>損益（低い順）、日付（古い順）</td>       </tr>       <tr>           <td>7</td>           <td>損益（低い順）、日付（新しい順）</td>       </tr>   </tbody> </table>")
  public Integer getClosePositionOrder() {
    return closePositionOrder;
  }

  public void setClosePositionOrder(Integer closePositionOrder) {
    this.closePositionOrder = closePositionOrder;
  }

  public RequestSendOrderDerivFuture closePositions(List<PositionsDeriv> closePositions) {
    this.closePositions = closePositions;
    return this;
  }

  public RequestSendOrderDerivFuture addClosePositionsItem(PositionsDeriv closePositionsItem) {
    if (this.closePositions == null) {
      this.closePositions = new ArrayList<PositionsDeriv>();
    }
    this.closePositions.add(closePositionsItem);
    return this;
  }

   /**
   * 返済建玉指定&lt;br&gt;※ClosePositionOrderとClosePositionsはどちらか一方のみ指定可能。&lt;br&gt;※ClosePositionOrderとClosePositionsを両方指定した場合、エラー。
   * @return closePositions
  **/
  @Schema(description = "返済建玉指定<br>※ClosePositionOrderとClosePositionsはどちらか一方のみ指定可能。<br>※ClosePositionOrderとClosePositionsを両方指定した場合、エラー。")
  public List<PositionsDeriv> getClosePositions() {
    return closePositions;
  }

  public void setClosePositions(List<PositionsDeriv> closePositions) {
    this.closePositions = closePositions;
  }

  public RequestSendOrderDerivFuture frontOrderType(Integer frontOrderType) {
    this.frontOrderType = frontOrderType;
    return this;
  }

   /**
   * 執行条件 &lt;table&gt;   &lt;thead&gt;       &lt;tr&gt;           &lt;th&gt;定義値&lt;/th&gt;           &lt;th&gt;説明&lt;/th&gt;           &lt;th&gt;”Price”の指定&lt;/th&gt;       &lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;       &lt;tr&gt;           &lt;td&gt;18&lt;/td&gt;           &lt;td&gt;引成（派生）&lt;br&gt;※TimeInForceは、「FAK」のみ有効&lt;/td&gt;           &lt;td&gt;0&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;20&lt;/td&gt;           &lt;td&gt;指値&lt;/td&gt;           &lt;td&gt;発注したい金額&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;28&lt;/td&gt;           &lt;td&gt;引指（派生）&lt;br&gt;※TimeInForceは、「FAS」のみ有効&lt;/td&gt;           &lt;td&gt;発注したい金額&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;30&lt;/td&gt;           &lt;td&gt;逆指値&lt;/td&gt;           &lt;td&gt;指定なし&lt;br&gt;※AfterHitPriceで指定ください&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;           &lt;td&gt;120&lt;/td&gt;           &lt;td&gt;成行（マーケットオーダー）&lt;/td&gt;           &lt;td&gt;0&lt;/td&gt;       &lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt;
   * @return frontOrderType
  **/
  @Schema(required = true, description = "執行条件 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>           <th>”Price”の指定</th>       </tr>   </thead>   <tbody>       <tr>           <td>18</td>           <td>引成（派生）<br>※TimeInForceは、「FAK」のみ有効</td>           <td>0</td>       </tr>       <tr>           <td>20</td>           <td>指値</td>           <td>発注したい金額</td>       </tr>       <tr>           <td>28</td>           <td>引指（派生）<br>※TimeInForceは、「FAS」のみ有効</td>           <td>発注したい金額</td>       </tr>       <tr>           <td>30</td>           <td>逆指値</td>           <td>指定なし<br>※AfterHitPriceで指定ください</td>       </tr>       <tr>           <td>120</td>           <td>成行（マーケットオーダー）</td>           <td>0</td>       </tr>   </tbody> </table>")
  public Integer getFrontOrderType() {
    return frontOrderType;
  }

  public void setFrontOrderType(Integer frontOrderType) {
    this.frontOrderType = frontOrderType;
  }

  public RequestSendOrderDerivFuture price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * 注文価格&lt;br&gt;※FrontOrderTypeで成行を指定した場合、0を指定する。&lt;br&gt;※詳細について、”FrontOrderType”をご確認ください。
   * @return price
  **/
  @Schema(required = true, description = "注文価格<br>※FrontOrderTypeで成行を指定した場合、0を指定する。<br>※詳細について、”FrontOrderType”をご確認ください。")
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public RequestSendOrderDerivFuture expireDay(Integer expireDay) {
    this.expireDay = expireDay;
    return this;
  }

   /**
   * 注文有効期限&lt;br&gt; yyyyMMdd形式。&lt;br&gt; 「0」を指定すると、kabuステーション上の発注画面の「本日」に対応する日付として扱います。&lt;br&gt; 「本日」は直近の注文可能日となり、以下のように設定されます。&lt;br&gt; その市場の引けまでの間 : 当日&lt;br&gt; その市場の引け後       : 翌取引所営業日&lt;br&gt; その市場の休前日       : 休日明けの取引所営業日&lt;br&gt; ※ 日替わりはkabuステーションが日付変更通知を受信したタイミングです。&lt;br&gt; ※ 日通しの場合、夜間取引の引け後に日付が更新されます。
   * @return expireDay
  **/
  @Schema(required = true, description = "注文有効期限<br> yyyyMMdd形式。<br> 「0」を指定すると、kabuステーション上の発注画面の「本日」に対応する日付として扱います。<br> 「本日」は直近の注文可能日となり、以下のように設定されます。<br> その市場の引けまでの間 : 当日<br> その市場の引け後       : 翌取引所営業日<br> その市場の休前日       : 休日明けの取引所営業日<br> ※ 日替わりはkabuステーションが日付変更通知を受信したタイミングです。<br> ※ 日通しの場合、夜間取引の引け後に日付が更新されます。")
  public Integer getExpireDay() {
    return expireDay;
  }

  public void setExpireDay(Integer expireDay) {
    this.expireDay = expireDay;
  }

  public RequestSendOrderDerivFuture reverseLimitOrder(RequestSendOrderDerivFutureReverseLimitOrder reverseLimitOrder) {
    this.reverseLimitOrder = reverseLimitOrder;
    return this;
  }

   /**
   * Get reverseLimitOrder
   * @return reverseLimitOrder
  **/
  @Schema(description = "")
  public RequestSendOrderDerivFutureReverseLimitOrder getReverseLimitOrder() {
    return reverseLimitOrder;
  }

  public void setReverseLimitOrder(RequestSendOrderDerivFutureReverseLimitOrder reverseLimitOrder) {
    this.reverseLimitOrder = reverseLimitOrder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestSendOrderDerivFuture requestSendOrderDerivFuture = (RequestSendOrderDerivFuture) o;
    return Objects.equals(this.password, requestSendOrderDerivFuture.password) &&
        Objects.equals(this.symbol, requestSendOrderDerivFuture.symbol) &&
        Objects.equals(this.exchange, requestSendOrderDerivFuture.exchange) &&
        Objects.equals(this.tradeType, requestSendOrderDerivFuture.tradeType) &&
        Objects.equals(this.timeInForce, requestSendOrderDerivFuture.timeInForce) &&
        Objects.equals(this.side, requestSendOrderDerivFuture.side) &&
        Objects.equals(this.qty, requestSendOrderDerivFuture.qty) &&
        Objects.equals(this.closePositionOrder, requestSendOrderDerivFuture.closePositionOrder) &&
        Objects.equals(this.closePositions, requestSendOrderDerivFuture.closePositions) &&
        Objects.equals(this.frontOrderType, requestSendOrderDerivFuture.frontOrderType) &&
        Objects.equals(this.price, requestSendOrderDerivFuture.price) &&
        Objects.equals(this.expireDay, requestSendOrderDerivFuture.expireDay) &&
        Objects.equals(this.reverseLimitOrder, requestSendOrderDerivFuture.reverseLimitOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, symbol, exchange, tradeType, timeInForce, side, qty, closePositionOrder, closePositions, frontOrderType, price, expireDay, reverseLimitOrder);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestSendOrderDerivFuture {\n");
    
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    tradeType: ").append(toIndentedString(tradeType)).append("\n");
    sb.append("    timeInForce: ").append(toIndentedString(timeInForce)).append("\n");
    sb.append("    side: ").append(toIndentedString(side)).append("\n");
    sb.append("    qty: ").append(toIndentedString(qty)).append("\n");
    sb.append("    closePositionOrder: ").append(toIndentedString(closePositionOrder)).append("\n");
    sb.append("    closePositions: ").append(toIndentedString(closePositions)).append("\n");
    sb.append("    frontOrderType: ").append(toIndentedString(frontOrderType)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    expireDay: ").append(toIndentedString(expireDay)).append("\n");
    sb.append("    reverseLimitOrder: ").append(toIndentedString(reverseLimitOrder)).append("\n");
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
