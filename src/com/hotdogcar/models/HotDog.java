package com.hotdogcar.models;

public class HotDog {
    private int idHotDog;
    private String baseOne;
    private String baseTwo;

    public HotDog(){

    }

    public HotDog(int idHotDog, String baseOne, String baseTwo) {
        this.idHotDog = idHotDog;
        this.baseOne = baseOne;
        this.baseTwo = baseTwo;
    }

    public int getIdHotDog() {
        return idHotDog;
    }

    public void setIdHotDog(int idHotDog) {
        this.idHotDog = idHotDog;
    }

    public String getBaseOne() {
        return baseOne;
    }

    public void setBaseOne(String baseOne) {
        this.baseOne = baseOne;
    }

    public String getBaseTwo() {
        return baseTwo;
    }

    public void setBaseTwo(String baseTwo) {
        this.baseTwo = baseTwo;
    }

    @Override
    public String toString() {
        return "HotDog{" +
                "idHotDog=" + idHotDog +
                ", baseOne='" + baseOne + '\'' +
                ", baseTwo='" + baseTwo + '\'' +
                '}';
    }
}
