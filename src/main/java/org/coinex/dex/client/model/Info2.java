/*
 * CET-Lite for CoinEx Chain
 * A REST interface for state queries, transaction generation and broadcasting.
 *
 * OpenAPI spec version: 3.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.coinex.dex.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.coinex.dex.client.model.BaseReq;

/**
 * Info2
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-09T11:28:51.986+08:00")
public class Info2 {
  @SerializedName("base_req")
  private BaseReq baseReq = null;

  @SerializedName("trading_pair")
  private String tradingPair = null;

  @SerializedName("time")
  private String time = null;

  public Info2 baseReq(BaseReq baseReq) {
    this.baseReq = baseReq;
    return this;
  }

   /**
   * Get baseReq
   * @return baseReq
  **/
  @ApiModelProperty(required = true, value = "")
  public BaseReq getBaseReq() {
    return baseReq;
  }

  public void setBaseReq(BaseReq baseReq) {
    this.baseReq = baseReq;
  }

  public Info2 tradingPair(String tradingPair) {
    this.tradingPair = tradingPair;
    return this;
  }

   /**
   * Get tradingPair
   * @return tradingPair
  **/
  @ApiModelProperty(example = "abc/cet", required = true, value = "")
  public String getTradingPair() {
    return tradingPair;
  }

  public void setTradingPair(String tradingPair) {
    this.tradingPair = tradingPair;
  }

  public Info2 time(String time) {
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @ApiModelProperty(example = "7", required = true, value = "")
  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Info2 info2 = (Info2) o;
    return Objects.equals(this.baseReq, info2.baseReq) &&
        Objects.equals(this.tradingPair, info2.tradingPair) &&
        Objects.equals(this.time, info2.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseReq, tradingPair, time);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Info2 {\n");
    
    sb.append("    baseReq: ").append(toIndentedString(baseReq)).append("\n");
    sb.append("    tradingPair: ").append(toIndentedString(tradingPair)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

