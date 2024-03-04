package com.JSFTask5;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class T4AgeCalculator {
        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            boolean isValidInput =false;

            while(!isValidInput)
            {
                try
                {
                    System.out.println("Please enter your birthdate (YYYY-MM-DD):");
                    String birthdateInput = in.nextLine();
                    LocalDate birthdate = LocalDate.parse(birthdateInput);
                    Period age = calculateAge(birthdate, LocalDate.now());
                    System.out.println("Your age is: " + age.getYears() + " years, " + age.getMonths() + " months, and " + age.getDays() + " days.");
                    isValidInput=true;

                }
                catch(Exception e)
                {
                    System.out.println("Invalid Input:"+e.getLocalizedMessage());
                    in.nextLine();
                }
            }
            in.close();
        }

        public static Period calculateAge(LocalDate birthdate, LocalDate currentDate) {
            if ((birthdate != null) && (currentDate != null)) {
                return Period.between(birthdate, currentDate);
            } else {
                throw new IllegalArgumentException("Invalid input");
            }
        }


}
