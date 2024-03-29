package org.example.exercicio12tratamentoexcecoes.exemplos.model.entities;

import org.example.exercicio12tratamentoexcecoes.exemplos.model.exception.DomainExeption;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

    private static SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
    private Integer roomNumber;
    private Date checkin;
    private Date checkout;

    public Reservation() {
    }

    public Reservation(Integer roomNumber, Date checkin, Date checkout) {
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckin() {
        return checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public long duration(){
        long diff = checkout.getTime() - checkin.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public String updateDatesExemplo2(Date checkin, Date checkout){
        Date now = new Date();
        if (checkin.before(now) || checkout.before(now)){
            return  "Error in reservation: Reservation dates for update must be future dates";
        }

        if (!checkout.after(checkin)){
            return  "Error in reservation: Check-out date must be after check-in date";
        }
        this.checkin = checkin;
        this.checkout = checkout;

        return null;
    }

    public void updateDates(Date checkin, Date checkout) throws DomainExeption {
        Date now = new Date();
        if (checkin.before(now) || checkout.before(now)){
            throw new DomainExeption("Error in reservation: Reservation dates for update must be future dates");
        }

        if (!checkout.after(checkin)){
            throw new DomainExeption("Error in reservation: Check-out date must be after check-in date");
        }
        this.checkin = checkin;
        this.checkout = checkout;

    }

    @Override
    public String toString() {
        return "Room " +
                roomNumber +
                ", check-in: " +
                formatoData.format(checkin) +
                ", check-out: " +
                formatoData.format(checkout) +
                ", duration: " +
                duration() +
                " nights";
    }
}
