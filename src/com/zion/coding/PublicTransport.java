package com.zion.coding;

public class PublicTransport {
    int ticketcost =10;
}
class Bus extends PublicTransport{
    int ticketcost =15;
}
class Train extends Bus{
    int ticketcost=5;
}
class Tester{
    public static void main(String[] args) {
        PublicTransport bus = new Bus();
        PublicTransport train = new Train();
        System.out.print("Bus Fare: "+bus.ticketcost);
        System.out.print("\n Train Fare: "+train.ticketcost);
    }
}
