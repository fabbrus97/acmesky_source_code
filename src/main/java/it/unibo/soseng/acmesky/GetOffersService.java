package it.unibo.soseng.acmesky;



import airlinetest.ApiClient;
import airlinetest.Configuration;
import airlinetest.test.RisorseApi;
import com.google.gson.Gson;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.*;



import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Date;

public class GetOffersService {

    public GetOffersService(){

    }

    public static void service(String airline){

        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath(airline);

        if (StaticValues.airline_token == ""){
            RisorseApi apiInstance = new RisorseApi();
            MapsV1Credentials body = new MapsV1Credentials(); // MapsV1Credentials |

            body.setUsername(StaticValues.airline_username);
            body.setPassword(StaticValues.airline_password);

            try {
                InlineResponse2001 result = apiInstance.postRegistration(body);
                System.out.println(result);
                StaticValues.airline_token = result.getToken();
            } catch (airlinetest.ApiException e) {
                System.err.println("Exception when calling RisorseApi#postRegistration");
                e.printStackTrace();
            }
        }

        RisorseApi apiInstance = new RisorseApi();
        try {
            InlineResponse200 result = apiInstance.getFlights();
            Offers offers = new Offers();
            System.out.println(result);
            ArrayList <InlineResponse200Flights> flights = (ArrayList<InlineResponse200Flights>) result.getFlights();
            ArrayList<Flight> voli = new ArrayList<Flight>();
            if(flights != null){
                offers.setCompanyName(result.getCompanyname());
                for (InlineResponse200Flights flight : flights) {
                    Flight f = new Flight();
                    f.setDepartureFrom(flight.getDepartureFrom());
                    f.setDestination(flight.getDestination());
                    f.setDepartureFrom(flight.getDepartureFrom());
                    f.setTakeoff(flight.getTakeoff());
                    InlineResponse200Price price = flight.getPrice();
                    f.setPrice(price.getCurrency(), price.getAmount().intValue());
                    voli.add(f);
                }
            }else{
                System.out.println("vecchio è stra vuota");
            }
            offers.setFlights(voli);
            saveJSON(offers);
        } catch (airlinetest.ApiException e) {
            System.err.println("Exception when calling RisorseApi#getFlights");
            e.printStackTrace();
        }
    }

    public static void saveJSON(Offers offers){

        Gson j = new Gson();

        try {
            Writer writer;
            writer = new FileWriter(new File(StaticValues.offers_file_path));
            JsonWriter jsonWriter = new JsonWriter(writer);

            j.toJson(offers, Offers.class, jsonWriter);

            jsonWriter.flush();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    //aggiungere funzione che apre il file e restituisce le offers dal json

}

class Offers{

    String companyName;
    ArrayList<Flight> flights = new ArrayList<Flight>();

    public Offers() {
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }

    public void setFlights(ArrayList<Flight> flights) {
        this.flights = flights;
    }
}
class Flight{

    String departureFrom;
    String destination;
    String offerCode;
    Price price;
    String takeoff;

    public Flight() {
    }

    public String getDepartureFrom() {
        return departureFrom;
    }

    public void setDepartureFrom(String departureFrom) {
        this.departureFrom = departureFrom;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getOfferCode() {
        return offerCode;
    }

    public void setOfferCode(String offerCode) {
        this.offerCode = offerCode;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(String currency, int amount) {
        Price price = new Price();
        price.setAmount(amount);
        price.setCurrency(currency);

        this.price = price;
    }

    public String getTakeoff() {
        return takeoff;
    }

    public void setTakeoff(String takeoff) {
        this.takeoff = takeoff;
    }
}
class Price{
    int amount;
    String currency;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
