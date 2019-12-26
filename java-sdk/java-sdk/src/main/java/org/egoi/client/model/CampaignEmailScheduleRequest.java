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
import org.egoi.client.model.AbstractSendEmail;
import org.egoi.client.model.CampaignEmailScheduleRequestAllOf;
import org.egoi.client.model.EmailSendSegment;
import org.threeten.bp.OffsetDateTime;

/**
 * Campaign email schedule request schema
 */
@ApiModel(description = "Campaign email schedule request schema")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-26T17:55:31.079829Z[Europe/Lisbon]")
public class CampaignEmailScheduleRequest  implements CampaignEmailSendRequest {
  public static final String SERIALIZED_NAME_SCHEDULE_DATE = "schedule_date";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_DATE)
  private OffsetDateTime scheduleDate;

  public static final String SERIALIZED_NAME_LIST_ID = "list_id";
  @SerializedName(SERIALIZED_NAME_LIST_ID)
  private Integer listId;

  public static final String SERIALIZED_NAME_SEGMENTS = "segments";
  @SerializedName(SERIALIZED_NAME_SEGMENTS)
  private EmailSendSegment segments;

  public static final String SERIALIZED_NAME_NOTIFY = "notify";
  @SerializedName(SERIALIZED_NAME_NOTIFY)
  private List<Integer> notify = null;

  public static final String SERIALIZED_NAME_DESTINATION_FIELD = "destination_field";
  @SerializedName(SERIALIZED_NAME_DESTINATION_FIELD)
  private String destinationField;

  public static final String SERIALIZED_NAME_UNIQUE_CONTACTS_ONLY = "unique_contacts_only";
  @SerializedName(SERIALIZED_NAME_UNIQUE_CONTACTS_ONLY)
  private Boolean uniqueContactsOnly = false;


  public CampaignEmailScheduleRequest scheduleDate(OffsetDateTime scheduleDate) {
    
    this.scheduleDate = scheduleDate;
    return this;
  }

   /**
   * The date and time
   * @return scheduleDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time")

  public OffsetDateTime getScheduleDate() {
    return scheduleDate;
  }


  public void setScheduleDate(OffsetDateTime scheduleDate) {
    this.scheduleDate = scheduleDate;
  }


  public CampaignEmailScheduleRequest listId(Integer listId) {
    
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


  public CampaignEmailScheduleRequest segments(EmailSendSegment segments) {
    
    this.segments = segments;
    return this;
  }

   /**
   * Get segments
   * @return segments
  **/
  @ApiModelProperty(required = true, value = "")

  public EmailSendSegment getSegments() {
    return segments;
  }


  public void setSegments(EmailSendSegment segments) {
    this.segments = segments;
  }


  public CampaignEmailScheduleRequest notify(List<Integer> notify) {
    
    this.notify = notify;
    return this;
  }

  public CampaignEmailScheduleRequest addNotifyItem(Integer notifyItem) {
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


  public CampaignEmailScheduleRequest destinationField(String destinationField) {
    
    this.destinationField = destinationField;
    return this;
  }

   /**
   * Destination field of this campaign, which must be an email field (email or extra field id).                         If not sent, defaults to the general email field
   * @return destinationField
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Destination field of this campaign, which must be an email field (email or extra field id).                         If not sent, defaults to the general email field")

  public String getDestinationField() {
    return destinationField;
  }


  public void setDestinationField(String destinationField) {
    this.destinationField = destinationField;
  }


  public CampaignEmailScheduleRequest uniqueContactsOnly(Boolean uniqueContactsOnly) {
    
    this.uniqueContactsOnly = uniqueContactsOnly;
    return this;
  }

   /**
   * True to send the campaign only to unique contacts
   * @return uniqueContactsOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True to send the campaign only to unique contacts")

  public Boolean getUniqueContactsOnly() {
    return uniqueContactsOnly;
  }


  public void setUniqueContactsOnly(Boolean uniqueContactsOnly) {
    this.uniqueContactsOnly = uniqueContactsOnly;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignEmailScheduleRequest campaignEmailScheduleRequest = (CampaignEmailScheduleRequest) o;
    return Objects.equals(this.scheduleDate, campaignEmailScheduleRequest.scheduleDate) &&
        Objects.equals(this.listId, campaignEmailScheduleRequest.listId) &&
        Objects.equals(this.segments, campaignEmailScheduleRequest.segments) &&
        Objects.equals(this.notify, campaignEmailScheduleRequest.notify) &&
        Objects.equals(this.destinationField, campaignEmailScheduleRequest.destinationField) &&
        Objects.equals(this.uniqueContactsOnly, campaignEmailScheduleRequest.uniqueContactsOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduleDate, listId, segments, notify, destinationField, uniqueContactsOnly);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignEmailScheduleRequest {\n");
    sb.append("    scheduleDate: ").append(toIndentedString(scheduleDate)).append("\n");
    sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
    sb.append("    segments: ").append(toIndentedString(segments)).append("\n");
    sb.append("    notify: ").append(toIndentedString(notify)).append("\n");
    sb.append("    destinationField: ").append(toIndentedString(destinationField)).append("\n");
    sb.append("    uniqueContactsOnly: ").append(toIndentedString(uniqueContactsOnly)).append("\n");
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

