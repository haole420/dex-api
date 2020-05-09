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
import java.util.ArrayList;
import java.util.List;
import org.coinex.dex.client.model.PricePoint;

/**
 * InlineResponse20055
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-09T11:28:51.986+08:00")
public class InlineResponse20055 {
  @SerializedName("asks")
  private List<PricePoint> asks = null;

  @SerializedName("bids")
  private List<PricePoint> bids = null;

  public InlineResponse20055 asks(List<PricePoint> asks) {
    this.asks = asks;
    return this;
  }

  public InlineResponse20055 addAsksItem(PricePoint asksItem) {
    if (this.asks == null) {
      this.asks = new ArrayList<>();
    }
    this.asks.add(asksItem);
    return this;
  }

   /**
   * Get asks
   * @return asks
  **/
  @ApiModelProperty(value = "")
  public List<PricePoint> getAsks() {
    return asks;
  }

  public void setAsks(List<PricePoint> asks) {
    this.asks = asks;
  }

  public InlineResponse20055 bids(List<PricePoint> bids) {
    this.bids = bids;
    return this;
  }

  public InlineResponse20055 addBidsItem(PricePoint bidsItem) {
    if (this.bids == null) {
      this.bids = new ArrayList<>();
    }
    this.bids.add(bidsItem);
    return this;
  }

   /**
   * Get bids
   * @return bids
  **/
  @ApiModelProperty(value = "")
  public List<PricePoint> getBids() {
    return bids;
  }

  public void setBids(List<PricePoint> bids) {
    this.bids = bids;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20055 inlineResponse20055 = (InlineResponse20055) o;
    return Objects.equals(this.asks, inlineResponse20055.asks) &&
        Objects.equals(this.bids, inlineResponse20055.bids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asks, bids);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20055 {\n");
    
    sb.append("    asks: ").append(toIndentedString(asks)).append("\n");
    sb.append("    bids: ").append(toIndentedString(bids)).append("\n");
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
