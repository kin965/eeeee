package dai12kai;

import java.util.ArrayList;
import java.util.List;

public class Ymanote {
	public static void main(String[] args) {
		Station station = new Station();
		//Line line = new Line();
		
		
		List<String> yamanote = new ArrayList<>();
		
		yamanote.add(station.station);
		for (String x : yamanote) {
			System.out.println(x);
		}
	}

}
