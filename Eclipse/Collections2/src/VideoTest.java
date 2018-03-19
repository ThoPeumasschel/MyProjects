import java.util.*;

public class VideoTest {

	

	public static void main(String[] args) {

		Video v = new Video("007G5", "Hannibal", 90, 'i', 't');
		System.out.println(v.getVideonummer());
		System.out.println(v.getTitel());
		System.out.println(v.getLaufzeit());
		System.out.println(v.getSprache());
		System.out.println(v.getGenre());

		v.setAusleihdatum(new Date());
		v.setAusleihername("Peuschel");
		System.out.println(v.getAusleihdatum());
		System.out.println(v.getAusleihername());
		System.out.println();

		System.out.println(v.videotoString());
		Video v2 = new Video("007G5", "Hannibal", 90, 'i', 't');
		v2.ausleihen("Paul Meier");
		
		Video[] videoarr = new Video[200];
		videoarr[5] = new Video("007G5", "Hannibal", 90, 'i', 't');
		videoarr[5].setGenre('a');
		System.out.println("Video Array am index 5: " + videoarr[5].videotoString());
		
		v.istVideoda("234", videoarr[5]);
		
	}

}
