package interfaces.solucaoProblema.model.service;

import interfaces.solucaoProblema.model.entities.CarRental;
import interfaces.solucaoProblema.model.entities.Invoice;

import java.time.Duration;

public class RentalService {

    private Double pricePerHour;
    private Double pricePerDay;

    private BrazilTaxService taxService;

    public RentalService(Double pricePerDay, Double pricePerHour, BrazilTaxService taxService) {
        this.taxService = taxService;
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
    }

    public void processInvoice(CarRental carRental){

       double minutes =  Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
       double hours = minutes / 60.0;

       double basicPayment;
       if (hours <= 12.0){
           basicPayment = pricePerHour * Math.ceil(hours);
       } else {
           basicPayment = pricePerDay * Math.ceil(hours / 24.0);
       }

       double tax = taxService.tax(basicPayment);


       carRental.setInvoice(new Invoice(basicPayment,tax));
    }

}
