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
import org.egoi.client.model.RequestItemsUnsubscribeAllOf;
import org.egoi.client.model.UnsubscriptionObject;

/**
 * RequestItemsUnsubscribe
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-18T18:19:55.100032Z[Europe/Lisbon]")
public class RequestItemsUnsubscribe {
  public static final String SERIALIZED_NAME_CONTACT_ID = "contact_id";
  @SerializedName(SERIALIZED_NAME_CONTACT_ID)
  private String contactId;

  /**
   * Unsubcription Method
   */
  @JsonAdapter(UnsubscriptionMethodEnum.Adapter.class)
  public enum UnsubscriptionMethodEnum {
    MANUAL("manual"),
    
    FORM("form"),
    
    UNSUBSCRIBE_LINK("unsubscribe_link"),
    
    BOUNCE("bounce"),
    
    API("api");

    private String value;

    UnsubscriptionMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static UnsubscriptionMethodEnum fromValue(String value) {
      for (UnsubscriptionMethodEnum b : UnsubscriptionMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<UnsubscriptionMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UnsubscriptionMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UnsubscriptionMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return UnsubscriptionMethodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_UNSUBSCRIPTION_METHOD = "unsubscription_method";
  @SerializedName(SERIALIZED_NAME_UNSUBSCRIPTION_METHOD)
  private UnsubscriptionMethodEnum unsubscriptionMethod;

  /**
   * Unsubcription Reason
   */
  @JsonAdapter(UnsubscriptionReasonEnum.Adapter.class)
  public enum UnsubscriptionReasonEnum {
    NOT_INTERESTED("not_interested"),
    
    LACK_OF_TIME("lack_of_time"),
    
    EMAIL_ADDRESS_CHANGE("email_address_change"),
    
    SPAM("spam"),
    
    OTHER("other");

    private String value;

    UnsubscriptionReasonEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static UnsubscriptionReasonEnum fromValue(String value) {
      for (UnsubscriptionReasonEnum b : UnsubscriptionReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<UnsubscriptionReasonEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UnsubscriptionReasonEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UnsubscriptionReasonEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return UnsubscriptionReasonEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_UNSUBSCRIPTION_REASON = "unsubscription_reason";
  @SerializedName(SERIALIZED_NAME_UNSUBSCRIPTION_REASON)
  private UnsubscriptionReasonEnum unsubscriptionReason;

  public static final String SERIALIZED_NAME_UNSUBSCRIPTION_OBSERVATION = "unsubscription_observation";
  @SerializedName(SERIALIZED_NAME_UNSUBSCRIPTION_OBSERVATION)
  private String unsubscriptionObservation;


  public RequestItemsUnsubscribe contactId(String contactId) {
    
    this.contactId = contactId;
    return this;
  }

   /**
   * Get contactId
   * @return contactId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8f3a27ef26", value = "")

  public String getContactId() {
    return contactId;
  }


  public void setContactId(String contactId) {
    this.contactId = contactId;
  }


  public RequestItemsUnsubscribe unsubscriptionMethod(UnsubscriptionMethodEnum unsubscriptionMethod) {
    
    this.unsubscriptionMethod = unsubscriptionMethod;
    return this;
  }

   /**
   * Unsubcription Method
   * @return unsubscriptionMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unsubcription Method")

  public UnsubscriptionMethodEnum getUnsubscriptionMethod() {
    return unsubscriptionMethod;
  }


  public void setUnsubscriptionMethod(UnsubscriptionMethodEnum unsubscriptionMethod) {
    this.unsubscriptionMethod = unsubscriptionMethod;
  }


  public RequestItemsUnsubscribe unsubscriptionReason(UnsubscriptionReasonEnum unsubscriptionReason) {
    
    this.unsubscriptionReason = unsubscriptionReason;
    return this;
  }

   /**
   * Unsubcription Reason
   * @return unsubscriptionReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unsubcription Reason")

  public UnsubscriptionReasonEnum getUnsubscriptionReason() {
    return unsubscriptionReason;
  }


  public void setUnsubscriptionReason(UnsubscriptionReasonEnum unsubscriptionReason) {
    this.unsubscriptionReason = unsubscriptionReason;
  }


  public RequestItemsUnsubscribe unsubscriptionObservation(String unsubscriptionObservation) {
    
    this.unsubscriptionObservation = unsubscriptionObservation;
    return this;
  }

   /**
   * Unsubcription Observation
   * @return unsubscriptionObservation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unsubcription Observation")

  public String getUnsubscriptionObservation() {
    return unsubscriptionObservation;
  }


  public void setUnsubscriptionObservation(String unsubscriptionObservation) {
    this.unsubscriptionObservation = unsubscriptionObservation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestItemsUnsubscribe requestItemsUnsubscribe = (RequestItemsUnsubscribe) o;
    return Objects.equals(this.contactId, requestItemsUnsubscribe.contactId) &&
        Objects.equals(this.unsubscriptionMethod, requestItemsUnsubscribe.unsubscriptionMethod) &&
        Objects.equals(this.unsubscriptionReason, requestItemsUnsubscribe.unsubscriptionReason) &&
        Objects.equals(this.unsubscriptionObservation, requestItemsUnsubscribe.unsubscriptionObservation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactId, unsubscriptionMethod, unsubscriptionReason, unsubscriptionObservation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestItemsUnsubscribe {\n");
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    unsubscriptionMethod: ").append(toIndentedString(unsubscriptionMethod)).append("\n");
    sb.append("    unsubscriptionReason: ").append(toIndentedString(unsubscriptionReason)).append("\n");
    sb.append("    unsubscriptionObservation: ").append(toIndentedString(unsubscriptionObservation)).append("\n");
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

