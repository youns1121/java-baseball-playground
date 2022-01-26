package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

public class BaseBallTest {


    public class Player {

        public List<Integer> createNumber() {
            int count = 0;

            List<Integer> input = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);

                input.add(1);
                input.add(4);
                input.add(6);


            return input;
        }
    }



    @Test
    @DisplayName("플레이어 숫자 하드 코딩 비교 테스트")
    public void playerNumber(){

        //given
            Player player = new Player();

        //when

         List<Integer> num = player.createNumber();

        //then
        assertThat(num).hasSize(3);

    }


}
