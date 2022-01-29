import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {

    public List<String> createNumber() {

        List<String> playerNumber = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력해 주세요 : ");
        String playerInput = scanner.next();


        for(int i = 0; i<playerInput.length();i++) {
            playerNumber.add(String.valueOf(playerInput.charAt(i)));
        }

        return playerNumber;
    }
}
