package vo;

import java.util.ArrayList;

public class Temper {
    private String city;
    private double temperatureA;
    private double temperatureB;
    private double temperatureC;
    private double temperatureD;
    private double temperatureE;
    private double temperatureF;
    private double temperatureG;
    private double temperatureH;
    private double temperatureI;
    private double temperatureJ;
    private double temperatureK;
    private double temperatureL;




    public String getCity() {
        return city;
    }
    public void setCity(String name) {
        this.city = name;
    }

    public double getTemperatureA() {
        return temperatureA;
    }

    public void setTemperatureA(double temperatureA) {
        this.temperatureA = temperatureA;
    }

    public double getTemperatureB() {
        return temperatureB;
    }

    public void setTemperatureB(double temperatureB) {
        this.temperatureB = temperatureB;
    }

    public double getTemperatureC() {
        return temperatureC;
    }

    public void setTemperatureC(double temperatureC) {
        this.temperatureC = temperatureC;
    }

    public double getTemperatureD() {
        return temperatureD;
    }

    public void setTemperatureD(double temperatureD) {
        this.temperatureD = temperatureD;
    }

    public double getTemperatureE() {
        return temperatureE;
    }

    public void setTemperatureE(double temperatureE) {
        this.temperatureE = temperatureE;
    }

    public double getTemperatureF() {
        return temperatureF;
    }

    public void setTemperatureF(double temperatureF) {
        this.temperatureF = temperatureF;
    }

    public double getTemperatureG() {
        return temperatureG;
    }

    public void setTemperatureG(double temperatureG) {
        this.temperatureG = temperatureG;
    }

    public double getTemperatureH() {
        return temperatureH;
    }

    public void setTemperatureH(double temperatureH) {
        this.temperatureH = temperatureH;
    }

    public double getTemperatureI() {
        return temperatureI;
    }

    public void setTemperatureI(double temperatureI) {
        this.temperatureI = temperatureI;
    }

    public double getTemperatureJ() {
        return temperatureJ;
    }

    public void setTemperatureJ(double temperatureJ) {
        this.temperatureJ = temperatureJ;
    }

    public double getTemperatureK() {
        return temperatureK;
    }

    public void setTemperatureK(double temperatureK) {
        this.temperatureK = temperatureK;
    }

    public double getTemperatureL() {
        return temperatureL;
    }

    public void setTemperatureL(double temperatureL) {
        this.temperatureL = temperatureL;
    }

    @Override
    public String toString() {
        ArrayList<Double> list= new ArrayList<Double>();
        list.add(temperatureA);
        list.add(temperatureB);
        list.add(temperatureC);
        list.add(temperatureD);
        list.add(temperatureE);
        list.add(temperatureF);
        list.add(temperatureG);
        list.add(temperatureH);
        list.add(temperatureI);
        list.add(temperatureJ);
        list.add(temperatureK);
        list.add(temperatureL);
        System.out.println(list.toString());
        return "{" +
                " name : '" + city + '\'' +
                ", data : " +list.toString()+
                "}";
    }

}
