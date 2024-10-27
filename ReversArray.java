//Revers array


public class ReversAray{
	
	public static void main(String arge[]){
		
		int[]arr={1,2,3,4,5};
		
		int n=arr.length;
		for(int i=0;i<n/2;i++){
			int temp;
			temp=arr[i];
			arr[i]=arr[n-i-1];
			arr[n-i-1]=temp;
			
		}
		
		
		for(int j=0;j<arr.length;j++){
			System.out.println(arr[j]);
		}
	}
	
}
