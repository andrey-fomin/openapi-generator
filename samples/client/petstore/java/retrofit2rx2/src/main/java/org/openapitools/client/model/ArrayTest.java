/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.ReadOnlyFirst;

/**
 * ArrayTest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0-SNAPSHOT")
public class ArrayTest {
  public static final String SERIALIZED_NAME_ARRAY_OF_STRING = "array_of_string";
  @SerializedName(SERIALIZED_NAME_ARRAY_OF_STRING)
  @javax.annotation.Nullable
  private List<String> arrayOfString;

  public static final String SERIALIZED_NAME_ARRAY_ARRAY_OF_INTEGER = "array_array_of_integer";
  @SerializedName(SERIALIZED_NAME_ARRAY_ARRAY_OF_INTEGER)
  @javax.annotation.Nullable
  private List<List<Long>> arrayArrayOfInteger;

  public static final String SERIALIZED_NAME_ARRAY_ARRAY_OF_MODEL = "array_array_of_model";
  @SerializedName(SERIALIZED_NAME_ARRAY_ARRAY_OF_MODEL)
  @javax.annotation.Nullable
  private List<List<ReadOnlyFirst>> arrayArrayOfModel;

  public ArrayTest() {
  }

  public ArrayTest arrayOfString(@javax.annotation.Nullable List<String> arrayOfString) {
    
    this.arrayOfString = arrayOfString;
    return this;
  }

  public ArrayTest addArrayOfStringItem(String arrayOfStringItem) {
    if (this.arrayOfString == null) {
      this.arrayOfString = new ArrayList<>();
    }
    this.arrayOfString.add(arrayOfStringItem);
    return this;
  }

  /**
   * Get arrayOfString
   * @return arrayOfString
   */
  @javax.annotation.Nullable

  public List<String> getArrayOfString() {
    return arrayOfString;
  }


  public void setArrayOfString(@javax.annotation.Nullable List<String> arrayOfString) {
    this.arrayOfString = arrayOfString;
  }

  public ArrayTest arrayArrayOfInteger(@javax.annotation.Nullable List<List<Long>> arrayArrayOfInteger) {
    
    this.arrayArrayOfInteger = arrayArrayOfInteger;
    return this;
  }

  public ArrayTest addArrayArrayOfIntegerItem(List<Long> arrayArrayOfIntegerItem) {
    if (this.arrayArrayOfInteger == null) {
      this.arrayArrayOfInteger = new ArrayList<>();
    }
    this.arrayArrayOfInteger.add(arrayArrayOfIntegerItem);
    return this;
  }

  /**
   * Get arrayArrayOfInteger
   * @return arrayArrayOfInteger
   */
  @javax.annotation.Nullable

  public List<List<Long>> getArrayArrayOfInteger() {
    return arrayArrayOfInteger;
  }


  public void setArrayArrayOfInteger(@javax.annotation.Nullable List<List<Long>> arrayArrayOfInteger) {
    this.arrayArrayOfInteger = arrayArrayOfInteger;
  }

  public ArrayTest arrayArrayOfModel(@javax.annotation.Nullable List<List<ReadOnlyFirst>> arrayArrayOfModel) {
    
    this.arrayArrayOfModel = arrayArrayOfModel;
    return this;
  }

  public ArrayTest addArrayArrayOfModelItem(List<ReadOnlyFirst> arrayArrayOfModelItem) {
    if (this.arrayArrayOfModel == null) {
      this.arrayArrayOfModel = new ArrayList<>();
    }
    this.arrayArrayOfModel.add(arrayArrayOfModelItem);
    return this;
  }

  /**
   * Get arrayArrayOfModel
   * @return arrayArrayOfModel
   */
  @javax.annotation.Nullable

  public List<List<ReadOnlyFirst>> getArrayArrayOfModel() {
    return arrayArrayOfModel;
  }


  public void setArrayArrayOfModel(@javax.annotation.Nullable List<List<ReadOnlyFirst>> arrayArrayOfModel) {
    this.arrayArrayOfModel = arrayArrayOfModel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArrayTest arrayTest = (ArrayTest) o;
    return Objects.equals(this.arrayOfString, arrayTest.arrayOfString) &&
        Objects.equals(this.arrayArrayOfInteger, arrayTest.arrayArrayOfInteger) &&
        Objects.equals(this.arrayArrayOfModel, arrayTest.arrayArrayOfModel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arrayOfString, arrayArrayOfInteger, arrayArrayOfModel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArrayTest {\n");
    sb.append("    arrayOfString: ").append(toIndentedString(arrayOfString)).append("\n");
    sb.append("    arrayArrayOfInteger: ").append(toIndentedString(arrayArrayOfInteger)).append("\n");
    sb.append("    arrayArrayOfModel: ").append(toIndentedString(arrayArrayOfModel)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

