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

    public double division (int x, int y){ return x/y;   }

    public int[] getCalArray() {
        return CalArray;
    }
}
