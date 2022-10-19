public class BowlingFrame {

    private int firstRollResult;
    private int secondRollResult;

    public final static int OPEN = 1;
    public final static int SPARE = 2;
    public final static int STRIKE = 3;

    private int status = OPEN;

    public int calculateStatus(){
        if (firstRollResult == 10){
            status = STRIKE;
        }
        else if (secondRollResult + firstRollResult == 10){
            status = SPARE;
        }
        else {
            status = OPEN;
        }

        return status;

    }

    public int getStatus() {
        return status;
    }

    public int getRollTotal(){
        return firstRollResult + secondRollResult;
    }

    public void setFirstRollResult(int firstRollResult) {
        this.firstRollResult = firstRollResult;
    }

    public void setSecondRollResult(int secondRollResult) {
        this.secondRollResult = secondRollResult;
    }

    public int getFirstRollResult(){
        return firstRollResult;
    }
}
