package HomeWork.HomeWork3;
// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка

import java.util.ArrayList;
import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        int size = 10;
        ArrayList<Integer> list = new ArrayList<>();
        CreateRandom(size,list);
        ShowArray(list);
        Finish(list);
        

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

    public static void Finish(ArrayList <Integer> array) {
        int min = 100;
        int max = 0;
        int mean = 0;
        int count = 0;
        for (int i = 0; i < array.size(); i++) {
            mean += array.get(i);
            if(array.get(i) < min){
                min = array.get(i);  
            }
            if(array.get(i) > max){
                max = array.get(i);  
            }
            count ++;
        }
        System.out.println("min: " + min);   
        System.out.println("max: " + max);  
        mean = mean / count; 
        System.out.println("mean: " + mean);
    }
}
            
        


        



    
