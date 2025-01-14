package primeNumbers;

public class primeNumber {
    public static void main(String[] args) {


        for (int i = 2; i <= 100; i++) {
            String isPrimeOrNot = isPrime(i);
            System.out.println(isPrimeOrNot);
        }
    }

    public static String isPrime(int number) {
        if (number <= 1) {
            return number+" Not A Prime Number";
        }
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return number+" Not A Prime Number";
            }
        }

        return number+" It Is A Prime Number";
    }
}
