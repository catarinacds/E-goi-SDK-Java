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
import org.egoi.client.model.Language;
import org.threeten.bp.OffsetDateTime;

/**
 * Form schema
 */
@ApiModel(description = "Form schema")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-18T18:19:55.100032Z[Europe/Lisbon]")
public class Form {
  public static final String SERIALIZED_NAME_FORM_ID = "form_id";
  @SerializedName(SERIALIZED_NAME_FORM_ID)
  private Integer formId;

  public static final String SERIALIZED_NAME_INTERNAL_TITLE = "internal_title";
  @SerializedName(SERIALIZED_NAME_INTERNAL_TITLE)
  private String internalTitle = "$request.body#/title";

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private Language language = Language.EN;

  public static final String SERIALIZED_NAME_LIST_ID = "list_id";
  @SerializedName(SERIALIZED_NAME_LIST_ID)
  private Integer listId;

  public static final String SERIALIZED_NAME_DEFAULT = "default";
  @SerializedName(SERIALIZED_NAME_DEFAULT)
  private Boolean _default;

  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private Integer owner;

  /**
   * Status of the form
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ACTIVE("active"),
    
    UNPUBLISHED("unpublished"),
    
    CLONED("cloned"),
    
    DELETED("deleted");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_UPDATED = "updated";
  @SerializedName(SERIALIZED_NAME_UPDATED)
  private OffsetDateTime updated;


   /**
   * Get formId
   * minimum: 1
   * @return formId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getFormId() {
    return formId;
  }




  public Form internalTitle(String internalTitle) {
    
    this.internalTitle = internalTitle;
    return this;
  }

   /**
   * Internal title of the form
   * @return internalTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Form title", value = "Internal title of the form")

  public String getInternalTitle() {
    return internalTitle;
  }


  public void setInternalTitle(String internalTitle) {
    this.internalTitle = internalTitle;
  }


  public Form title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Title of the form
   * @return title
  **/
  @ApiModelProperty(example = "Form title", required = true, value = "Title of the form")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public Form language(Language language) {
    
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Language getLanguage() {
    return language;
  }


  public void setLanguage(Language language) {
    this.language = language;
  }


  public Form listId(Integer listId) {
    
    this.listId = listId;
    return this;
  }

   /**
   * Get listId
   * minimum: 1
   * @return listId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getListId() {
    return listId;
  }


  public void setListId(Integer listId) {
    this.listId = listId;
  }


  public Form _default(Boolean _default) {
    
    this._default = _default;
    return this;
  }

   /**
   * True if this is the default form in the list, false otherwise
   * @return _default
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "True if this is the default form in the list, false otherwise")

  public Boolean getDefault() {
    return _default;
  }


  public void setDefault(Boolean _default) {
    this._default = _default;
  }


  public Form owner(Integer owner) {
    
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * minimum: 1
   * @return owner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getOwner() {
    return owner;
  }


  public void setOwner(Integer owner) {
    this.owner = owner;
  }


   /**
   * Status of the form
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "active", value = "Status of the form")

  public StatusEnum getStatus() {
    return status;
  }




  public Form created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * The date and time
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time")

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public Form updated(OffsetDateTime updated) {
    
    this.updated = updated;
    return this;
  }

   /**
   * The date and time
   * @return updated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time")

  public OffsetDateTime getUpdated() {
    return updated;
  }


  public void setUpdated(OffsetDateTime updated) {
    this.updated = updated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Form form = (Form) o;
    return Objects.equals(this.formId, form.formId) &&
        Objects.equals(this.internalTitle, form.internalTitle) &&
        Objects.equals(this.title, form.title) &&
        Objects.equals(this.language, form.language) &&
        Objects.equals(this.listId, form.listId) &&
        Objects.equals(this._default, form._default) &&
        Objects.equals(this.owner, form.owner) &&
        Objects.equals(this.status, form.status) &&
        Objects.equals(this.created, form.created) &&
        Objects.equals(this.updated, form.updated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formId, internalTitle, title, language, listId, _default, owner, status, created, updated);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Form {\n");
    sb.append("    formId: ").append(toIndentedString(formId)).append("\n");
    sb.append("    internalTitle: ").append(toIndentedString(internalTitle)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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

