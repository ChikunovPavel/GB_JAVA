package HomeWork.HomeWork1;
import java.util.Scanner;

// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)

// Первое треугольное число = 1
// Второе 1+2 = 3
// Третье 3+3 = 6
// Четвертое 6+4=10
// Пятое 10+5 = 15

// (n! = n*(n-1)!) факториал
public class task1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число n:");
        int num = sc.nextInt();
        sc.close();

        triangle(num);
        getFactorial(num);
    }

    public static void triangle (int number) { // метод на поиск Треугольного числа
        int sum = 0;
        System.out.print("Треугольноe число:");
        for(int i =1; i <= number; i ++){
            sum+=i;
        System.out.print(sum + " ");
        
    }
    System.out.println();
        
    }

    public static void getFactorial(int number) { // метод на поиск Факториала
        int result = 1;
        System.out.print("Факториал:");
        for (int i = 1; i <= number; i++) {
           result *= i;
           System.out.print(result + " ");   
        }
    }

    
}
