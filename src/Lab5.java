import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab5 {
	public static void main(String[] args){

	    Scanner x = new Scanner(System.in);

	    int RaceCycles = 0;
	     Automobile Truck = new Automobile(2000,"Ford","F150","Big Truck",3);

	        Automobile Van = new Automobile(2010,"Dodge","Ram","",4);

	        Automobile Sportcar = new Automobile(1990,"Chevy","Impala","",6);

	    try
	    {

	        System.out.println("Enter the number of dices you want to roll");
	        RaceCycles= x.nextInt();
	    }
	    catch (InputMismatchException badInput)
	    {
	        System.err.printf("Enter a number",badInput);
	    }
	   

	    for ( int cycle = 1; cycle <= RaceCycles; cycle++)//for loop to print out data
	    {
	        Truck.SetCycle(cycle);
	        Van.SetCycle(cycle);
	        Sportcar.SetCycle(cycle);
	       
	        if(RaceCycles - cycle == 1){
	        System.out.println("Race in Yellow flag");}
	        System.out.println(Truck.toString());
	        System.out.println(Van.toString());
	        System.out.println(Sportcar.toString());
	       
	    }

}}