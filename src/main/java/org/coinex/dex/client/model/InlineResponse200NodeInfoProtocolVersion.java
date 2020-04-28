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

/**
 * InlineResponse200NodeInfoProtocolVersion
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-27T01:19:45.029Z")
public class InlineResponse200NodeInfoProtocolVersion {
  @SerializedName("p2p")
  private String p2p = null;

  @SerializedName("block")
  private String block = null;

  @SerializedName("app")
  private String app = null;

  public InlineResponse200NodeInfoProtocolVersion p2p(String p2p) {
    this.p2p = p2p;
    return this;
  }

   /**
   * Get p2p
   * @return p2p
  **/
  @ApiModelProperty(example = "7", value = "")
  public String getP2p() {
    return p2p;
  }

  public void setP2p(String p2p) {
    this.p2p = p2p;
  }

  public InlineResponse200NodeInfoProtocolVersion block(String block) {
    this.block = block;
    return this;
  }

   /**
   * Get block
   * @return block
  **/
  @ApiModelProperty(example = "10", value = "")
  public String getBlock() {
    return block;
  }

  public void setBlock(String block) {
    this.block = block;
  }

  public InlineResponse200NodeInfoProtocolVersion app(String app) {
    this.app = app;
    return this;
  }

   /**
   * Get app
   * @return app
  **/
  @ApiModelProperty(example = "0", value = "")
  public String getApp() {
    return app;
  }

  public void setApp(String app) {
    this.app = app;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200NodeInfoProtocolVersion inlineResponse200NodeInfoProtocolVersion = (InlineResponse200NodeInfoProtocolVersion) o;
    return Objects.equals(this.p2p, inlineResponse200NodeInfoProtocolVersion.p2p) &&
        Objects.equals(this.block, inlineResponse200NodeInfoProtocolVersion.block) &&
        Objects.equals(this.app, inlineResponse200NodeInfoProtocolVersion.app);
  }

  @Override
  public int hashCode() {
    return Objects.hash(p2p, block, app);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200NodeInfoProtocolVersion {\n");
    
    sb.append("    p2p: ").append(toIndentedString(p2p)).append("\n");
    sb.append("    block: ").append(toIndentedString(block)).append("\n");
    sb.append("    app: ").append(toIndentedString(app)).append("\n");
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
