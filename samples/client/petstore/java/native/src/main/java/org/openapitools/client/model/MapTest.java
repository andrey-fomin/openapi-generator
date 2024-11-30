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
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.openapitools.client.ApiClient;
/**
 * MapTest
 */
@JsonPropertyOrder({
  MapTest.JSON_PROPERTY_MAP_MAP_OF_STRING,
  MapTest.JSON_PROPERTY_MAP_OF_ENUM_STRING,
  MapTest.JSON_PROPERTY_DIRECT_MAP,
  MapTest.JSON_PROPERTY_INDIRECT_MAP
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0-SNAPSHOT")
public class MapTest {
  public static final String JSON_PROPERTY_MAP_MAP_OF_STRING = "map_map_of_string";
  @javax.annotation.Nullable
  private Map<String, Map<String, String>> mapMapOfString;

  /**
   * Gets or Sets inner
   */
  public enum InnerEnum {
    UPPER(String.valueOf("UPPER")),
    
    LOWER(String.valueOf("lower"));

    private String value;

    InnerEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static InnerEnum fromValue(String value) {
      for (InnerEnum b : InnerEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_MAP_OF_ENUM_STRING = "map_of_enum_string";
  @javax.annotation.Nullable
  private Map<String, InnerEnum> mapOfEnumString;

  public static final String JSON_PROPERTY_DIRECT_MAP = "direct_map";
  @javax.annotation.Nullable
  private Map<String, Boolean> directMap;

  public static final String JSON_PROPERTY_INDIRECT_MAP = "indirect_map";
  @javax.annotation.Nullable
  private Map<String, Boolean> indirectMap;

  public MapTest() { 
  }

  public MapTest mapMapOfString(@javax.annotation.Nullable Map<String, Map<String, String>> mapMapOfString) {
    this.mapMapOfString = mapMapOfString;
    return this;
  }

  public MapTest putMapMapOfStringItem(String key, Map<String, String> mapMapOfStringItem) {
    if (this.mapMapOfString == null) {
      this.mapMapOfString = new HashMap<>();
    }
    this.mapMapOfString.put(key, mapMapOfStringItem);
    return this;
  }

  /**
   * Get mapMapOfString
   * @return mapMapOfString
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAP_MAP_OF_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Map<String, String>> getMapMapOfString() {
    return mapMapOfString;
  }


  @JsonProperty(JSON_PROPERTY_MAP_MAP_OF_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMapMapOfString(@javax.annotation.Nullable Map<String, Map<String, String>> mapMapOfString) {
    this.mapMapOfString = mapMapOfString;
  }


  public MapTest mapOfEnumString(@javax.annotation.Nullable Map<String, InnerEnum> mapOfEnumString) {
    this.mapOfEnumString = mapOfEnumString;
    return this;
  }

  public MapTest putMapOfEnumStringItem(String key, InnerEnum mapOfEnumStringItem) {
    if (this.mapOfEnumString == null) {
      this.mapOfEnumString = new HashMap<>();
    }
    this.mapOfEnumString.put(key, mapOfEnumStringItem);
    return this;
  }

  /**
   * Get mapOfEnumString
   * @return mapOfEnumString
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAP_OF_ENUM_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, InnerEnum> getMapOfEnumString() {
    return mapOfEnumString;
  }


  @JsonProperty(JSON_PROPERTY_MAP_OF_ENUM_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMapOfEnumString(@javax.annotation.Nullable Map<String, InnerEnum> mapOfEnumString) {
    this.mapOfEnumString = mapOfEnumString;
  }


  public MapTest directMap(@javax.annotation.Nullable Map<String, Boolean> directMap) {
    this.directMap = directMap;
    return this;
  }

  public MapTest putDirectMapItem(String key, Boolean directMapItem) {
    if (this.directMap == null) {
      this.directMap = new HashMap<>();
    }
    this.directMap.put(key, directMapItem);
    return this;
  }

  /**
   * Get directMap
   * @return directMap
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DIRECT_MAP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Boolean> getDirectMap() {
    return directMap;
  }


  @JsonProperty(JSON_PROPERTY_DIRECT_MAP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDirectMap(@javax.annotation.Nullable Map<String, Boolean> directMap) {
    this.directMap = directMap;
  }


  public MapTest indirectMap(@javax.annotation.Nullable Map<String, Boolean> indirectMap) {
    this.indirectMap = indirectMap;
    return this;
  }

  public MapTest putIndirectMapItem(String key, Boolean indirectMapItem) {
    if (this.indirectMap == null) {
      this.indirectMap = new HashMap<>();
    }
    this.indirectMap.put(key, indirectMapItem);
    return this;
  }

  /**
   * Get indirectMap
   * @return indirectMap
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INDIRECT_MAP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Boolean> getIndirectMap() {
    return indirectMap;
  }


  @JsonProperty(JSON_PROPERTY_INDIRECT_MAP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIndirectMap(@javax.annotation.Nullable Map<String, Boolean> indirectMap) {
    this.indirectMap = indirectMap;
  }


  /**
   * Return true if this MapTest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    return EqualsBuilder.reflectionEquals(this, o, false, null, true);
  }

  @Override
  public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapTest {\n");
    sb.append("    mapMapOfString: ").append(toIndentedString(mapMapOfString)).append("\n");
    sb.append("    mapOfEnumString: ").append(toIndentedString(mapOfEnumString)).append("\n");
    sb.append("    directMap: ").append(toIndentedString(directMap)).append("\n");
    sb.append("    indirectMap: ").append(toIndentedString(indirectMap)).append("\n");
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

    // add `map_map_of_string` to the URL query string
    if (getMapMapOfString() != null) {
      for (String _key : getMapMapOfString().keySet()) {
        joiner.add(String.format("%smap_map_of_string%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
            getMapMapOfString().get(_key), URLEncoder.encode(ApiClient.valueToString(getMapMapOfString().get(_key)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `map_of_enum_string` to the URL query string
    if (getMapOfEnumString() != null) {
      for (String _key : getMapOfEnumString().keySet()) {
        joiner.add(String.format("%smap_of_enum_string%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
            getMapOfEnumString().get(_key), URLEncoder.encode(ApiClient.valueToString(getMapOfEnumString().get(_key)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `direct_map` to the URL query string
    if (getDirectMap() != null) {
      for (String _key : getDirectMap().keySet()) {
        joiner.add(String.format("%sdirect_map%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
            getDirectMap().get(_key), URLEncoder.encode(ApiClient.valueToString(getDirectMap().get(_key)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `indirect_map` to the URL query string
    if (getIndirectMap() != null) {
      for (String _key : getIndirectMap().keySet()) {
        joiner.add(String.format("%sindirect_map%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
            getIndirectMap().get(_key), URLEncoder.encode(ApiClient.valueToString(getIndirectMap().get(_key)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    return joiner.toString();
  }

    public static class Builder {

    private MapTest instance;

    public Builder() {
      this(new MapTest());
    }

    protected Builder(MapTest instance) {
      this.instance = instance;
    }

    public MapTest.Builder mapMapOfString(Map<String, Map<String, String>> mapMapOfString) {
      this.instance.mapMapOfString = mapMapOfString;
      return this;
    }
    public MapTest.Builder mapOfEnumString(Map<String, InnerEnum> mapOfEnumString) {
      this.instance.mapOfEnumString = mapOfEnumString;
      return this;
    }
    public MapTest.Builder directMap(Map<String, Boolean> directMap) {
      this.instance.directMap = directMap;
      return this;
    }
    public MapTest.Builder indirectMap(Map<String, Boolean> indirectMap) {
      this.instance.indirectMap = indirectMap;
      return this;
    }


    /**
    * returns a built MapTest instance.
    *
    * The builder is not reusable.
    */
    public MapTest build() {
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
  public static MapTest.Builder builder() {
    return new MapTest.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public MapTest.Builder toBuilder() {
    return new MapTest.Builder()
      .mapMapOfString(getMapMapOfString())
      .mapOfEnumString(getMapOfEnumString())
      .directMap(getDirectMap())
      .indirectMap(getIndirectMap());
  }

}

