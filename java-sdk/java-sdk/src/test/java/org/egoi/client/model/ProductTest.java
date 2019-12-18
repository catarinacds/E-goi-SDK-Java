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
import org.egoi.client.model.BasicProduct;
import org.egoi.client.model.ProductAllOf;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for Product
 */
public class ProductTest {
    private final Product model = new Product();

    /**
     * Model tests for Product
     */
    @Test
    public void testProduct() {
        // TODO: test Product
    }

    /**
     * Test the property 'productIdentifier'
     */
    @Test
    public void productIdentifierTest() {
        // TODO: test productIdentifier
    }

    /**
     * Test the property 'catalogId'
     */
    @Test
    public void catalogIdTest() {
        // TODO: test catalogId
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'description'
     */
    @Test
    public void descriptionTest() {
        // TODO: test description
    }

    /**
     * Test the property 'sku'
     */
    @Test
    public void skuTest() {
        // TODO: test sku
    }

    /**
     * Test the property 'upc'
     */
    @Test
    public void upcTest() {
        // TODO: test upc
    }

    /**
     * Test the property 'ean'
     */
    @Test
    public void eanTest() {
        // TODO: test ean
    }

    /**
     * Test the property 'gtin'
     */
    @Test
    public void gtinTest() {
        // TODO: test gtin
    }

    /**
     * Test the property 'mpn'
     */
    @Test
    public void mpnTest() {
        // TODO: test mpn
    }

    /**
     * Test the property 'link'
     */
    @Test
    public void linkTest() {
        // TODO: test link
    }

    /**
     * Test the property 'imageLink'
     */
    @Test
    public void imageLinkTest() {
        // TODO: test imageLink
    }

    /**
     * Test the property 'price'
     */
    @Test
    public void priceTest() {
        // TODO: test price
    }

    /**
     * Test the property 'salePrice'
     */
    @Test
    public void salePriceTest() {
        // TODO: test salePrice
    }

    /**
     * Test the property 'brand'
     */
    @Test
    public void brandTest() {
        // TODO: test brand
    }

    /**
     * Test the property 'categories'
     */
    @Test
    public void categoriesTest() {
        // TODO: test categories
    }

    /**
     * Test the property 'relatedProducts'
     */
    @Test
    public void relatedProductsTest() {
        // TODO: test relatedProducts
    }

}
