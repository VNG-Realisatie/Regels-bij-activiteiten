/*
 * Plan SW - Toepasbare regel SW
 * Nog in te voorzien
 *
 * The version of the OpenAPI document: 0.0.1
 * Contact: robert.melskens@vng.nl
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * &lt;body&gt;&lt;p&gt;Een inhoudelijke toelichting op de toepassing van het informatie-element.&lt;/p&gt;&lt;/body&gt;
 */
@ApiModel(description = "<body><p>Een inhoudelijke toelichting op de toepassing van het informatie-element.</p></body>")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-10T09:19:26.366Z[Etc/UTC]")
public class Kop {
  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_NUMMER = "nummer";
  @SerializedName(SERIALIZED_NAME_NUMMER)
  private String nummer;

  public static final String SERIALIZED_NAME_OPSCHRIFT = "opschrift";
  @SerializedName(SERIALIZED_NAME_OPSCHRIFT)
  private String opschrift;


  public Kop label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    this.label = label;
  }


  public Kop nummer(String nummer) {
    
    this.nummer = nummer;
    return this;
  }

   /**
   * Get nummer
   * @return nummer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNummer() {
    return nummer;
  }


  public void setNummer(String nummer) {
    this.nummer = nummer;
  }


  public Kop opschrift(String opschrift) {
    
    this.opschrift = opschrift;
    return this;
  }

   /**
   * Get opschrift
   * @return opschrift
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOpschrift() {
    return opschrift;
  }


  public void setOpschrift(String opschrift) {
    this.opschrift = opschrift;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Kop kop = (Kop) o;
    return Objects.equals(this.label, kop.label) &&
        Objects.equals(this.nummer, kop.nummer) &&
        Objects.equals(this.opschrift, kop.opschrift);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, nummer, opschrift);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Kop {\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    nummer: ").append(toIndentedString(nummer)).append("\n");
    sb.append("    opschrift: ").append(toIndentedString(opschrift)).append("\n");
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
