package org.poc.pruebas.mapper;

public class BeanHouse {

    private int numberDoors;
    private int numberWindows;

    public BeanHouse(){

    }

    public BeanHouse(int numberDoors, int numberWindows) {
        this.numberDoors = numberDoors;
        this.numberWindows = numberWindows;
    }

    public int getNumberDoors() {
        return numberDoors;
    }

    public void setNumberDoors(int numberDoors) {
        this.numberDoors = numberDoors;
    }

    public int getNumberWindows() {
        return numberWindows;
    }

    public void setNumberWindows(int numberWindows) {
        this.numberWindows = numberWindows;
    }

    @Override
    public String toString() {
        return "BeanHouse{" +
                "numberDoors=" + numberDoors +
                ", numberWindows=" + numberWindows +
                '}';
    }
}
