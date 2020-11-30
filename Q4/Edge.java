import java.util.ArrayList;

// A path represents a directed edge of a graph.
public class Edge{
	// Edge segment from start to end.  
	private String start;
	private String end;
	private int cost;

	// Constructor - no cost 
	public Edge(String start, String end){
		this(start, end, 0); // calling the other constructor. 
	}

	// Constructor with cost
	public Edge(String start, String end, int cost){
		this.cost = 0;
		this.start = start;
		this.end = end;
	}

	// --- Accessor Methods ---
	public int getCost(){
		return cost;
	}
	public String getStart(){
		return start;
	}
	public String getEnd(){
		return end;
	}

	// Return the Edge as a String
	public String toString(){
		return "Edge: (" + start + " , " + end + ")";
	}

}