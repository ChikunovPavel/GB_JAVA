package HomeWork.HomeWork4;
import java.util.Deque;
import java.util.LinkedList;

// В калькулятор добавьте возможность отменить последнюю операцию.
// Пример:
//  1 + 2 ответ:3 + 4 ответ: 7 Отмена 3 * 3 ответ:9
import java.util.Scanner;
 
public class task3 {
    static Scanner scanner = new Scanner(System.in);
 
    public static void main(String[] args) {
     
    Deque <Integer> mem = new LinkedList<>();        
    int num1 = getInt();
    char operation = getOperation();
    int num2 = getInt();
    int result = calc(num1,operation,num2);
    mem.addFirst(result);
    System.out.println("Результат операции: " + mem.getFirst());   
    
    
    
    System.out.println("Продолжть:1 " +"Удалить:2 " +"Стоп:3");
    int flag = scanner.nextInt();
    while(flag != 3){
        
        if(flag == 1){
            num1 = mem.getFirst();
            operation = getOperation();
            num2 = getInt();
            result = calc(num1,operation,num2);
            mem.addFirst(result);
            System.out.println("Результат операции: " + mem.getFirst());
            System.out.println("Продолжть:1 " +"Удалить:2 " +"Стоп:3");
            flag = scanner.nextInt();
        }
        
        if(flag == 2){
            mem.remove(mem.getFirst());
            System.out.println("Результат операции: " + mem.getFirst());
            System.out.println("Продолжть:1 " +"Удалить:2 " +"Стоп:3");
            flag = scanner.nextInt();
        }
    }

}
 
    public static int getInt(){
        System.out.println("Введите число:");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();//рекурсия
            num = getInt();
        }
        return num;
    }
 
    public static char getOperation(){
        System.out.println("Введите операцию:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();//рекурсия
            operation = getOperation();
        }
        return operation;
    }
 
    public static int calc(int num1,char operation,int num2){
        int result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1,getOperation(), num2);//рекурсия
        }
        return result;
    }
}
                
                
                
                  

                

            
        
        
            
    

