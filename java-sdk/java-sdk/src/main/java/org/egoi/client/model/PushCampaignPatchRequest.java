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
import org.egoi.client.model.PushCampaignPatchRequestContent;
import org.egoi.client.model.PushCampaignPostRequestActions;
import org.egoi.client.model.PushCampaignPostRequestGeoOptions;
import org.egoi.client.model.PushCampaignPostRequestNotificationOptions;

/**
 * Push campaign patch request schema
 */
@ApiModel(description = "Push campaign patch request schema")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-18T18:19:55.100032Z[Europe/Lisbon]")
public class PushCampaignPatchRequest {
  public static final String SERIALIZED_NAME_CAMPAIGN_HASH = "campaign_hash";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_HASH)
  private String campaignHash;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private PushCampaignPatchRequestContent content;

  public static final String SERIALIZED_NAME_ACTIONS = "actions";
  @SerializedName(SERIALIZED_NAME_ACTIONS)
  private List<PushCampaignPostRequestActions> actions = null;

  public static final String SERIALIZED_NAME_GEO_OPTIONS = "geo_options";
  @SerializedName(SERIALIZED_NAME_GEO_OPTIONS)
  private PushCampaignPostRequestGeoOptions geoOptions;

  public static final String SERIALIZED_NAME_NOTIFICATION_OPTIONS = "notification_options";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_OPTIONS)
  private PushCampaignPostRequestNotificationOptions notificationOptions;


   /**
   * Get campaignHash
   * @return campaignHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCampaignHash() {
    return campaignHash;
  }




  public PushCampaignPatchRequest title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Push campaign subject
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Push campaign subject")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public PushCampaignPatchRequest content(PushCampaignPatchRequestContent content) {
    
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PushCampaignPatchRequestContent getContent() {
    return content;
  }


  public void setContent(PushCampaignPatchRequestContent content) {
    this.content = content;
  }


  public PushCampaignPatchRequest actions(List<PushCampaignPostRequestActions> actions) {
    
    this.actions = actions;
    return this;
  }

  public PushCampaignPatchRequest addActionsItem(PushCampaignPostRequestActions actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<PushCampaignPostRequestActions>();
    }
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * Actions for push campaign
   * @return actions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Actions for push campaign")

  public List<PushCampaignPostRequestActions> getActions() {
    return actions;
  }


  public void setActions(List<PushCampaignPostRequestActions> actions) {
    this.actions = actions;
  }


  public PushCampaignPatchRequest geoOptions(PushCampaignPostRequestGeoOptions geoOptions) {
    
    this.geoOptions = geoOptions;
    return this;
  }

   /**
   * Get geoOptions
   * @return geoOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PushCampaignPostRequestGeoOptions getGeoOptions() {
    return geoOptions;
  }


  public void setGeoOptions(PushCampaignPostRequestGeoOptions geoOptions) {
    this.geoOptions = geoOptions;
  }


  public PushCampaignPatchRequest notificationOptions(PushCampaignPostRequestNotificationOptions notificationOptions) {
    
    this.notificationOptions = notificationOptions;
    return this;
  }

   /**
   * Get notificationOptions
   * @return notificationOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PushCampaignPostRequestNotificationOptions getNotificationOptions() {
    return notificationOptions;
  }


  public void setNotificationOptions(PushCampaignPostRequestNotificationOptions notificationOptions) {
    this.notificationOptions = notificationOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PushCampaignPatchRequest pushCampaignPatchRequest = (PushCampaignPatchRequest) o;
    return Objects.equals(this.campaignHash, pushCampaignPatchRequest.campaignHash) &&
        Objects.equals(this.title, pushCampaignPatchRequest.title) &&
        Objects.equals(this.content, pushCampaignPatchRequest.content) &&
        Objects.equals(this.actions, pushCampaignPatchRequest.actions) &&
        Objects.equals(this.geoOptions, pushCampaignPatchRequest.geoOptions) &&
        Objects.equals(this.notificationOptions, pushCampaignPatchRequest.notificationOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignHash, title, content, actions, geoOptions, notificationOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PushCampaignPatchRequest {\n");
    sb.append("    campaignHash: ").append(toIndentedString(campaignHash)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    geoOptions: ").append(toIndentedString(geoOptions)).append("\n");
    sb.append("    notificationOptions: ").append(toIndentedString(notificationOptions)).append("\n");
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

