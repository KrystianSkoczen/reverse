package com.kodilla;

import java.util.ArrayList;
import java.util.Collections;

public class Reverse {
    public static void main(String[] args) throws java.lang.Exception {
        ArrayList<String> cars = new ArrayList<String>();
        ArrayList<String> reversedCars = new ArrayList<String>();

        cars.add("Peugeot");
        cars.add("Citroen");
        cars.add("DS");
        cars.add("Renault");
        cars.add("Alpine");

        for (int i = cars.size() - 1; i >= 0; i--) {
            reversedCars.add(cars.get(i));
        }
        for (String a: reversedCars) {
            System.out.println(a);
        }
    }
}