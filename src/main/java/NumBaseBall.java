import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class NumBaseBall {
    public static void main(String[] args) {

        List<Integer> gameNum = new ArrayList<>(3);


        Random random = new Random();

        for (int i= 0; i<3; i++){
             int randNum = random.nextInt((9 - 1) + 1) + 1;

             gameNum.add(randNum);
            System.out.println(gameNum.get(i));

        }
















    }


}
