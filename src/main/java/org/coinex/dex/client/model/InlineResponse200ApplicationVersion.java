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

/**
 * InlineResponse200ApplicationVersion
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-09T11:28:51.986+08:00")
public class InlineResponse200ApplicationVersion {
  @SerializedName("build_tags")
  private String buildTags = null;

  @SerializedName("client_name")
  private String clientName = null;

  @SerializedName("commit")
  private String commit = null;

  @SerializedName("go")
  private String go = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("server_name")
  private String serverName = null;

  @SerializedName("version")
  private String version = null;

  public InlineResponse200ApplicationVersion buildTags(String buildTags) {
    this.buildTags = buildTags;
    return this;
  }

   /**
   * Get buildTags
   * @return buildTags
  **/
  @ApiModelProperty(value = "")
  public String getBuildTags() {
    return buildTags;
  }

  public void setBuildTags(String buildTags) {
    this.buildTags = buildTags;
  }

  public InlineResponse200ApplicationVersion clientName(String clientName) {
    this.clientName = clientName;
    return this;
  }

   /**
   * Get clientName
   * @return clientName
  **/
  @ApiModelProperty(value = "")
  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

  public InlineResponse200ApplicationVersion commit(String commit) {
    this.commit = commit;
    return this;
  }

   /**
   * Get commit
   * @return commit
  **/
  @ApiModelProperty(value = "")
  public String getCommit() {
    return commit;
  }

  public void setCommit(String commit) {
    this.commit = commit;
  }

  public InlineResponse200ApplicationVersion go(String go) {
    this.go = go;
    return this;
  }

   /**
   * Get go
   * @return go
  **/
  @ApiModelProperty(value = "")
  public String getGo() {
    return go;
  }

  public void setGo(String go) {
    this.go = go;
  }

  public InlineResponse200ApplicationVersion name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InlineResponse200ApplicationVersion serverName(String serverName) {
    this.serverName = serverName;
    return this;
  }

   /**
   * Get serverName
   * @return serverName
  **/
  @ApiModelProperty(value = "")
  public String getServerName() {
    return serverName;
  }

  public void setServerName(String serverName) {
    this.serverName = serverName;
  }

  public InlineResponse200ApplicationVersion version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(value = "")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200ApplicationVersion inlineResponse200ApplicationVersion = (InlineResponse200ApplicationVersion) o;
    return Objects.equals(this.buildTags, inlineResponse200ApplicationVersion.buildTags) &&
        Objects.equals(this.clientName, inlineResponse200ApplicationVersion.clientName) &&
        Objects.equals(this.commit, inlineResponse200ApplicationVersion.commit) &&
        Objects.equals(this.go, inlineResponse200ApplicationVersion.go) &&
        Objects.equals(this.name, inlineResponse200ApplicationVersion.name) &&
        Objects.equals(this.serverName, inlineResponse200ApplicationVersion.serverName) &&
        Objects.equals(this.version, inlineResponse200ApplicationVersion.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buildTags, clientName, commit, go, name, serverName, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200ApplicationVersion {\n");
    
    sb.append("    buildTags: ").append(toIndentedString(buildTags)).append("\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    commit: ").append(toIndentedString(commit)).append("\n");
    sb.append("    go: ").append(toIndentedString(go)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

