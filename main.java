public class Main {
 
    
    public static void main(String[] args) {
        System.out.println(isPalindrome("Енот"));
        System.out.println(isPalindrome("тут"));
        for (int i = 0; i < 100; i++) {
            if (isPrime(i))
                System.out.println(i);
        }
    }