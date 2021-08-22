/*
 * fornitoreDistanzeAPI
 * È l'API RESTful offerta dal *Fornitore delle distanze geografiche* che, come suggerisce il nome, vi racchiude la capability di calcolare la distanza tra due posizioni geografiche.
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
import io.swagger.client.model.InlineResponse200Distance;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * InlineResponse200
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-07-17T09:58:09.511692+02:00[Europe/Rome]")
public class InlineResponse200 {
  @SerializedName("distance")
  private List<InlineResponse200Distance> distance = new ArrayList<InlineResponse200Distance>();

  public InlineResponse200 distance(List<InlineResponse200Distance> distance) {
    this.distance = distance;
    return this;
  }

  public InlineResponse200 addDistanceItem(InlineResponse200Distance distanceItem) {
    this.distance.add(distanceItem);
    return this;
  }

   /**
   * Get distance
   * @return distance
  **/
  @Schema(required = true, description = "")
  public List<InlineResponse200Distance> getDistance() {
    return distance;
  }

  public void setDistance(List<InlineResponse200Distance> distance) {
    this.distance = distance;
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
    return Objects.equals(this.distance, inlineResponse200.distance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distance);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
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
