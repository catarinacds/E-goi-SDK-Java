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
import java.util.ArrayList;
import java.util.List;
import org.egoi.client.model.NotifyUserIdArrayActionSend;
import org.egoi.client.model.SendSmsAllOf;
import org.egoi.client.model.SendSmsAllOf1;
import org.egoi.client.model.SendSmsAllOf2;
import org.egoi.client.model.SmsSegmentsActionSend;

/**
 * SendSms
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-18T16:14:18.288020Z[Europe/Lisbon]")
public class SendSms {
  public static final String SERIALIZED_NAME_LIST_ID = "list_id";
  @SerializedName(SERIALIZED_NAME_LIST_ID)
  private Integer listId;

  public static final String SERIALIZED_NAME_DESTINATION_FIELD = "destination_field";
  @SerializedName(SERIALIZED_NAME_DESTINATION_FIELD)
  private String destinationField;

  public static final String SERIALIZED_NAME_SEGMENTS = "segments";
  @SerializedName(SERIALIZED_NAME_SEGMENTS)
  private SmsSegmentsActionSend segments;

  public static final String SERIALIZED_NAME_NOTIFY = "notify";
  @SerializedName(SERIALIZED_NAME_NOTIFY)
  private List<Integer> notify = null;


  public SendSms listId(Integer listId) {
    
    this.listId = listId;
    return this;
  }

   /**
   * Get listId
   * minimum: 1
   * @return listId
  **/
  @ApiModelProperty(example = "1", required = true, value = "")

  public Integer getListId() {
    return listId;
  }


  public void setListId(Integer listId) {
    this.listId = listId;
  }


  public SendSms destinationField(String destinationField) {
    
    this.destinationField = destinationField;
    return this;
  }

   /**
   * SMS campaign destination field. Must be &#39;cellphone&#39; or the other field ID of type                                 cellphone
   * @return destinationField
  **/
  @ApiModelProperty(example = "cellphone", required = true, value = "SMS campaign destination field. Must be 'cellphone' or the other field ID of type                                 cellphone")

  public String getDestinationField() {
    return destinationField;
  }


  public void setDestinationField(String destinationField) {
    this.destinationField = destinationField;
  }


  public SendSms segments(SmsSegmentsActionSend segments) {
    
    this.segments = segments;
    return this;
  }

   /**
   * Get segments
   * @return segments
  **/
  @ApiModelProperty(required = true, value = "")

  public SmsSegmentsActionSend getSegments() {
    return segments;
  }


  public void setSegments(SmsSegmentsActionSend segments) {
    this.segments = segments;
  }


  public SendSms notify(List<Integer> notify) {
    
    this.notify = notify;
    return this;
  }

  public SendSms addNotifyItem(Integer notifyItem) {
    if (this.notify == null) {
      this.notify = new ArrayList<Integer>();
    }
    this.notify.add(notifyItem);
    return this;
  }

   /**
   * Array of IDs of the users to notify
   * @return notify
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of IDs of the users to notify")

  public List<Integer> getNotify() {
    return notify;
  }


  public void setNotify(List<Integer> notify) {
    this.notify = notify;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendSms sendSms = (SendSms) o;
    return Objects.equals(this.listId, sendSms.listId) &&
        Objects.equals(this.destinationField, sendSms.destinationField) &&
        Objects.equals(this.segments, sendSms.segments) &&
        Objects.equals(this.notify, sendSms.notify);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listId, destinationField, segments, notify);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendSms {\n");
    sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
    sb.append("    destinationField: ").append(toIndentedString(destinationField)).append("\n");
    sb.append("    segments: ").append(toIndentedString(segments)).append("\n");
    sb.append("    notify: ").append(toIndentedString(notify)).append("\n");
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

