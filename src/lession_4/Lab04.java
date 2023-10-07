package lession_4;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab04 {
    public static void main(String[] args) {
        // khai bao 1 array random
        ArrayList<Integer> list = new ArrayList<Integer>();

        list = createData(10);
       System.out.println("=====MENU=====");
        Scanner scanner = new Scanner(System.in);
        int userInput = 1;
        while (userInput > 0){

            userInput = scanner.nextInt();

            switch (userInput) {
                case 1:
                    printAllNumber(list);
                    break;
                case 2:
                    printMaxvalue(list);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Input number incorrectly. Only 1,2,3,4");

            }
        }

    }

    //get all number
    public  static ArrayList<Integer> createData (int number){
        ArrayList<Integer> myList = new ArrayList<Integer>();
        for (int i = 0; i < number; i++){
            myList.add(new SecureRandom().nextInt(1000));
        }
        return myList;
    }
    public static void printAllNumber (ArrayList<Integer> list){
        for ( int value : list) {
            System.out.println(value);
        }
    }
    public static void printMaxvalue (ArrayList<Integer> list){
       int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
            System.out.println(max);
    }
}
}
