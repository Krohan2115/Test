public class CalorieTracker {

    //This function takes the calories burnt by the activities and the calorie intake in a day
    // and returns the weight lost by Anne

    public int weightLostInAMonth(int cycling,int running,int swimming,int calorieIntake)
    {
        // write logic here
		int t = 0;
		t = 2*cycling+2*running+2*swimming;
		t = t*4;
		t = t - (30*calorieIntake);

		if(t>0)
			t = t/1000;
		else
			t =0;	

        return t;
    }


    public static void main(String[] args) {
        CalorieTracker ct = new CalorieTracker();
        System.out.println("Weight lost by Anne in a month is : "+ct.weightLostInAMonth(300,200,500,2000)+" pounds");

    }
}
