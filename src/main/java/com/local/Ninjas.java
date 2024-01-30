package com.local;

import java.util.ArrayList;
import java.util.List;

public class Ninjas implements InterfazNinjas {
    private String name;
    private String rango;
    private String village;
    private List<Abilitys> abilities;

    public Ninjas() {
        this.abilities = new ArrayList<>();
    }

    public Ninjas(String name, String rango, String village) {
        this.name = name;
        this.rango = rango;
        this.village = village;
        this.abilities = new ArrayList<>();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getRango() {
        return this.rango;
    }

    @Override
    public void setRango(String rango) {
        this.rango = rango;
    }

    @Override
    public String getVillage() {
        return this.village;
    }

    @Override
    public void setVillage(String village) {
        this.village = village;
    }

    // Implementación del nuevo método para obtener habilidades
    @Override
    public List<Abilitys> getAbilities() {
        return this.abilities;
    }

    public void addAbility(Abilitys ability) {
        abilities.add(ability);
        ability.setName(name); // Establecer la relación inversa
    }

    public void displayNinjaWithAbilities() {
        System.out.println("Ninja Information:");
        System.out.println("Name: " + getName());
        System.out.println("Rank: " + getRango());
        System.out.println("Village: " + getVillage());
        System.out.println("Abilities:");
        for (Abilitys ability : abilities) {
            System.out.println("- " + ability.getName() + ": " + ability.getDescription());
        }
    }
}
