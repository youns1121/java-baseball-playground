package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @DisplayName("요구사항1")
    @Test
    public void split(){
        
        //given
        String str1 = "1,2";
        String str2 = "1";

        //when
        String[] strArray1 = str1.split(",");
        String[] strArray2 = str2.split(",");
        
        //then

        assertThat(strArray1).contains("2","1"); //순서 상관없이 포함
        assertThat(strArray1).containsExactly( "1", "2"); // 포함에 순서 관련 있음
        //assertThat(strArray1).containsExactly("2", "1"); // 포함에 순서 관련 있음, <- 에러


        assertThat(strArray2).contains("1");
        assertThat(strArray2).containsExactly("1");
        
    }

    @Test
    @DisplayName("요구사항2")
    public void substring(){

        //given
        String str = "(1,2)";


        //when
        str = str.substring(1);
        str = str.substring(0, 3);
        System.out.println(str);


        //then
        assertThat(str).isEqualTo("1,2");
    }

    @Test
    @DisplayName("요구사항3: 인덱스 2번째 값과 동일 여부")
    public void charAt(){

        //given
        String str = "abc";
        char actual = ' ';

        //when
        actual = str.charAt(2);

        //then
        assertThat(actual).isEqualTo('c');

    }

    @Test
    @DisplayName("요구사항3: 인덱스 3번째 값과 동일 여부")
    public void charAt2(){

        //given
        String str = "abc";
        char actual = ' ';

        //when
        actual = str.charAt(3);

        //then
        assertThat(actual).isEqualTo('c');

    }







    

    

    @Test
    void Req_1(){
        String actual = "1,2".replace(",", " ");
        assertThat(actual).contains("1", "2");
    }

    @Test
    void Req_2(){
        String actual = "(1,2)".substring(1);
        assertThat(actual).contains("1", "2");
    }
}
