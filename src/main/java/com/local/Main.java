package com.local;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        System.out.println("                   Welcome to KonohaSystem");
        System.out.println("---------------------------------------------------------------");
        System.out.println("               please, choose some option: ");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("                  1. Ninja Operations");
        System.out.println("                  2. Mission Operations");
        System.out.println("                  0. Finish the program");
        System.out.println("--> ");

        try (Scanner scanner = new Scanner(System.in)) {
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    ninjaOperationsMenu();
                    break;
                case 2:
                    missionOperationsMenu();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    displayMainMenu();
                    break;
            }
        } catch (Exception e) {
            System.out.println("You have an error!");
        }
    }

    public static void ninjaOperationsMenu() {
        System.out.println("         Ninja Operations Menu");
        System.out.println("---------------------------------------------------------------");
        System.out.println("               Please choose an option: ");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("                  1. Show Ninjas");
        System.out.println("                  2. Add Ninja");
        System.out.println("                  3. Remove Ninja");
        System.out.println("                  0. Go Back");
        System.out.println("--> ");

        try (Scanner scanner = new Scanner(System.in)) {
            int choice = scanner.nextInt();
            List<Ninjas> ninjasList = new ArrayList<>();

            switch (choice) {
                case 1:
                    displayAllNinjas(ninjasList);
                    break;
                case 2:
                    addNinja(ninjasList);
                    break;
                case 3:
                    removeNinja(ninjasList);
                    break;
                case 0:
                    System.out.println("Going back to the main menu...");
                    displayMainMenu(); // Return to main menu
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    ninjaOperationsMenu(); // Re-display ninja operaciones de menu para nuevos inputs
                    break;
            }
        } catch (Exception e) {
            System.out.println("You have an error!");
        }
    }

    public static void displayAllNinjas(List<Ninjas> ninjasList) {
        if (ninjasList.isEmpty()) {
            System.out.println("No ninjas to display.");
            return;
        }
        System.out.println("List of Ninjas:");
        for (Ninjas ninja : ninjasList) {
            System.out.println(ninja.toString());
        }
    }

    public static void addNinja(List<Ninjas> ninjasList) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter ninja name: ");
            String name = scanner.nextLine();
            System.out.println("Enter ninja rank: ");
            String rank = scanner.nextLine();
            System.out.println("Enter ninja village: ");
            String village = scanner.nextLine();

            Ninjas ninja = new Ninjas(name, rank, village);
            ninjasList.add(ninja);
            System.out.println("Ninja added successfully.");
        } catch (Exception e) {
            System.out.println("Error adding ninja.");
        }
    }

    public static void removeNinja(List<Ninjas> ninjasList) {
        if (ninjasList.isEmpty()) {
            System.out.println("No ninjas to remove.");
            return;
        }

        System.out.println("Enter the name of the ninja to remove: ");
        try (Scanner scanner = new Scanner(System.in)) {
            String name = scanner.nextLine();

            for (int i = 0; i < ninjasList.size(); i++) {
                if (ninjasList.get(i).getName().equalsIgnoreCase(name)) {
                    ninjasList.remove(i);
                    System.out.println("Ninja removed successfully.");
                    return;
                }
            }
            System.out.println("Ninja not found.");
        } catch (Exception e) {
            System.out.println("Error removing ninja.");
        }
    }

    public static void missionOperationsMenu() {
        System.out.println("         Mission Operations Menu");
        System.out.println("---------------------------------------------------------------");
        System.out.println("               Please choose an option: ");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("                  1. Show Missions");
        System.out.println("                  2. Add Mission");
        System.out.println("                  3. Remove Mission");
        System.out.println("                  0. Go Back");
        System.out.println("--> ");

        try (Scanner scanner = new Scanner(System.in)) {
            int choice = scanner.nextInt();
            List<Missions> missionsList = new ArrayList<>();

            switch (choice) {
                case 1:
                    displayAllMissions(missionsList);
                    break;
                case 2:
                    addMission(missionsList);
                    break;
                case 3:
                    removeMission(missionsList);
                    break;
                case 0:
                    System.out.println("Going back to the main menu...");
                    displayMainMenu(); // Return to main menu
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    missionOperationsMenu(); // Re-display mission operations menu for new input
                    break;
            }
        } catch (Exception e) {
            System.out.println("You have an error!");
        }
    }

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

    public static void addMission(List<Missions> missionsList) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter mission description: ");
            String description = scanner.nextLine();
            System.out.println("Enter mission rank: ");
            String rank = scanner.nextLine();
            System.out.println("Enter mission reward: ");
            String reward = scanner.nextLine();

            Missions mission = new Missions(description, rank, reward);
            missionsList.add(mission);
            System.out.println("Mission added successfully.");
        } catch (Exception e) {
            System.out.println("Error adding mission.");
        }
    }

    public static void removeMission(List<Missions> missionsList) {
        if (missionsList.isEmpty()) {
            System.out.println("No missions to remove.");
            return;
        }

        System.out.println("Enter the description of the mission to remove: ");
        try (Scanner scanner = new Scanner(System.in)) {
            String description = scanner.nextLine();

            for (int i = 0; i < missionsList.size(); i++) {
                if (missionsList.get(i).getDescription().equalsIgnoreCase(description)) {
                    missionsList.remove(i);
                    System.out.println("Mission removed successfully.");
                    return;
                }
            }
            System.out.println("Mission not found.");
        } catch (Exception e) {
            System.out.println("Error removing mission.");
        }
    }
}
