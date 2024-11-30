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
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.openapitools.client.model.Animal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.openapitools.client.ApiClient;
/**
 * MixedPropertiesAndAdditionalPropertiesClass
 */
@JsonPropertyOrder({
  MixedPropertiesAndAdditionalPropertiesClass.JSON_PROPERTY_UUID,
  MixedPropertiesAndAdditionalPropertiesClass.JSON_PROPERTY_DATE_TIME,
  MixedPropertiesAndAdditionalPropertiesClass.JSON_PROPERTY_MAP
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0-SNAPSHOT")
public class MixedPropertiesAndAdditionalPropertiesClass {
  public static final String JSON_PROPERTY_UUID = "uuid";
  @javax.annotation.Nullable
  private UUID uuid;

  public static final String JSON_PROPERTY_DATE_TIME = "dateTime";
  @javax.annotation.Nullable
  private OffsetDateTime dateTime;

  public static final String JSON_PROPERTY_MAP = "map";
  @javax.annotation.Nullable
  private Map<String, Animal> map;

  public MixedPropertiesAndAdditionalPropertiesClass() { 
  }

  public MixedPropertiesAndAdditionalPropertiesClass uuid(@javax.annotation.Nullable UUID uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * Get uuid
   * @return uuid
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getUuid() {
    return uuid;
  }


  @JsonProperty(JSON_PROPERTY_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUuid(@javax.annotation.Nullable UUID uuid) {
    this.uuid = uuid;
  }


  public MixedPropertiesAndAdditionalPropertiesClass dateTime(@javax.annotation.Nullable OffsetDateTime dateTime) {
    this.dateTime = dateTime;
    return this;
  }

  /**
   * Get dateTime
   * @return dateTime
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getDateTime() {
    return dateTime;
  }


  @JsonProperty(JSON_PROPERTY_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateTime(@javax.annotation.Nullable OffsetDateTime dateTime) {
    this.dateTime = dateTime;
  }


  public MixedPropertiesAndAdditionalPropertiesClass map(@javax.annotation.Nullable Map<String, Animal> map) {
    this.map = map;
    return this;
  }

  public MixedPropertiesAndAdditionalPropertiesClass putMapItem(String key, Animal mapItem) {
    if (this.map == null) {
      this.map = new HashMap<>();
    }
    this.map.put(key, mapItem);
    return this;
  }

  /**
   * Get map
   * @return map
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Animal> getMap() {
    return map;
  }


  @JsonProperty(JSON_PROPERTY_MAP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMap(@javax.annotation.Nullable Map<String, Animal> map) {
    this.map = map;
  }


  /**
   * Return true if this MixedPropertiesAndAdditionalPropertiesClass object is equal to o.
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
    sb.append("class MixedPropertiesAndAdditionalPropertiesClass {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    map: ").append(toIndentedString(map)).append("\n");
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

    // add `uuid` to the URL query string
    if (getUuid() != null) {
      joiner.add(String.format("%suuid%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getUuid()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `dateTime` to the URL query string
    if (getDateTime() != null) {
      joiner.add(String.format("%sdateTime%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDateTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `map` to the URL query string
    if (getMap() != null) {
      for (String _key : getMap().keySet()) {
        if (getMap().get(_key) != null) {
          joiner.add(getMap().get(_key).toUrlQueryString(String.format("%smap%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

    public static class Builder {

    private MixedPropertiesAndAdditionalPropertiesClass instance;

    public Builder() {
      this(new MixedPropertiesAndAdditionalPropertiesClass());
    }

    protected Builder(MixedPropertiesAndAdditionalPropertiesClass instance) {
      this.instance = instance;
    }

    public MixedPropertiesAndAdditionalPropertiesClass.Builder uuid(UUID uuid) {
      this.instance.uuid = uuid;
      return this;
    }
    public MixedPropertiesAndAdditionalPropertiesClass.Builder dateTime(OffsetDateTime dateTime) {
      this.instance.dateTime = dateTime;
      return this;
    }
    public MixedPropertiesAndAdditionalPropertiesClass.Builder map(Map<String, Animal> map) {
      this.instance.map = map;
      return this;
    }


    /**
    * returns a built MixedPropertiesAndAdditionalPropertiesClass instance.
    *
    * The builder is not reusable.
    */
    public MixedPropertiesAndAdditionalPropertiesClass build() {
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
  public static MixedPropertiesAndAdditionalPropertiesClass.Builder builder() {
    return new MixedPropertiesAndAdditionalPropertiesClass.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public MixedPropertiesAndAdditionalPropertiesClass.Builder toBuilder() {
    return new MixedPropertiesAndAdditionalPropertiesClass.Builder()
      .uuid(getUuid())
      .dateTime(getDateTime())
      .map(getMap());
  }

}

