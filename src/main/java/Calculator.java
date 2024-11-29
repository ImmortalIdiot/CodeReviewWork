public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int dif(int a, int b) {
        return a - b;
    }

    public int div(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new IllegalArgumentException("You can't divide by zero");
        }
    }

    public int times(int a, int b) {
        return a * b;
    }

    public int solver(int a, int b, int c, int d) {
        return add(dif(times(a, b), div(c, d)), dif(a, d));
    }
}
