
public class MatchWinner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = MatchWinner.winningTeam(6,5);
		System.out.println(result);
	}
	/*public static void winningTeam(int IND, int AUS) {
		if(IND>AUS)
			System.out.println("IND wins");
		else
			System.out.println("AUS wins");
	}*/
	// the above method is also correct, only commented to save time.

	public static String winningTeam(int IND, int AUS) {
		if(IND>AUS)
			return("IND wins");
		else
			return("AUS wins");
	}
}
