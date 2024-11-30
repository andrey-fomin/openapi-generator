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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * XmlItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0-SNAPSHOT")
public class XmlItem {
  public static final String SERIALIZED_NAME_ATTRIBUTE_STRING = "attribute_string";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_STRING)
  @javax.annotation.Nullable
  private String attributeString;

  public static final String SERIALIZED_NAME_ATTRIBUTE_NUMBER = "attribute_number";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_NUMBER)
  @javax.annotation.Nullable
  private BigDecimal attributeNumber;

  public static final String SERIALIZED_NAME_ATTRIBUTE_INTEGER = "attribute_integer";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_INTEGER)
  @javax.annotation.Nullable
  private Integer attributeInteger;

  public static final String SERIALIZED_NAME_ATTRIBUTE_BOOLEAN = "attribute_boolean";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_BOOLEAN)
  @javax.annotation.Nullable
  private Boolean attributeBoolean;

  public static final String SERIALIZED_NAME_WRAPPED_ARRAY = "wrapped_array";
  @SerializedName(SERIALIZED_NAME_WRAPPED_ARRAY)
  @javax.annotation.Nullable
  private List<Integer> wrappedArray;

  public static final String SERIALIZED_NAME_NAME_STRING = "name_string";
  @SerializedName(SERIALIZED_NAME_NAME_STRING)
  @javax.annotation.Nullable
  private String nameString;

  public static final String SERIALIZED_NAME_NAME_NUMBER = "name_number";
  @SerializedName(SERIALIZED_NAME_NAME_NUMBER)
  @javax.annotation.Nullable
  private BigDecimal nameNumber;

  public static final String SERIALIZED_NAME_NAME_INTEGER = "name_integer";
  @SerializedName(SERIALIZED_NAME_NAME_INTEGER)
  @javax.annotation.Nullable
  private Integer nameInteger;

  public static final String SERIALIZED_NAME_NAME_BOOLEAN = "name_boolean";
  @SerializedName(SERIALIZED_NAME_NAME_BOOLEAN)
  @javax.annotation.Nullable
  private Boolean nameBoolean;

  public static final String SERIALIZED_NAME_NAME_ARRAY = "name_array";
  @SerializedName(SERIALIZED_NAME_NAME_ARRAY)
  @javax.annotation.Nullable
  private List<Integer> nameArray;

  public static final String SERIALIZED_NAME_NAME_WRAPPED_ARRAY = "name_wrapped_array";
  @SerializedName(SERIALIZED_NAME_NAME_WRAPPED_ARRAY)
  @javax.annotation.Nullable
  private List<Integer> nameWrappedArray;

  public static final String SERIALIZED_NAME_PREFIX_STRING = "prefix_string";
  @SerializedName(SERIALIZED_NAME_PREFIX_STRING)
  @javax.annotation.Nullable
  private String prefixString;

  public static final String SERIALIZED_NAME_PREFIX_NUMBER = "prefix_number";
  @SerializedName(SERIALIZED_NAME_PREFIX_NUMBER)
  @javax.annotation.Nullable
  private BigDecimal prefixNumber;

  public static final String SERIALIZED_NAME_PREFIX_INTEGER = "prefix_integer";
  @SerializedName(SERIALIZED_NAME_PREFIX_INTEGER)
  @javax.annotation.Nullable
  private Integer prefixInteger;

  public static final String SERIALIZED_NAME_PREFIX_BOOLEAN = "prefix_boolean";
  @SerializedName(SERIALIZED_NAME_PREFIX_BOOLEAN)
  @javax.annotation.Nullable
  private Boolean prefixBoolean;

  public static final String SERIALIZED_NAME_PREFIX_ARRAY = "prefix_array";
  @SerializedName(SERIALIZED_NAME_PREFIX_ARRAY)
  @javax.annotation.Nullable
  private List<Integer> prefixArray;

  public static final String SERIALIZED_NAME_PREFIX_WRAPPED_ARRAY = "prefix_wrapped_array";
  @SerializedName(SERIALIZED_NAME_PREFIX_WRAPPED_ARRAY)
  @javax.annotation.Nullable
  private List<Integer> prefixWrappedArray;

  public static final String SERIALIZED_NAME_NAMESPACE_STRING = "namespace_string";
  @SerializedName(SERIALIZED_NAME_NAMESPACE_STRING)
  @javax.annotation.Nullable
  private String namespaceString;

  public static final String SERIALIZED_NAME_NAMESPACE_NUMBER = "namespace_number";
  @SerializedName(SERIALIZED_NAME_NAMESPACE_NUMBER)
  @javax.annotation.Nullable
  private BigDecimal namespaceNumber;

  public static final String SERIALIZED_NAME_NAMESPACE_INTEGER = "namespace_integer";
  @SerializedName(SERIALIZED_NAME_NAMESPACE_INTEGER)
  @javax.annotation.Nullable
  private Integer namespaceInteger;

  public static final String SERIALIZED_NAME_NAMESPACE_BOOLEAN = "namespace_boolean";
  @SerializedName(SERIALIZED_NAME_NAMESPACE_BOOLEAN)
  @javax.annotation.Nullable
  private Boolean namespaceBoolean;

  public static final String SERIALIZED_NAME_NAMESPACE_ARRAY = "namespace_array";
  @SerializedName(SERIALIZED_NAME_NAMESPACE_ARRAY)
  @javax.annotation.Nullable
  private List<Integer> namespaceArray;

  public static final String SERIALIZED_NAME_NAMESPACE_WRAPPED_ARRAY = "namespace_wrapped_array";
  @SerializedName(SERIALIZED_NAME_NAMESPACE_WRAPPED_ARRAY)
  @javax.annotation.Nullable
  private List<Integer> namespaceWrappedArray;

  public static final String SERIALIZED_NAME_PREFIX_NS_STRING = "prefix_ns_string";
  @SerializedName(SERIALIZED_NAME_PREFIX_NS_STRING)
  @javax.annotation.Nullable
  private String prefixNsString;

  public static final String SERIALIZED_NAME_PREFIX_NS_NUMBER = "prefix_ns_number";
  @SerializedName(SERIALIZED_NAME_PREFIX_NS_NUMBER)
  @javax.annotation.Nullable
  private BigDecimal prefixNsNumber;

  public static final String SERIALIZED_NAME_PREFIX_NS_INTEGER = "prefix_ns_integer";
  @SerializedName(SERIALIZED_NAME_PREFIX_NS_INTEGER)
  @javax.annotation.Nullable
  private Integer prefixNsInteger;

  public static final String SERIALIZED_NAME_PREFIX_NS_BOOLEAN = "prefix_ns_boolean";
  @SerializedName(SERIALIZED_NAME_PREFIX_NS_BOOLEAN)
  @javax.annotation.Nullable
  private Boolean prefixNsBoolean;

  public static final String SERIALIZED_NAME_PREFIX_NS_ARRAY = "prefix_ns_array";
  @SerializedName(SERIALIZED_NAME_PREFIX_NS_ARRAY)
  @javax.annotation.Nullable
  private List<Integer> prefixNsArray;

  public static final String SERIALIZED_NAME_PREFIX_NS_WRAPPED_ARRAY = "prefix_ns_wrapped_array";
  @SerializedName(SERIALIZED_NAME_PREFIX_NS_WRAPPED_ARRAY)
  @javax.annotation.Nullable
  private List<Integer> prefixNsWrappedArray;

  public XmlItem() {
  }

  public XmlItem attributeString(@javax.annotation.Nullable String attributeString) {
    this.attributeString = attributeString;
    return this;
  }

  /**
   * Get attributeString
   * @return attributeString
   */
  @javax.annotation.Nullable
  public String getAttributeString() {
    return attributeString;
  }

  public void setAttributeString(@javax.annotation.Nullable String attributeString) {
    this.attributeString = attributeString;
  }


  public XmlItem attributeNumber(@javax.annotation.Nullable BigDecimal attributeNumber) {
    this.attributeNumber = attributeNumber;
    return this;
  }

  /**
   * Get attributeNumber
   * @return attributeNumber
   */
  @javax.annotation.Nullable
  public BigDecimal getAttributeNumber() {
    return attributeNumber;
  }

  public void setAttributeNumber(@javax.annotation.Nullable BigDecimal attributeNumber) {
    this.attributeNumber = attributeNumber;
  }


  public XmlItem attributeInteger(@javax.annotation.Nullable Integer attributeInteger) {
    this.attributeInteger = attributeInteger;
    return this;
  }

  /**
   * Get attributeInteger
   * @return attributeInteger
   */
  @javax.annotation.Nullable
  public Integer getAttributeInteger() {
    return attributeInteger;
  }

  public void setAttributeInteger(@javax.annotation.Nullable Integer attributeInteger) {
    this.attributeInteger = attributeInteger;
  }


  public XmlItem attributeBoolean(@javax.annotation.Nullable Boolean attributeBoolean) {
    this.attributeBoolean = attributeBoolean;
    return this;
  }

  /**
   * Get attributeBoolean
   * @return attributeBoolean
   */
  @javax.annotation.Nullable
  public Boolean getAttributeBoolean() {
    return attributeBoolean;
  }

  public void setAttributeBoolean(@javax.annotation.Nullable Boolean attributeBoolean) {
    this.attributeBoolean = attributeBoolean;
  }


  public XmlItem wrappedArray(@javax.annotation.Nullable List<Integer> wrappedArray) {
    this.wrappedArray = wrappedArray;
    return this;
  }

  public XmlItem addWrappedArrayItem(Integer wrappedArrayItem) {
    if (this.wrappedArray == null) {
      this.wrappedArray = new ArrayList<>();
    }
    this.wrappedArray.add(wrappedArrayItem);
    return this;
  }

  /**
   * Get wrappedArray
   * @return wrappedArray
   */
  @javax.annotation.Nullable
  public List<Integer> getWrappedArray() {
    return wrappedArray;
  }

  public void setWrappedArray(@javax.annotation.Nullable List<Integer> wrappedArray) {
    this.wrappedArray = wrappedArray;
  }


  public XmlItem nameString(@javax.annotation.Nullable String nameString) {
    this.nameString = nameString;
    return this;
  }

  /**
   * Get nameString
   * @return nameString
   */
  @javax.annotation.Nullable
  public String getNameString() {
    return nameString;
  }

  public void setNameString(@javax.annotation.Nullable String nameString) {
    this.nameString = nameString;
  }


  public XmlItem nameNumber(@javax.annotation.Nullable BigDecimal nameNumber) {
    this.nameNumber = nameNumber;
    return this;
  }

  /**
   * Get nameNumber
   * @return nameNumber
   */
  @javax.annotation.Nullable
  public BigDecimal getNameNumber() {
    return nameNumber;
  }

  public void setNameNumber(@javax.annotation.Nullable BigDecimal nameNumber) {
    this.nameNumber = nameNumber;
  }


  public XmlItem nameInteger(@javax.annotation.Nullable Integer nameInteger) {
    this.nameInteger = nameInteger;
    return this;
  }

  /**
   * Get nameInteger
   * @return nameInteger
   */
  @javax.annotation.Nullable
  public Integer getNameInteger() {
    return nameInteger;
  }

  public void setNameInteger(@javax.annotation.Nullable Integer nameInteger) {
    this.nameInteger = nameInteger;
  }


  public XmlItem nameBoolean(@javax.annotation.Nullable Boolean nameBoolean) {
    this.nameBoolean = nameBoolean;
    return this;
  }

  /**
   * Get nameBoolean
   * @return nameBoolean
   */
  @javax.annotation.Nullable
  public Boolean getNameBoolean() {
    return nameBoolean;
  }

  public void setNameBoolean(@javax.annotation.Nullable Boolean nameBoolean) {
    this.nameBoolean = nameBoolean;
  }


  public XmlItem nameArray(@javax.annotation.Nullable List<Integer> nameArray) {
    this.nameArray = nameArray;
    return this;
  }

  public XmlItem addNameArrayItem(Integer nameArrayItem) {
    if (this.nameArray == null) {
      this.nameArray = new ArrayList<>();
    }
    this.nameArray.add(nameArrayItem);
    return this;
  }

  /**
   * Get nameArray
   * @return nameArray
   */
  @javax.annotation.Nullable
  public List<Integer> getNameArray() {
    return nameArray;
  }

  public void setNameArray(@javax.annotation.Nullable List<Integer> nameArray) {
    this.nameArray = nameArray;
  }


  public XmlItem nameWrappedArray(@javax.annotation.Nullable List<Integer> nameWrappedArray) {
    this.nameWrappedArray = nameWrappedArray;
    return this;
  }

  public XmlItem addNameWrappedArrayItem(Integer nameWrappedArrayItem) {
    if (this.nameWrappedArray == null) {
      this.nameWrappedArray = new ArrayList<>();
    }
    this.nameWrappedArray.add(nameWrappedArrayItem);
    return this;
  }

  /**
   * Get nameWrappedArray
   * @return nameWrappedArray
   */
  @javax.annotation.Nullable
  public List<Integer> getNameWrappedArray() {
    return nameWrappedArray;
  }

  public void setNameWrappedArray(@javax.annotation.Nullable List<Integer> nameWrappedArray) {
    this.nameWrappedArray = nameWrappedArray;
  }


  public XmlItem prefixString(@javax.annotation.Nullable String prefixString) {
    this.prefixString = prefixString;
    return this;
  }

  /**
   * Get prefixString
   * @return prefixString
   */
  @javax.annotation.Nullable
  public String getPrefixString() {
    return prefixString;
  }

  public void setPrefixString(@javax.annotation.Nullable String prefixString) {
    this.prefixString = prefixString;
  }


  public XmlItem prefixNumber(@javax.annotation.Nullable BigDecimal prefixNumber) {
    this.prefixNumber = prefixNumber;
    return this;
  }

  /**
   * Get prefixNumber
   * @return prefixNumber
   */
  @javax.annotation.Nullable
  public BigDecimal getPrefixNumber() {
    return prefixNumber;
  }

  public void setPrefixNumber(@javax.annotation.Nullable BigDecimal prefixNumber) {
    this.prefixNumber = prefixNumber;
  }


  public XmlItem prefixInteger(@javax.annotation.Nullable Integer prefixInteger) {
    this.prefixInteger = prefixInteger;
    return this;
  }

  /**
   * Get prefixInteger
   * @return prefixInteger
   */
  @javax.annotation.Nullable
  public Integer getPrefixInteger() {
    return prefixInteger;
  }

  public void setPrefixInteger(@javax.annotation.Nullable Integer prefixInteger) {
    this.prefixInteger = prefixInteger;
  }


  public XmlItem prefixBoolean(@javax.annotation.Nullable Boolean prefixBoolean) {
    this.prefixBoolean = prefixBoolean;
    return this;
  }

  /**
   * Get prefixBoolean
   * @return prefixBoolean
   */
  @javax.annotation.Nullable
  public Boolean getPrefixBoolean() {
    return prefixBoolean;
  }

  public void setPrefixBoolean(@javax.annotation.Nullable Boolean prefixBoolean) {
    this.prefixBoolean = prefixBoolean;
  }


  public XmlItem prefixArray(@javax.annotation.Nullable List<Integer> prefixArray) {
    this.prefixArray = prefixArray;
    return this;
  }

  public XmlItem addPrefixArrayItem(Integer prefixArrayItem) {
    if (this.prefixArray == null) {
      this.prefixArray = new ArrayList<>();
    }
    this.prefixArray.add(prefixArrayItem);
    return this;
  }

  /**
   * Get prefixArray
   * @return prefixArray
   */
  @javax.annotation.Nullable
  public List<Integer> getPrefixArray() {
    return prefixArray;
  }

  public void setPrefixArray(@javax.annotation.Nullable List<Integer> prefixArray) {
    this.prefixArray = prefixArray;
  }


  public XmlItem prefixWrappedArray(@javax.annotation.Nullable List<Integer> prefixWrappedArray) {
    this.prefixWrappedArray = prefixWrappedArray;
    return this;
  }

  public XmlItem addPrefixWrappedArrayItem(Integer prefixWrappedArrayItem) {
    if (this.prefixWrappedArray == null) {
      this.prefixWrappedArray = new ArrayList<>();
    }
    this.prefixWrappedArray.add(prefixWrappedArrayItem);
    return this;
  }

  /**
   * Get prefixWrappedArray
   * @return prefixWrappedArray
   */
  @javax.annotation.Nullable
  public List<Integer> getPrefixWrappedArray() {
    return prefixWrappedArray;
  }

  public void setPrefixWrappedArray(@javax.annotation.Nullable List<Integer> prefixWrappedArray) {
    this.prefixWrappedArray = prefixWrappedArray;
  }


  public XmlItem namespaceString(@javax.annotation.Nullable String namespaceString) {
    this.namespaceString = namespaceString;
    return this;
  }

  /**
   * Get namespaceString
   * @return namespaceString
   */
  @javax.annotation.Nullable
  public String getNamespaceString() {
    return namespaceString;
  }

  public void setNamespaceString(@javax.annotation.Nullable String namespaceString) {
    this.namespaceString = namespaceString;
  }


  public XmlItem namespaceNumber(@javax.annotation.Nullable BigDecimal namespaceNumber) {
    this.namespaceNumber = namespaceNumber;
    return this;
  }

  /**
   * Get namespaceNumber
   * @return namespaceNumber
   */
  @javax.annotation.Nullable
  public BigDecimal getNamespaceNumber() {
    return namespaceNumber;
  }

  public void setNamespaceNumber(@javax.annotation.Nullable BigDecimal namespaceNumber) {
    this.namespaceNumber = namespaceNumber;
  }


  public XmlItem namespaceInteger(@javax.annotation.Nullable Integer namespaceInteger) {
    this.namespaceInteger = namespaceInteger;
    return this;
  }

  /**
   * Get namespaceInteger
   * @return namespaceInteger
   */
  @javax.annotation.Nullable
  public Integer getNamespaceInteger() {
    return namespaceInteger;
  }

  public void setNamespaceInteger(@javax.annotation.Nullable Integer namespaceInteger) {
    this.namespaceInteger = namespaceInteger;
  }


  public XmlItem namespaceBoolean(@javax.annotation.Nullable Boolean namespaceBoolean) {
    this.namespaceBoolean = namespaceBoolean;
    return this;
  }

  /**
   * Get namespaceBoolean
   * @return namespaceBoolean
   */
  @javax.annotation.Nullable
  public Boolean getNamespaceBoolean() {
    return namespaceBoolean;
  }

  public void setNamespaceBoolean(@javax.annotation.Nullable Boolean namespaceBoolean) {
    this.namespaceBoolean = namespaceBoolean;
  }


  public XmlItem namespaceArray(@javax.annotation.Nullable List<Integer> namespaceArray) {
    this.namespaceArray = namespaceArray;
    return this;
  }

  public XmlItem addNamespaceArrayItem(Integer namespaceArrayItem) {
    if (this.namespaceArray == null) {
      this.namespaceArray = new ArrayList<>();
    }
    this.namespaceArray.add(namespaceArrayItem);
    return this;
  }

  /**
   * Get namespaceArray
   * @return namespaceArray
   */
  @javax.annotation.Nullable
  public List<Integer> getNamespaceArray() {
    return namespaceArray;
  }

  public void setNamespaceArray(@javax.annotation.Nullable List<Integer> namespaceArray) {
    this.namespaceArray = namespaceArray;
  }


  public XmlItem namespaceWrappedArray(@javax.annotation.Nullable List<Integer> namespaceWrappedArray) {
    this.namespaceWrappedArray = namespaceWrappedArray;
    return this;
  }

  public XmlItem addNamespaceWrappedArrayItem(Integer namespaceWrappedArrayItem) {
    if (this.namespaceWrappedArray == null) {
      this.namespaceWrappedArray = new ArrayList<>();
    }
    this.namespaceWrappedArray.add(namespaceWrappedArrayItem);
    return this;
  }

  /**
   * Get namespaceWrappedArray
   * @return namespaceWrappedArray
   */
  @javax.annotation.Nullable
  public List<Integer> getNamespaceWrappedArray() {
    return namespaceWrappedArray;
  }

  public void setNamespaceWrappedArray(@javax.annotation.Nullable List<Integer> namespaceWrappedArray) {
    this.namespaceWrappedArray = namespaceWrappedArray;
  }


  public XmlItem prefixNsString(@javax.annotation.Nullable String prefixNsString) {
    this.prefixNsString = prefixNsString;
    return this;
  }

  /**
   * Get prefixNsString
   * @return prefixNsString
   */
  @javax.annotation.Nullable
  public String getPrefixNsString() {
    return prefixNsString;
  }

  public void setPrefixNsString(@javax.annotation.Nullable String prefixNsString) {
    this.prefixNsString = prefixNsString;
  }


  public XmlItem prefixNsNumber(@javax.annotation.Nullable BigDecimal prefixNsNumber) {
    this.prefixNsNumber = prefixNsNumber;
    return this;
  }

  /**
   * Get prefixNsNumber
   * @return prefixNsNumber
   */
  @javax.annotation.Nullable
  public BigDecimal getPrefixNsNumber() {
    return prefixNsNumber;
  }

  public void setPrefixNsNumber(@javax.annotation.Nullable BigDecimal prefixNsNumber) {
    this.prefixNsNumber = prefixNsNumber;
  }


  public XmlItem prefixNsInteger(@javax.annotation.Nullable Integer prefixNsInteger) {
    this.prefixNsInteger = prefixNsInteger;
    return this;
  }

  /**
   * Get prefixNsInteger
   * @return prefixNsInteger
   */
  @javax.annotation.Nullable
  public Integer getPrefixNsInteger() {
    return prefixNsInteger;
  }

  public void setPrefixNsInteger(@javax.annotation.Nullable Integer prefixNsInteger) {
    this.prefixNsInteger = prefixNsInteger;
  }


  public XmlItem prefixNsBoolean(@javax.annotation.Nullable Boolean prefixNsBoolean) {
    this.prefixNsBoolean = prefixNsBoolean;
    return this;
  }

  /**
   * Get prefixNsBoolean
   * @return prefixNsBoolean
   */
  @javax.annotation.Nullable
  public Boolean getPrefixNsBoolean() {
    return prefixNsBoolean;
  }

  public void setPrefixNsBoolean(@javax.annotation.Nullable Boolean prefixNsBoolean) {
    this.prefixNsBoolean = prefixNsBoolean;
  }


  public XmlItem prefixNsArray(@javax.annotation.Nullable List<Integer> prefixNsArray) {
    this.prefixNsArray = prefixNsArray;
    return this;
  }

  public XmlItem addPrefixNsArrayItem(Integer prefixNsArrayItem) {
    if (this.prefixNsArray == null) {
      this.prefixNsArray = new ArrayList<>();
    }
    this.prefixNsArray.add(prefixNsArrayItem);
    return this;
  }

  /**
   * Get prefixNsArray
   * @return prefixNsArray
   */
  @javax.annotation.Nullable
  public List<Integer> getPrefixNsArray() {
    return prefixNsArray;
  }

  public void setPrefixNsArray(@javax.annotation.Nullable List<Integer> prefixNsArray) {
    this.prefixNsArray = prefixNsArray;
  }


  public XmlItem prefixNsWrappedArray(@javax.annotation.Nullable List<Integer> prefixNsWrappedArray) {
    this.prefixNsWrappedArray = prefixNsWrappedArray;
    return this;
  }

  public XmlItem addPrefixNsWrappedArrayItem(Integer prefixNsWrappedArrayItem) {
    if (this.prefixNsWrappedArray == null) {
      this.prefixNsWrappedArray = new ArrayList<>();
    }
    this.prefixNsWrappedArray.add(prefixNsWrappedArrayItem);
    return this;
  }

  /**
   * Get prefixNsWrappedArray
   * @return prefixNsWrappedArray
   */
  @javax.annotation.Nullable
  public List<Integer> getPrefixNsWrappedArray() {
    return prefixNsWrappedArray;
  }

  public void setPrefixNsWrappedArray(@javax.annotation.Nullable List<Integer> prefixNsWrappedArray) {
    this.prefixNsWrappedArray = prefixNsWrappedArray;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XmlItem xmlItem = (XmlItem) o;
    return Objects.equals(this.attributeString, xmlItem.attributeString) &&
        Objects.equals(this.attributeNumber, xmlItem.attributeNumber) &&
        Objects.equals(this.attributeInteger, xmlItem.attributeInteger) &&
        Objects.equals(this.attributeBoolean, xmlItem.attributeBoolean) &&
        Objects.equals(this.wrappedArray, xmlItem.wrappedArray) &&
        Objects.equals(this.nameString, xmlItem.nameString) &&
        Objects.equals(this.nameNumber, xmlItem.nameNumber) &&
        Objects.equals(this.nameInteger, xmlItem.nameInteger) &&
        Objects.equals(this.nameBoolean, xmlItem.nameBoolean) &&
        Objects.equals(this.nameArray, xmlItem.nameArray) &&
        Objects.equals(this.nameWrappedArray, xmlItem.nameWrappedArray) &&
        Objects.equals(this.prefixString, xmlItem.prefixString) &&
        Objects.equals(this.prefixNumber, xmlItem.prefixNumber) &&
        Objects.equals(this.prefixInteger, xmlItem.prefixInteger) &&
        Objects.equals(this.prefixBoolean, xmlItem.prefixBoolean) &&
        Objects.equals(this.prefixArray, xmlItem.prefixArray) &&
        Objects.equals(this.prefixWrappedArray, xmlItem.prefixWrappedArray) &&
        Objects.equals(this.namespaceString, xmlItem.namespaceString) &&
        Objects.equals(this.namespaceNumber, xmlItem.namespaceNumber) &&
        Objects.equals(this.namespaceInteger, xmlItem.namespaceInteger) &&
        Objects.equals(this.namespaceBoolean, xmlItem.namespaceBoolean) &&
        Objects.equals(this.namespaceArray, xmlItem.namespaceArray) &&
        Objects.equals(this.namespaceWrappedArray, xmlItem.namespaceWrappedArray) &&
        Objects.equals(this.prefixNsString, xmlItem.prefixNsString) &&
        Objects.equals(this.prefixNsNumber, xmlItem.prefixNsNumber) &&
        Objects.equals(this.prefixNsInteger, xmlItem.prefixNsInteger) &&
        Objects.equals(this.prefixNsBoolean, xmlItem.prefixNsBoolean) &&
        Objects.equals(this.prefixNsArray, xmlItem.prefixNsArray) &&
        Objects.equals(this.prefixNsWrappedArray, xmlItem.prefixNsWrappedArray);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeString, attributeNumber, attributeInteger, attributeBoolean, wrappedArray, nameString, nameNumber, nameInteger, nameBoolean, nameArray, nameWrappedArray, prefixString, prefixNumber, prefixInteger, prefixBoolean, prefixArray, prefixWrappedArray, namespaceString, namespaceNumber, namespaceInteger, namespaceBoolean, namespaceArray, namespaceWrappedArray, prefixNsString, prefixNsNumber, prefixNsInteger, prefixNsBoolean, prefixNsArray, prefixNsWrappedArray);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XmlItem {\n");
    sb.append("    attributeString: ").append(toIndentedString(attributeString)).append("\n");
    sb.append("    attributeNumber: ").append(toIndentedString(attributeNumber)).append("\n");
    sb.append("    attributeInteger: ").append(toIndentedString(attributeInteger)).append("\n");
    sb.append("    attributeBoolean: ").append(toIndentedString(attributeBoolean)).append("\n");
    sb.append("    wrappedArray: ").append(toIndentedString(wrappedArray)).append("\n");
    sb.append("    nameString: ").append(toIndentedString(nameString)).append("\n");
    sb.append("    nameNumber: ").append(toIndentedString(nameNumber)).append("\n");
    sb.append("    nameInteger: ").append(toIndentedString(nameInteger)).append("\n");
    sb.append("    nameBoolean: ").append(toIndentedString(nameBoolean)).append("\n");
    sb.append("    nameArray: ").append(toIndentedString(nameArray)).append("\n");
    sb.append("    nameWrappedArray: ").append(toIndentedString(nameWrappedArray)).append("\n");
    sb.append("    prefixString: ").append(toIndentedString(prefixString)).append("\n");
    sb.append("    prefixNumber: ").append(toIndentedString(prefixNumber)).append("\n");
    sb.append("    prefixInteger: ").append(toIndentedString(prefixInteger)).append("\n");
    sb.append("    prefixBoolean: ").append(toIndentedString(prefixBoolean)).append("\n");
    sb.append("    prefixArray: ").append(toIndentedString(prefixArray)).append("\n");
    sb.append("    prefixWrappedArray: ").append(toIndentedString(prefixWrappedArray)).append("\n");
    sb.append("    namespaceString: ").append(toIndentedString(namespaceString)).append("\n");
    sb.append("    namespaceNumber: ").append(toIndentedString(namespaceNumber)).append("\n");
    sb.append("    namespaceInteger: ").append(toIndentedString(namespaceInteger)).append("\n");
    sb.append("    namespaceBoolean: ").append(toIndentedString(namespaceBoolean)).append("\n");
    sb.append("    namespaceArray: ").append(toIndentedString(namespaceArray)).append("\n");
    sb.append("    namespaceWrappedArray: ").append(toIndentedString(namespaceWrappedArray)).append("\n");
    sb.append("    prefixNsString: ").append(toIndentedString(prefixNsString)).append("\n");
    sb.append("    prefixNsNumber: ").append(toIndentedString(prefixNsNumber)).append("\n");
    sb.append("    prefixNsInteger: ").append(toIndentedString(prefixNsInteger)).append("\n");
    sb.append("    prefixNsBoolean: ").append(toIndentedString(prefixNsBoolean)).append("\n");
    sb.append("    prefixNsArray: ").append(toIndentedString(prefixNsArray)).append("\n");
    sb.append("    prefixNsWrappedArray: ").append(toIndentedString(prefixNsWrappedArray)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("attribute_string");
    openapiFields.add("attribute_number");
    openapiFields.add("attribute_integer");
    openapiFields.add("attribute_boolean");
    openapiFields.add("wrapped_array");
    openapiFields.add("name_string");
    openapiFields.add("name_number");
    openapiFields.add("name_integer");
    openapiFields.add("name_boolean");
    openapiFields.add("name_array");
    openapiFields.add("name_wrapped_array");
    openapiFields.add("prefix_string");
    openapiFields.add("prefix_number");
    openapiFields.add("prefix_integer");
    openapiFields.add("prefix_boolean");
    openapiFields.add("prefix_array");
    openapiFields.add("prefix_wrapped_array");
    openapiFields.add("namespace_string");
    openapiFields.add("namespace_number");
    openapiFields.add("namespace_integer");
    openapiFields.add("namespace_boolean");
    openapiFields.add("namespace_array");
    openapiFields.add("namespace_wrapped_array");
    openapiFields.add("prefix_ns_string");
    openapiFields.add("prefix_ns_number");
    openapiFields.add("prefix_ns_integer");
    openapiFields.add("prefix_ns_boolean");
    openapiFields.add("prefix_ns_array");
    openapiFields.add("prefix_ns_wrapped_array");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to XmlItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!XmlItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in XmlItem is not found in the empty JSON string", XmlItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!XmlItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `XmlItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("attribute_string") != null && !jsonObj.get("attribute_string").isJsonNull()) && !jsonObj.get("attribute_string").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attribute_string` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attribute_string").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("wrapped_array") != null && !jsonObj.get("wrapped_array").isJsonNull() && !jsonObj.get("wrapped_array").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `wrapped_array` to be an array in the JSON string but got `%s`", jsonObj.get("wrapped_array").toString()));
      }
      if ((jsonObj.get("name_string") != null && !jsonObj.get("name_string").isJsonNull()) && !jsonObj.get("name_string").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name_string` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name_string").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("name_array") != null && !jsonObj.get("name_array").isJsonNull() && !jsonObj.get("name_array").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `name_array` to be an array in the JSON string but got `%s`", jsonObj.get("name_array").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("name_wrapped_array") != null && !jsonObj.get("name_wrapped_array").isJsonNull() && !jsonObj.get("name_wrapped_array").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `name_wrapped_array` to be an array in the JSON string but got `%s`", jsonObj.get("name_wrapped_array").toString()));
      }
      if ((jsonObj.get("prefix_string") != null && !jsonObj.get("prefix_string").isJsonNull()) && !jsonObj.get("prefix_string").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prefix_string` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prefix_string").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("prefix_array") != null && !jsonObj.get("prefix_array").isJsonNull() && !jsonObj.get("prefix_array").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `prefix_array` to be an array in the JSON string but got `%s`", jsonObj.get("prefix_array").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("prefix_wrapped_array") != null && !jsonObj.get("prefix_wrapped_array").isJsonNull() && !jsonObj.get("prefix_wrapped_array").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `prefix_wrapped_array` to be an array in the JSON string but got `%s`", jsonObj.get("prefix_wrapped_array").toString()));
      }
      if ((jsonObj.get("namespace_string") != null && !jsonObj.get("namespace_string").isJsonNull()) && !jsonObj.get("namespace_string").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace_string` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespace_string").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("namespace_array") != null && !jsonObj.get("namespace_array").isJsonNull() && !jsonObj.get("namespace_array").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace_array` to be an array in the JSON string but got `%s`", jsonObj.get("namespace_array").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("namespace_wrapped_array") != null && !jsonObj.get("namespace_wrapped_array").isJsonNull() && !jsonObj.get("namespace_wrapped_array").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace_wrapped_array` to be an array in the JSON string but got `%s`", jsonObj.get("namespace_wrapped_array").toString()));
      }
      if ((jsonObj.get("prefix_ns_string") != null && !jsonObj.get("prefix_ns_string").isJsonNull()) && !jsonObj.get("prefix_ns_string").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prefix_ns_string` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prefix_ns_string").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("prefix_ns_array") != null && !jsonObj.get("prefix_ns_array").isJsonNull() && !jsonObj.get("prefix_ns_array").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `prefix_ns_array` to be an array in the JSON string but got `%s`", jsonObj.get("prefix_ns_array").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("prefix_ns_wrapped_array") != null && !jsonObj.get("prefix_ns_wrapped_array").isJsonNull() && !jsonObj.get("prefix_ns_wrapped_array").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `prefix_ns_wrapped_array` to be an array in the JSON string but got `%s`", jsonObj.get("prefix_ns_wrapped_array").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!XmlItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'XmlItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<XmlItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(XmlItem.class));

       return (TypeAdapter<T>) new TypeAdapter<XmlItem>() {
           @Override
           public void write(JsonWriter out, XmlItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public XmlItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of XmlItem given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of XmlItem
   * @throws IOException if the JSON string is invalid with respect to XmlItem
   */
  public static XmlItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, XmlItem.class);
  }

  /**
   * Convert an instance of XmlItem to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

