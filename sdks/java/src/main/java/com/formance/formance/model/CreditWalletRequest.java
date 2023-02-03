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
import com.formance.formance.model.Monetary;
import com.formance.formance.model.Subject;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * CreditWalletRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreditWalletRequest {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Monetary amount;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, Object> metadata = null;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public static final String SERIALIZED_NAME_SOURCES = "sources";
  @SerializedName(SERIALIZED_NAME_SOURCES)
  private List<Subject> sources = new ArrayList<>();

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private String balance;

  public CreditWalletRequest() {
  }

  public CreditWalletRequest amount(Monetary amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nonnull

  public Monetary getAmount() {
    return amount;
  }


  public void setAmount(Monetary amount) {
    this.amount = amount;
  }


  public CreditWalletRequest metadata(Map<String, Object> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public CreditWalletRequest putMetadataItem(String key, Object metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Metadata associated with the wallet.
   * @return metadata
  **/
  @javax.annotation.Nullable

  public Map<String, Object> getMetadata() {
    return metadata;
  }


  public void setMetadata(Map<String, Object> metadata) {
    this.metadata = metadata;
  }


  public CreditWalletRequest reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * Get reference
   * @return reference
  **/
  @javax.annotation.Nullable

  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {
    this.reference = reference;
  }


  public CreditWalletRequest sources(List<Subject> sources) {
    
    this.sources = sources;
    return this;
  }

  public CreditWalletRequest addSourcesItem(Subject sourcesItem) {
    this.sources.add(sourcesItem);
    return this;
  }

   /**
   * Get sources
   * @return sources
  **/
  @javax.annotation.Nonnull

  public List<Subject> getSources() {
    return sources;
  }


  public void setSources(List<Subject> sources) {
    this.sources = sources;
  }


  public CreditWalletRequest balance(String balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * The balance to credit
   * @return balance
  **/
  @javax.annotation.Nullable

  public String getBalance() {
    return balance;
  }


  public void setBalance(String balance) {
    this.balance = balance;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditWalletRequest creditWalletRequest = (CreditWalletRequest) o;
    return Objects.equals(this.amount, creditWalletRequest.amount) &&
        Objects.equals(this.metadata, creditWalletRequest.metadata) &&
        Objects.equals(this.reference, creditWalletRequest.reference) &&
        Objects.equals(this.sources, creditWalletRequest.sources) &&
        Objects.equals(this.balance, creditWalletRequest.balance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, metadata, reference, sources, balance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditWalletRequest {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
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

