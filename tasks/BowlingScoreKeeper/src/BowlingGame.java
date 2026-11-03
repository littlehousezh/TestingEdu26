import java.util.*;

public class BowlingGame {
    private List<Frame> frames = new ArrayList<>();
    private Frame bonus;
    private int frameCounter = 0;

    public void addFrame(Frame frame) {
        if (frameCounter < 10) {
            frames.add(frame);
            frameCounter = frameCounter + 1;
        }
    }

    public void setBonus(int firstThrow, int secondThrow) {
        this.bonus = new Frame(firstThrow, secondThrow);
    }

    public int score() {
        int totalScore = 0;

        for (int i = 0; i < frames.size(); i++) {
            Frame current = frames.get(i);
            totalScore = totalScore + current.getScore();

            if (current.isStrike()) {
                totalScore = totalScore + calculateStrikeBonus(i);
            } else if (current.isSpare()) {
                totalScore = totalScore + calculateSpareBonus(i);
            }
        }
        return totalScore;
    }

    private int calculateSpareBonus(int index) {
        if (index == 9) {
            if (bonus != null) {
                return bonus.getFirstThrow();
            }
            return 0;
        }

        if (index + 1 < frames.size()) {
            return frames.get(index + 1).getFirstThrow();
        }
        return 0;
    }

    private int calculateStrikeBonus(int index) {
        if (index == 9) {
            if (bonus != null) {
                return bonus.getScore();
            }
            return 0;
        }

        int bonusPins = 0;
        if (index + 1 < frames.size()) {
            Frame nextFrame = frames.get(index + 1);
            bonusPins = bonusPins + nextFrame.getFirstThrow();

            if (nextFrame.isStrike()) {
                if (index + 1 == 9) {
                    if (bonus != null) {
                        bonusPins = bonusPins + bonus.getFirstThrow();
                    }
                } else if (index + 2 < frames.size()) {
                    bonusPins = bonusPins + frames.get(index + 2).getFirstThrow();
                }
            } else {
                bonusPins = bonusPins + nextFrame.getSecondThrow();
            }
        }
        return bonusPins;
    }
}