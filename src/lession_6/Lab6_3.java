package lession_6;

public class Lab6_3 {
    public static void main(String[] args) {
        String str = "Give me 500 numbers";
        String expectedNumber = "";
        for ( int index = 0; index < str.length(); index ++){
            char ch = str.charAt(index);
            if(Character.isDigit(ch)){
               expectedNumber = expectedNumber + Integer.parseInt(""+ch);
            }
        }
        System.out.println(expectedNumber);
    }
}
