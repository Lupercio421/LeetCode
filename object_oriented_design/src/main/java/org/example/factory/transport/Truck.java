package org.example.factory.transport;

public class Truck implements Transport{
    /**
     *
     */
    @Override
    public String deliver() {
        return "Delivering by land in a box";
    }
}
