public class Main {
public static void main(String[] args) {
//Задание 1
        System.out.println("Hello world!");
//Задание 2
        //Проверка на палиндром 1
        System.out.println(isPalindrome("Ежики"));
        //Проверка на палиндром 2
        System.out.println(isPalindrome("обобо"));
//Задание 3 
        for (int i = 0; i < 100; i++) {          
            if (isPrime(i))
                System.out.println(i);
        }}  
public static boolean isPalindrome(String string) {
        return new StringBuilder(string).reverse().toString().equals(string);
    }
public static boolean isPrime(final int num) {
        return num > 1 && IntStream.range(2, num).noneMatch(index -> num % index == 0);
    }}