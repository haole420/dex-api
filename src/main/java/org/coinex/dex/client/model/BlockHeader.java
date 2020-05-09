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
import java.math.BigDecimal;
import org.coinex.dex.client.model.BlockHeaderVersion;
import org.coinex.dex.client.model.BlockID;

/**
 * BlockHeader
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-09T11:28:51.986+08:00")
public class BlockHeader {
  @SerializedName("chain_id")
  private String chainId = null;

  @SerializedName("height")
  private BigDecimal height = null;

  @SerializedName("time")
  private String time = null;

  @SerializedName("num_txs")
  private BigDecimal numTxs = null;

  @SerializedName("last_block_id")
  private BlockID lastBlockId = null;

  @SerializedName("total_txs")
  private BigDecimal totalTxs = null;

  @SerializedName("last_commit_hash")
  private String lastCommitHash = null;

  @SerializedName("data_hash")
  private String dataHash = null;

  @SerializedName("validators_hash")
  private String validatorsHash = null;

  @SerializedName("next_validators_hash")
  private String nextValidatorsHash = null;

  @SerializedName("consensus_hash")
  private String consensusHash = null;

  @SerializedName("app_hash")
  private String appHash = null;

  @SerializedName("last_results_hash")
  private String lastResultsHash = null;

  @SerializedName("evidence_hash")
  private String evidenceHash = null;

  @SerializedName("proposer_address")
  private String proposerAddress = null;

  @SerializedName("version")
  private BlockHeaderVersion version = null;

  public BlockHeader chainId(String chainId) {
    this.chainId = chainId;
    return this;
  }

   /**
   * Get chainId
   * @return chainId
  **/
  @ApiModelProperty(example = "coinexchain-2", required = true, value = "")
  public String getChainId() {
    return chainId;
  }

  public void setChainId(String chainId) {
    this.chainId = chainId;
  }

  public BlockHeader height(BigDecimal height) {
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @ApiModelProperty(example = "1.0", required = true, value = "")
  public BigDecimal getHeight() {
    return height;
  }

  public void setHeight(BigDecimal height) {
    this.height = height;
  }

  public BlockHeader time(String time) {
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @ApiModelProperty(example = "2017-12-30T05:53:09.287+01:00", required = true, value = "")
  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public BlockHeader numTxs(BigDecimal numTxs) {
    this.numTxs = numTxs;
    return this;
  }

   /**
   * Get numTxs
   * @return numTxs
  **/
  @ApiModelProperty(example = "0.0", required = true, value = "")
  public BigDecimal getNumTxs() {
    return numTxs;
  }

  public void setNumTxs(BigDecimal numTxs) {
    this.numTxs = numTxs;
  }

  public BlockHeader lastBlockId(BlockID lastBlockId) {
    this.lastBlockId = lastBlockId;
    return this;
  }

   /**
   * Get lastBlockId
   * @return lastBlockId
  **/
  @ApiModelProperty(required = true, value = "")
  public BlockID getLastBlockId() {
    return lastBlockId;
  }

  public void setLastBlockId(BlockID lastBlockId) {
    this.lastBlockId = lastBlockId;
  }

  public BlockHeader totalTxs(BigDecimal totalTxs) {
    this.totalTxs = totalTxs;
    return this;
  }

   /**
   * Get totalTxs
   * @return totalTxs
  **/
  @ApiModelProperty(example = "35.0", required = true, value = "")
  public BigDecimal getTotalTxs() {
    return totalTxs;
  }

  public void setTotalTxs(BigDecimal totalTxs) {
    this.totalTxs = totalTxs;
  }

  public BlockHeader lastCommitHash(String lastCommitHash) {
    this.lastCommitHash = lastCommitHash;
    return this;
  }

   /**
   * Get lastCommitHash
   * @return lastCommitHash
  **/
  @ApiModelProperty(required = true, value = "")
  public String getLastCommitHash() {
    return lastCommitHash;
  }

  public void setLastCommitHash(String lastCommitHash) {
    this.lastCommitHash = lastCommitHash;
  }

  public BlockHeader dataHash(String dataHash) {
    this.dataHash = dataHash;
    return this;
  }

   /**
   * Get dataHash
   * @return dataHash
  **/
  @ApiModelProperty(required = true, value = "")
  public String getDataHash() {
    return dataHash;
  }

  public void setDataHash(String dataHash) {
    this.dataHash = dataHash;
  }

  public BlockHeader validatorsHash(String validatorsHash) {
    this.validatorsHash = validatorsHash;
    return this;
  }

   /**
   * Get validatorsHash
   * @return validatorsHash
  **/
  @ApiModelProperty(required = true, value = "")
  public String getValidatorsHash() {
    return validatorsHash;
  }

  public void setValidatorsHash(String validatorsHash) {
    this.validatorsHash = validatorsHash;
  }

  public BlockHeader nextValidatorsHash(String nextValidatorsHash) {
    this.nextValidatorsHash = nextValidatorsHash;
    return this;
  }

   /**
   * Get nextValidatorsHash
   * @return nextValidatorsHash
  **/
  @ApiModelProperty(required = true, value = "")
  public String getNextValidatorsHash() {
    return nextValidatorsHash;
  }

  public void setNextValidatorsHash(String nextValidatorsHash) {
    this.nextValidatorsHash = nextValidatorsHash;
  }

  public BlockHeader consensusHash(String consensusHash) {
    this.consensusHash = consensusHash;
    return this;
  }

   /**
   * Get consensusHash
   * @return consensusHash
  **/
  @ApiModelProperty(required = true, value = "")
  public String getConsensusHash() {
    return consensusHash;
  }

  public void setConsensusHash(String consensusHash) {
    this.consensusHash = consensusHash;
  }

  public BlockHeader appHash(String appHash) {
    this.appHash = appHash;
    return this;
  }

   /**
   * Get appHash
   * @return appHash
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAppHash() {
    return appHash;
  }

  public void setAppHash(String appHash) {
    this.appHash = appHash;
  }

  public BlockHeader lastResultsHash(String lastResultsHash) {
    this.lastResultsHash = lastResultsHash;
    return this;
  }

   /**
   * Get lastResultsHash
   * @return lastResultsHash
  **/
  @ApiModelProperty(required = true, value = "")
  public String getLastResultsHash() {
    return lastResultsHash;
  }

  public void setLastResultsHash(String lastResultsHash) {
    this.lastResultsHash = lastResultsHash;
  }

  public BlockHeader evidenceHash(String evidenceHash) {
    this.evidenceHash = evidenceHash;
    return this;
  }

   /**
   * Get evidenceHash
   * @return evidenceHash
  **/
  @ApiModelProperty(required = true, value = "")
  public String getEvidenceHash() {
    return evidenceHash;
  }

  public void setEvidenceHash(String evidenceHash) {
    this.evidenceHash = evidenceHash;
  }

  public BlockHeader proposerAddress(String proposerAddress) {
    this.proposerAddress = proposerAddress;
    return this;
  }

   /**
   * Get proposerAddress
   * @return proposerAddress
  **/
  @ApiModelProperty(required = true, value = "")
  public String getProposerAddress() {
    return proposerAddress;
  }

  public void setProposerAddress(String proposerAddress) {
    this.proposerAddress = proposerAddress;
  }

  public BlockHeader version(BlockHeaderVersion version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(required = true, value = "")
  public BlockHeaderVersion getVersion() {
    return version;
  }

  public void setVersion(BlockHeaderVersion version) {
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
    BlockHeader blockHeader = (BlockHeader) o;
    return Objects.equals(this.chainId, blockHeader.chainId) &&
        Objects.equals(this.height, blockHeader.height) &&
        Objects.equals(this.time, blockHeader.time) &&
        Objects.equals(this.numTxs, blockHeader.numTxs) &&
        Objects.equals(this.lastBlockId, blockHeader.lastBlockId) &&
        Objects.equals(this.totalTxs, blockHeader.totalTxs) &&
        Objects.equals(this.lastCommitHash, blockHeader.lastCommitHash) &&
        Objects.equals(this.dataHash, blockHeader.dataHash) &&
        Objects.equals(this.validatorsHash, blockHeader.validatorsHash) &&
        Objects.equals(this.nextValidatorsHash, blockHeader.nextValidatorsHash) &&
        Objects.equals(this.consensusHash, blockHeader.consensusHash) &&
        Objects.equals(this.appHash, blockHeader.appHash) &&
        Objects.equals(this.lastResultsHash, blockHeader.lastResultsHash) &&
        Objects.equals(this.evidenceHash, blockHeader.evidenceHash) &&
        Objects.equals(this.proposerAddress, blockHeader.proposerAddress) &&
        Objects.equals(this.version, blockHeader.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chainId, height, time, numTxs, lastBlockId, totalTxs, lastCommitHash, dataHash, validatorsHash, nextValidatorsHash, consensusHash, appHash, lastResultsHash, evidenceHash, proposerAddress, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockHeader {\n");
    
    sb.append("    chainId: ").append(toIndentedString(chainId)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    numTxs: ").append(toIndentedString(numTxs)).append("\n");
    sb.append("    lastBlockId: ").append(toIndentedString(lastBlockId)).append("\n");
    sb.append("    totalTxs: ").append(toIndentedString(totalTxs)).append("\n");
    sb.append("    lastCommitHash: ").append(toIndentedString(lastCommitHash)).append("\n");
    sb.append("    dataHash: ").append(toIndentedString(dataHash)).append("\n");
    sb.append("    validatorsHash: ").append(toIndentedString(validatorsHash)).append("\n");
    sb.append("    nextValidatorsHash: ").append(toIndentedString(nextValidatorsHash)).append("\n");
    sb.append("    consensusHash: ").append(toIndentedString(consensusHash)).append("\n");
    sb.append("    appHash: ").append(toIndentedString(appHash)).append("\n");
    sb.append("    lastResultsHash: ").append(toIndentedString(lastResultsHash)).append("\n");
    sb.append("    evidenceHash: ").append(toIndentedString(evidenceHash)).append("\n");
    sb.append("    proposerAddress: ").append(toIndentedString(proposerAddress)).append("\n");
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

