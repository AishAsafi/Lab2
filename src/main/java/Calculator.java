public class Calculator {

    public int [] CalArray = {2,4,6,8};

    public Calculator() {
    }

    public int addition (int x, int y){
        return x+y;
    }

    public int subtraktion (int x, int y){
        return x-y;
    }

    public int multiplikation(int x, int y){
        return x*y;
    }

    public double division (double x, double y){
        if (y == 0)
            throw new IllegalArgumentException("Cannot divide by zero");
        else
            return x/y;   }



    private int privateAdditionMethod(int a, int b){
        return a+b;
    }

    public int callPrivateMethod(int a, int b){
        return this.privateAdditionMethod(a , b);
    }

    public static boolean isEven(int a) {
        return a % 2 == 0;
    }
    public int[] getCalArray() {
        return CalArray;
    }

}
