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
import io.swagger.client.model.OfferMessage;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse200Message
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-10-06T11:54:26.074+02:00[Europe/Rome]")
public class InlineResponse200Message {
  @SerializedName("offer")
  private OfferMessage offer = null;

  @SerializedName("receiver")
  private String receiver = null;

  @SerializedName("date")
  private String date = null;

  @SerializedName("id")
  private Integer id = null;

  public InlineResponse200Message offer(OfferMessage offer) {
    this.offer = offer;
    return this;
  }

   /**
   * Get offer
   * @return offer
  **/
  @Schema(description = "")
  public OfferMessage getOffer() {
    return offer;
  }

  public void setOffer(OfferMessage offer) {
    this.offer = offer;
  }

  public InlineResponse200Message receiver(String receiver) {
    this.receiver = receiver;
    return this;
  }

   /**
   * Get receiver
   * @return receiver
  **/
  @Schema(description = "")
  public String getReceiver() {
    return receiver;
  }

  public void setReceiver(String receiver) {
    this.receiver = receiver;
  }

  public InlineResponse200Message date(String date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @Schema(description = "")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public InlineResponse200Message id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200Message inlineResponse200Message = (InlineResponse200Message) o;
    return Objects.equals(this.offer, inlineResponse200Message.offer) &&
        Objects.equals(this.receiver, inlineResponse200Message.receiver) &&
        Objects.equals(this.date, inlineResponse200Message.date) &&
        Objects.equals(this.id, inlineResponse200Message.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offer, receiver, date, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200Message {\n");
    
    sb.append("    offer: ").append(toIndentedString(offer)).append("\n");
    sb.append("    receiver: ").append(toIndentedString(receiver)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
