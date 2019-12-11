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



    private int privateAdditionMethod(int x, int y){
        return x+y;
    }

    public int callPrivateMethod(int x, int y){
        return this.privateAdditionMethod(x , y);
    }

    public static boolean isEven(int x) {
        return x % 2 == 0;
    }
    public int[] getCalArray() {
        return CalArray;
    }

}
