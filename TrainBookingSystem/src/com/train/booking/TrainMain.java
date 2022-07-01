package com.train.booking;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class TrainMain {
    public static void main(String[] args) {

        System.out.println("Now Searching For Trains...");
        TrainService.searchTrainsBetweenStations("Hyderabad","Bangalore", LocalDate.now(),10);

        BankAccount b1=new BankAccount();
        b1.setActBalance(999);
        b1.setActNumber(10000);


        Passenger p1=new Passenger(10,"ravi",30,b1);
        Passenger p2=new Passenger(20,"Scott",32,b1);
        Passenger p3=new Passenger(10,"sumit",33,b1);

        List<Passenger> passengerList=new LinkedList<>();

        passengerList.add(p1);
        passengerList.add(p2);
        passengerList.add(p3);

        System.out.println("Now booking is complete for 3 passenger");
        TrainService.bookTickets(101,passengerList);

        System.out.println("Now printing the Ticket Details");
        TicketService.showTicketDetails(1);
    }
}
