import java.util.ArrayList;

public class BowlingGame
{
    private ArrayList<BowlingFrame> frames = new ArrayList<>();
    private int totalScore;

    private int firstRoll;
    private int secondRoll;

    private ThrowBall throwBall = new ThrowBall();

    public int playBowling() {
        BowlingFrame frame = new BowlingFrame();
        firstRoll = throwBall.throwFirstBall();
        if (firstRoll != 10){
            secondRoll = throwBall.throwSecondBall();
            frame.setSecondRollResult(secondRoll);
        }
        frame.setFirstRollResult(firstRoll);
        totalScore += calculateScore(frame);
        frames.add(frame);
        return frame.getStatus();

    }
    /*
    maybe we don't need to store the whole list of frames, we could just store the previous one,
    and check the status of that one (if it is not null) when updating the score. Once the score is updated,
    we update the previous frame to be the one we just played? */

    public int calculateScore(BowlingFrame frame){
        int status = frame.calculateStatus();
        int score = 0;
        if (status == BowlingFrame.OPEN){
            score = frame.getRollTotal();
        }
        else score += 10;
        if (frames.size() > 0 && frames.size() < 10) {
        BowlingFrame frame2 = frames.get(frames.size()-1);
        if (frame2.getStatus() == BowlingFrame.SPARE)
            score += frame.getFirstRollResult();

        if (frame2.getStatus() == BowlingFrame.STRIKE)
            score += frame.getRollTotal();
        }

        totalScore += score;
        return score;

    }










}
