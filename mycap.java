package tcs.minutestodays;

import java.util.Scanner;

public class mycap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("enter the minutes:");
        int minutes = input.nextInt();
        int years = minutes / 525600;
        float days = minutes / 1440;
        System.out.println(minutes+ " minutes is " +years+ "years and " +days+ "days");
        input.close();

    }

    
}
    
