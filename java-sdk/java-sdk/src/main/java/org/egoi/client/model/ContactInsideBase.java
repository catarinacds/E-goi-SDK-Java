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
import org.egoi.client.model.ContactBaseWithStatusFieldsSchemaBasePushTokenAndroid;
import org.egoi.client.model.ContactBaseWithStatusFieldsSchemaBasePushTokenIos;
import org.egoi.client.model.Language;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;

/**
 * ContactInsideBase
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-18T16:14:18.288020Z[Europe/Lisbon]")
public class ContactInsideBase {
  public static final String SERIALIZED_NAME_CONTACT_ID = "contact_id";
  @SerializedName(SERIALIZED_NAME_CONTACT_ID)
  private String contactId;

  /**
   * Status of the contact
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ACTIVE("active"),
    
    INACTIVE("inactive"),
    
    REMOVED("removed"),
    
    UNCONFIRMED("unconfirmed");

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
  private StatusEnum status = StatusEnum.ACTIVE;

  /**
   * Contact consent
   */
  @JsonAdapter(ConsentEnum.Adapter.class)
  public enum ConsentEnum {
    ANY("any"),
    
    CONSENT("consent"),
    
    CONTRACT("contract"),
    
    LEGITIMATE_INTEREST("legitimate_interest"),
    
    NONE("none"),
    
    PROTECT_VITAL_INTERESTS("protect_vital_interests"),
    
    PUBLIC_INTERESTS("public_interests"),
    
    REQUIRED_BY_LAW("required_by_law"),
    
    WITHDRAWN("withdrawn");

    private String value;

    ConsentEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ConsentEnum fromValue(String value) {
      for (ConsentEnum b : ConsentEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ConsentEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ConsentEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ConsentEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ConsentEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CONSENT = "consent";
  @SerializedName(SERIALIZED_NAME_CONSENT)
  private ConsentEnum consent = ConsentEnum.CONSENT;

  public static final String SERIALIZED_NAME_CONSENT_DATE = "consent_date";
  @SerializedName(SERIALIZED_NAME_CONSENT_DATE)
  private OffsetDateTime consentDate;

  /**
   * Contact subscription method
   */
  @JsonAdapter(SubscriptionMethodEnum.Adapter.class)
  public enum SubscriptionMethodEnum {
    MANUAL("manual"),
    
    FORM("form"),
    
    IMPORTED("imported"),
    
    REFERRAL("referral"),
    
    API("api");

    private String value;

    SubscriptionMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SubscriptionMethodEnum fromValue(String value) {
      for (SubscriptionMethodEnum b : SubscriptionMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SubscriptionMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SubscriptionMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SubscriptionMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SubscriptionMethodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SUBSCRIPTION_METHOD = "subscription_method";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_METHOD)
  private SubscriptionMethodEnum subscriptionMethod;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_DATE = "subscription_date";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_DATE)
  private OffsetDateTime subscriptionDate;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_FORM = "subscription_form";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_FORM)
  private Integer subscriptionForm;

  /**
   * Contact unsubscription method
   */
  @JsonAdapter(UnsubscriptionMethodEnum.Adapter.class)
  public enum UnsubscriptionMethodEnum {
    MANUAL("manual"),
    
    FORM("form"),
    
    UNSUBSCRIBE_LINK("unsubscribe_link"),
    
    BOUNCE("bounce"),
    
    API("api"),
    
    EMPTY("");

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
   * Contact unsubscription reason
   */
  @JsonAdapter(UnsubscriptionReasonEnum.Adapter.class)
  public enum UnsubscriptionReasonEnum {
    NOT_INTERESTED("not_interested"),
    
    LACK_OF_TIME("lack_of_time"),
    
    EMAIL_ADDRESS_CHANGE("email_address_change"),
    
    SPAM("spam"),
    
    OTHER("other"),
    
    EMPTY("");

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

  public static final String SERIALIZED_NAME_UNSUBSCRIPTION_DATE = "unsubscription_date";
  @SerializedName(SERIALIZED_NAME_UNSUBSCRIPTION_DATE)
  private OffsetDateTime unsubscriptionDate;

  public static final String SERIALIZED_NAME_CHANGE_DATE = "change_date";
  @SerializedName(SERIALIZED_NAME_CHANGE_DATE)
  private LocalDate changeDate;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_BIRTH_DATE = "birth_date";
  @SerializedName(SERIALIZED_NAME_BIRTH_DATE)
  private LocalDate birthDate;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private Language language = Language.EN;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  /**
   * Email channel status
   */
  @JsonAdapter(EmailStatusEnum.Adapter.class)
  public enum EmailStatusEnum {
    ACTIVE("active"),
    
    INACTIVE("inactive");

    private String value;

    EmailStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EmailStatusEnum fromValue(String value) {
      for (EmailStatusEnum b : EmailStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EmailStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EmailStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EmailStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EmailStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_EMAIL_STATUS = "email_status";
  @SerializedName(SERIALIZED_NAME_EMAIL_STATUS)
  private EmailStatusEnum emailStatus = EmailStatusEnum.ACTIVE;

  public static final String SERIALIZED_NAME_CELLPHONE = "cellphone";
  @SerializedName(SERIALIZED_NAME_CELLPHONE)
  private String cellphone;

  /**
   * Cellphone channel status
   */
  @JsonAdapter(CellphoneStatusEnum.Adapter.class)
  public enum CellphoneStatusEnum {
    ACTIVE("active"),
    
    INACTIVE("inactive");

    private String value;

    CellphoneStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CellphoneStatusEnum fromValue(String value) {
      for (CellphoneStatusEnum b : CellphoneStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CellphoneStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CellphoneStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CellphoneStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CellphoneStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CELLPHONE_STATUS = "cellphone_status";
  @SerializedName(SERIALIZED_NAME_CELLPHONE_STATUS)
  private CellphoneStatusEnum cellphoneStatus = CellphoneStatusEnum.ACTIVE;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  /**
   * Phone channel status
   */
  @JsonAdapter(PhoneStatusEnum.Adapter.class)
  public enum PhoneStatusEnum {
    ACTIVE("active"),
    
    INACTIVE("inactive");

    private String value;

    PhoneStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PhoneStatusEnum fromValue(String value) {
      for (PhoneStatusEnum b : PhoneStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PhoneStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PhoneStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PhoneStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PhoneStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PHONE_STATUS = "phone_status";
  @SerializedName(SERIALIZED_NAME_PHONE_STATUS)
  private PhoneStatusEnum phoneStatus = PhoneStatusEnum.ACTIVE;

  public static final String SERIALIZED_NAME_PUSH_TOKEN_ANDROID = "push_token_android";
  @SerializedName(SERIALIZED_NAME_PUSH_TOKEN_ANDROID)
  private List<ContactBaseWithStatusFieldsSchemaBasePushTokenAndroid> pushTokenAndroid = null;

  public static final String SERIALIZED_NAME_PUSH_TOKEN_IOS = "push_token_ios";
  @SerializedName(SERIALIZED_NAME_PUSH_TOKEN_IOS)
  private List<ContactBaseWithStatusFieldsSchemaBasePushTokenIos> pushTokenIos = null;


   /**
   * Get contactId
   * @return contactId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8f3a27ef26", value = "")

  public String getContactId() {
    return contactId;
  }




  public ContactInsideBase status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Status of the contact
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Status of the contact")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


   /**
   * Contact consent
   * @return consent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contact consent")

  public ConsentEnum getConsent() {
    return consent;
  }




   /**
   * Date and hour of the contact consent
   * @return consentDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date and hour of the contact consent")

  public OffsetDateTime getConsentDate() {
    return consentDate;
  }




   /**
   * Contact subscription method
   * @return subscriptionMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contact subscription method")

  public SubscriptionMethodEnum getSubscriptionMethod() {
    return subscriptionMethod;
  }




   /**
   * Date and hour of the contact subscription
   * @return subscriptionDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date and hour of the contact subscription")

  public OffsetDateTime getSubscriptionDate() {
    return subscriptionDate;
  }




   /**
   * Contact subscription form
   * minimum: 0
   * @return subscriptionForm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contact subscription form")

  public Integer getSubscriptionForm() {
    return subscriptionForm;
  }




   /**
   * Contact unsubscription method
   * @return unsubscriptionMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contact unsubscription method")

  public UnsubscriptionMethodEnum getUnsubscriptionMethod() {
    return unsubscriptionMethod;
  }




   /**
   * Contact unsubscription reason
   * @return unsubscriptionReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contact unsubscription reason")

  public UnsubscriptionReasonEnum getUnsubscriptionReason() {
    return unsubscriptionReason;
  }




   /**
   * Contact unsubscription observation
   * @return unsubscriptionObservation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contact unsubscription observation")

  public String getUnsubscriptionObservation() {
    return unsubscriptionObservation;
  }




   /**
   * Contact unsubscription date
   * @return unsubscriptionDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contact unsubscription date")

  public OffsetDateTime getUnsubscriptionDate() {
    return unsubscriptionDate;
  }




   /**
   * Last modification date of the contact
   * @return changeDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Last modification date of the contact")

  public LocalDate getChangeDate() {
    return changeDate;
  }




  public ContactInsideBase firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * First name of the contact
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "John", value = "First name of the contact")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public ContactInsideBase lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Last name of the contact
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Doe", value = "Last name of the contact")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public ContactInsideBase birthDate(LocalDate birthDate) {
    
    this.birthDate = birthDate;
    return this;
  }

   /**
   * Birth date of the contact
   * @return birthDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Fri Jan 10 01:00:00 WET 1975", value = "Birth date of the contact")

  public LocalDate getBirthDate() {
    return birthDate;
  }


  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }


  public ContactInsideBase language(Language language) {
    
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


  public ContactInsideBase email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Email of the contact
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "example@e-goi.com", value = "Email of the contact")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


   /**
   * Email channel status
   * @return emailStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Email channel status")

  public EmailStatusEnum getEmailStatus() {
    return emailStatus;
  }




  public ContactInsideBase cellphone(String cellphone) {
    
    this.cellphone = cellphone;
    return this;
  }

   /**
   * Cellphone of the contact
   * @return cellphone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "351-300404336", value = "Cellphone of the contact")

  public String getCellphone() {
    return cellphone;
  }


  public void setCellphone(String cellphone) {
    this.cellphone = cellphone;
  }


   /**
   * Cellphone channel status
   * @return cellphoneStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Cellphone channel status")

  public CellphoneStatusEnum getCellphoneStatus() {
    return cellphoneStatus;
  }




  public ContactInsideBase phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * Phone of the contact
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "351-300404336", value = "Phone of the contact")

  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }


   /**
   * Phone channel status
   * @return phoneStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Phone channel status")

  public PhoneStatusEnum getPhoneStatus() {
    return phoneStatus;
  }




  public ContactInsideBase pushTokenAndroid(List<ContactBaseWithStatusFieldsSchemaBasePushTokenAndroid> pushTokenAndroid) {
    
    this.pushTokenAndroid = pushTokenAndroid;
    return this;
  }

  public ContactInsideBase addPushTokenAndroidItem(ContactBaseWithStatusFieldsSchemaBasePushTokenAndroid pushTokenAndroidItem) {
    if (this.pushTokenAndroid == null) {
      this.pushTokenAndroid = new ArrayList<ContactBaseWithStatusFieldsSchemaBasePushTokenAndroid>();
    }
    this.pushTokenAndroid.add(pushTokenAndroidItem);
    return this;
  }

   /**
   * Android push token of the contact
   * @return pushTokenAndroid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Android push token of the contact")

  public List<ContactBaseWithStatusFieldsSchemaBasePushTokenAndroid> getPushTokenAndroid() {
    return pushTokenAndroid;
  }


  public void setPushTokenAndroid(List<ContactBaseWithStatusFieldsSchemaBasePushTokenAndroid> pushTokenAndroid) {
    this.pushTokenAndroid = pushTokenAndroid;
  }


  public ContactInsideBase pushTokenIos(List<ContactBaseWithStatusFieldsSchemaBasePushTokenIos> pushTokenIos) {
    
    this.pushTokenIos = pushTokenIos;
    return this;
  }

  public ContactInsideBase addPushTokenIosItem(ContactBaseWithStatusFieldsSchemaBasePushTokenIos pushTokenIosItem) {
    if (this.pushTokenIos == null) {
      this.pushTokenIos = new ArrayList<ContactBaseWithStatusFieldsSchemaBasePushTokenIos>();
    }
    this.pushTokenIos.add(pushTokenIosItem);
    return this;
  }

   /**
   * IOS push token of the contact
   * @return pushTokenIos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "IOS push token of the contact")

  public List<ContactBaseWithStatusFieldsSchemaBasePushTokenIos> getPushTokenIos() {
    return pushTokenIos;
  }


  public void setPushTokenIos(List<ContactBaseWithStatusFieldsSchemaBasePushTokenIos> pushTokenIos) {
    this.pushTokenIos = pushTokenIos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactInsideBase contactInsideBase = (ContactInsideBase) o;
    return Objects.equals(this.contactId, contactInsideBase.contactId) &&
        Objects.equals(this.status, contactInsideBase.status) &&
        Objects.equals(this.consent, contactInsideBase.consent) &&
        Objects.equals(this.consentDate, contactInsideBase.consentDate) &&
        Objects.equals(this.subscriptionMethod, contactInsideBase.subscriptionMethod) &&
        Objects.equals(this.subscriptionDate, contactInsideBase.subscriptionDate) &&
        Objects.equals(this.subscriptionForm, contactInsideBase.subscriptionForm) &&
        Objects.equals(this.unsubscriptionMethod, contactInsideBase.unsubscriptionMethod) &&
        Objects.equals(this.unsubscriptionReason, contactInsideBase.unsubscriptionReason) &&
        Objects.equals(this.unsubscriptionObservation, contactInsideBase.unsubscriptionObservation) &&
        Objects.equals(this.unsubscriptionDate, contactInsideBase.unsubscriptionDate) &&
        Objects.equals(this.changeDate, contactInsideBase.changeDate) &&
        Objects.equals(this.firstName, contactInsideBase.firstName) &&
        Objects.equals(this.lastName, contactInsideBase.lastName) &&
        Objects.equals(this.birthDate, contactInsideBase.birthDate) &&
        Objects.equals(this.language, contactInsideBase.language) &&
        Objects.equals(this.email, contactInsideBase.email) &&
        Objects.equals(this.emailStatus, contactInsideBase.emailStatus) &&
        Objects.equals(this.cellphone, contactInsideBase.cellphone) &&
        Objects.equals(this.cellphoneStatus, contactInsideBase.cellphoneStatus) &&
        Objects.equals(this.phone, contactInsideBase.phone) &&
        Objects.equals(this.phoneStatus, contactInsideBase.phoneStatus) &&
        Objects.equals(this.pushTokenAndroid, contactInsideBase.pushTokenAndroid) &&
        Objects.equals(this.pushTokenIos, contactInsideBase.pushTokenIos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactId, status, consent, consentDate, subscriptionMethod, subscriptionDate, subscriptionForm, unsubscriptionMethod, unsubscriptionReason, unsubscriptionObservation, unsubscriptionDate, changeDate, firstName, lastName, birthDate, language, email, emailStatus, cellphone, cellphoneStatus, phone, phoneStatus, pushTokenAndroid, pushTokenIos);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactInsideBase {\n");
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    consent: ").append(toIndentedString(consent)).append("\n");
    sb.append("    consentDate: ").append(toIndentedString(consentDate)).append("\n");
    sb.append("    subscriptionMethod: ").append(toIndentedString(subscriptionMethod)).append("\n");
    sb.append("    subscriptionDate: ").append(toIndentedString(subscriptionDate)).append("\n");
    sb.append("    subscriptionForm: ").append(toIndentedString(subscriptionForm)).append("\n");
    sb.append("    unsubscriptionMethod: ").append(toIndentedString(unsubscriptionMethod)).append("\n");
    sb.append("    unsubscriptionReason: ").append(toIndentedString(unsubscriptionReason)).append("\n");
    sb.append("    unsubscriptionObservation: ").append(toIndentedString(unsubscriptionObservation)).append("\n");
    sb.append("    unsubscriptionDate: ").append(toIndentedString(unsubscriptionDate)).append("\n");
    sb.append("    changeDate: ").append(toIndentedString(changeDate)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    emailStatus: ").append(toIndentedString(emailStatus)).append("\n");
    sb.append("    cellphone: ").append(toIndentedString(cellphone)).append("\n");
    sb.append("    cellphoneStatus: ").append(toIndentedString(cellphoneStatus)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    phoneStatus: ").append(toIndentedString(phoneStatus)).append("\n");
    sb.append("    pushTokenAndroid: ").append(toIndentedString(pushTokenAndroid)).append("\n");
    sb.append("    pushTokenIos: ").append(toIndentedString(pushTokenIos)).append("\n");
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

