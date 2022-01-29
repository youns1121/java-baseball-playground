import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Computer {

    public Integer randomMaker(){
        Random random = new Random();
        return random.nextInt(9)+1;



    }

    public List<String> createNumber(){

        List<String> comNumber = new ArrayList<>();

        while (comNumber.size() != 3){
            String randNum = String.valueOf(randomMaker());
            if (comNumber.contains(randNum)){
                continue;
            }
            comNumber.add(randNum);
        }

        return comNumber;
    }

}
