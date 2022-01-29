import java.util.ArrayList;
import java.util.List;

public class Compare {


    int noCount = 0;
    int strike = 0;
    int ball = 0;


    public Integer firstCompare(List<String> playerNum, List<String> comNum) {

        if (playerNum.get(0).equals(comNum.get(0))) {
            return strike++;
        }

        if (playerNum.get(0).equals(comNum.get(1))) {
            return ball++;
        }

        if (playerNum.get(0).equals(comNum.get(2))) {
            return ball++;
        }

        return noCount;
    }

    public Integer secondCompare(List<String> playerNum, List<String> comNum) {

        if (playerNum.get(1).equals(comNum.get(0))) {
            return ball++;
        }

        if (playerNum.get(1).equals(comNum.get(1))) {
            return strike++;
        }

        if (playerNum.get(1).equals(comNum.get(2))) {
            return ball++;
        }

        return noCount;
    }

    public Integer thirdCompare(List<String> playerNum, List<String> comNum) {

        if (playerNum.get(2).equals(comNum.get(0))) {
            return ball++;
        }

        if (playerNum.get(2).equals(comNum.get(1))) {
            return ball++;
        }

        if (playerNum.get(2).equals(comNum.get(2))) {
            return strike++;
        }

        return noCount;
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }

    public void ballCountPrint(){

        if(ball >= 1 && strike >= 1){
            System.out.println(ball + "볼 "+strike+"스트라이크");

        }

        if(ball >= 1 && strike == 0 ){
            System.out.println(ball +"볼");
        }

        if(strike >= 1 && ball == 0){
            System.out.println(strike +"스트라이크");
        }

    }
}

