/**
 * @(#)Rental.java	0.0.1, 11-Jun-2019 
 * 
 * Universidad Politécnica Salesiana
 * Carrera de Computación
 * Cuenca - Ecuador	
 */
package ec.edu.ups.model;

import java.util.Date;

/**
 * @since 11-Jun-2019
 * @version 0.0.1
 * @author Sarmiento Bryan, Serpa Roberto, Zhizhpon Eduardo
 */
public class Rental {
    
    private int renId;
    private double renKilometrajeIni;
    private double renKilometrajeFin;
    private Date renDateIni;
    private Date renDateFin;
    private Customer renCustomer;
    private Vehicle renVehicle;
    private Reservation renReservation;

    public Rental() {
    }

    public Rental(int renId, double renKilometrajeIni, double renKilometrajeFin, 
            Date renDateIni, Date renDateFin, Customer renCustomer,Vehicle renVehicle,
            Reservation renReservation) {
        this.renId = renId;
        this.renKilometrajeIni = renKilometrajeIni;
        this.renKilometrajeFin = renKilometrajeFin;
        this.renDateIni = renDateIni;
        this.renDateFin = renDateFin;
        this.renCustomer = renCustomer;
        this.renVehicle = renVehicle;
        this.renReservation = renReservation;
    }

    public int getRenId() {
        return renId;
    }

    public void setRenId(int renId) {
        this.renId = renId;
    }

    public double getRenKilometrajeIni() {
        return renKilometrajeIni;
    }

    public void setRenKilometrajeIni(double renKilometrajeIni) {
        this.renKilometrajeIni = renKilometrajeIni;
    }

    public double getRenKilometrajeFin() {
        return renKilometrajeFin;
    }

    public void setRenKilometrajeFin(double renKilometrajeFin) {
        this.renKilometrajeFin = renKilometrajeFin;
    }

    public Date getRenDateIni() {
        return renDateIni;
    }

    public void setRenDateIni(Date renDateIni) {
        this.renDateIni = renDateIni;
    }

    public Date getRenDateFin() {
        return renDateFin;
    }

    public void setRenDateFin(Date renDateFin) {
        this.renDateFin = renDateFin;
    }

    public Customer getRenCustomer() {
        return renCustomer;
    }

    public void setRenCustomer(Customer renCustomer) {
        this.renCustomer = renCustomer;
    }
    
    public Vehicle getRenVehicle() {
        return renVehicle;
    }

    public void setRenVehicle(Vehicle renVehicle) {
        this.renVehicle = renVehicle;
    }

    public Reservation getRenReservation() {
        return renReservation;
    }

    public void setRenReservation(Reservation renReservation) {
        this.renReservation = renReservation;
    }

    @Override
    public String toString() {
        return "Rental{" + "renId=" + renId + ", renKilometrajeIni=" 
                + renKilometrajeIni + ", renKilometrajeFin=" + renKilometrajeFin 
                + ", renDateIni=" + renDateIni + ", renDateFin=" + renDateFin 
                + ", renVehicle=" + renVehicle.toString() + ", renReservation=" 
                + renReservation.toString() + '}';
    }
    
    
    
    
    
}
