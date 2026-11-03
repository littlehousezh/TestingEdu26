import java.awt.Point;
import java.util.ArrayList;

public class MarsRover {

    private Point position = new Point(0, 0);
    private char facing = 'N';

    private final int gridWidth;
    private final int gridHeight;

    private final ArrayList<Point> obstacles = new ArrayList<>();
    private final ArrayList<Point> encounteredObstacles = new ArrayList<>();

    public MarsRover(int gridWidth, int gridHeight, String obstacleString) {
        this.gridWidth = gridWidth;
        this.gridHeight = gridHeight;
        parseObstacles(obstacleString);
    }

    public String execute(String commands) {
        if (commands == null) {
            return formatOutput();
        }

        for (int i = 0; i < commands.length(); i++) {
            char cmd = commands.charAt(i);
            if (cmd == 'l' || cmd == 'r') {
                rotate(cmd);
            } else if (cmd == 'f' || cmd == 'b') {
                move(cmd);
            }
        }
        return formatOutput();
    }

    private void rotate(char cmd) {
        if (cmd == 'r') {
            if (facing == 'N') facing = 'E';
            else if (facing == 'E') facing = 'S';
            else if (facing == 'S') facing = 'W';
            else if (facing == 'W') facing = 'N';
        } else if (cmd == 'l') {
            if (facing == 'N') facing = 'W';
            else if (facing == 'W') facing = 'S';
            else if (facing == 'S') facing = 'E';
            else if (facing == 'E') facing = 'N';
        }
    }

    private void move(char cmd) {
        int step;
        if (cmd == 'f') {
            step = 1;
        } else {
            step = -1;
        }

        int dx = 0;
        int dy = 0;

        if (facing == 'N') {
            dy = step;
        } else if (facing == 'S') {
            dy = -step;
        } else if (facing == 'E') {
            dx = step;
        } else if (facing == 'W') {
            dx = -step;
        }

        // Spherical wrapping logic
        int nextX = (position.x + dx) % gridWidth;
        if (nextX < 0) {
            nextX += gridWidth;
        }

        int nextY = (position.y + dy) % gridHeight;
        if (nextY < 0) {
            nextY += gridHeight;
        }

        Point target = new Point(nextX, nextY);

        if (obstacles.contains(target)) {
            if (!encounteredObstacles.contains(target)) {
                encounteredObstacles.add(target);
            }
        } else {
            this.position = target;
        }
    }

    private String formatOutput() {
        String result = "(" + position.x + "," + position.y + "," + facing + ")";

        for (int i = 0; i < encounteredObstacles.size(); i++) {
            Point p = encounteredObstacles.get(i);
            result = result + "(" + p.x + "," + p.y + ")";
        }
        return result;
    }

    private void parseObstacles(String s) {
        if (s == null || s.isEmpty()) {
            return;
        }

        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '(') {
                int comma = s.indexOf(',', i);
                int close = s.indexOf(')', i);

                if (comma != -1 && close != -1) {
                    int px = Integer.parseInt(s.substring(i + 1, comma).trim());
                    int py = Integer.parseInt(s.substring(comma + 1, close).trim());
                    obstacles.add(new Point(px, py));
                    i = close;
                }
            }
            i++;
        }
    }
}