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

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Account
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-27T01:19:45.029Z")
public class Account extends HashMap<String, Object> {
  @SerializedName("base_req")
  private BaseReq baseReq = null;

  @SerializedName("amount")
  private List<Coin> amount = new ArrayList<Coin>();

  @SerializedName("unlock_time")
  private String unlockTime = null;

  public Account baseReq(BaseReq baseReq) {
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

  public Account amount(List<Coin> amount) {
    this.amount = amount;
    return this;
  }

  public Account addAmountItem(Coin amountItem) {
    this.amount.add(amountItem);
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "")
  public List<Coin> getAmount() {
    return amount;
  }

  public void setAmount(List<Coin> amount) {
    this.amount = amount;
  }

  public Account unlockTime(String unlockTime) {
    this.unlockTime = unlockTime;
    return this;
  }

   /**
   * Get unlockTime
   * @return unlockTime
  **/
  @ApiModelProperty(example = "675132000", required = true, value = "")
  public String getUnlockTime() {
    return unlockTime;
  }

  public void setUnlockTime(String unlockTime) {
    this.unlockTime = unlockTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.baseReq, account.baseReq) &&
        Objects.equals(this.amount, account.amount) &&
        Objects.equals(this.unlockTime, account.unlockTime) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseReq, amount, unlockTime, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    baseReq: ").append(toIndentedString(baseReq)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    unlockTime: ").append(toIndentedString(unlockTime)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
