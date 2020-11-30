import java.util.ArrayList;

// Question 4 - Comp 1020
// A class to demonstrate a recursive graph search algorithm. 
public class RecursionProblem{
	
	public static void main(String[] args){
		// given a sequence of possible paths, find the best path between two locations
		ArrayList<Edge> graph = new ArrayList<Edge>();
		graph.add(new Edge("A","B"));
		graph.add(new Edge("A","B"));
		graph.add(new Edge("A","C"));
		graph.add(new Edge("B","C"));

		// Test Graph - Should be true
		boolean goalReached = search(graph, "A", "C");
		System.out.println(goalReached +  " A" + " to " + "C");

		// Test Graph - Should be false
		goalReached = search(graph, "C", "A");
		System.out.println(goalReached +  " C" + " to " + "A");

		// Test Graph - Should be false
		goalReached = search(graph, " Anywhere", "C");
		System.out.println(goalReached +  " Anywhere" + " to " + "C");

		// Test Graph - Should be false
		goalReached = search(graph, "A", "Nowhere");
		System.out.println(goalReached +  " A" + " to " + "Nowhere");

		// Test Graph - True
		goalReached = search(graph, "A", "A");
		System.out.println(goalReached +  " A" + " to " + "A");

	}

	// Basic method to call. Returns true if a path can be found through the edges in possibleEdges from 
	// startPoint to goalPoint. 
	public static boolean search(ArrayList<Edge> possibleEdges, String startPoint, String goalPoint){
		return helper(possibleEdges,startPoint,goalPoint,0,false,false);//call helper method
	}
	public static boolean helper(ArrayList<Edge> list, String a, String b,int n,boolean c,boolean d){
		if(a.equals(b)){
			return true;
		}
		if (n < list.size()) {//if out current index in range
			if (!c && !d) { //if start and end doesnot match
				if (list.get(n).getStart().compareTo(a) == 0) {
					c = true;//if start match, make first boolean true
				}
				return helper(list, a, b, n + 1, c, d);//or continue till first boolean becomes true
			} else if (c && !d) { //if first condition is true and goal is not reached
				if (list.get(n).getEnd().equals(b)) {
					return true;//return true if end also matches
				}
				return helper(list, a, b, n + 1, c, d);//else just continue
			}
		}
		return false;
	}
}