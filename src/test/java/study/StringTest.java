package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void Req_1(){
        String actual = "1,2".replace(",", " ");
        assertThat(actual).contains("1", "2");
    }

//    @Test
//    void Req_2(){
//        String actual = "(1,2)".substring(1);
//        assertThat(actual).contains("1", "2");
//    }
}
