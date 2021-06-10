// Jada Alexander
// Chp 2 PaintEstimator program

import java.util.Scanner;

public class PaintEstimator {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        double wallHeight;
        double wallWidth;
        double wallArea; //The wall's area is calculated here
        double amountOfPaint; /*The amount of paint needed to paint the all is calculated by
        dividing the total wall area by 350 square feet which will output the amount of paint needed in gallons.*/


        //Input of wall height
        System.out.print("Enter wall height (feet): ");
        wallHeight = scnr.nextDouble(); 

        //Input of wall width
        System.out.print("Enter wall width (feet): ");
        wallWidth = scnr.nextDouble();

        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + wallArea + " square feet"); //Output of wall area

        amountOfPaint = wallArea / 350;
        System.out.println("Paint needed: " + amountOfPaint + " gallons"); //Output of the amount of paint needed
        System.out.println("Cans needed: " + Math.round(amountOfPaint) + " can(s)"); //amount of paint rounded

    }
}
