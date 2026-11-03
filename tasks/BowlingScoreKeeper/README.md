Bowling Scorekeeper
===

The objective is to TEST an application that can calculate the score of a single bowling game.

- There is no graphical user interface.
- You work ONLY with JUnit test cases in this project.
- You ONLY edit `FrameTest.java` and `BowlingGameTest.java`.
- Do not modify `Frame.java` or `BowlingGame.java`.
- You have ONE HOUR to work on this project (if needed, you may exceed this limit by up to 20%).
- You are free to consult/use any online resources, including documentations, tutorials, Q&A sites, and any IntelliJ IDEA built-in tools or plug-ins.

**Project Template**

You are provided with a completed project that contains two implementation classes: `Frame` and `BowlingGame`, and two starter test classes: `FrameTest` and `BowlingGameTest`. DO NOT CHANGE the names and functionalities of the existing fields and methods.

You are expected to create JUnit test cases to verify the behavior of this implementation as thoroughly as possible based on the following description of a bowling score keeper.

Do not write tests that are not present in `Frame.java` or `BowlingGame.java`.

**Bowling Score Keeper Task Description**

The game consists of 10 frames as shown in the example below. In each frame, the player has two opportunities to knock down 10 pins. The score for the frame is the total number of pins knocked down, plus bonuses for strikes and spares.

| Frame | Throws | Frame score with bonuses | Cumulative score |
| --- | --- | --- | --- |
| 1 | 1, 4 | 5 | 5 |
| 2 | 4, 5 | 9 | 14 |
| 3 | 6, 4 (spare) | 15 | 29 |
| 4 | 5, 5 (spare) | 20 | 49 |
| 5 | 10 (strike) | 11 | 60 |
| 6 | 0, 1 | 1 | 61 |
| 7 | 7, 3 (spare) | 16 | 77 |
| 8 | 6, 4 (spare) | 20 | 97 |
| 9 | 10 (strike) | 20 | 117 |
| 10 | 2, 8 (spare), bonus 6 | 16 | 133 |

A spare is when the player knocks down all 10 pins in two throws. The bonus for that frame is the number of pins knocked down by the next throw. So in frame 3 of the example game above, the score is 10 (the total number knocked down) plus a bonus of 5 (the number of pins knocked down on the next throw).

A strike is when the player knocks down all 10 pins on the first try. The bonus for that frame is the value of the next two throws.

In the tenth frame, a player who rolls a spare or strike is allowed to have bonus throws to complete the frame. However, no more than three balls can be rolled in the tenth frame.

**Additional resources**

The original instructions referred to detailed bowling scoring rules and an online score calculator. External links have been removed from this archival copy.

**Project Requirements**

- Req 1: A frame consists of two throws.
- Req 2: For this task, tests should use valid bowling values for the first throw, normally ranging from 0 to 10.
- Req 3: For this task, tests should use valid bowling values for the second throw, normally ranging from 0 to 10.
- Req 4: The score of a non-bonus frame is the sum of two throws.
- Req 5: A frame is a *strike* if the first throw is 10 points.
- Req 6: A strike frame receives bonus score of the value of the next two throws.
- Req 7: A frame is a *spare* if its score is 10 and it is not a strike.
- Req 8: A spare frame receives bonus score of the value of the next throw.
- Req 9: A complete bowling game consists of ten frames; this implementation accepts up to ten frames.
- Req 10: The score of a game is the sum of all frames and applicable bonuses.
- Req 11: If the tenth frame is a spare, there is one bonus throw.
- Req 12: If the tenth frame is a strike, there are two bonus throws.
- Req 13: The bonus throw(s) are added to the game score.

**Submission**

Make sure your finished work is saved in `src/FrameTest.java` and `src/BowlingGameTest.java`. Submit the complete `BowlingScoreKeeper` project folder and video as instructed in the main assignment README.
