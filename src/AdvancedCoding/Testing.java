package AdvancedCoding;

import javax.sound.midi.Soundbank;

public class Testing {
    public static void main(String[] args) {
        Tiers tire = new Tiers("Low tires");
        tire.addTyreBrand("Toyo+M/L");
        tire.addTyreBrand("Nordman RS2");

        tire.getBrandCount();
        System.out.println(tire.getBrandCount());
        System.out.println(tire.getTyreType());
        System.out.println(tire.getTyreBrand());
        for (int i = 0; i < tire.getBrandCount(); i++) {
            System.out.println((i + 1 + " ") + " " + tire.getTyreBrand()[i]);
        }
        Car cars = new Car("sedan");
        cars.addCar("BMW");
        cars.addCar("TOYOTA");
        cars.getCarBrandCount();
        System.out.println(cars.getCarBrandCount());
        System.out.println(cars.getTypeOfCar());
        for (int i = 0; i < cars.getCarBrandCount(); i++) {
            System.out.println((i + 1 + " ") + cars.getCarBrand()[i]);
        }
        for (int i = 0; i < cars.getCarBrandCount(); i++) {
            int j = 0;
            while (j < tire.getBrandCount()) {
                System.out.println(cars.getCarBrand()[i] + " " + tire.getTyreBrand()[j]);
                j++;
            }
        }
    }
}