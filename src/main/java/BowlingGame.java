import java.util.ArrayList;

public class BowlingGame
{
    private BowlingFrame previousFrame;
    private int totalScore;

    private int firstRoll;
    private int secondRoll;

    private ThrowBall throwBall;

    public int playBowling() {
        BowlingFrame frame = new BowlingFrame();
        throwBall = new ThrowBall();
        firstRoll = throwBall.throwFirstBall();
        if (firstRoll != 10){
            secondRoll = throwBall.throwSecondBall();
            frame.setSecondRollResult(secondRoll);
        }
        frame.setFirstRollResult(firstRoll);
        totalScore += calculateScore(frame);
        previousFrame = frame;

        System.out.println("First roll: " + frame.getFirstRollResult());
        if (frame.getFirstRollResult() == 10)
            System.out.println("There was no second roll");
        else
            System.out.println("Second roll: " + (frame.getRollTotal() - frame.getFirstRollResult()));
        return frame.getStatus();


    }

    public int calculateScore(BowlingFrame frame){
        int status = frame.calculateStatus();
        int score = 0;
        if (status == BowlingFrame.OPEN){
            score = frame.getRollTotal();
        }
        else score += 10;
        if (previousFrame != null) {
        if (previousFrame.getStatus() == BowlingFrame.SPARE)
            score += frame.getFirstRollResult();

        if (previousFrame.getStatus() == BowlingFrame.STRIKE)
            score += frame.getRollTotal();
        }

        totalScore += score;
        return score;

    }

    public int getTotalScore(){
        return totalScore;
    }

    public void playTheWholeGame() {
        for (int i = 0; i < 10; i++) {

            int status = this.playBowling();
            System.out.println("Status is " + status);
            System.out.println(this.getTotalScore());
            System.out.println("-----------------");

        }

        System.out.println("FINAL SCORE IS:" + totalScore);
    }





    public static void main(String[] args)
    {
      BowlingGame bg = new BowlingGame();
      bg.playTheWholeGame();

    }










}
