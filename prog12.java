class MathOperations {

    int multiply(int a, int b) {
        return a * b;
    }

    int multiply(int a, int b, int c) {
        return a * b * c;
    }

    double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        MathOperations obj = new MathOperations();

        System.out.println(obj.multiply(3, 4));
        System.out.println(obj.multiply(2, 3, 4));
        System.out.println(obj.multiply(2.5, 4.0));
    }
}