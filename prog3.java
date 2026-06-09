class FinalVariable {
    public static void main(String[] args) {
        final int MAX = 100;

        System.out.println("Maximum Value = " + MAX);

        // MAX = 200;  // Error: cannot change final variable
    }
}