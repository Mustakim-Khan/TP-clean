package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.APPEND;


public class Main {

    public static void main(String[] args) {
        // write your code here
    }

    public class App {
        public App() {
        }

        public void runMenus() {
            Path orderPath = Paths.get("db.csv");
            System.out.println("Combien souhaitez vous commander de menu ?");
            Scanner sc = new Scanner(System.in);
            boolean responseIsGood;
            do {
                try {
                    //menuQuantity = sc.nextInt();
                    responseIsGood = true;
                } catch (InputMismatchException e) {
                    sc.next();
                    System.out.println("Vous devez saisir un nombre, correspondant au nombre de menus souhaités");
                    responseIsGood = false;
                }
            } while (!responseIsGood);
                //String orderLine = runMenu();
                try {
                    Files.write(orderPath, String.format(/*orderLine*/).getBytes(), APPEND);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            //System.out.println("");
            //System.out.println(String.format(orderSummary));
        }
    }

}
