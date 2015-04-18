public class Tester {

	public Tester() {

		Maze maze;
		int size = 12;
		do {
			maze = new Maze(size, 0, 0, size-1, size-1);
		} while (!maze.hasPath());
		say(maze);
		maze.updateShortestPath2();
		say(maze.shortestPath);

	}

	public static void say(Object s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		new Tester();
	}

}
