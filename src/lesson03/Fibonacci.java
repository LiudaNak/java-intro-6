package lesson03;

public class Fibonacci {

    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();
        int b = 10; // оголошую кількість чисел, що будуть виведені

            if (b < 0) {
                System.out.println("Please enter a positive number more than 0");
            }
               else if (b== 0) {
                System.out.println("Please enter a positive number more than 0");
            }
                else
                for (int i : fib.printFibonacciNumbers(b)){ // виводжу масив, який отримала з метода
                    System.out.println(i);
            }
        }

        int[] printFibonacciNumbers(int n){
        int[] arr = new int[n];
            int f = 1;
            int f1 = 1;
            int f2;
            arr[0] = f;
            arr[1] = f1;
            for (int i = 2; i <= n-1; i++) {
                f2 = f + f1;
                arr[i]=f2;
                f = f1;
                f1 = f2; //ідею циклу таки дивилась в інтернеті :(
            }
            return arr; // отримала масив. Sout виводити значно легше...
        }
    }
