package com.local;



public class Ninjas {
    private String name;
    private String rango;
    private String village;



    public Ninjas() {
    }

    public Ninjas(String name, String rango, String village) {
        this.name = name;
        this.rango = rango;
        this.village = village;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRango() {
        return this.rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public String getVillage() {
        return this.village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public Ninjas name(String name) {
        setName(name);
        return this;
    }

    public Ninjas rango(String rango) {
        setRango(rango);
        return this;
    }

    public Ninjas village(String village) {
        setVillage(village);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", rango='" + getRango() + "'" +
            ", village='" + getVillage() + "'" +
            "}";
    }
    public void viewNinjas(){
        System.out.println("This is the registration information of a ninja: " + name + ", ");
    }


    
}
