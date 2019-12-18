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
import org.egoi.client.model.BalanceInfo;
import org.egoi.client.model.BalanceInfoBalanceInfo;
import org.egoi.client.model.BillingInfo;
import org.egoi.client.model.BillingInfoAllOfBillingInfo;
import org.egoi.client.model.GeneralInfo;
import org.egoi.client.model.GeneralInfoAllOfGeneralInfo;
import org.egoi.client.model.ModuleInfo;
import org.egoi.client.model.ModuleInfoModuleInfo;
import org.egoi.client.model.PlanInfo;
import org.egoi.client.model.PlanInfoPlanInfo;

/**
 * My Account schema
 */
@ApiModel(description = "My Account schema")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-18T18:19:55.100032Z[Europe/Lisbon]")
public class MyAccount {
  public static final String SERIALIZED_NAME_GENERAL_INFO = "general_info";
  @SerializedName(SERIALIZED_NAME_GENERAL_INFO)
  private GeneralInfoAllOfGeneralInfo generalInfo;

  public static final String SERIALIZED_NAME_BILLING_INFO = "billing_info";
  @SerializedName(SERIALIZED_NAME_BILLING_INFO)
  private BillingInfoAllOfBillingInfo billingInfo;

  public static final String SERIALIZED_NAME_PLAN_INFO = "plan_info";
  @SerializedName(SERIALIZED_NAME_PLAN_INFO)
  private PlanInfoPlanInfo planInfo;

  public static final String SERIALIZED_NAME_BALANCE_INFO = "balance_info";
  @SerializedName(SERIALIZED_NAME_BALANCE_INFO)
  private BalanceInfoBalanceInfo balanceInfo;

  public static final String SERIALIZED_NAME_MODULE_INFO = "module_info";
  @SerializedName(SERIALIZED_NAME_MODULE_INFO)
  private ModuleInfoModuleInfo moduleInfo;


  public MyAccount generalInfo(GeneralInfoAllOfGeneralInfo generalInfo) {
    
    this.generalInfo = generalInfo;
    return this;
  }

   /**
   * Get generalInfo
   * @return generalInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GeneralInfoAllOfGeneralInfo getGeneralInfo() {
    return generalInfo;
  }


  public void setGeneralInfo(GeneralInfoAllOfGeneralInfo generalInfo) {
    this.generalInfo = generalInfo;
  }


  public MyAccount billingInfo(BillingInfoAllOfBillingInfo billingInfo) {
    
    this.billingInfo = billingInfo;
    return this;
  }

   /**
   * Get billingInfo
   * @return billingInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BillingInfoAllOfBillingInfo getBillingInfo() {
    return billingInfo;
  }


  public void setBillingInfo(BillingInfoAllOfBillingInfo billingInfo) {
    this.billingInfo = billingInfo;
  }


  public MyAccount planInfo(PlanInfoPlanInfo planInfo) {
    
    this.planInfo = planInfo;
    return this;
  }

   /**
   * Get planInfo
   * @return planInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PlanInfoPlanInfo getPlanInfo() {
    return planInfo;
  }


  public void setPlanInfo(PlanInfoPlanInfo planInfo) {
    this.planInfo = planInfo;
  }


  public MyAccount balanceInfo(BalanceInfoBalanceInfo balanceInfo) {
    
    this.balanceInfo = balanceInfo;
    return this;
  }

   /**
   * Get balanceInfo
   * @return balanceInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BalanceInfoBalanceInfo getBalanceInfo() {
    return balanceInfo;
  }


  public void setBalanceInfo(BalanceInfoBalanceInfo balanceInfo) {
    this.balanceInfo = balanceInfo;
  }


  public MyAccount moduleInfo(ModuleInfoModuleInfo moduleInfo) {
    
    this.moduleInfo = moduleInfo;
    return this;
  }

   /**
   * Get moduleInfo
   * @return moduleInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ModuleInfoModuleInfo getModuleInfo() {
    return moduleInfo;
  }


  public void setModuleInfo(ModuleInfoModuleInfo moduleInfo) {
    this.moduleInfo = moduleInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MyAccount myAccount = (MyAccount) o;
    return Objects.equals(this.generalInfo, myAccount.generalInfo) &&
        Objects.equals(this.billingInfo, myAccount.billingInfo) &&
        Objects.equals(this.planInfo, myAccount.planInfo) &&
        Objects.equals(this.balanceInfo, myAccount.balanceInfo) &&
        Objects.equals(this.moduleInfo, myAccount.moduleInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(generalInfo, billingInfo, planInfo, balanceInfo, moduleInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MyAccount {\n");
    sb.append("    generalInfo: ").append(toIndentedString(generalInfo)).append("\n");
    sb.append("    billingInfo: ").append(toIndentedString(billingInfo)).append("\n");
    sb.append("    planInfo: ").append(toIndentedString(planInfo)).append("\n");
    sb.append("    balanceInfo: ").append(toIndentedString(balanceInfo)).append("\n");
    sb.append("    moduleInfo: ").append(toIndentedString(moduleInfo)).append("\n");
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

