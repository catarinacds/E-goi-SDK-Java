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

/**
 * CampaignSmsOptions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-18T16:14:18.288020Z[Europe/Lisbon]")
public class CampaignSmsOptions {
  /**
   * Gets or Sets encoding
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


  public CampaignSmsOptions encoding(EncodingEnum encoding) {
    
    this.encoding = encoding;
    return this;
  }

   /**
   * Get encoding
   * @return encoding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "gsm", value = "")

  public EncodingEnum getEncoding() {
    return encoding;
  }


  public void setEncoding(EncodingEnum encoding) {
    this.encoding = encoding;
  }


  public CampaignSmsOptions maxMessages(Integer maxMessages) {
    
    this.maxMessages = maxMessages;
    return this;
  }

   /**
   * Get maxMessages
   * minimum: 1
   * @return maxMessages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "")

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
    CampaignSmsOptions campaignSmsOptions = (CampaignSmsOptions) o;
    return Objects.equals(this.encoding, campaignSmsOptions.encoding) &&
        Objects.equals(this.maxMessages, campaignSmsOptions.maxMessages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encoding, maxMessages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignSmsOptions {\n");
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
