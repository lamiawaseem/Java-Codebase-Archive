
public class point {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String team1name = ("Red");		
		String team2name = ("Blue");	
		String team3name = ("Green");
	
	int team1Wins = 5;
	int team1Losses = 9;
	int team2Wins = 7;
	int team2Losses = 7;
	int team3Wins = 11;
	int team3Losses = 3;
	int team1Points = team1Wins*2;
	int team2Points = team2Wins*2;
	int team3Points = team3Wins*2;

	System.out.println("Team 	Wins Losses Points");
	System.out.println(team1name +"\t" +team1Wins+ "\t" +team1Losses+"\t"+ team1Points);
	System.out.println(team2name + "\t" + team2Wins + "\t" + team2Losses + "\t" + team2Points);
	System.out.println(team3name + "\t"  +team3Wins + "\t" + team3Losses + "\t" + team3Points);
	}
}
