class Printer {

    void print(int num) {
        System.out.println("Integer: " + num);
    }

    void print(String str) {
        System.out.println("String: " + str);
    }

    void print(int[] arr) {
        System.out.print("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Printer p = new Printer();

        p.print(100);
        p.print("Hello Java");

        int[] numbers = {10, 20, 30, 40, 50};
        p.print(numbers);
    }
}