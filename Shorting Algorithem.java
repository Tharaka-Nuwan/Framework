//Sorting algorithem


public class Javaparctice{
    public static void main(String arge[]){
        
        int[] arr={20,10,40,30,60,50,70,90};
        
        for(int i=0;i<arr.length - 1;i++){
            for(int j=i+1;j<arr.length;j++){
                int temp;
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        
        for(int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }
    }
}