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
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * AdditionalPropertiesClass
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0-SNAPSHOT")
public class AdditionalPropertiesClass {
  public static final String SERIALIZED_NAME_MAP_PROPERTY = "map_property";
  @SerializedName(SERIALIZED_NAME_MAP_PROPERTY)
  @javax.annotation.Nullable
  private Map<String, String> mapProperty;

  public static final String SERIALIZED_NAME_MAP_OF_MAP_PROPERTY = "map_of_map_property";
  @SerializedName(SERIALIZED_NAME_MAP_OF_MAP_PROPERTY)
  @javax.annotation.Nullable
  private Map<String, Map<String, String>> mapOfMapProperty;

  public static final String SERIALIZED_NAME_ANYTYPE1 = "anytype_1";
  @SerializedName(SERIALIZED_NAME_ANYTYPE1)
  @javax.annotation.Nullable
  private Object anytype1 = null;

  public static final String SERIALIZED_NAME_MAP_WITH_UNDECLARED_PROPERTIES_ANYTYPE1 = "map_with_undeclared_properties_anytype_1";
  @SerializedName(SERIALIZED_NAME_MAP_WITH_UNDECLARED_PROPERTIES_ANYTYPE1)
  @javax.annotation.Nullable
  private Object mapWithUndeclaredPropertiesAnytype1;

  public static final String SERIALIZED_NAME_MAP_WITH_UNDECLARED_PROPERTIES_ANYTYPE2 = "map_with_undeclared_properties_anytype_2";
  @SerializedName(SERIALIZED_NAME_MAP_WITH_UNDECLARED_PROPERTIES_ANYTYPE2)
  @javax.annotation.Nullable
  private Object mapWithUndeclaredPropertiesAnytype2;

  public static final String SERIALIZED_NAME_MAP_WITH_UNDECLARED_PROPERTIES_ANYTYPE3 = "map_with_undeclared_properties_anytype_3";
  @SerializedName(SERIALIZED_NAME_MAP_WITH_UNDECLARED_PROPERTIES_ANYTYPE3)
  @javax.annotation.Nullable
  private Map<String, Object> mapWithUndeclaredPropertiesAnytype3;

  public static final String SERIALIZED_NAME_EMPTY_MAP = "empty_map";
  @SerializedName(SERIALIZED_NAME_EMPTY_MAP)
  @javax.annotation.Nullable
  private Object emptyMap;

  public static final String SERIALIZED_NAME_MAP_WITH_UNDECLARED_PROPERTIES_STRING = "map_with_undeclared_properties_string";
  @SerializedName(SERIALIZED_NAME_MAP_WITH_UNDECLARED_PROPERTIES_STRING)
  @javax.annotation.Nullable
  private Map<String, String> mapWithUndeclaredPropertiesString;

  public AdditionalPropertiesClass() {
  }

  public AdditionalPropertiesClass mapProperty(@javax.annotation.Nullable Map<String, String> mapProperty) {
    this.mapProperty = mapProperty;
    return this;
  }

  public AdditionalPropertiesClass putMapPropertyItem(String key, String mapPropertyItem) {
    if (this.mapProperty == null) {
      this.mapProperty = new HashMap<>();
    }
    this.mapProperty.put(key, mapPropertyItem);
    return this;
  }

  /**
   * Get mapProperty
   * @return mapProperty
   */
  @javax.annotation.Nullable
  public Map<String, String> getMapProperty() {
    return mapProperty;
  }

  public void setMapProperty(@javax.annotation.Nullable Map<String, String> mapProperty) {
    this.mapProperty = mapProperty;
  }


  public AdditionalPropertiesClass mapOfMapProperty(@javax.annotation.Nullable Map<String, Map<String, String>> mapOfMapProperty) {
    this.mapOfMapProperty = mapOfMapProperty;
    return this;
  }

  public AdditionalPropertiesClass putMapOfMapPropertyItem(String key, Map<String, String> mapOfMapPropertyItem) {
    if (this.mapOfMapProperty == null) {
      this.mapOfMapProperty = new HashMap<>();
    }
    this.mapOfMapProperty.put(key, mapOfMapPropertyItem);
    return this;
  }

  /**
   * Get mapOfMapProperty
   * @return mapOfMapProperty
   */
  @javax.annotation.Nullable
  public Map<String, Map<String, String>> getMapOfMapProperty() {
    return mapOfMapProperty;
  }

  public void setMapOfMapProperty(@javax.annotation.Nullable Map<String, Map<String, String>> mapOfMapProperty) {
    this.mapOfMapProperty = mapOfMapProperty;
  }


  public AdditionalPropertiesClass anytype1(@javax.annotation.Nullable Object anytype1) {
    this.anytype1 = anytype1;
    return this;
  }

