package AdvancedCoding;

public class Car {
    private String typeOfCar;
    private String [] carBrand = new String[2];
    private int carBrandCount;
    public Car (String typeOfCar) {
        this.typeOfCar=typeOfCar;
    }
    public void addCar(String nameOfCar) {
        carBrand[carBrandCount]=nameOfCar;
        carBrandCount++;
    }
    public int getCarBrandCount() {
        return carBrandCount;
    }

    public String[] getCarBrand() {
        return carBrand;
    }
    public String getTypeOfCar() {
        return typeOfCar;
    }

}
