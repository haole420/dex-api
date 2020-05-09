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
import org.coinex.dex.client.model.InlineResponse200NodeInfoOther;
import org.coinex.dex.client.model.InlineResponse200NodeInfoProtocolVersion;

/**
 * InlineResponse200NodeInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-09T11:28:51.986+08:00")
public class InlineResponse200NodeInfo {
  @SerializedName("id")
  private String id = null;

  @SerializedName("moniker")
  private String moniker = null;

  @SerializedName("protocol_version")
  private InlineResponse200NodeInfoProtocolVersion protocolVersion = null;

  @SerializedName("network")
  private String network = null;

  @SerializedName("channels")
  private String channels = null;

  @SerializedName("listen_addr")
  private String listenAddr = null;

  @SerializedName("version")
  private String version = null;

  @SerializedName("other")
  private InlineResponse200NodeInfoOther other = null;

  public InlineResponse200NodeInfo id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InlineResponse200NodeInfo moniker(String moniker) {
    this.moniker = moniker;
    return this;
  }

   /**
   * Get moniker
   * @return moniker
  **/
  @ApiModelProperty(example = "validator-name", value = "")
  public String getMoniker() {
    return moniker;
  }

  public void setMoniker(String moniker) {
    this.moniker = moniker;
  }

  public InlineResponse200NodeInfo protocolVersion(InlineResponse200NodeInfoProtocolVersion protocolVersion) {
    this.protocolVersion = protocolVersion;
    return this;
  }

   /**
   * Get protocolVersion
   * @return protocolVersion
  **/
  @ApiModelProperty(value = "")
  public InlineResponse200NodeInfoProtocolVersion getProtocolVersion() {
    return protocolVersion;
  }

  public void setProtocolVersion(InlineResponse200NodeInfoProtocolVersion protocolVersion) {
    this.protocolVersion = protocolVersion;
  }

  public InlineResponse200NodeInfo network(String network) {
    this.network = network;
    return this;
  }

   /**
   * Get network
   * @return network
  **/
  @ApiModelProperty(example = "gaia-2", value = "")
  public String getNetwork() {
    return network;
  }

  public void setNetwork(String network) {
    this.network = network;
  }

  public InlineResponse200NodeInfo channels(String channels) {
    this.channels = channels;
    return this;
  }

   /**
   * Get channels
   * @return channels
  **/
  @ApiModelProperty(value = "")
  public String getChannels() {
    return channels;
  }

  public void setChannels(String channels) {
    this.channels = channels;
  }

  public InlineResponse200NodeInfo listenAddr(String listenAddr) {
    this.listenAddr = listenAddr;
    return this;
  }

   /**
   * Get listenAddr
   * @return listenAddr
  **/
  @ApiModelProperty(example = "192.168.56.1:26656", value = "")
  public String getListenAddr() {
    return listenAddr;
  }

  public void setListenAddr(String listenAddr) {
    this.listenAddr = listenAddr;
  }

  public InlineResponse200NodeInfo version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Tendermint version
   * @return version
  **/
  @ApiModelProperty(example = "0.15.0", value = "Tendermint version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public InlineResponse200NodeInfo other(InlineResponse200NodeInfoOther other) {
    this.other = other;
    return this;
  }

   /**
   * Get other
   * @return other
  **/
  @ApiModelProperty(value = "")
  public InlineResponse200NodeInfoOther getOther() {
    return other;
  }

  public void setOther(InlineResponse200NodeInfoOther other) {
    this.other = other;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200NodeInfo inlineResponse200NodeInfo = (InlineResponse200NodeInfo) o;
    return Objects.equals(this.id, inlineResponse200NodeInfo.id) &&
        Objects.equals(this.moniker, inlineResponse200NodeInfo.moniker) &&
        Objects.equals(this.protocolVersion, inlineResponse200NodeInfo.protocolVersion) &&
        Objects.equals(this.network, inlineResponse200NodeInfo.network) &&
        Objects.equals(this.channels, inlineResponse200NodeInfo.channels) &&
        Objects.equals(this.listenAddr, inlineResponse200NodeInfo.listenAddr) &&
        Objects.equals(this.version, inlineResponse200NodeInfo.version) &&
        Objects.equals(this.other, inlineResponse200NodeInfo.other);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, moniker, protocolVersion, network, channels, listenAddr, version, other);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200NodeInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    moniker: ").append(toIndentedString(moniker)).append("\n");
    sb.append("    protocolVersion: ").append(toIndentedString(protocolVersion)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
    sb.append("    listenAddr: ").append(toIndentedString(listenAddr)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    other: ").append(toIndentedString(other)).append("\n");
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

