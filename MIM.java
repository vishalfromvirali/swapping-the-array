import java.util.*;
class MIM{
    public static void main(String []args){
        int[] numbers={3,31,233,1,2,1,36,58,24};
        
        int temp;
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]>numbers[j]){
                    temp=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=temp;


                }
            }
            System.out.println(numbers[i]);
        }
    }
} 