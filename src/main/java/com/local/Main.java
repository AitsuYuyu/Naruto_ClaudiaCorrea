package com.local;

import java.util.Scanner;

import com.local.NinjasMissions.ninjasMissionsBuilder;


public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("                   Welcome to KonohaSystem");
        System.out.println("---------------------------------------------------------------");
        System.out.println("               please, choose some option: ");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("                  1. Show the ninjas");
        System.out.println("                   2. mission status");
        System.out.println("                  3.Register missions");
        System.out.println("                    4. show missions");
        System.out.println("             ++++ 0. finish the program ++++");
        System.out.println("--> ");
        // Uso del builder para llamarlo desde la clase Ninjas
        Ninjas.NinjasBuilder builder = new Ninjas.NinjasBuilder();
    
        Ninjas ninjas = builder
            .setName("Naruto Uzumaki")
            .setRango("Hokage")
            .setVillager("Konoha")
            .build();
            
    
    

// Builder para mostrar la informacion de la clase Missions
            Missions.MissionsBuilder builderMissions = new Missions.MissionsBuilder();
    
            Missions missionss = builderMissions
                .setDescription("askajskldjaklsjdklaslkdjalksjd")
                .setRango("failed")
                .setReward("300000 Ryo")
                .build();
                
        try (Scanner scanner = new Scanner(System.in)) {
            int answer = scanner.nextInt();
           
           while (true){
            if (answer == 1){
                System.out.println("The information about the ninja: " + ninjas.getName() + ", rank " + ninjas.getRango() + ", and stay on village " + ninjas.getVillage() );
                break;
                
            }else if (answer == 2){
                System.out.println("1. Show status");
                
                System.out.println("2. Show misions availables for ninjas");
                System.out.println("0. Exit");
                
                try (Scanner scanner2 = new Scanner(System.in)){               
                    int answer2 = scanner.nextInt();
                    

                    while ( true) {
                        if (answer2 == 1){
                            System.out.println("Description from Missions: " + ninjasMissionsBuilder.getDescription() + ".");
                            break;
                        }else if (answer2 == 2){
                            System.out.println("no missions availables.");
                            break;
                        }else if (answer2 == 0){
                            break;
                        }else{
                            System.out.println("You have an error, please check and try again.");
                            break;
                        }
                    }
                } 
            }else if (answer == 3){
                System.out.println("You enter to register missions: ");
                System.out.println("1. Register");
                System.out.println("2. Create");
                System.out.println("3. Show missions");
                System.out.println("0. Exit");
                try (Scanner answer3 = new Scanner(System.in)){
                    
                } catch (Exception e) {
                    System.out.println("You have an error in yout anser, chek out and try again");
                }
            }else if (answer == 4){
                System.out.println("Option 4");
                break;
            }else if (answer == 0){
                System.out.println("Exit...");
                break;
            }
           }
           
        }catch (Exception e) {
            System.out.println("You have an error!");
        }

    
    }}
