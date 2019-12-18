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
import org.egoi.client.model.AbstractCampaignTemplate;
import org.egoi.client.model.EmailCampaignTemplateAllOf;
import org.egoi.client.model.EmailCampaignTemplateAllOfReplyToData;
import org.egoi.client.model.EmailCampaignTemplateAllOfSenderData;
import org.threeten.bp.OffsetDateTime;

/**
 * Email campaign template schema
 */
@ApiModel(description = "Email campaign template schema")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-18T18:19:55.100032Z[Europe/Lisbon]")
public class EmailCampaignTemplate {
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

  public static final String SERIALIZED_NAME_SENDER_DATA = "sender_data";
  @SerializedName(SERIALIZED_NAME_SENDER_DATA)
  private EmailCampaignTemplateAllOfSenderData senderData;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private String image;

  public static final String SERIALIZED_NAME_MESSAGE_HTML_VERSION = "message_html_version";
  @SerializedName(SERIALIZED_NAME_MESSAGE_HTML_VERSION)
  private String messageHtmlVersion;

  public static final String SERIALIZED_NAME_MESSAGE_TEXT_VERSION = "message_text_version";
  @SerializedName(SERIALIZED_NAME_MESSAGE_TEXT_VERSION)
  private String messageTextVersion;

  public static final String SERIALIZED_NAME_REPLY_TO_DATA = "reply_to_data";
  @SerializedName(SERIALIZED_NAME_REPLY_TO_DATA)
  private EmailCampaignTemplateAllOfReplyToData replyToData;


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




  public EmailCampaignTemplate internalName(String internalName) {
    
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




  public EmailCampaignTemplate senderData(EmailCampaignTemplateAllOfSenderData senderData) {
    
    this.senderData = senderData;
    return this;
  }

   /**
   * Get senderData
   * @return senderData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EmailCampaignTemplateAllOfSenderData getSenderData() {
    return senderData;
  }


  public void setSenderData(EmailCampaignTemplateAllOfSenderData senderData) {
    this.senderData = senderData;
  }


  public EmailCampaignTemplate image(String image) {
    
    this.image = image;
    return this;
  }

   /**
   * Template image
   * @return image
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Template image")

  public String getImage() {
    return image;
  }


  public void setImage(String image) {
    this.image = image;
  }


  public EmailCampaignTemplate messageHtmlVersion(String messageHtmlVersion) {
    
    this.messageHtmlVersion = messageHtmlVersion;
    return this;
  }

   /**
   * Html message
   * @return messageHtmlVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Html message")

  public String getMessageHtmlVersion() {
    return messageHtmlVersion;
  }


  public void setMessageHtmlVersion(String messageHtmlVersion) {
    this.messageHtmlVersion = messageHtmlVersion;
  }


  public EmailCampaignTemplate messageTextVersion(String messageTextVersion) {
    
    this.messageTextVersion = messageTextVersion;
    return this;
  }

   /**
   * Text message
   * @return messageTextVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text message")

  public String getMessageTextVersion() {
    return messageTextVersion;
  }


  public void setMessageTextVersion(String messageTextVersion) {
    this.messageTextVersion = messageTextVersion;
  }


  public EmailCampaignTemplate replyToData(EmailCampaignTemplateAllOfReplyToData replyToData) {
    
    this.replyToData = replyToData;
    return this;
  }

   /**
   * Get replyToData
   * @return replyToData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EmailCampaignTemplateAllOfReplyToData getReplyToData() {
    return replyToData;
  }


  public void setReplyToData(EmailCampaignTemplateAllOfReplyToData replyToData) {
    this.replyToData = replyToData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailCampaignTemplate emailCampaignTemplate = (EmailCampaignTemplate) o;
    return Objects.equals(this.templateId, emailCampaignTemplate.templateId) &&
        Objects.equals(this.templateHash, emailCampaignTemplate.templateHash) &&
        Objects.equals(this.internalName, emailCampaignTemplate.internalName) &&
        Objects.equals(this.created, emailCampaignTemplate.created) &&
        Objects.equals(this.updated, emailCampaignTemplate.updated) &&
        Objects.equals(this.senderData, emailCampaignTemplate.senderData) &&
        Objects.equals(this.image, emailCampaignTemplate.image) &&
        Objects.equals(this.messageHtmlVersion, emailCampaignTemplate.messageHtmlVersion) &&
        Objects.equals(this.messageTextVersion, emailCampaignTemplate.messageTextVersion) &&
        Objects.equals(this.replyToData, emailCampaignTemplate.replyToData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateId, templateHash, internalName, created, updated, senderData, image, messageHtmlVersion, messageTextVersion, replyToData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailCampaignTemplate {\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    templateHash: ").append(toIndentedString(templateHash)).append("\n");
    sb.append("    internalName: ").append(toIndentedString(internalName)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    senderData: ").append(toIndentedString(senderData)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    messageHtmlVersion: ").append(toIndentedString(messageHtmlVersion)).append("\n");
    sb.append("    messageTextVersion: ").append(toIndentedString(messageTextVersion)).append("\n");
    sb.append("    replyToData: ").append(toIndentedString(replyToData)).append("\n");
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

