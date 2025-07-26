package test;

import java.util.ArrayList;
import java.util.List;

/**
 * bus system, each bus has 40 seats, 10 row, 1row -window, last row- window
 * outcome - window seat
 *
 */
public class WindowSeats {

	public static void main(String[] args) {
		
		List<Integer> windowsseats =getWindowSeat(10);
		System.out.println("Widows seat numbers"+ windowsseats);
	}
	
	public static List<Integer> getWindowSeat(int rows){
		List<Integer> windowsSeats=new ArrayList<>();
		for(int i=0;i<rows;i++) {
			int firstSeat = (i*4)+1;
			int lastSeat= (i*4)+4;
			windowsSeats.add(firstSeat);
			windowsSeats.add(lastSeat);

		}
		return windowsSeats;
	}

}
