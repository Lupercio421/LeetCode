package org.example.factory.transport;

public class Ship implements Transport{
    @Override
    public String deliver(){
        return "Deliver by Sea in a container";
    }
}
