package dai12kai;

import java.util.ArrayList;
import java.util.List;

public class Line  {
	Station station01 = new Station();
    
	private List<String> line = new ArrayList<>();
	
	public Line() {
		
	}

	public List<String> getLine() {
		return line;
	}

	public void setLine(List<String> line) {
		line.add(station01.station);
		this.line = line;
	}
    
	
	
	


	

}
