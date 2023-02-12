package HomeWork.HomeWork1;
// Вывести все простые числа от 1 до 1000

public class task2 {
    
    public static void main(String[] args) {
        
        int begin = 1;
        int and  = 1000;

        for(int i = begin + 1; i < and; ++i){
            int count = 0;
            for(int j = 2; j <= i && count < 2;++j){
              if(i % j == 0){
                ++count;
              }
            }
            if(count<2)
               System.out.println(i);
          }

    }
}
