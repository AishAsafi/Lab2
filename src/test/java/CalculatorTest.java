import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CalculatorTest {

    Calculator calculator;


    @BeforeEach
    public void beforeMethod(){

        calculator=new Calculator();
    }


    @Test
    @Order(1)
    @DisplayName("Testing add method ")
        void testAddition() {
        Assertions.assertEquals(40,calculator.addition(20,20));
    }

    @Test
    @Order(2)
    @DisplayName("Testing subtraction method ")
    void testSubtraktion() {
        Assertions.assertEquals(10,calculator.subtraktion(25,15));
    }

    @Test
    @Order(3)
    @DisplayName("Testing multiplikation method ")
    void testMultiplikation() {
        Assertions.assertEquals(50,calculator.multiplikation(5,10));
    }


    @Test
    void testDivision( ) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calculator.division(4.0, 0.0);
        }, "Error :Division by 0 ");
    }


    @Test
    @DisplayName("Testing private method")
    void testingPrivateMethod(){
        Assertions.assertEquals(90, calculator.callPrivateMethod(20,70));
    }

    @ParameterizedTest
    @ValueSource(ints = {2,4,6,8,10})
    void isEvenReturnTrue(int a) {
        assertTrue(calculator.isEven(a));
    }


    @Test
    void testingArraySize(){
        int [] Array_ny = {2,4,6,8};
        Assertions.assertArrayEquals(Array_ny, calculator.getCalArray());
    }

    @AfterEach
    public void afterMethod(){

        System.out.println("Test is finished. ");
    }


}
