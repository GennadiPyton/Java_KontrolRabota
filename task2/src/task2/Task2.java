/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

/**
 *
 * @author user
 */
public class Task2 {

    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        String strip=Integer.toString(number);

        int sum=0;
        for (int i=0; i<strip.length(); i++)
         {
           sum+=Character.getNumericValue(strip.charAt(i));//напишите тут ваш код
         }
         return sum;

    }
}
