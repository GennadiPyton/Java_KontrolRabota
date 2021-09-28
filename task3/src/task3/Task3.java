/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Task3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ваше имя : ");
        String name1 = input.nextLine();
        
        System.out.println("Ваше Фамилия : ");
        String name2 = input.nextLine();
        
        System.out.println("Ваше год рождения : ");
        String year = input.nextLine();
        
        
        System.out.println("Ваше месяц рождения : ");
        String month = input.nextLine();
        
        System.out.println("Ваше день рождения : ");
        String day = input.nextLine();
        
        System.out.println(name1 + "" + name2 + "" + year + "Год рождения" + month + "месяц" + day + "день");
    }
    
}
