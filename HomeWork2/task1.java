package HomeWork.HomeWork2;


import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;

// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами), результат после каждой итерации запишите в лог-файл
public class task1{

    
    public static void main(String[] args)  throws IOException  {
        int [] array = new int [] {900, 800, 5, 1, 2, 300, -142, 123, 12, 32, -300, -400, -500};
        BubbleSort(array);
        String list = Arrays.toString(array) ;

        Logger logger = Logger.getLogger(task1.class.getName());
            
            FileHandler fh = new FileHandler("log.txt");
            
            logger.addHandler(fh);
            
            
            // XMLFormatter xml = new XMLFormatter();
            // fh.setFormatter(xml);

            SimpleFormatter sFormat = new SimpleFormatter ();
            fh.setFormatter(sFormat);

            
            logger.info(list);
                  
        
    }

    public static void ShowArray(int[] array) {
        for(int i = 0;i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


    public static void BubbleSort(int [] arr) {
        Boolean isSorted = false;

        while(!isSorted){
            isSorted = true;
            for (int i = 1; i < arr.length; i++) {
                if(arr[i] < arr[i - 1]){
    
                    int temp = arr[i];
                    arr[i] = arr[i -1];
                    arr [ i -1] = temp;
                    isSorted = false;
                    
                }
            }
        }
        ShowArray(arr);
    }
}

    
    
            
        
        
    
   
    
        
    
    
    
    
    
