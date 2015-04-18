public class Tester {

	public Tester() {

		PathFinder maze;
		int size = 40;
		do {
			maze = new PathFinder(size, 0, 0, size-1, size-1);
		} while (!maze.hasPath());
		say(maze);
		maze.updateShortestPath();
		say(maze.shortestPath);
		say(maze.shortestPath.fancyToString());

	}

	public static void say(Object s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		new Tester();
	}

}
