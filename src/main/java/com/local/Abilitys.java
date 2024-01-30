
package com.local;

import java.util.ArrayList;
import java.util.List;

public class Abilitys {
    private String name;
    private String description;

    // Constructor por defecto
    public Abilitys() {
    }

    // Constructor con parámetros
    public Abilitys(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // Métodos getters y setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Método para mostrar información de la habilidad
    public void displayInfo() {
        System.out.println("Ability Name: " + getName());
        System.out.println("Description: " + getDescription());
    }

    // Método para guardar la habilidad en una lista (simulando almacenamiento)
    public static void saveAbility(Abilitys ability, List<Abilitys> abilitiesList) {
        abilitiesList.add(ability);
        System.out.println("Ability saved successfully.");
    }

    // Método para eliminar una habilidad de la lista
    public static void deleteAbility(String name, List<Abilitys> abilitiesList) {
        for (int i = 0; i < abilitiesList.size(); i++) {
            if (abilitiesList.get(i).getName().equals(name)) {
                abilitiesList.remove(i);
                System.out.println("Ability deleted successfully.");
                return;
            }
        }
        System.out.println("Ability not found.");
    }

    // Método para mostrar todas las habilidades en la lista
    public static void displayAllAbilities(List<Abilitys> abilitiesList) {
        if (abilitiesList.isEmpty()) {
            System.out.println("No abilities to display.");
            return;
        }
        System.out.println("List of Abilities:");
        for (Abilitys ability : abilitiesList) {
            ability.displayInfo();
        }
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", description='" + getDescription() + "'" +
                "}";
    }
}

