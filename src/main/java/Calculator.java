public class Calculator {
    public int add(int a, int b){
        return a + b;
    }
    public int dif(int a, int b){
        return a - b;
    }
    public int div(int a, int b){
        if (b == 0) {
            return 0;
        }
        else {
            return a / b;
        }
    }
    public int times(int a, int b){
        return a * b;
    }
    public int solver(int a, int b, int c, int d){
        //My equation: ((a * b) - (a + c)) / d
        return div(dif(times(a, b), add(a, c)), d);
    }
}
