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

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.openapitools.client.ApiClient;
/**
 * NullableClass
 */
@JsonPropertyOrder({
  NullableClass.JSON_PROPERTY_INTEGER_PROP,
  NullableClass.JSON_PROPERTY_NUMBER_PROP,
  NullableClass.JSON_PROPERTY_BOOLEAN_PROP,
  NullableClass.JSON_PROPERTY_STRING_PROP,
  NullableClass.JSON_PROPERTY_DATE_PROP,
  NullableClass.JSON_PROPERTY_DATETIME_PROP,
  NullableClass.JSON_PROPERTY_ARRAY_NULLABLE_PROP,
  NullableClass.JSON_PROPERTY_ARRAY_AND_ITEMS_NULLABLE_PROP,
  NullableClass.JSON_PROPERTY_ARRAY_ITEMS_NULLABLE,
  NullableClass.JSON_PROPERTY_OBJECT_NULLABLE_PROP,
  NullableClass.JSON_PROPERTY_OBJECT_AND_ITEMS_NULLABLE_PROP,
  NullableClass.JSON_PROPERTY_OBJECT_ITEMS_NULLABLE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0-SNAPSHOT")
public class NullableClass extends HashMap<String, Object> {
  public static final String JSON_PROPERTY_INTEGER_PROP = "integer_prop";
  private JsonNullable<Integer> integerProp = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_NUMBER_PROP = "number_prop";
  private JsonNullable<BigDecimal> numberProp = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_BOOLEAN_PROP = "boolean_prop";
  private JsonNullable<Boolean> booleanProp = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_STRING_PROP = "string_prop";
  private JsonNullable<String> stringProp = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DATE_PROP = "date_prop";
  private JsonNullable<LocalDate> dateProp = JsonNullable.<LocalDate>undefined();

  public static final String JSON_PROPERTY_DATETIME_PROP = "datetime_prop";
  private JsonNullable<OffsetDateTime> datetimeProp = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_ARRAY_NULLABLE_PROP = "array_nullable_prop";
  private JsonNullable<List<Object>> arrayNullableProp = JsonNullable.<List<Object>>undefined();

  public static final String JSON_PROPERTY_ARRAY_AND_ITEMS_NULLABLE_PROP = "array_and_items_nullable_prop";
  private JsonNullable<List<Object>> arrayAndItemsNullableProp = JsonNullable.<List<Object>>undefined();

  public static final String JSON_PROPERTY_ARRAY_ITEMS_NULLABLE = "array_items_nullable";
  @javax.annotation.Nullable
  private List<Object> arrayItemsNullable;

  public static final String JSON_PROPERTY_OBJECT_NULLABLE_PROP = "object_nullable_prop";
  private JsonNullable<Map<String, Object>> objectNullableProp = JsonNullable.<Map<String, Object>>undefined();

  public static final String JSON_PROPERTY_OBJECT_AND_ITEMS_NULLABLE_PROP = "object_and_items_nullable_prop";
  private JsonNullable<Map<String, Object>> objectAndItemsNullableProp = JsonNullable.<Map<String, Object>>undefined();

  public static final String JSON_PROPERTY_OBJECT_ITEMS_NULLABLE = "object_items_nullable";
  @javax.annotation.Nullable
  private Map<String, Object> objectItemsNullable;

  public NullableClass() { 
  }

  public NullableClass integerProp(@javax.annotation.Nullable Integer integerProp) {
    this.integerProp = JsonNullable.<Integer>of(integerProp);
    return this;
  }

  /**
   * Get integerProp
   * @return integerProp
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public Integer getIntegerProp() {
        return integerProp.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INTEGER_PROP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getIntegerProp_JsonNullable() {
    return integerProp;
  }
  
  @JsonProperty(JSON_PROPERTY_INTEGER_PROP)
  public void setIntegerProp_JsonNullable(JsonNullable<Integer> integerProp) {
    this.integerProp = integerProp;
  }

  public void setIntegerProp(@javax.annotation.Nullable Integer integerProp) {
    this.integerProp = JsonNullable.<Integer>of(integerProp);
  }


  public NullableClass numberProp(@javax.annotation.Nullable BigDecimal numberProp) {
    this.numberProp = JsonNullable.<BigDecimal>of(numberProp);
    return this;
  }

  /**
   * Get numberProp
   * @return numberProp
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public BigDecimal getNumberProp() {
        return numberProp.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NUMBER_PROP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getNumberProp_JsonNullable() {
    return numberProp;
  }
  
  @JsonProperty(JSON_PROPERTY_NUMBER_PROP)
  public void setNumberProp_JsonNullable(JsonNullable<BigDecimal> numberProp) {
    this.numberProp = numberProp;
  }

  public void setNumberProp(@javax.annotation.Nullable BigDecimal numberProp) {
    this.numberProp = JsonNullable.<BigDecimal>of(numberProp);
  }


  public NullableClass booleanProp(@javax.annotation.Nullable Boolean booleanProp) {
    this.booleanProp = JsonNullable.<Boolean>of(booleanProp);
    return this;
  }

  /**
   * Get booleanProp
   * @return booleanProp
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public Boolean getBooleanProp() {
        return booleanProp.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BOOLEAN_PROP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getBooleanProp_JsonNullable() {
    return booleanProp;
  }
  
  @JsonProperty(JSON_PROPERTY_BOOLEAN_PROP)
  public void setBooleanProp_JsonNullable(JsonNullable<Boolean> booleanProp) {
    this.booleanProp = booleanProp;
  }

  public void setBooleanProp(@javax.annotation.Nullable Boolean booleanProp) {
    this.booleanProp = JsonNullable.<Boolean>of(booleanProp);
  }


  public NullableClass stringProp(@javax.annotation.Nullable String stringProp) {
    this.stringProp = JsonNullable.<String>of(stringProp);
    return this;
  }

  /**
   * Get stringProp
   * @return stringProp
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getStringProp() {
        return stringProp.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STRING_PROP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getStringProp_JsonNullable() {
    return stringProp;
  }
  
  @JsonProperty(JSON_PROPERTY_STRING_PROP)
  public void setStringProp_JsonNullable(JsonNullable<String> stringProp) {
    this.stringProp = stringProp;
  }

  public void setStringProp(@javax.annotation.Nullable String stringProp) {
    this.stringProp = JsonNullable.<String>of(stringProp);
  }


  public NullableClass dateProp(@javax.annotation.Nullable LocalDate dateProp) {
    this.dateProp = JsonNullable.<LocalDate>of(dateProp);
    return this;
  }

  /**
   * Get dateProp
   * @return dateProp
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public LocalDate getDateProp() {
        return dateProp.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DATE_PROP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<LocalDate> getDateProp_JsonNullable() {
    return dateProp;
  }
  
  @JsonProperty(JSON_PROPERTY_DATE_PROP)
  public void setDateProp_JsonNullable(JsonNullable<LocalDate> dateProp) {
    this.dateProp = dateProp;
  }

  public void setDateProp(@javax.annotation.Nullable LocalDate dateProp) {
    this.dateProp = JsonNullable.<LocalDate>of(dateProp);
  }


  public NullableClass datetimeProp(@javax.annotation.Nullable OffsetDateTime datetimeProp) {
    this.datetimeProp = JsonNullable.<OffsetDateTime>of(datetimeProp);
    return this;
  }

  /**
   * Get datetimeProp
   * @return datetimeProp
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getDatetimeProp() {
        return datetimeProp.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DATETIME_PROP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getDatetimeProp_JsonNullable() {
    return datetimeProp;
  }
  
  @JsonProperty(JSON_PROPERTY_DATETIME_PROP)
  public void setDatetimeProp_JsonNullable(JsonNullable<OffsetDateTime> datetimeProp) {
    this.datetimeProp = datetimeProp;
  }

  public void setDatetimeProp(@javax.annotation.Nullable OffsetDateTime datetimeProp) {
    this.datetimeProp = JsonNullable.<OffsetDateTime>of(datetimeProp);
  }


  public NullableClass arrayNullableProp(@javax.annotation.Nullable List<Object> arrayNullableProp) {
    this.arrayNullableProp = JsonNullable.<List<Object>>of(arrayNullableProp);
    return this;
  }

  public NullableClass addArrayNullablePropItem(Object arrayNullablePropItem) {
    if (this.arrayNullableProp == null || !this.arrayNullableProp.isPresent()) {
      this.arrayNullableProp = JsonNullable.<List<Object>>of(new ArrayList<>());
    }
    try {
      this.arrayNullableProp.get().add(arrayNullablePropItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Get arrayNullableProp
   * @return arrayNullableProp
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public List<Object> getArrayNullableProp() {
        return arrayNullableProp.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ARRAY_NULLABLE_PROP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<Object>> getArrayNullableProp_JsonNullable() {
    return arrayNullableProp;
  }
  
  @JsonProperty(JSON_PROPERTY_ARRAY_NULLABLE_PROP)
  public void setArrayNullableProp_JsonNullable(JsonNullable<List<Object>> arrayNullableProp) {
    this.arrayNullableProp = arrayNullableProp;
  }

  public void setArrayNullableProp(@javax.annotation.Nullable List<Object> arrayNullableProp) {
    this.arrayNullableProp = JsonNullable.<List<Object>>of(arrayNullableProp);
  }


  public NullableClass arrayAndItemsNullableProp(@javax.annotation.Nullable List<Object> arrayAndItemsNullableProp) {
    this.arrayAndItemsNullableProp = JsonNullable.<List<Object>>of(arrayAndItemsNullableProp);
    return this;
  }

  public NullableClass addArrayAndItemsNullablePropItem(Object arrayAndItemsNullablePropItem) {
    if (this.arrayAndItemsNullableProp == null || !this.arrayAndItemsNullableProp.isPresent()) {
      this.arrayAndItemsNullableProp = JsonNullable.<List<Object>>of(new ArrayList<>());
    }
    try {
      this.arrayAndItemsNullableProp.get().add(arrayAndItemsNullablePropItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Get arrayAndItemsNullableProp
   * @return arrayAndItemsNullableProp
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public List<Object> getArrayAndItemsNullableProp() {
        return arrayAndItemsNullableProp.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ARRAY_AND_ITEMS_NULLABLE_PROP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<Object>> getArrayAndItemsNullableProp_JsonNullable() {
    return arrayAndItemsNullableProp;
  }
  
  @JsonProperty(JSON_PROPERTY_ARRAY_AND_ITEMS_NULLABLE_PROP)
  public void setArrayAndItemsNullableProp_JsonNullable(JsonNullable<List<Object>> arrayAndItemsNullableProp) {
    this.arrayAndItemsNullableProp = arrayAndItemsNullableProp;
  }

  public void setArrayAndItemsNullableProp(@javax.annotation.Nullable List<Object> arrayAndItemsNullableProp) {
    this.arrayAndItemsNullableProp = JsonNullable.<List<Object>>of(arrayAndItemsNullableProp);
  }


  public NullableClass arrayItemsNullable(@javax.annotation.Nullable List<Object> arrayItemsNullable) {
    this.arrayItemsNullable = arrayItemsNullable;
    return this;
  }

  public NullableClass addArrayItemsNullableItem(Object arrayItemsNullableItem) {
    if (this.arrayItemsNullable == null) {
      this.arrayItemsNullable = new ArrayList<>();
    }
    this.arrayItemsNullable.add(arrayItemsNullableItem);
    return this;
  }

  /**
   * Get arrayItemsNullable
   * @return arrayItemsNullable
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ARRAY_ITEMS_NULLABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Object> getArrayItemsNullable() {
    return arrayItemsNullable;
  }


  @JsonProperty(JSON_PROPERTY_ARRAY_ITEMS_NULLABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArrayItemsNullable(@javax.annotation.Nullable List<Object> arrayItemsNullable) {
    this.arrayItemsNullable = arrayItemsNullable;
  }


  public NullableClass objectNullableProp(@javax.annotation.Nullable Map<String, Object> objectNullableProp) {
    this.objectNullableProp = JsonNullable.<Map<String, Object>>of(objectNullableProp);
    return this;
  }

  public NullableClass putObjectNullablePropItem(String key, Object objectNullablePropItem) {
    if (this.objectNullableProp == null || !this.objectNullableProp.isPresent()) {
      this.objectNullableProp = JsonNullable.<Map<String, Object>>of(new HashMap<>());
    }
    try {
      this.objectNullableProp.get().put(key, objectNullablePropItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Get objectNullableProp
   * @return objectNullableProp
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public Map<String, Object> getObjectNullableProp() {
        return objectNullableProp.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OBJECT_NULLABLE_PROP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Map<String, Object>> getObjectNullableProp_JsonNullable() {
    return objectNullableProp;
  }
  
  @JsonProperty(JSON_PROPERTY_OBJECT_NULLABLE_PROP)
  public void setObjectNullableProp_JsonNullable(JsonNullable<Map<String, Object>> objectNullableProp) {
    this.objectNullableProp = objectNullableProp;
  }

  public void setObjectNullableProp(@javax.annotation.Nullable Map<String, Object> objectNullableProp) {
    this.objectNullableProp = JsonNullable.<Map<String, Object>>of(objectNullableProp);
  }


  public NullableClass objectAndItemsNullableProp(@javax.annotation.Nullable Map<String, Object> objectAndItemsNullableProp) {
    this.objectAndItemsNullableProp = JsonNullable.<Map<String, Object>>of(objectAndItemsNullableProp);
    return this;
  }

  public NullableClass putObjectAndItemsNullablePropItem(String key, Object objectAndItemsNullablePropItem) {
    if (this.objectAndItemsNullableProp == null || !this.objectAndItemsNullableProp.isPresent()) {
      this.objectAndItemsNullableProp = JsonNullable.<Map<String, Object>>of(new HashMap<>());
    }
    try {
      this.objectAndItemsNullableProp.get().put(key, objectAndItemsNullablePropItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Get objectAndItemsNullableProp
   * @return objectAndItemsNullableProp
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public Map<String, Object> getObjectAndItemsNullableProp() {
        return objectAndItemsNullableProp.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OBJECT_AND_ITEMS_NULLABLE_PROP)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Map<String, Object>> getObjectAndItemsNullableProp_JsonNullable() {
    return objectAndItemsNullableProp;
  }
  
  @JsonProperty(JSON_PROPERTY_OBJECT_AND_ITEMS_NULLABLE_PROP)
  public void setObjectAndItemsNullableProp_JsonNullable(JsonNullable<Map<String, Object>> objectAndItemsNullableProp) {
    this.objectAndItemsNullableProp = objectAndItemsNullableProp;
  }

  public void setObjectAndItemsNullableProp(@javax.annotation.Nullable Map<String, Object> objectAndItemsNullableProp) {
    this.objectAndItemsNullableProp = JsonNullable.<Map<String, Object>>of(objectAndItemsNullableProp);
  }


  public NullableClass objectItemsNullable(@javax.annotation.Nullable Map<String, Object> objectItemsNullable) {
    this.objectItemsNullable = objectItemsNullable;
    return this;
  }

  public NullableClass putObjectItemsNullableItem(String key, Object objectItemsNullableItem) {
    if (this.objectItemsNullable == null) {
      this.objectItemsNullable = new HashMap<>();
    }
    this.objectItemsNullable.put(key, objectItemsNullableItem);
    return this;
  }

  /**
   * Get objectItemsNullable
   * @return objectItemsNullable
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OBJECT_ITEMS_NULLABLE)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getObjectItemsNullable() {
    return objectItemsNullable;
  }


  @JsonProperty(JSON_PROPERTY_OBJECT_ITEMS_NULLABLE)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
  public void setObjectItemsNullable(@javax.annotation.Nullable Map<String, Object> objectItemsNullable) {
    this.objectItemsNullable = objectItemsNullable;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   * @param key the name of the property
   * @param value the value of the property
   * @return self reference
   */
  @JsonAnySetter
  public NullableClass putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) properties.
   * @return the additional (undeclared) properties
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   * @param key the name of the property
   * @return the additional (undeclared) property with the specified name
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }

  /**
   * Return true if this NullableClass object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    return EqualsBuilder.reflectionEquals(this, o, false, null, true);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NullableClass {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    integerProp: ").append(toIndentedString(integerProp)).append("\n");
    sb.append("    numberProp: ").append(toIndentedString(numberProp)).append("\n");
    sb.append("    booleanProp: ").append(toIndentedString(booleanProp)).append("\n");
    sb.append("    stringProp: ").append(toIndentedString(stringProp)).append("\n");
    sb.append("    dateProp: ").append(toIndentedString(dateProp)).append("\n");
    sb.append("    datetimeProp: ").append(toIndentedString(datetimeProp)).append("\n");
    sb.append("    arrayNullableProp: ").append(toIndentedString(arrayNullableProp)).append("\n");
    sb.append("    arrayAndItemsNullableProp: ").append(toIndentedString(arrayAndItemsNullableProp)).append("\n");
    sb.append("    arrayItemsNullable: ").append(toIndentedString(arrayItemsNullable)).append("\n");
    sb.append("    objectNullableProp: ").append(toIndentedString(objectNullableProp)).append("\n");
    sb.append("    objectAndItemsNullableProp: ").append(toIndentedString(objectAndItemsNullableProp)).append("\n");
    sb.append("    objectItemsNullable: ").append(toIndentedString(objectItemsNullable)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `integer_prop` to the URL query string
    if (getIntegerProp() != null) {
      joiner.add(String.format("%sinteger_prop%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getIntegerProp()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `number_prop` to the URL query string
    if (getNumberProp() != null) {
      joiner.add(String.format("%snumber_prop%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getNumberProp()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `boolean_prop` to the URL query string
    if (getBooleanProp() != null) {
      joiner.add(String.format("%sboolean_prop%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getBooleanProp()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `string_prop` to the URL query string
    if (getStringProp() != null) {
      joiner.add(String.format("%sstring_prop%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getStringProp()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `date_prop` to the URL query string
    if (getDateProp() != null) {
      joiner.add(String.format("%sdate_prop%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDateProp()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `datetime_prop` to the URL query string
    if (getDatetimeProp() != null) {
      joiner.add(String.format("%sdatetime_prop%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDatetimeProp()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `array_nullable_prop` to the URL query string
    if (getArrayNullableProp() != null) {
      for (int i = 0; i < getArrayNullableProp().size(); i++) {
        joiner.add(String.format("%sarray_nullable_prop%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(ApiClient.valueToString(getArrayNullableProp().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `array_and_items_nullable_prop` to the URL query string
    if (getArrayAndItemsNullableProp() != null) {
      for (int i = 0; i < getArrayAndItemsNullableProp().size(); i++) {
        joiner.add(String.format("%sarray_and_items_nullable_prop%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(ApiClient.valueToString(getArrayAndItemsNullableProp().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `array_items_nullable` to the URL query string
    if (getArrayItemsNullable() != null) {
      for (int i = 0; i < getArrayItemsNullable().size(); i++) {
        joiner.add(String.format("%sarray_items_nullable%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(ApiClient.valueToString(getArrayItemsNullable().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `object_nullable_prop` to the URL query string
    if (getObjectNullableProp() != null) {
      for (String _key : getObjectNullableProp().keySet()) {
        joiner.add(String.format("%sobject_nullable_prop%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
            getObjectNullableProp().get(_key), URLEncoder.encode(ApiClient.valueToString(getObjectNullableProp().get(_key)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `object_and_items_nullable_prop` to the URL query string
    if (getObjectAndItemsNullableProp() != null) {
      for (String _key : getObjectAndItemsNullableProp().keySet()) {
        joiner.add(String.format("%sobject_and_items_nullable_prop%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
            getObjectAndItemsNullableProp().get(_key), URLEncoder.encode(ApiClient.valueToString(getObjectAndItemsNullableProp().get(_key)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `object_items_nullable` to the URL query string
    if (getObjectItemsNullable() != null) {
      for (String _key : getObjectItemsNullable().keySet()) {
        joiner.add(String.format("%sobject_items_nullable%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
            getObjectItemsNullable().get(_key), URLEncoder.encode(ApiClient.valueToString(getObjectItemsNullable().get(_key)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    return joiner.toString();
  }

    public static class Builder {

    private NullableClass instance;

    public Builder() {
      this(new NullableClass());
    }

    protected Builder(NullableClass instance) {
      this.instance = instance;
    }

    public NullableClass.Builder integerProp(Integer integerProp) {
      this.instance.integerProp = JsonNullable.<Integer>of(integerProp);
      return this;
    }
    public NullableClass.Builder integerProp(JsonNullable<Integer> integerProp) {
      this.instance.integerProp = integerProp;
      return this;
    }
    public NullableClass.Builder numberProp(BigDecimal numberProp) {
      this.instance.numberProp = JsonNullable.<BigDecimal>of(numberProp);
      return this;
    }
    public NullableClass.Builder numberProp(JsonNullable<BigDecimal> numberProp) {
      this.instance.numberProp = numberProp;
      return this;
    }
    public NullableClass.Builder booleanProp(Boolean booleanProp) {
      this.instance.booleanProp = JsonNullable.<Boolean>of(booleanProp);
      return this;
    }
    public NullableClass.Builder booleanProp(JsonNullable<Boolean> booleanProp) {
      this.instance.booleanProp = booleanProp;
      return this;
    }
    public NullableClass.Builder stringProp(String stringProp) {
      this.instance.stringProp = JsonNullable.<String>of(stringProp);
      return this;
    }
    public NullableClass.Builder stringProp(JsonNullable<String> stringProp) {
      this.instance.stringProp = stringProp;
      return this;
    }
    public NullableClass.Builder dateProp(LocalDate dateProp) {
      this.instance.dateProp = JsonNullable.<LocalDate>of(dateProp);
      return this;
    }
    public NullableClass.Builder dateProp(JsonNullable<LocalDate> dateProp) {
      this.instance.dateProp = dateProp;
      return this;
    }
    public NullableClass.Builder datetimeProp(OffsetDateTime datetimeProp) {
      this.instance.datetimeProp = JsonNullable.<OffsetDateTime>of(datetimeProp);
      return this;
    }
    public NullableClass.Builder datetimeProp(JsonNullable<OffsetDateTime> datetimeProp) {
      this.instance.datetimeProp = datetimeProp;
      return this;
    }
    public NullableClass.Builder arrayNullableProp(List<Object> arrayNullableProp) {
      this.instance.arrayNullableProp = JsonNullable.<List<Object>>of(arrayNullableProp);
      return this;
    }
    public NullableClass.Builder arrayNullableProp(JsonNullable<List<Object>> arrayNullableProp) {
      this.instance.arrayNullableProp = arrayNullableProp;
      return this;
    }
    public NullableClass.Builder arrayAndItemsNullableProp(List<Object> arrayAndItemsNullableProp) {
      this.instance.arrayAndItemsNullableProp = JsonNullable.<List<Object>>of(arrayAndItemsNullableProp);
      return this;
    }
    public NullableClass.Builder arrayAndItemsNullableProp(JsonNullable<List<Object>> arrayAndItemsNullableProp) {
      this.instance.arrayAndItemsNullableProp = arrayAndItemsNullableProp;
      return this;
    }
    public NullableClass.Builder arrayItemsNullable(List<Object> arrayItemsNullable) {
      this.instance.arrayItemsNullable = arrayItemsNullable;
      return this;
    }
    public NullableClass.Builder objectNullableProp(Map<String, Object> objectNullableProp) {
      this.instance.objectNullableProp = JsonNullable.<Map<String, Object>>of(objectNullableProp);
      return this;
    }
    public NullableClass.Builder objectNullableProp(JsonNullable<Map<String, Object>> objectNullableProp) {
      this.instance.objectNullableProp = objectNullableProp;
      return this;
    }
    public NullableClass.Builder objectAndItemsNullableProp(Map<String, Object> objectAndItemsNullableProp) {
      this.instance.objectAndItemsNullableProp = JsonNullable.<Map<String, Object>>of(objectAndItemsNullableProp);
      return this;
    }
    public NullableClass.Builder objectAndItemsNullableProp(JsonNullable<Map<String, Object>> objectAndItemsNullableProp) {
      this.instance.objectAndItemsNullableProp = objectAndItemsNullableProp;
      return this;
    }
    public NullableClass.Builder objectItemsNullable(Map<String, Object> objectItemsNullable) {
      this.instance.objectItemsNullable = objectItemsNullable;
      return this;
    }


    /**
    * returns a built NullableClass instance.
    *
    * The builder is not reusable.
    */
    public NullableClass build() {
      try {
        return this.instance;
      } finally {
        // ensure that this.instance is not reused
        this.instance = null;
      }
    }

    @Override
    public String toString() {
      return getClass() + "=(" + instance + ")";
    }
  }

  /**
  * Create a builder with no initialized field.
  */
  public static NullableClass.Builder builder() {
    return new NullableClass.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public NullableClass.Builder toBuilder() {
    return new NullableClass.Builder()
      .integerProp(getIntegerProp())
      .numberProp(getNumberProp())
      .booleanProp(getBooleanProp())
      .stringProp(getStringProp())
      .dateProp(getDateProp())
      .datetimeProp(getDatetimeProp())
      .arrayNullableProp(getArrayNullableProp())
      .arrayAndItemsNullableProp(getArrayAndItemsNullableProp())
      .arrayItemsNullable(getArrayItemsNullable())
      .objectNullableProp(getObjectNullableProp())
      .objectAndItemsNullableProp(getObjectAndItemsNullableProp())
      .objectItemsNullable(getObjectItemsNullable());
  }

}

