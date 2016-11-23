
public class Automobile {

	 public int caryear=0, cargears = 0, currentgear=0, currentspeed=0;// declare all variables
	    public String carmake,carmodel,carname,carsound;
	    public double distancetravel=0;
	   
	    public Automobile(int year, String make, String model, String name, int gears)
	    {
	        caryear= year;//set the variables
	        cargears= gears;
	        carmake = make;
	        carmodel = model;
	        carname = carname;     
	    }
	    public void setSound(String sound)//set sound
	    {
	        carsound = sound;   
	    }
	    public void SetYear(int year)//set year
	    {
	        caryear= year;
	    }
	    public void SetGear(int gear)//set gear
	    {
	        cargears= gear;
	    }
	    public void Setmake(String make)//set make
	    {
	        carmake= make;
	    }
	    public void SetModel(String model)//set model
	    {
	        carmodel= model;
	    }
	    public void SetName(String name)//set name
	    {
	        carname= name;
	    }
	    public void SetCycle (int cycle)//set cycle 
	    {

	        if (cycle <= cargears)
	    {
	        currentgear = cycle;
	    }
	        currentspeed = currentgear * 10;

	        distancetravel += currentspeed;

	        }
	    public int GetGear()//get gears 
	    {
	        return cargears;
	    }
	    public int GetSpeed()//get speed
	    {
	        return currentspeed;
	    }
	    public double GetDistance()//get distance 
	    {
	        return distancetravel;
	    }
	    public String GetSound() throws Exception//get sound throw exception if it over 100;
	    {
	        if (distancetravel < 10)
	        {carsound = "Prr";return carsound;}
	       
	        if ( distancetravel >= 10 && distancetravel <= 100)
	        {carsound = "Vroom";return carsound;}
	        else
	        {carsound="Sputter"; throw new Exception();}
	    }
	    public String toString()//set strings 
	 	   {
	 	        return carmake +":\n Gear: " +cargears+" Speed: " + currentspeed + " DistanceTravel: " + distancetravel+" Sound: "+ carsound +"\n";
	 	   }    
	    }
	//}
	//public class myAutomobile extends Automobile {
	    
		//public String toString()//set strings 
	   // {
	   //     return  carmake +":\n Gear: " +cargears+" Speed: " + currentspeed + " DistanceTravel: " + distancetravel+" Sound: "+ carsound +"\n";
	    //}    
	//}
	    