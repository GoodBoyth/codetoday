public class BubbleSort
{
	public static void sort(int[] arr){
		for(int i=0 ; i<arr.length-1 ; i++){
			for(int j=arr.length-1 ; j>i ; j--){
				int tmp;
				if(arr[j-1] > arr[j]){
					tmp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	public static void main(String[] args){
		int[] arr = {223,23,46,-23,22};
		sort(arr);
		for(int i=0 ; i<arr.length ; i++){
			System.out.print(arr[i]+",");
		}
	}
}