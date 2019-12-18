# UsersApi

All URIs are relative to *http://api-v3.egoiapp.max*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUser**](UsersApi.md#createUser) | **POST** /users | Create new user
[**deleteUser**](UsersApi.md#deleteUser) | **DELETE** /users/{user_id} | Remove user
[**getAllUsers**](UsersApi.md#getAllUsers) | **GET** /users | Get all users
[**getUser**](UsersApi.md#getUser) | **GET** /users/{user_id} | Get user


<a name="createUser"></a>
# **createUser**
> ComplexUser createUser(userPostRequest)

Create new user

Create a new user

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api-v3.egoiapp.max");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    UsersApi apiInstance = new UsersApi(defaultClient);
    UserPostRequest userPostRequest = new UserPostRequest(); // UserPostRequest | Parameters for the user
    try {
      ComplexUser result = apiInstance.createUser(userPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#createUser");
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
 **userPostRequest** | [**UserPostRequest**](UserPostRequest.md)| Parameters for the user |

### Return type

[**ComplexUser**](ComplexUser.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**422** | Unprocessable Entity |  -  |
**500** | Internal Server Error |  -  |

<a name="deleteUser"></a>
# **deleteUser**
> deleteUser(userId)

Remove user

Remove user information given its ID

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api-v3.egoiapp.max");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    UsersApi apiInstance = new UsersApi(defaultClient);
    Integer userId = 56; // Integer | ID of the User
    try {
      apiInstance.deleteUser(userId);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#deleteUser");
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
 **userId** | **Integer**| ID of the User |

### Return type

null (empty response body)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**409** | Conflict |  -  |
**500** | Internal Server Error |  -  |

<a name="getAllUsers"></a>
# **getAllUsers**
> UserCollection getAllUsers(username, status, createdMin, createdMax, updatedMin, updatedMax, offset, limit, order, orderBy)

Get all users

Returns all users

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api-v3.egoiapp.max");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String username = "username_example"; // String | Reference attribute to username user
    String status = "status_example"; // String | Status filter
    OffsetDateTime createdMin = new OffsetDateTime(); // OffsetDateTime | Created initial date
    OffsetDateTime createdMax = new OffsetDateTime(); // OffsetDateTime | Created finish
    OffsetDateTime updatedMin = new OffsetDateTime(); // OffsetDateTime | Updated initial
    OffsetDateTime updatedMax = new OffsetDateTime(); // OffsetDateTime | Updated finish
    Integer offset = 56; // Integer | Element offset (starting at zero for the first element)
    Integer limit = 10; // Integer | Number of items to return
    String order = "desc"; // String | Type of order
    String orderBy = "user_id"; // String | Reference attribute to order users
    try {
      UserCollection result = apiInstance.getAllUsers(username, status, createdMin, createdMax, updatedMin, updatedMax, offset, limit, order, orderBy);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getAllUsers");
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
 **username** | **String**| Reference attribute to username user | [optional]
 **status** | **String**| Status filter | [optional] [enum: active, inactive]
 **createdMin** | **OffsetDateTime**| Created initial date | [optional]
 **createdMax** | **OffsetDateTime**| Created finish | [optional]
 **updatedMin** | **OffsetDateTime**| Updated initial | [optional]
 **updatedMax** | **OffsetDateTime**| Updated finish | [optional]
 **offset** | **Integer**| Element offset (starting at zero for the first element) | [optional]
 **limit** | **Integer**| Number of items to return | [optional] [default to 10]
 **order** | **String**| Type of order | [optional] [default to desc] [enum: asc, desc]
 **orderBy** | **String**| Reference attribute to order users | [optional] [default to user_id] [enum: user_id, username]

### Return type

[**UserCollection**](UserCollection.md)

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

<a name="getUser"></a>
# **getUser**
> ComplexUser getUser(userId)

Get user

Returns user information given its ID

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api-v3.egoiapp.max");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    UsersApi apiInstance = new UsersApi(defaultClient);
    Integer userId = 56; // Integer | ID of the User
    try {
      ComplexUser result = apiInstance.getUser(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUser");
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
 **userId** | **Integer**| ID of the User |

### Return type

[**ComplexUser**](ComplexUser.md)

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
**404** | Not Found |  -  |
**422** | Unprocessable Entity |  -  |
**500** | Internal Server Error |  -  |

