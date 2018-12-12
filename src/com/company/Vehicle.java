package com.company;

public interface Vehicle {
    enum VehicleType{
        Car,Bike;
        public String toString(){
            return this.name ();
        }
    }
    String type();
}
