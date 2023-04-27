package ClimbLeaderboard;

import java.util.*;
public class ClimbingtheLeaderboard {

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("How many entries in the leaderboard");
		int entries = scan.nextInt();
		//function to collect current leaderboard
		ArrayList<Integer> leaderboard = new ArrayList<Integer>();
		currentleaderboard(leaderboard, entries);
		
		//take player scores and compare with leaderboard
		System.out.println("How many player scores to enter");
		int playerentries = scan.nextInt();
		ArrayList<Integer> playerscore = new ArrayList<Integer>();
		for (int i=0; i<playerentries;i++) {
			int sent = scan.nextInt();
			//send it straight to the compare method
			playerscore.add(sent);
		}
		for (Integer element:playerscore) {
			ArrayList<Integer>comparescore = leaderboard;
			comparescore.add(element);
			Collections.sort(comparescore, Collections.reverseOrder());
			System.out.println(comparescore.indexOf(element) + 1);
			comparescore.remove(element);
		}
		
	}

	protected static ArrayList<Integer> currentleaderboard(ArrayList<Integer> leaderboard, int entries) {
		// TODO Auto-generated method stub
		System.out.println("Enter current leaderboard");
		for (int i=0; i<entries; i++) {
			int sc = scan.nextInt();
			if (!leaderboard.contains(sc) ) {
				leaderboard.add(sc);
			}//if statement
		}//for loop
		return leaderboard;
	}//current leaderboard method

}//class 
