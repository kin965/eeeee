package dai12kai;

import java.util.ArrayList;
import java.util.List;

public class YmanoteCheak {

	public static void main(String[] args) {
		Station station = new Station();
		Line line = new Line();
		List<String> yamanote = new ArrayList<>();
		yamanote.add(station.station);
		for (String x : yamanote) {
			if (x.contains("新橋")) {
				System.out.println("山手線内に新橋駅がある");
			} else {
				System.out.println("山手線内に新橋駅がない");
			}
		}
	}

}
