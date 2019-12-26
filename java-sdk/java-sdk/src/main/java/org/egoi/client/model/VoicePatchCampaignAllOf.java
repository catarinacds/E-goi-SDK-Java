/*
 * APIv3 (Beta)
 *  # Introduction Just a quick pick!!! This is our new version of API. Remember, it is not stable yet!!! But we invite you play with it and give us your feedback ;) # Getting Started  E-goi can be integrated with many environments and programming languages via our REST API. We've created a developer focused portal to give your organization a clear and quick overview of how to integrate with E-goi. The developer portal focuses on scenarios for integration and flow of events. We recommend familiarizing yourself with all of the content in the developer portal, before start using our rest API.   The E-goi  APIv3 is served over HTTPS. To ensure data privacy, unencrypted HTTP is not supported.  Request data is passed to the API by POSTing JSON objects to the API endpoints with the appropriate parameters.   BaseURL = api.egoiapp.com  # HTTP Methods for RESTful Services This API supports 5 HTTP methods:  * <b>GET</b>: The HTTP GET method is used to **read** (or retrieve) a representation of a resource. * <b>POST</b>: The POST verb is most-often utilized to **create** new resources. * <b>PATCH</b>: PATCH is used for **modify** capabilities. The PATCH request only needs to contain the changes to the resource, not the complete resource * <b>PUT</b>: PUT is most-often utilized for **update** capabilities, PUT-ing to a known resource URI with the request body containing the newly-updated representation of the original resource. * <b>DELETE</b>: DELETE is pretty easy to understand. It is used to **delete** a resource identified by a URI.  # Authentication   We use a custom authentication method, you will need a apikey that you can find in your account settings. Below you will see a curl example to get your account information:  #!/bin/bash  curl -X GET 'https://api.egoiapp.com/my-account' \\  -H 'accept: application/json' \\  -H 'Apikey: <YOUR_APY_KEY>'  Here you can see a curl Post example with authentication:  #!/bin/bash  curl -X POST 'http://api.egoiapp.com/tags' \\  -H 'accept: application/json' \\  -H 'Apikey: <YOUR_APY_KEY>' \\  -H 'Content-Type: application/json' \\  -d '{`name`:`Your custom tag`,`color`:`#FFFFFF`}'  <security-definitions/>
 *
 * The version of the OpenAPI document: 3.0.0-beta
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.egoi.client.model;

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
import org.egoi.client.model.ContentVoicePatch;

/**
 * VoicePatchCampaignAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-26T17:55:31.079829Z[Europe/Lisbon]")
public class VoicePatchCampaignAllOf   {
  public static final String SERIALIZED_NAME_INTERNAL_NAME = "internal_name";
  @SerializedName(SERIALIZED_NAME_INTERNAL_NAME)
  private String internalName;

  public static final String SERIALIZED_NAME_GROUP_ID = "group_id";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private Integer groupId;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private ContentVoicePatch message;

  public static final String SERIALIZED_NAME_SENDER_ID = "sender_id";
  @SerializedName(SERIALIZED_NAME_SENDER_ID)
  private Integer senderId;


  public VoicePatchCampaignAllOf internalName(String internalName) {
    
    this.internalName = internalName;
    return this;
  }

   /**
   * Voice campaign internal name
   * @return internalName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Voice campaign internal name")

  public String getInternalName() {
    return internalName;
  }


  public void setInternalName(String internalName) {
    this.internalName = internalName;
  }


  public VoicePatchCampaignAllOf groupId(Integer groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * Get groupId
   * minimum: 1
   * @return groupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getGroupId() {
    return groupId;
  }


  public void setGroupId(Integer groupId) {
    this.groupId = groupId;
  }


  public VoicePatchCampaignAllOf message(ContentVoicePatch message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ContentVoicePatch getMessage() {
    return message;
  }


  public void setMessage(ContentVoicePatch message) {
    this.message = message;
  }


  public VoicePatchCampaignAllOf senderId(Integer senderId) {
    
    this.senderId = senderId;
    return this;
  }

   /**
   * Get senderId
   * minimum: 1
   * @return senderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getSenderId() {
    return senderId;
  }


  public void setSenderId(Integer senderId) {
    this.senderId = senderId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoicePatchCampaignAllOf voicePatchCampaignAllOf = (VoicePatchCampaignAllOf) o;
    return Objects.equals(this.internalName, voicePatchCampaignAllOf.internalName) &&
        Objects.equals(this.groupId, voicePatchCampaignAllOf.groupId) &&
        Objects.equals(this.message, voicePatchCampaignAllOf.message) &&
        Objects.equals(this.senderId, voicePatchCampaignAllOf.senderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(internalName, groupId, message, senderId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoicePatchCampaignAllOf {\n");
    sb.append("    internalName: ").append(toIndentedString(internalName)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    senderId: ").append(toIndentedString(senderId)).append("\n");
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

