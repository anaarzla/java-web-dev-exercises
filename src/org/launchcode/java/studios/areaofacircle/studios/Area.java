package org.launchcode.java.studios.areaofacircle.studios;
import java.util.Scanner;
public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");

        double radius = input.nextDouble();
        input.close();

        /** double area = radius*radius*3.14; **/

        double area = Circle.getArea(radius);

        System.out.println("The area of a circle of radius "+radius+" is : "+ area);

    }

}

