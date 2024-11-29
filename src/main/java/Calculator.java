public class Calculator {

    /** Adds two integers and returns the result.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the sum of a and b
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts the second integer from the first and returns the result.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the result of a - b
     */
    public int dif(int a, int b) {
        return a - b;
    }

    /**
     * Divides the first integer by the second and returns the result.
     *
     * @param a the dividend (numerator)
     * @param b the divisor (denominator)
     * @return the result of a / b
     * @throws IllegalArgumentException if b is 0, as division by zero is not allowed
     */
    public int div(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new IllegalArgumentException("You can't divide by zero");
        }
    }

    /**
     * Multiplies two integers and returns the result.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the product of a and b
     */
    public int times(int a, int b) {
        return a * b;
    }

    /**
     * Solves a mathematical expression using the provided methods.<p>
     * The expression solved is: (a * b - c / d) + (a - d)
     *
     * @param a the first integer
     * @param b the second integer
     * @param c the third integer (numerator in division)
     * @param d the fourth integer (denominator in division)
     * @return the result of the mathematical expression
     * @throws IllegalArgumentException if d is 0 (division by zero is not allowed)
     */
    public int solver(int a, int b, int c, int d) {
        return add(dif(times(a, b), div(c, d)), dif(a, d));
    }
}