  /**
   * Get anytype1
   * @return anytype1
   */
  @javax.annotation.Nullable
  public Object getAnytype1() {
    return anytype1;
  }

  public void setAnytype1(@javax.annotation.Nullable Object anytype1) {
    this.anytype1 = anytype1;
  }


  public AdditionalPropertiesClass mapWithUndeclaredPropertiesAnytype1(@javax.annotation.Nullable Object mapWithUndeclaredPropertiesAnytype1) {
    this.mapWithUndeclaredPropertiesAnytype1 = mapWithUndeclaredPropertiesAnytype1;
    return this;
  }

  /**
   * Get mapWithUndeclaredPropertiesAnytype1
   * @return mapWithUndeclaredPropertiesAnytype1
   */
  @javax.annotation.Nullable
  public Object getMapWithUndeclaredPropertiesAnytype1() {
    return mapWithUndeclaredPropertiesAnytype1;
  }

  public void setMapWithUndeclaredPropertiesAnytype1(@javax.annotation.Nullable Object mapWithUndeclaredPropertiesAnytype1) {
    this.mapWithUndeclaredPropertiesAnytype1 = mapWithUndeclaredPropertiesAnytype1;
  }


  public AdditionalPropertiesClass mapWithUndeclaredPropertiesAnytype2(@javax.annotation.Nullable Object mapWithUndeclaredPropertiesAnytype2) {
    this.mapWithUndeclaredPropertiesAnytype2 = mapWithUndeclaredPropertiesAnytype2;
    return this;
  }

  /**
   * Get mapWithUndeclaredPropertiesAnytype2
   * @return mapWithUndeclaredPropertiesAnytype2
   */
  @javax.annotation.Nullable
  public Object getMapWithUndeclaredPropertiesAnytype2() {
    return mapWithUndeclaredPropertiesAnytype2;
  }

  public void setMapWithUndeclaredPropertiesAnytype2(@javax.annotation.Nullable Object mapWithUndeclaredPropertiesAnytype2) {
    this.mapWithUndeclaredPropertiesAnytype2 = mapWithUndeclaredPropertiesAnytype2;
  }


  public AdditionalPropertiesClass mapWithUndeclaredPropertiesAnytype3(@javax.annotation.Nullable Map<String, Object> mapWithUndeclaredPropertiesAnytype3) {
    this.mapWithUndeclaredPropertiesAnytype3 = mapWithUndeclaredPropertiesAnytype3;
    return this;
  }

  public AdditionalPropertiesClass putMapWithUndeclaredPropertiesAnytype3Item(String key, Object mapWithUndeclaredPropertiesAnytype3Item) {
    if (this.mapWithUndeclaredPropertiesAnytype3 == null) {
      this.mapWithUndeclaredPropertiesAnytype3 = new HashMap<>();
    }
    this.mapWithUndeclaredPropertiesAnytype3.put(key, mapWithUndeclaredPropertiesAnytype3Item);
    return this;
  }

  /**
   * Get mapWithUndeclaredPropertiesAnytype3
   * @return mapWithUndeclaredPropertiesAnytype3
   */
  @javax.annotation.Nullable
  public Map<String, Object> getMapWithUndeclaredPropertiesAnytype3() {
    return mapWithUndeclaredPropertiesAnytype3;
  }

  public void setMapWithUndeclaredPropertiesAnytype3(@javax.annotation.Nullable Map<String, Object> mapWithUndeclaredPropertiesAnytype3) {
    this.mapWithUndeclaredPropertiesAnytype3 = mapWithUndeclaredPropertiesAnytype3;
  }


  public AdditionalPropertiesClass emptyMap(@javax.annotation.Nullable Object emptyMap) {
    this.emptyMap = emptyMap;
    return this;
  }

  /**
   * an object with no declared properties and no undeclared properties, hence it&#39;s an empty map.
   * @return emptyMap
   */
  @javax.annotation.Nullable
  public Object getEmptyMap() {
    return emptyMap;
  }

  public void setEmptyMap(@javax.annotation.Nullable Object emptyMap) {
    this.emptyMap = emptyMap;
  }


  public AdditionalPropertiesClass mapWithUndeclaredPropertiesString(@javax.annotation.Nullable Map<String, String> mapWithUndeclaredPropertiesString) {
    this.mapWithUndeclaredPropertiesString = mapWithUndeclaredPropertiesString;
    return this;
  }

  public AdditionalPropertiesClass putMapWithUndeclaredPropertiesStringItem(String key, String mapWithUndeclaredPropertiesStringItem) {
    if (this.mapWithUndeclaredPropertiesString == null) {
      this.mapWithUndeclaredPropertiesString = new HashMap<>();
    }
    this.mapWithUndeclaredPropertiesString.put(key, mapWithUndeclaredPropertiesStringItem);
    return this;
  }

