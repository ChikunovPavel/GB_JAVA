package HomeWork.HomeWork5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
// Добавить функции
// 1) Добавление номера
// 2) Вывод всего

public class task1 {

    static Scanner sc = new Scanner(System.in,"cp866");
    
    
    public static void main(String[] args) {
        
        
        String [] name = new String []{"Иванов","Васильев","Петрова","Иванов","Петрова","Иванов"};
        Long [] number = new Long[]{89991235577l,89996578543l,89998761122l,89993218844l,89995671155l,899997652233l};
        Map<Long,String> map = new HashMap<>(); 
        has(map,name,number);
        
        
        
        
        System.out.println("Ввеcти данные: 1, Вывести данные:2, Закончить программу:3" );
        int flag = sc.nextInt();
        while(flag != 3){
            if(flag == 1){
                Scanner str = new Scanner(System.in,"cp866");
                System.out.println("Введите имя:");
                String nam = str.nextLine();
                System.out.println("Введите номер телефона:");
                long fone = sc.nextLong();
                map.putIfAbsent(fone, nam);
                System.out.println(map);
                
                System.out.println("Ввеcти данные: 1, Вывести данные:2, Закончить программу:3" );
                flag = sc.nextInt();
            }
        if(flag == 2){
            
            System.out.println("Вывеcти все данные: 5, Вывести данные по имени:6" );
            int flag2 = sc.nextInt();
            if(flag2 == 5){
                System.out.println(map);
                
            }    
            if(flag2 == 6){
                Wiev(map);
            }    
            else{
                System.out.println("Ввеcти данные: 1, Вывести данные:2, Закончить программу:3" );
                flag = sc.nextInt();
                
                
            }
        }
        }   
    }



    public static void has(Map<Long,String> map,String [] name,Long [] number) {
        for (int i = 0; i < name.length; i++) {
            map.put(number[i],name[i]);
        }
            
    }

    public static void Wiev(Map<Long,String> map) {
        Scanner s = new Scanner(System.in,"cp866");
        System.out.println("Введите имя");
        String nam = s.nextLine();
        
        for (var sort : map.entrySet()) {
            if(sort.getValue().equals(nam)){
                System.out.println(sort.getValue() + " " + sort.getKey());
                
            }
        }
        
    }
}

        
        
        
        
        
        
        
    
    
            
        


    

