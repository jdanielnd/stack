/*
 * Formance Stack API
 * Open, modular foundation for unique payments flows  # Introduction This API is documented in **OpenAPI format**.  # Authentication Formance Stack offers one forms of authentication:   - OAuth2 OAuth2 - an open protocol to allow secure authorization in a simple and standard method from web, mobile and desktop applications. <SecurityDefinitions /> 
 *
 * The version of the OpenAPI document: develop
 * Contact: support@formance.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.formance.formance.model;

import java.util.Objects;
import java.util.Arrays;
import com.formance.formance.model.Subject;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * ExpandedDebitHold
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExpandedDebitHold {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_WALLET_I_D = "walletID";
  @SerializedName(SERIALIZED_NAME_WALLET_I_D)
  private String walletID;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = new HashMap<>();

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DESTINATION = "destination";
  @SerializedName(SERIALIZED_NAME_DESTINATION)
  private Subject destination;

  public static final String SERIALIZED_NAME_REMAINING = "remaining";
  @SerializedName(SERIALIZED_NAME_REMAINING)
  private Long remaining;

  public static final String SERIALIZED_NAME_ORIGINAL_AMOUNT = "originalAmount";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_AMOUNT)
  private Long originalAmount;

  public ExpandedDebitHold() {
  }

  public ExpandedDebitHold id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique ID of the hold.
   * @return id
  **/
  @javax.annotation.Nonnull

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public ExpandedDebitHold walletID(String walletID) {
    
    this.walletID = walletID;
    return this;
  }

   /**
   * The ID of the wallet the hold is associated with.
   * @return walletID
  **/
  @javax.annotation.Nonnull

  public String getWalletID() {
    return walletID;
  }


  public void setWalletID(String walletID) {
    this.walletID = walletID;
  }


  public ExpandedDebitHold metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public ExpandedDebitHold putMetadataItem(String key, String metadataItem) {
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Metadata associated with the hold.
   * @return metadata
  **/
  @javax.annotation.Nonnull

  public Map<String, String> getMetadata() {
    return metadata;
  }


  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }


  public ExpandedDebitHold description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nonnull

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ExpandedDebitHold destination(Subject destination) {
    
    this.destination = destination;
    return this;
  }

   /**
   * Get destination
   * @return destination
  **/
  @javax.annotation.Nullable

  public Subject getDestination() {
    return destination;
  }


  public void setDestination(Subject destination) {
    this.destination = destination;
  }


  public ExpandedDebitHold remaining(Long remaining) {
    
    this.remaining = remaining;
    return this;
  }

   /**
   * Remaining amount on hold
   * @return remaining
  **/
  @javax.annotation.Nonnull

  public Long getRemaining() {
    return remaining;
  }


  public void setRemaining(Long remaining) {
    this.remaining = remaining;
  }


  public ExpandedDebitHold originalAmount(Long originalAmount) {
    
    this.originalAmount = originalAmount;
    return this;
  }

   /**
   * Original amount on hold
   * @return originalAmount
  **/
  @javax.annotation.Nonnull

  public Long getOriginalAmount() {
    return originalAmount;
  }


  public void setOriginalAmount(Long originalAmount) {
    this.originalAmount = originalAmount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExpandedDebitHold expandedDebitHold = (ExpandedDebitHold) o;
    return Objects.equals(this.id, expandedDebitHold.id) &&
        Objects.equals(this.walletID, expandedDebitHold.walletID) &&
        Objects.equals(this.metadata, expandedDebitHold.metadata) &&
        Objects.equals(this.description, expandedDebitHold.description) &&
        Objects.equals(this.destination, expandedDebitHold.destination) &&
        Objects.equals(this.remaining, expandedDebitHold.remaining) &&
        Objects.equals(this.originalAmount, expandedDebitHold.originalAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, walletID, metadata, description, destination, remaining, originalAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpandedDebitHold {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    walletID: ").append(toIndentedString(walletID)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    remaining: ").append(toIndentedString(remaining)).append("\n");
    sb.append("    originalAmount: ").append(toIndentedString(originalAmount)).append("\n");
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

