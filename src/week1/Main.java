package week1;

class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static void getNewNumber(int d) // extends RuntimeException extends Exception
    {
        if (d < 0) {
            throw new IllegalArgumentException("Negative numbers are restricted!");
        }

        new NegativeNumberException("Negative numbers are restricted!");
        // how to print exception and do not stop program: DKA

    }

    public static class NegativeNumberException extends Exception {
        public NegativeNumberException(){};

        public NegativeNumberException(String message) {
            super(message);
        }
    }
}