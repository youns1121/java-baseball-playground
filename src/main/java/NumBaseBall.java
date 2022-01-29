import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class NumBaseBall {
    public static void main(String[] args) {

        Player player = new Player();
        Computer computer = new Computer();

        List<String> comNumber = computer.createNumber();

        int gameCount = 0;







        while(gameCount != 2) {
            Compare compare = new Compare();

            List<String> playerNumber = player.createNumber();

            compare.firstCompare(playerNumber, comNumber);
            compare.secondCompare(playerNumber, comNumber);
            compare.thirdCompare(playerNumber, comNumber);

            System.out.println(playerNumber+", "+comNumber);

            compare.ballCountPrint();

            if(compare.getStrike() == 3) {
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
                Scanner scanner = new Scanner(System.in);
                gameCount = scanner.nextInt();
            }

            if(gameCount == 1){
                continue;
            }

            if(gameCount == 2){
                break;
            }





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




