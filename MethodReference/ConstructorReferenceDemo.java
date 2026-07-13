package MethodReference;

public class ConstructorReferenceDemo {

    public static void main(String[] args) {

        PrimeCheck obj = PrimeNumber::new;

        obj.check(17);
        obj.check(20);
        obj.check(29);
        obj.check(100);
    }
}