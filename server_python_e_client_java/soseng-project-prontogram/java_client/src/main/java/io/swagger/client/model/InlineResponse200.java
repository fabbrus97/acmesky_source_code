/*
 * prontogramAPI
 * È l'API Restful offerta dall'applicazione di messaggistica *Prontogram* che vi racchiude la capability di inoltrare i messaggi circa le offerte inviate da ACMESky ai clienti interessati.
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.InlineResponse200Data;
import io.swagger.client.model.InlineResponse200Links;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * InlineResponse200
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-04-30T10:20:00.422+02:00[Europe/Rome]")
public class InlineResponse200 {
  @SerializedName("links")
  private InlineResponse200Links links = null;

  @SerializedName("data")
  private List<InlineResponse200Data> data = null;

  public InlineResponse200 links(InlineResponse200Links links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @Schema(description = "")
  public InlineResponse200Links getLinks() {
    return links;
  }

  public void setLinks(InlineResponse200Links links) {
    this.links = links;
  }

  public InlineResponse200 data(List<InlineResponse200Data> data) {
    this.data = data;
    return this;
  }

  public InlineResponse200 addDataItem(InlineResponse200Data dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<InlineResponse200Data>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Schema(description = "")
  public List<InlineResponse200Data> getData() {
    return data;
  }

  public void setData(List<InlineResponse200Data> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.links, inlineResponse200.links) &&
        Objects.equals(this.data, inlineResponse200.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}