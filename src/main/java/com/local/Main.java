package com.local;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("                   Welcome to KonohaSystem");
        System.out.println("---------------------------------------------------------------");
        System.out.println("               please, choose some option: ");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("                  1. Show the ninjas");
        System.out.println("                   2. Mission status");
        System.out.println("                  3. Register missions");
        System.out.println("                    4. Show missions");
        System.out.println("             ++++ 0. Finish the program ++++");
        System.out.println("--> ");

        // Crear habilidades
        Abilitys fireball = new Abilitys("Fireball", "Launches a fireball.");
        Abilitys shadowClone = new Abilitys("Shadow Clone", "Creates shadow clones.");

        // Crear lista de habilidades
        List<Abilitys> abilitiesList = new ArrayList<>();
        abilitiesList.add(fireball);
        abilitiesList.add(shadowClone);

        // Crear un ninja y agregar habilidades
        Ninjas naruto = new Ninjas("Naruto Uzumaki", "Hokage", "Konoha");
        naruto.addAbility(fireball);
        naruto.addAbility(shadowClone);

        // Mostrar información del ninja con habilidades
        naruto.displayNinjaWithAbilities();

        try (Scanner scanner = new Scanner(System.in)) {
            int answer = scanner.nextInt();

            while (true) {
                if (answer == 1) {
                    System.out.println("The information about the ninja: " + naruto.getName() + ", rank "
                            + naruto.getRango() + ", and stay on village " + naruto.getVillage());
                    break;

                } else if (answer == 2) {
                    System.out.println("1. Show status");
                    System.out.println("2. Show missions available for ninjas");
                    System.out.println("0. Exit");

                    try (Scanner scanner2 = new Scanner(System.in)) {
                        int answer2 = scanner.nextInt();

                        while (true) {
                            if (answer2 == 1) {
                                System.out.println("Description from Missions: ");
                                // Implementa la lógica para obtener la descripción de las misiones
                                break;
                            } else if (answer2 == 2) {
                                System.out.println("No missions available.");
                                break;
                            } else if (answer2 == 0) {
                                break;
                            } else {
                                System.out.println("You have an error, please check and try again.");
                                break;
                            }
                        }
                    }
                } else if (answer == 3) {
                    System.out.println("You enter to register missions: ");
                    System.out.println("1. Register");
                    System.out.println("2. Create");
                    System.out.println("3. Show missions");
                    System.out.println("0. Exit");

                    try (Scanner answer3 = new Scanner(System.in)) {

                    } catch (Exception e) {
                        System.out.println("You have an error in your answer, check it out and try again.");
                    }
                } else if (answer == 4) {
                    System.out.println("Option 4");
                    break;
                } else if (answer == 0) {
                    System.out.println("Exit...");
                    break;
                }
            }

        } catch (Exception e) {
            System.out.println("You have an error!");
        }
    }
}
