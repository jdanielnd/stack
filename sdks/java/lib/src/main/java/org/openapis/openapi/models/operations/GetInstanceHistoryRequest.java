/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapis.openapi.utils.SpeakeasyMetadata;

public class GetInstanceHistoryRequest {
    /**
     * The instance id
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=instanceID")
    public String instanceID;

    public GetInstanceHistoryRequest withInstanceID(String instanceID) {
        this.instanceID = instanceID;
        return this;
    }
    
    public GetInstanceHistoryRequest(@JsonProperty("instanceID") String instanceID) {
        this.instanceID = instanceID;
  }
}