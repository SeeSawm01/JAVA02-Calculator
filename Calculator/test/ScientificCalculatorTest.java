import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;



class ScientificCalculatorTest {

    ScientificCalculator sciCalc;  // 클래스 레벨로 선언

    @BeforeEach
    void setUp() {
        sciCalc = new ScientificCalculator();
        sciCalc.setNumbers(3, 2);  // 기본값: 3^2 테스트용
    }

    @Test
    void power() {
        assertEquals(9, sciCalc.power());
    }

    @Test
    void sqrt() {
        sciCalc.setNumbers(9, 0);  // sqrt 테스트용
        assertEquals(3.0, sciCalc.sqrt(), 1e-9); //num2 는 없기 때문에 이렇게 생성
    }
}