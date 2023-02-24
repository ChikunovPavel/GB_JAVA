package HomeWork.HomeWork3;
// Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;
import java.util.Random;

public class task {
    public static void main(String[] args) {
        int size = 10;
        ArrayList <Integer> list= new ArrayList<>();
        CreateRandom(size,list);
        ShowArray(list);
        Remove(list);
        ShowArray(list);
    }
        
    public static void CreateRandom(int size,ArrayList <Integer> array) {
        Random num = new Random();
        for(int i = 0; i < size; i++){
            array.add(num.nextInt(1,100));
        }
    
    }
    
    public static void ShowArray(ArrayList <Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i)+ " ");
        }
        System.out.println();
    }
        
    public static void Remove(ArrayList <Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            if(array.get(i) % 2 == 0){
                array.remove(i);
                i--;
            }
        }
    }
}
        
                
            
                
                
                

       
       
        
            
                
            



            

        
        
            
        
    

    
        
            
        










