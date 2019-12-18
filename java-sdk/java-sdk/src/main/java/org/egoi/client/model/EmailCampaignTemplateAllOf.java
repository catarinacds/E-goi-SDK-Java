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
import org.egoi.client.model.EmailCampaignTemplateAllOfReplyToData;
import org.egoi.client.model.EmailCampaignTemplateAllOfSenderData;

/**
 * EmailCampaignTemplateAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-18T16:14:18.288020Z[Europe/Lisbon]")
public class EmailCampaignTemplateAllOf {
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


  public EmailCampaignTemplateAllOf senderData(EmailCampaignTemplateAllOfSenderData senderData) {
    
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


  public EmailCampaignTemplateAllOf image(String image) {
    
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


  public EmailCampaignTemplateAllOf messageHtmlVersion(String messageHtmlVersion) {
    
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


  public EmailCampaignTemplateAllOf messageTextVersion(String messageTextVersion) {
    
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


  public EmailCampaignTemplateAllOf replyToData(EmailCampaignTemplateAllOfReplyToData replyToData) {
    
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
    EmailCampaignTemplateAllOf emailCampaignTemplateAllOf = (EmailCampaignTemplateAllOf) o;
    return Objects.equals(this.senderData, emailCampaignTemplateAllOf.senderData) &&
        Objects.equals(this.image, emailCampaignTemplateAllOf.image) &&
        Objects.equals(this.messageHtmlVersion, emailCampaignTemplateAllOf.messageHtmlVersion) &&
        Objects.equals(this.messageTextVersion, emailCampaignTemplateAllOf.messageTextVersion) &&
        Objects.equals(this.replyToData, emailCampaignTemplateAllOf.replyToData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(senderData, image, messageHtmlVersion, messageTextVersion, replyToData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailCampaignTemplateAllOf {\n");
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

