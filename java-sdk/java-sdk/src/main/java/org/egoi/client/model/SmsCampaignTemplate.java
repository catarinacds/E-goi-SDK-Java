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
import org.egoi.client.model.PhoneCampaignTemplate;
import org.egoi.client.model.SmsCampaignTemplateAllOf;
import org.threeten.bp.OffsetDateTime;

/**
 * Sms campaign template schema
 */
@ApiModel(description = "Sms campaign template schema")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-18T18:19:55.100032Z[Europe/Lisbon]")
public class SmsCampaignTemplate {
  public static final String SERIALIZED_NAME_TEMPLATE_ID = "template_id";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private Integer templateId;

  public static final String SERIALIZED_NAME_TEMPLATE_HASH = "template_hash";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_HASH)
  private String templateHash;

  public static final String SERIALIZED_NAME_INTERNAL_NAME = "internal_name";
  @SerializedName(SERIALIZED_NAME_INTERNAL_NAME)
  private String internalName;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created = null;

  public static final String SERIALIZED_NAME_UPDATED = "updated";
  @SerializedName(SERIALIZED_NAME_UPDATED)
  private OffsetDateTime updated = null;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_SENDER = "sender";
  @SerializedName(SERIALIZED_NAME_SENDER)
  private String sender;

  /**
   * Message type
   */
  @JsonAdapter(MessageTypeEnum.Adapter.class)
  public enum MessageTypeEnum {
    NORMAL("normal"),
    
    FLASH("flash");

    private String value;

    MessageTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MessageTypeEnum fromValue(String value) {
      for (MessageTypeEnum b : MessageTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MessageTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MessageTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MessageTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MessageTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MESSAGE_TYPE = "message_type";
  @SerializedName(SERIALIZED_NAME_MESSAGE_TYPE)
  private MessageTypeEnum messageType;

  /**
   * Message encoding
   */
  @JsonAdapter(EncodingEnum.Adapter.class)
  public enum EncodingEnum {
    GSM("gsm"),
    
    UNICODE("unicode");

    private String value;

    EncodingEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EncodingEnum fromValue(String value) {
      for (EncodingEnum b : EncodingEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EncodingEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EncodingEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EncodingEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EncodingEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ENCODING = "encoding";
  @SerializedName(SERIALIZED_NAME_ENCODING)
  private EncodingEnum encoding;

  public static final String SERIALIZED_NAME_MAX_MESSAGES = "max_messages";
  @SerializedName(SERIALIZED_NAME_MAX_MESSAGES)
  private Integer maxMessages;


   /**
   * Get templateId
   * minimum: 1
   * @return templateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getTemplateId() {
    return templateId;
  }




   /**
   * Get templateHash
   * @return templateHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTemplateHash() {
    return templateHash;
  }




  public SmsCampaignTemplate internalName(String internalName) {
    
    this.internalName = internalName;
    return this;
  }

   /**
   * Campaign internal name
   * @return internalName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Campaign internal name", value = "Campaign internal name")

  public String getInternalName() {
    return internalName;
  }


  public void setInternalName(String internalName) {
    this.internalName = internalName;
  }


   /**
   * Get created
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreated() {
    return created;
  }




   /**
   * Get updated
   * @return updated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getUpdated() {
    return updated;
  }




  public SmsCampaignTemplate message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Message")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public SmsCampaignTemplate sender(String sender) {
    
    this.sender = sender;
    return this;
  }

   /**
   * Sender number
   * @return sender
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sender number")

  public String getSender() {
    return sender;
  }


  public void setSender(String sender) {
    this.sender = sender;
  }


  public SmsCampaignTemplate messageType(MessageTypeEnum messageType) {
    
    this.messageType = messageType;
    return this;
  }

   /**
   * Message type
   * @return messageType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "normal", value = "Message type")

  public MessageTypeEnum getMessageType() {
    return messageType;
  }


  public void setMessageType(MessageTypeEnum messageType) {
    this.messageType = messageType;
  }


  public SmsCampaignTemplate encoding(EncodingEnum encoding) {
    
    this.encoding = encoding;
    return this;
  }

   /**
   * Message encoding
   * @return encoding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "gsm", value = "Message encoding")

  public EncodingEnum getEncoding() {
    return encoding;
  }


  public void setEncoding(EncodingEnum encoding) {
    this.encoding = encoding;
  }


  public SmsCampaignTemplate maxMessages(Integer maxMessages) {
    
    this.maxMessages = maxMessages;
    return this;
  }

   /**
   * Maximum number of messages
   * minimum: 1
   * @return maxMessages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "Maximum number of messages")

  public Integer getMaxMessages() {
    return maxMessages;
  }


  public void setMaxMessages(Integer maxMessages) {
    this.maxMessages = maxMessages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmsCampaignTemplate smsCampaignTemplate = (SmsCampaignTemplate) o;
    return Objects.equals(this.templateId, smsCampaignTemplate.templateId) &&
        Objects.equals(this.templateHash, smsCampaignTemplate.templateHash) &&
        Objects.equals(this.internalName, smsCampaignTemplate.internalName) &&
        Objects.equals(this.created, smsCampaignTemplate.created) &&
        Objects.equals(this.updated, smsCampaignTemplate.updated) &&
        Objects.equals(this.message, smsCampaignTemplate.message) &&
        Objects.equals(this.sender, smsCampaignTemplate.sender) &&
        Objects.equals(this.messageType, smsCampaignTemplate.messageType) &&
        Objects.equals(this.encoding, smsCampaignTemplate.encoding) &&
        Objects.equals(this.maxMessages, smsCampaignTemplate.maxMessages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateId, templateHash, internalName, created, updated, message, sender, messageType, encoding, maxMessages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmsCampaignTemplate {\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    templateHash: ").append(toIndentedString(templateHash)).append("\n");
    sb.append("    internalName: ").append(toIndentedString(internalName)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    maxMessages: ").append(toIndentedString(maxMessages)).append("\n");
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

