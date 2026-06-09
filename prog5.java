class OverloadDemo {
    void display(int a) {
        System.out.println("Integer: " + a);
    }

    void display(double a) {
        System.out.println("Double: " + a);
    }

    void display(String a) {
        System.out.println("String: " + a);
    }

    public static void main(String[] args) {
        OverloadDemo obj = new OverloadDemo();

        obj.display(10);
        obj.display(10.5);
        obj.display("Java");
    }
}