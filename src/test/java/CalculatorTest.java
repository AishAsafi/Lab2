import org.junit.jupiter.api.*;


class CalculatorTest {

    Calculator calculator;


    @BeforeEach
    public void beforeMethod(){

        calculator=new Calculator();
    }


    @Test
    @DisplayName("Testing add method ")
    void testAddition() {
        Assertions.assertEquals(40,calculator.addition(15,25));
    }

    @Test
    @DisplayName("Testing subtraction method ")
    void testSubtraktion() {
        Assertions.assertEquals(10,calculator.subtraktion(25,15));
    }

    @Test
    void testMultiplikation() {
        Assertions.assertEquals(50,calculator.multiplikation(5,10));
    }


    //@Test(expected = ArithmeticException.class) eller ska jag skriva så
    @Test
    void testDivision( ) {
        Assertions.assertThrows(ArithmeticException.class, ()-> calculator.division(50,0),"Error: divid by Zero" );



    }


    @AfterEach
    public void afterMethod(){

        System.out.println("Test is finished. ");
    }


    @Test
    void testingArraySize(){
        int [] Array_ny = {2,4,6,8};
        Assertions.assertArrayEquals(Array_ny, calculator.getCalArray());
    }

// De här är kvar
//@ParameterizedTest ---  ---- ordningen på hur tester körs ---  en metod ska vara private
}
