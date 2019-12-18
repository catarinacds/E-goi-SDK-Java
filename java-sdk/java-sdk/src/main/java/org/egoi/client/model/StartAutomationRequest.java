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

/**
 * Start automation to the provided contacts
 */
@ApiModel(description = "Start automation to the provided contacts")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-18T16:14:18.288020Z[Europe/Lisbon]")
public class StartAutomationRequest {
  public static final String SERIALIZED_NAME_AUTOMATION_ID = "automation_id";
  @SerializedName(SERIALIZED_NAME_AUTOMATION_ID)
  private Integer automationId;

  public static final String SERIALIZED_NAME_ACTION_ID = "action_id";
  @SerializedName(SERIALIZED_NAME_ACTION_ID)
  private Integer actionId;

  public static final String SERIALIZED_NAME_CONTACTS = "contacts";
  @SerializedName(SERIALIZED_NAME_CONTACTS)
  private List<String> contacts = new ArrayList<String>();


  public StartAutomationRequest automationId(Integer automationId) {
    
    this.automationId = automationId;
    return this;
  }

   /**
   * Get automationId
   * minimum: 1
   * @return automationId
  **/
  @ApiModelProperty(example = "1", required = true, value = "")

  public Integer getAutomationId() {
    return automationId;
  }


  public void setAutomationId(Integer automationId) {
    this.automationId = automationId;
  }


  public StartAutomationRequest actionId(Integer actionId) {
    
    this.actionId = actionId;
    return this;
  }

   /**
   * Get actionId
   * minimum: 1
   * @return actionId
  **/
  @ApiModelProperty(example = "1", required = true, value = "")

  public Integer getActionId() {
    return actionId;
  }


  public void setActionId(Integer actionId) {
    this.actionId = actionId;
  }


  public StartAutomationRequest contacts(List<String> contacts) {
    
    this.contacts = contacts;
    return this;
  }

  public StartAutomationRequest addContactsItem(String contactsItem) {
    this.contacts.add(contactsItem);
    return this;
  }

   /**
   * Array of contact IDs to start automation
   * @return contacts
  **/
  @ApiModelProperty(required = true, value = "Array of contact IDs to start automation")

  public List<String> getContacts() {
    return contacts;
  }


  public void setContacts(List<String> contacts) {
    this.contacts = contacts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StartAutomationRequest startAutomationRequest = (StartAutomationRequest) o;
    return Objects.equals(this.automationId, startAutomationRequest.automationId) &&
        Objects.equals(this.actionId, startAutomationRequest.actionId) &&
        Objects.equals(this.contacts, startAutomationRequest.contacts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(automationId, actionId, contacts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartAutomationRequest {\n");
    sb.append("    automationId: ").append(toIndentedString(automationId)).append("\n");
    sb.append("    actionId: ").append(toIndentedString(actionId)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
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

