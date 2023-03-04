package HomeWork.HomeWork5;
// Пусть дан список сотрудников:

// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности Имени.

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class task2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> arr = new ArrayList<>();
        Map<String, String> name = new HashMap<>();
        Deque<String> arr1 = new LinkedList<>();
       

        Maper(name);
        Counter(name, list);
        Decoder(list, arr);
        System.out.println();
        System.out.println(arr);
        System.out.println();
        sort(arr,arr1);
        System.out.println(arr1);
        

    }

    public static void Maper(Map<String, String> name) {
        name.put("Иванов", "Иван");
        name.put("Петрова", "Светлана");// 1
        name.put("Белова", "Анна");// 3
        name.put("Мусина", "Анна");
        name.put("Крутова", "Анна");
        name.put("Юрин", "Иван");// 1
        name.put("Лыков", "Петр");// 2
        name.put("Чернов", "Мария");
        name.put("Чернышов", "Петр");
        name.put("Федорова", "Мария");// 4
        name.put("Светлова", "Мария");
        name.put("Савина", "Мария");
        System.out.println(name);

    }

    public static void Counter(Map<String, String> name, ArrayList<String> list) {
        for (var map : name.entrySet()) {
            list.add(map.getValue());
        }
        
    }
    
    public static void Decoder(ArrayList<String> list, ArrayList<String> arr) {
        int count = 0;
        int countMax = 0;
        for (int i = 0; i < list.size(); i++) {
            boolean f = arr.contains(list.get(i));

            if(f != true)
                arr.add(list.get(i));
                count = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    count++;
                    if(count > countMax);
                    countMax = count;
                }
            }
            if(f != true)
                 arr.add(countMax + " ");
        }
    }


      
    public static void sort (ArrayList<String> arr,Deque<String> arr1){
        int max = 0 ;
      
        for (int i = 1; i < arr.size(); i +=2) {
            try{
                String s = arr.get(i)  ;
                int it = Integer.parseInt(s.trim());
                
                Boolean isSorted = false;
                
                while(!isSorted){
                    isSorted = true;
                    // for (int j = 1; j < arr.size(); j +=2) {
                        String ss = arr.get(i+2)  ;
                        int its = Integer.parseInt(ss.trim());
                        System.out.println(its);
                        if(its > it){
                            
                            String temp = arr.get(i-1);
                            // System.out.println(temp);
                            arr1.addFirst(arr.get(i+1));
                            isSorted = false;
                            
                            
                        }
                            ss = arr.get(i)  ;
                            its = Integer.parseInt(ss.trim());
                }
        
            }
            catch (NumberFormatException nfe){
            System.out.println("NumberFormatException: " + nfe.getMessage());
            }
            
                
        }
    }
}

                            
                


                
                
                    
                    
                   
            
            


                
                
                
              
              
              
              
  
        
  
        
  
            
            
        
        

            
            
            
            


    
            
            
                
            
           
            
            
            
        
    

                    
                    

                
                

            
            
                    
                    
                
                
            // if (count > countMax) {
            //     countMax = count;
            //     if (arr.getFirst().equals(list.get(i))) {
            //         count = 0;
            //     } else {
            //         arr.addFirst(list.get(i));
            //         System.out.println(arr.getFirst());
            //         count = 0;
            //     }
                
            // }
            // if (count < countMax) {
            //     if (arr.getFirst().equals(list.get(i))) {
            //         count = 0;
            //     } 
            //     else {
            //         arr.addLast(list.get(i));
            //         System.out.println(arr.getLast());
            //         count = 0;
            //     }
            // }
            // // System.out.println(countMax);
            // System.out.println(countMax);
            // // count = 0;



            // public static void Decoder(ArrayList<String> list, Deque<String> arr) {
            //     int count = 0;
            //     int countMax = 0;
        
            //     for (int i = 0; i < list.size(); i++) {
            //         System.out.print(list.get(i));
                    
            //         arr.add(list.get(i));
                    
            //         count = 0;
            //         for (int j = 0; j < list.size(); j++) {
            //             if (list.get(i).equals(list.get(j))) {
            //                 count++;
            //                 if(count > countMax);
            //                 countMax = count;
            //             }
            //         }
            //         System.out.print(countMax + " ");
            //         arr.add(countMax + " ");
        
            //     }
            // }
        
