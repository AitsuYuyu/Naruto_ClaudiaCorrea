package com.local;

import java.util.ArrayList;
import java.util.List;

public class Missions {
    private String description;
    private String rango;
    private String reward;

    public Missions() {
    }

    public Missions(String description, String rango, String reward) {
        this.description = description;
        this.rango = rango;
        this.reward = reward;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRango() {
        return this.rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public String getReward() {
        return this.reward;
    }

    public void setReward(String reward) {
        this.reward = reward;
    }

    @Override
    public String toString() {
        return "{" +
            " description='" + getDescription() + "'" +
            ", rango='" + getRango() + "'" +
            ", reward='" + getReward() + "'" +
            "}";
    }

    // CRUD Operations

    // Create
    public static void createMission(String description, String rango, String reward, List<Missions> missionsList) {
        missionsList.add(new Missions(description, rango, reward));
        System.out.println("Mission created successfully.");
    }

    // Read
    public static void displayAllMissions(List<Missions> missionsList) {
        if (missionsList.isEmpty()) {
            System.out.println("No missions to display.");
            return;
        }
        System.out.println("List of Missions:");
        for (Missions mission : missionsList) {
            System.out.println(mission.toString());
        }
    }

    // Update
    public static void updateMission(String description, String newDescription, String newRango, String newReward, List<Missions> missionsList) {
        for (Missions mission : missionsList) {
            if (mission.getDescription().equalsIgnoreCase(description)) {
                mission.setDescription(newDescription);
                mission.setRango(newRango);
                mission.setReward(newReward);
                System.out.println("Mission updated successfully.");
                return;
            }
        }
        System.out.println("Mission not found.");
    }

    // Delete
    public static void deleteMission(String description, List<Missions> missionsList) {
        for (int i = 0; i < missionsList.size(); i++) {
            if (missionsList.get(i).getDescription().equalsIgnoreCase(description)) {
                missionsList.remove(i);
                System.out.println("Mission deleted successfully.");
                return;
            }
        }
        System.out.println("Mission not found.");
    }
}
