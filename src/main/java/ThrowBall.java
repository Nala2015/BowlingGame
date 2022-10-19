import static java.lang.Math.floor;
import static java.lang.Math.random;

public class ThrowBall {
    private int max = 10;
    private int min = 0;
    private int numberOfPins;
    private int newMax;

    public int throwFirstBall(){
        numberOfPins = (int) floor(random() * (max - min + 1) + min);
        if (numberOfPins != 10){
            newMax = 10-numberOfPins;
        }
        return numberOfPins;


    }

    public int throwSecondBall(){

        numberOfPins = (int) floor(random() * (newMax - min + 1) + min);
        return numberOfPins;

    }


}
