public class SelectionSort
{
	public static void sort(int[] arr){
		int k,tmp;
		for(int i=0 ; i<arr.length-1 ; i++){
			k = i;
			for(int j=i+1 ; j<arr.length ; j++){
				if(arr[k] > arr[j])
					k = j;
			}
			if(k != i){
				tmp = arr[i];
				arr[i] = arr[k];
				arr[k] = tmp;
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