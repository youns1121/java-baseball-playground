import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumBaseBall {
    public static void main(String[] args) {

        List<String> gameNum = new ArrayList<>(3);
        List<String> playerNum = new ArrayList<>(3);
        Random random = new Random();
        int strike = 0;
        int ball = 0;

        //숫자 야구 숫자 생성
        for (int i = 0; i < 3; i++) {
            int randNum = random.nextInt((9 - 1) + 1) + 1;

            gameNum.add(String.valueOf(randNum));


            if ((gameNum.size() >= 2) && (gameNum.get(i-1).equals(gameNum.get(i)))) {
                gameNum.remove(i);
                i--;

            }


            System.out.println(gameNum);

        }
    }
}





//        Scanner scanner = new Scanner(System.in);
//        System.out.print("숫자를 입력해 주세요: ");
//        String num = scanner.next();
//
//        for (int i = 0; i< playerNum.length; i++){
//            playerNum[i] = String.valueOf(num.charAt(i));
//            System.out.print(playerNum[i]);
//        }
//
//        //게임 숫자와 사용자 숫자 입력값 비교
//        for(int i = 0; i< gameNum.length; i++){
//            if(playerNum[i].equals(gameNum[i])){
//                strike++;
//            }
//            return strike;
//        }
//
//        for (int i=0; i< gameNum.length; i++){
//            if(playerNum[0].equals(i+1)){
//                ball++;
//            }


//