  /**
   * Get mapWithUndeclaredPropertiesString
   * @return mapWithUndeclaredPropertiesString
   */
  @javax.annotation.Nullable
  public Map<String, String> getMapWithUndeclaredPropertiesString() {
    return mapWithUndeclaredPropertiesString;
  }

  public void setMapWithUndeclaredPropertiesString(@javax.annotation.Nullable Map<String, String> mapWithUndeclaredPropertiesString) {
    this.mapWithUndeclaredPropertiesString = mapWithUndeclaredPropertiesString;
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
   *
   * @param key name of the property
   * @param value value of the property
   * @return the AdditionalPropertiesClass instance itself
   */
  public AdditionalPropertiesClass putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalPropertiesClass additionalPropertiesClass = (AdditionalPropertiesClass) o;
    return Objects.equals(this.mapProperty, additionalPropertiesClass.mapProperty) &&
        Objects.equals(this.mapOfMapProperty, additionalPropertiesClass.mapOfMapProperty) &&
        Objects.equals(this.anytype1, additionalPropertiesClass.anytype1) &&
        Objects.equals(this.mapWithUndeclaredPropertiesAnytype1, additionalPropertiesClass.mapWithUndeclaredPropertiesAnytype1) &&
        Objects.equals(this.mapWithUndeclaredPropertiesAnytype2, additionalPropertiesClass.mapWithUndeclaredPropertiesAnytype2) &&
        Objects.equals(this.mapWithUndeclaredPropertiesAnytype3, additionalPropertiesClass.mapWithUndeclaredPropertiesAnytype3) &&
        Objects.equals(this.emptyMap, additionalPropertiesClass.emptyMap) &&
        Objects.equals(this.mapWithUndeclaredPropertiesString, additionalPropertiesClass.mapWithUndeclaredPropertiesString)&&
        Objects.equals(this.additionalProperties, additionalPropertiesClass.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(mapProperty, mapOfMapProperty, anytype1, mapWithUndeclaredPropertiesAnytype1, mapWithUndeclaredPropertiesAnytype2, mapWithUndeclaredPropertiesAnytype3, emptyMap, mapWithUndeclaredPropertiesString, additionalProperties);
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
    sb.append("class AdditionalPropertiesClass {\n");
    sb.append("    mapProperty: ").append(toIndentedString(mapProperty)).append("\n");
    sb.append("    mapOfMapProperty: ").append(toIndentedString(mapOfMapProperty)).append("\n");
    sb.append("    anytype1: ").append(toIndentedString(anytype1)).append("\n");
    sb.append("    mapWithUndeclaredPropertiesAnytype1: ").append(toIndentedString(mapWithUndeclaredPropertiesAnytype1)).append("\n");
    sb.append("    mapWithUndeclaredPropertiesAnytype2: ").append(toIndentedString(mapWithUndeclaredPropertiesAnytype2)).append("\n");
    sb.append("    mapWithUndeclaredPropertiesAnytype3: ").append(toIndentedString(mapWithUndeclaredPropertiesAnytype3)).append("\n");
    sb.append("    emptyMap: ").append(toIndentedString(emptyMap)).append("\n");
    sb.append("    mapWithUndeclaredPropertiesString: ").append(toIndentedString(mapWithUndeclaredPropertiesString)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("map_property");
    openapiFields.add("map_of_map_property");
    openapiFields.add("anytype_1");
    openapiFields.add("map_with_undeclared_properties_anytype_1");
    openapiFields.add("map_with_undeclared_properties_anytype_2");
    openapiFields.add("map_with_undeclared_properties_anytype_3");
    openapiFields.add("empty_map");
    openapiFields.add("map_with_undeclared_properties_string");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AdditionalPropertiesClass
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AdditionalPropertiesClass.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AdditionalPropertiesClass is not found in the empty JSON string", AdditionalPropertiesClass.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdditionalPropertiesClass.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdditionalPropertiesClass' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdditionalPropertiesClass> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdditionalPropertiesClass.class));

       return (TypeAdapter<T>) new TypeAdapter<AdditionalPropertiesClass>() {
           @Override
           public void write(JsonWriter out, AdditionalPropertiesClass value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public AdditionalPropertiesClass read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AdditionalPropertiesClass instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AdditionalPropertiesClass given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AdditionalPropertiesClass
   * @throws IOException if the JSON string is invalid with respect to AdditionalPropertiesClass
   */
  public static AdditionalPropertiesClass fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdditionalPropertiesClass.class);
  }

  /**
   * Convert an instance of AdditionalPropertiesClass to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

