package uz.pdp.service.impl;

import java.util.Scanner;

public class StartPR {
    public static void main(String[] args) {

        System.out.println("Xush kelibsiz");
        while (true){
            System.out.println("1-Kirish, 2-Ruyhatdan utish, 0-Chiqish");
            Scanner scanner = new Scanner(System.in);
            int command = scanner.nextInt();
            if (command==1){

            } else if (command==2) {

            } else if (command==0) {

            }else {
                System.out.println("Xato buyruq");
            }


        }



    }
}
