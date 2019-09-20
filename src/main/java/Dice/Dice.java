package Dice;

import java.util.Random;

public class Dice {

    public static void main(String[] args) {

        Random r = new Random();
        int x = 1;
        int y = 6;

        int a = r.nextInt(y - x + 1) + x;
        int b = r.nextInt(y - x + 1) + x;
        int c = r.nextInt(y - x + 1) + x;
        for (int i = 1; i < 6; i++) ;
        if (a == 1) {
            System.out.println("---------");
            System.out.println("|       |");
            System.out.println("|   O   |");
            System.out.println("|       |");
            System.out.println("---------");
        } else if (a == 2) {
            System.out.println("---------");
            System.out.println("| O     |");
            System.out.println("|       |");
            System.out.println("|     O |");
            System.out.println("---------");
        } else if (a == 3) {
            System.out.println("---------");
            System.out.println("| O     |");
            System.out.println("|   O   |");
            System.out.println("|     O |");
            System.out.println("---------");
        } else if (a == 4) {
            System.out.println("---------");
            System.out.println("| O   O |");
            System.out.println("|       |");
            System.out.println("| O   O |");
            System.out.println("---------");
        } else if (a == 5) {
            System.out.println("---------");
            System.out.println("| O   O |");
            System.out.println("|   O   |");
            System.out.println("| O   O |");
            System.out.println("---------");
        } else if (a == 6) {
            System.out.println("---------");
            System.out.println("| O   O |");
            System.out.println("| O   O |");
            System.out.println("| O   O |");
            System.out.println("---------");

            System.out.println("masz jeszcze jeden rzut");

            if (b == 1) {
                System.out.println("---------");
                System.out.println("|       |");
                System.out.println("|   O   |");
                System.out.println("|       |");
                System.out.println("---------");
            } else if (b == 2) {
                System.out.println("---------");
                System.out.println("| O     |");
                System.out.println("|       |");
                System.out.println("|     O |");
                System.out.println("---------");
            } else if (b == 3) {
                System.out.println("---------");
                System.out.println("| O     |");
                System.out.println("|   O   |");
                System.out.println("|     O |");
                System.out.println("---------");
            } else if (b == 4) {
                System.out.println("---------");
                System.out.println("| O   O |");
                System.out.println("|       |");
                System.out.println("| O   O |");
                System.out.println("---------");
            } else if (b == 5) {
                System.out.println("---------");
                System.out.println("| O   O |");
                System.out.println("|   O   |");
                System.out.println("| O   O |");
                System.out.println("---------");
            } else if (b == 6) {
                System.out.println("---------");
                System.out.println("| O   O |");
                System.out.println("| O   O |");
                System.out.println("| O   O |");
                System.out.println("---------");

                System.out.println("masz jeszcze jeden rzut");

                if (c == 1) {
                    System.out.println("---------");
                    System.out.println("|       |");
                    System.out.println("|   O   |");
                    System.out.println("|       |");
                    System.out.println("---------");
                } else if (c == 2) {
                    System.out.println("---------");
                    System.out.println("| O     |");
                    System.out.println("|       |");
                    System.out.println("|     O |");
                    System.out.println("---------");
                } else if (c == 3) {
                    System.out.println("---------");
                    System.out.println("| O     |");
                    System.out.println("|   O   |");
                    System.out.println("|     O |");
                    System.out.println("---------");
                } else if (c == 4) {
                    System.out.println("---------");
                    System.out.println("| O   O |");
                    System.out.println("|       |");
                    System.out.println("| O   O |");
                    System.out.println("---------");
                } else if (c == 5) {
                    System.out.println("---------");
                    System.out.println("| O   O |");
                    System.out.println("|   O   |");
                    System.out.println("| O   O |");
                    System.out.println("---------");
                } else if (c == 6) {
                    System.out.println("---------");
                    System.out.println("| O   O |");
                    System.out.println("| O   O |");
                    System.out.println("| O   O |");
                    System.out.println("---------");
                }
            }
        }
    }
}

