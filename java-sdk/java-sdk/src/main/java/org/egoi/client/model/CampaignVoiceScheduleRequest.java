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
import org.egoi.client.model.AbstractSendVoice;
import org.egoi.client.model.CampaignEmailScheduleRequestAllOf;
import org.egoi.client.model.LimitHourActionSendLimitHour;
import org.egoi.client.model.OLimitContactsActionSend;
import org.egoi.client.model.OSegmentsActionSend;
import org.threeten.bp.OffsetDateTime;

/**
 * Campaign voice schedule request schema
 */
@ApiModel(description = "Campaign voice schedule request schema")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-18T18:19:55.100032Z[Europe/Lisbon]")
public class CampaignVoiceScheduleRequest {
  public static final String SERIALIZED_NAME_SCHEDULE_DATE = "schedule_date";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_DATE)
  private OffsetDateTime scheduleDate;

  public static final String SERIALIZED_NAME_LIST_ID = "list_id";
  @SerializedName(SERIALIZED_NAME_LIST_ID)
  private Integer listId;

  public static final String SERIALIZED_NAME_SEGMENTS = "segments";
  @SerializedName(SERIALIZED_NAME_SEGMENTS)
  private OSegmentsActionSend segments;

  public static final String SERIALIZED_NAME_NOTIFY = "notify";
  @SerializedName(SERIALIZED_NAME_NOTIFY)
  private List<Integer> notify = null;

  /**
   * Destination field of this campaign
   */
  @JsonAdapter(DestinationFieldEnum.Adapter.class)
  public enum DestinationFieldEnum {
    PHONE("phone"),
    
    CELLPHONE("cellphone"),
    
    PHONE_FAILSAFE_CELLPHONE("phone_failsafe_cellphone"),
    
    CELLPHONE_FAILSAFE_PHONE("cellphone_failsafe_phone"),
    
    CELLPHONE_PHONE("cellphone_phone");

    private String value;

    DestinationFieldEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DestinationFieldEnum fromValue(String value) {
      for (DestinationFieldEnum b : DestinationFieldEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DestinationFieldEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DestinationFieldEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DestinationFieldEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DestinationFieldEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DESTINATION_FIELD = "destination_field";
  @SerializedName(SERIALIZED_NAME_DESTINATION_FIELD)
  private DestinationFieldEnum destinationField;

  public static final String SERIALIZED_NAME_LIMIT_CONTACTS = "limit_contacts";
  @SerializedName(SERIALIZED_NAME_LIMIT_CONTACTS)
  private OLimitContactsActionSend limitContacts;

  public static final String SERIALIZED_NAME_LIMIT_HOUR = "limit_hour";
  @SerializedName(SERIALIZED_NAME_LIMIT_HOUR)
  private LimitHourActionSendLimitHour limitHour;

  public static final String SERIALIZED_NAME_LIMIT_SPEED = "limit_speed";
  @SerializedName(SERIALIZED_NAME_LIMIT_SPEED)
  private Integer limitSpeed;


  public CampaignVoiceScheduleRequest scheduleDate(OffsetDateTime scheduleDate) {
    
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


  public CampaignVoiceScheduleRequest listId(Integer listId) {
    
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


  public CampaignVoiceScheduleRequest segments(OSegmentsActionSend segments) {
    
    this.segments = segments;
    return this;
  }

   /**
   * Get segments
   * @return segments
  **/
  @ApiModelProperty(required = true, value = "")

  public OSegmentsActionSend getSegments() {
    return segments;
  }


  public void setSegments(OSegmentsActionSend segments) {
    this.segments = segments;
  }


  public CampaignVoiceScheduleRequest notify(List<Integer> notify) {
    
    this.notify = notify;
    return this;
  }

  public CampaignVoiceScheduleRequest addNotifyItem(Integer notifyItem) {
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


  public CampaignVoiceScheduleRequest destinationField(DestinationFieldEnum destinationField) {
    
    this.destinationField = destinationField;
    return this;
  }

   /**
   * Destination field of this campaign
   * @return destinationField
  **/
  @ApiModelProperty(required = true, value = "Destination field of this campaign")

  public DestinationFieldEnum getDestinationField() {
    return destinationField;
  }


  public void setDestinationField(DestinationFieldEnum destinationField) {
    this.destinationField = destinationField;
  }


  public CampaignVoiceScheduleRequest limitContacts(OLimitContactsActionSend limitContacts) {
    
    this.limitContacts = limitContacts;
    return this;
  }

   /**
   * Get limitContacts
   * @return limitContacts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OLimitContactsActionSend getLimitContacts() {
    return limitContacts;
  }


  public void setLimitContacts(OLimitContactsActionSend limitContacts) {
    this.limitContacts = limitContacts;
  }


  public CampaignVoiceScheduleRequest limitHour(LimitHourActionSendLimitHour limitHour) {
    
    this.limitHour = limitHour;
    return this;
  }

   /**
   * Get limitHour
   * @return limitHour
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LimitHourActionSendLimitHour getLimitHour() {
    return limitHour;
  }


  public void setLimitHour(LimitHourActionSendLimitHour limitHour) {
    this.limitHour = limitHour;
  }


  public CampaignVoiceScheduleRequest limitSpeed(Integer limitSpeed) {
    
    this.limitSpeed = limitSpeed;
    return this;
  }

   /**
   * Speed limit to send the campaign
   * minimum: 1
   * maximum: 10
   * @return limitSpeed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Speed limit to send the campaign")

  public Integer getLimitSpeed() {
    return limitSpeed;
  }


  public void setLimitSpeed(Integer limitSpeed) {
    this.limitSpeed = limitSpeed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignVoiceScheduleRequest campaignVoiceScheduleRequest = (CampaignVoiceScheduleRequest) o;
    return Objects.equals(this.scheduleDate, campaignVoiceScheduleRequest.scheduleDate) &&
        Objects.equals(this.listId, campaignVoiceScheduleRequest.listId) &&
        Objects.equals(this.segments, campaignVoiceScheduleRequest.segments) &&
        Objects.equals(this.notify, campaignVoiceScheduleRequest.notify) &&
        Objects.equals(this.destinationField, campaignVoiceScheduleRequest.destinationField) &&
        Objects.equals(this.limitContacts, campaignVoiceScheduleRequest.limitContacts) &&
        Objects.equals(this.limitHour, campaignVoiceScheduleRequest.limitHour) &&
        Objects.equals(this.limitSpeed, campaignVoiceScheduleRequest.limitSpeed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduleDate, listId, segments, notify, destinationField, limitContacts, limitHour, limitSpeed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignVoiceScheduleRequest {\n");
    sb.append("    scheduleDate: ").append(toIndentedString(scheduleDate)).append("\n");
    sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
    sb.append("    segments: ").append(toIndentedString(segments)).append("\n");
    sb.append("    notify: ").append(toIndentedString(notify)).append("\n");
    sb.append("    destinationField: ").append(toIndentedString(destinationField)).append("\n");
    sb.append("    limitContacts: ").append(toIndentedString(limitContacts)).append("\n");
    sb.append("    limitHour: ").append(toIndentedString(limitHour)).append("\n");
    sb.append("    limitSpeed: ").append(toIndentedString(limitSpeed)).append("\n");
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

