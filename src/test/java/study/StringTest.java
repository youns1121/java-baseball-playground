package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import sun.awt.HKSCS;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
    @DisplayName("인덱스 초과 예외발생 테스트")
    public void charAt2(){

        assertThatThrownBy(() -> {

            //given
            String str = "abc";
            char actual = ' ';

            //when
            actual = str.charAt(3);


            //then
            assertThat(actual).isEqualTo('c');

        }).isInstanceOf(IndexOutOfBoundsException.class);


    }


    public class SetTest {

        private Set<Integer> numbers;

        @BeforeEach
        void setUp() {
            numbers = new HashSet<>();
            numbers.add(1);
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
        }



        @Test
        @DisplayName("Set 사이즈 확인")
        public void checkSize() {

                //given
                ;//순서 없이 저장하고 , 객체 중복 허용 안함

                //when

                int size = numbers.size();


                //then

                assertThat(size).isEqualTo(3);
        }

        @ParameterizedTest
        @DisplayName("Set 내부 값의 존재 여부 확인 - 중복코드 제거")
        @ValueSource(ints = {1, 2, 3})
        void usingContains(int input) {

            //given


            //when

            //then
            assertTrue(numbers.contains(input));

        }

        @ParameterizedTest
        @CsvSource(value = {"1: true", "2: true", "3 : true", "4: false", "5: flase"}, delimiter = ':')
        @DisplayName("입력 값에 따라 결과 값이 다른 경우의 테스트")
        void differentReturn(int input, boolean expected){

            assertThat(numbers.contains(input)).isEqualTo(expected);
        }

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
