# FormsApi

All URIs are relative to *http://api-v3.egoiapp.max*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllForms**](FormsApi.md#getAllForms) | **GET** /forms | Get all forms


<a name="getAllForms"></a>
# **getAllForms**
> FormCollection getAllForms(offset, limit, order, orderBy, language, listId, owner, status, createdMin, createdMax, updatedMin, updatedMax)

Get all forms

Returns all forms

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.FormsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api-v3.egoiapp.max");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    FormsApi apiInstance = new FormsApi(defaultClient);
    Integer offset = 56; // Integer | Element offset (starting at zero for the first element)
    Integer limit = 10; // Integer | Number of items to return
    String order = "desc"; // String | Type of order
    String orderBy = "form_id"; // String | Reference attribute to order forms
    String language = "language_example"; // String | Language of the form
    Integer listId = 56; // Integer | ID of the list that owns the form
    Integer owner = 56; // Integer | User ID of the form owner
    String status = "status_example"; // String | Status filter
    OffsetDateTime createdMin = new OffsetDateTime(); // OffsetDateTime | Created initial date
    OffsetDateTime createdMax = new OffsetDateTime(); // OffsetDateTime | Created finish
    OffsetDateTime updatedMin = new OffsetDateTime(); // OffsetDateTime | Updated initial
    OffsetDateTime updatedMax = new OffsetDateTime(); // OffsetDateTime | Updated finish
    try {
      FormCollection result = apiInstance.getAllForms(offset, limit, order, orderBy, language, listId, owner, status, createdMin, createdMax, updatedMin, updatedMax);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FormsApi#getAllForms");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **Integer**| Element offset (starting at zero for the first element) | [optional]
 **limit** | **Integer**| Number of items to return | [optional] [default to 10]
 **order** | **String**| Type of order | [optional] [default to desc] [enum: asc, desc]
 **orderBy** | **String**| Reference attribute to order forms | [optional] [default to form_id] [enum: form_id, internal_title, title, language, list_id, default, owner, status, created, updated]
 **language** | **String**| Language of the form | [optional] [enum: en, pt, br, es, de, hu]
 **listId** | **Integer**| ID of the list that owns the form | [optional]
 **owner** | **Integer**| User ID of the form owner | [optional]
 **status** | **String**| Status filter | [optional] [enum: active, unpublished, cloned, deleted]
 **createdMin** | **OffsetDateTime**| Created initial date | [optional]
 **createdMax** | **OffsetDateTime**| Created finish | [optional]
 **updatedMin** | **OffsetDateTime**| Updated initial | [optional]
 **updatedMax** | **OffsetDateTime**| Updated finish | [optional]

### Return type

[**FormCollection**](FormCollection.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**422** | Unprocessable Entity |  -  |
**500** | Internal Server Error |  -  |

