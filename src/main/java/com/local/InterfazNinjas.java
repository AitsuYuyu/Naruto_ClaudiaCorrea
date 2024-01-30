package com.local;

import java.util.List;

public interface InterfazNinjas {
    String getName();
    void setName(String name);
    String getRango();
    void setRango(String rango);
    String getVillage();
    void setVillage(String village);
    List<Abilitys> getAbilities(); // Nuevo método para obtener habilidades
}
