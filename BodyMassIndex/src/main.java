

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter your weight in kilograms:");
        double mass_for_kilogram = scanner.nextDouble();
        
        System.out.println("Please enter your height in meters:");
        double height_by_metre = scanner.nextDouble();
        
        double body_mass_index = mass_for_kilogram / (height_by_metre * height_by_metre);
        
        System.out.println("Your Body Mass Index = " + body_mass_index);
        
        if (body_mass_index < 18.5) {
            System.out.println("According to the BMI evaluation, you are underweight.");
        } else if (body_mass_index >= 18.5 && body_mass_index < 24.9) {
            System.out.println("According to the BMI evaluation, you are of normal weight.");
        } else if (body_mass_index >= 25 && body_mass_index < 29.9) {
            System.out.println("According to the BMI evaluation, you are overweight.");
        } else {
            System.out.println("According to the BMI evaluation, you are obese.");
        }
        
       
    }
}
