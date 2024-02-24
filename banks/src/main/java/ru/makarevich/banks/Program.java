package ru.makarevich.banks;

public class Program {
    public static void main(String[] args) {
        try {
            Bank test = new Bank("A");
            System.out.println("Hello from " + test.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
