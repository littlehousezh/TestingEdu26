MarsRoverApi
============

The objective is to TEST an API that follows the movement of a planet exploration vehicle (also called a Rover) and keeps track of its position and the obstacles that it may have encountered on a tour.

- There is no graphical user interface.
- You ONLY work in `MarsRoverTest.java` and write JUnit test cases based on the requirement.
- Do not modify `MarsRover.java`.
- You have 40 minutes to work on this task (if needed, you may exceed this limit by up to 20%).
- You are free to consult/use any online resources, including documentation, tutorials, and Q&A sites.

**Project Template**

You are provided with a project template that contains one completed implementation class, `MarsRover`, and one starter test class, `MarsRoverTest`. DO NOT CHANGE the names, parameters, or return types of the existing methods in `MarsRover`.

You are expected to create JUnit test cases to verify the behavior of this implementation as thoroughly as possible based on the following description of a Mars Rover API.

**Mars Rover API Task Description**

Mars Rover API manages the movement of a planet exploration vehicle (i.e., a rover) around a planet. The planet is represented as a grid with x and y coordinates. The rover starts the movement at position (0,0). The rover also has a direction that it is facing. The direction of the rover can be N (north), S (south), E (east), and W (west). The rover starts facing North. The input received by the rover is a string representing the sequence of commands it needs to execute.

The rover receives one string of commands. The commands are: "l" (left), "r" (right), "f" (forward), and "b" (backward). "l" and "r" change the rover's direction counter-clockwise and clockwise, respectively, but not its position. "f" and "b" move the rover 1 position on the grid towards the direction it is facing or away from it, respectively. The facing does not change. Since the planet is a sphere, the grid wraps around the edges. When the rover moves over the edges of the planet, it spawns on the opposite edges.

The planet (grid) may contain obstacles in cells. Obstacles are defined as a list of coordinates "(obs1_x,obs1_y)(obs2_x,obs2_y)...(obsN_x,obsN_y)". When the rover finds an obstacle during a tour, it skips the current command (i.e., does not move to the cell where the obstacle is located) and continues executing the remaining commands.

Upon processing the string of commands, the rover returns its position and facing in the format "(pos_x,pos_y,facing)". If obstacles are found, the output will be "(pos_x,pos_y,facing)(obs1_x,obs1_y)(obs2_x,obs2_y)..(obsN_x,obsN_y)". The same obstacle shall be reported only once. Obstacles are reported in the order they are found.

In this local project, `execute(null)` returns the rover's current output without moving or rotating, and unknown command characters are ignored.

**Examples:**

| Scenario on a 3 × 3 grid | Commands | Final output |
| --- | --- | --- |
| No obstacles | `ffrf` | `(1,2,E)` |
| No obstacles; wrap past the right edge | `ffrfff` | `(0,2,E)` |
| Obstacle at `(0,2)` | `ffrf` | `(1,1,E)(0,2)` |

Example of a rover's tour on a 3x3 planet in response to the command "ffrf". The starting position is (0,0) facing N(orth). After the 1st "f" (forward) command, the rover moves to position (0,1) facing North. Subsequent commands keep the rover moving. The expected output is (1,2,E).

If there were two more "f" in the command, the rover would move over the right edge and spawn on the left edge to the final position (0,2,E).

Example of a rover's tour on a 3x3 planet in response to the command "ffrf", with one obstacle in position (0,2). After the 1st "f" (forward) command, the rover moves to position (0,1) facing North. The 2nd "f" command does not change the rover's position, because there is an obstacle in (0,2). This second "f" command is thus skipped. The expected output is (1,1,E)(0,2).

Note that the API that you are testing does not have a graphical user interface. These examples are given to help you visualize the moves of the planet rover.

**Project Requirements**

- Req 1: The rover starts at position (0,0) facing North.
- Req 2: The rover can turn left and right.
- Req 3: The rover can move forward and backward.
- Req 4: Moving forward or backward changes position but does not change facing.
- Req 5: The planet grid wraps around at the edges.
- Req 6: Obstacles are provided as coordinate pairs.
- Req 7: If the rover moves into an obstacle, it stays in its current position.
- Req 8: After encountering an obstacle, the rover continues executing the remaining commands.
- Req 9: The same obstacle is reported only once.
- Req 10: Multiple encountered obstacles are reported in the order they are found.
- Req 11: The rover returns output in the required position/facing format, with encountered obstacles appended when applicable.
- Req 12: Null commands and unknown command characters should be handled according to the provided implementation.

**Submission**

Make sure your finished work is saved in `src/MarsRoverTest.java`. Submit the complete `MarsRover` project folder and video as instructed in the main assignment README.
