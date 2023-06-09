/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;

public class UpdateMetadataRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.formance.formance_sdk.models.shared.PaymentMetadata paymentMetadata;

    public UpdateMetadataRequest withPaymentMetadata(com.formance.formance_sdk.models.shared.PaymentMetadata paymentMetadata) {
        this.paymentMetadata = paymentMetadata;
        return this;
    }
    
    /**
     * The payment ID.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=paymentId")
    public String paymentId;

    public UpdateMetadataRequest withPaymentId(String paymentId) {
        this.paymentId = paymentId;
        return this;
    }
    
    public UpdateMetadataRequest(@JsonProperty("PaymentMetadata") com.formance.formance_sdk.models.shared.PaymentMetadata paymentMetadata, @JsonProperty("paymentId") String paymentId) {
        this.paymentMetadata = paymentMetadata;
        this.paymentId = paymentId;
  }
}