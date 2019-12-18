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
import org.egoi.client.model.Contact;

/**
 * Contact import bulk request schema
 */
@ApiModel(description = "Contact import bulk request schema")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-18T16:14:18.288020Z[Europe/Lisbon]")
public class ImportBulkRequest {
  /**
   * Field ID which will be mapped for comparison to prevent duplicates. If it is an extra field,                         append the prefix &#39;extra_&#39; to it (e. g. &#39;extra_1&#39;)
   */
  @JsonAdapter(CompareFieldEnum.Adapter.class)
  public enum CompareFieldEnum {
    EMAIL("email"),
    
    CELLPHONE("cellphone"),
    
    PHONE("phone"),
    
    FIRST_NAME("first_name"),
    
    LAST_NAME("last_name"),
    
    BIRTH_DATE("birth_date"),
    
    EXTRA_X("extra_X");

    private String value;

    CompareFieldEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CompareFieldEnum fromValue(String value) {
      for (CompareFieldEnum b : CompareFieldEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CompareFieldEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CompareFieldEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CompareFieldEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CompareFieldEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_COMPARE_FIELD = "compare_field";
  @SerializedName(SERIALIZED_NAME_COMPARE_FIELD)
  private CompareFieldEnum compareField;

  public static final String SERIALIZED_NAME_REPLACE_EXISTING_CONTACTS = "replace_existing_contacts";
  @SerializedName(SERIALIZED_NAME_REPLACE_EXISTING_CONTACTS)
  private Boolean replaceExistingContacts = false;

  public static final String SERIALIZED_NAME_SEND_AUTORESPONDER = "send_autoresponder";
  @SerializedName(SERIALIZED_NAME_SEND_AUTORESPONDER)
  private Boolean sendAutoresponder = false;

  public static final String SERIALIZED_NAME_CONTACTS = "contacts";
  @SerializedName(SERIALIZED_NAME_CONTACTS)
  private List<Contact> contacts = new ArrayList<Contact>();


  public ImportBulkRequest compareField(CompareFieldEnum compareField) {
    
    this.compareField = compareField;
    return this;
  }

   /**
   * Field ID which will be mapped for comparison to prevent duplicates. If it is an extra field,                         append the prefix &#39;extra_&#39; to it (e. g. &#39;extra_1&#39;)
   * @return compareField
  **/
  @ApiModelProperty(example = "email", required = true, value = "Field ID which will be mapped for comparison to prevent duplicates. If it is an extra field,                         append the prefix 'extra_' to it (e. g. 'extra_1')")

  public CompareFieldEnum getCompareField() {
    return compareField;
  }


  public void setCompareField(CompareFieldEnum compareField) {
    this.compareField = compareField;
  }


  public ImportBulkRequest replaceExistingContacts(Boolean replaceExistingContacts) {
    
    this.replaceExistingContacts = replaceExistingContacts;
    return this;
  }

   /**
   * False to add new contacts only, true to replace existing contacts
   * @return replaceExistingContacts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "False to add new contacts only, true to replace existing contacts")

  public Boolean getReplaceExistingContacts() {
    return replaceExistingContacts;
  }


  public void setReplaceExistingContacts(Boolean replaceExistingContacts) {
    this.replaceExistingContacts = replaceExistingContacts;
  }


  public ImportBulkRequest sendAutoresponder(Boolean sendAutoresponder) {
    
    this.sendAutoresponder = sendAutoresponder;
    return this;
  }

   /**
   * True to send each imported contact the autoresponder sequence you have previously set up for                         sign-ups in this mailing list
   * @return sendAutoresponder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True to send each imported contact the autoresponder sequence you have previously set up for                         sign-ups in this mailing list")

  public Boolean getSendAutoresponder() {
    return sendAutoresponder;
  }


  public void setSendAutoresponder(Boolean sendAutoresponder) {
    this.sendAutoresponder = sendAutoresponder;
  }


  public ImportBulkRequest contacts(List<Contact> contacts) {
    
    this.contacts = contacts;
    return this;
  }

  public ImportBulkRequest addContactsItem(Contact contactsItem) {
    this.contacts.add(contactsItem);
    return this;
  }

   /**
   * Array of contacts to import
   * @return contacts
  **/
  @ApiModelProperty(required = true, value = "Array of contacts to import")

  public List<Contact> getContacts() {
    return contacts;
  }


  public void setContacts(List<Contact> contacts) {
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
    ImportBulkRequest importBulkRequest = (ImportBulkRequest) o;
    return Objects.equals(this.compareField, importBulkRequest.compareField) &&
        Objects.equals(this.replaceExistingContacts, importBulkRequest.replaceExistingContacts) &&
        Objects.equals(this.sendAutoresponder, importBulkRequest.sendAutoresponder) &&
        Objects.equals(this.contacts, importBulkRequest.contacts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compareField, replaceExistingContacts, sendAutoresponder, contacts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportBulkRequest {\n");
    sb.append("    compareField: ").append(toIndentedString(compareField)).append("\n");
    sb.append("    replaceExistingContacts: ").append(toIndentedString(replaceExistingContacts)).append("\n");
    sb.append("    sendAutoresponder: ").append(toIndentedString(sendAutoresponder)).append("\n");
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
