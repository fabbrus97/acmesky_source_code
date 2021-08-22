/*
 * compagniaAereaAPI
 * È l'API Restful offerta dalla compagnia aerea che permette di fruire alla capability di restituire le offerte attive e di riceve la quota del pagamento del cliente.
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
import io.swagger.client.model.LMflightFlight;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Lmflight
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-07-26T11:31:13.722+02:00[Europe/Rome]")
public class Lmflight {
  @SerializedName("flight")
  private LMflightFlight flight = null;

  @SerializedName("companyname")
  private String companyname = null;

  public Lmflight flight(LMflightFlight flight) {
    this.flight = flight;
    return this;
  }

   /**
   * Get flight
   * @return flight
  **/
  @Schema(description = "")
  public LMflightFlight getFlight() {
    return flight;
  }

  public void setFlight(LMflightFlight flight) {
    this.flight = flight;
  }

  public Lmflight companyname(String companyname) {
    this.companyname = companyname;
    return this;
  }

   /**
   * Get companyname
   * @return companyname
  **/
  @Schema(description = "")
  public String getCompanyname() {
    return companyname;
  }

  public void setCompanyname(String companyname) {
    this.companyname = companyname;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Lmflight lmflight = (Lmflight) o;
    return Objects.equals(this.flight, lmflight.flight) &&
        Objects.equals(this.companyname, lmflight.companyname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flight, companyname);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Lmflight {\n");
    
    sb.append("    flight: ").append(toIndentedString(flight)).append("\n");
    sb.append("    companyname: ").append(toIndentedString(companyname)).append("\n");
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
