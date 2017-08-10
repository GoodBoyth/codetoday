public class InsertSort
{
	public static void sort(int[] arr){
		int tmp,j;
		for(int i=1 ; i<arr.length ; i++){//从1开始的后面的元素遍历
			if(arr[i-1] > arr[i]){//如果前一个大于当前的i,则需要移动
				tmp = arr[i];//保存当前i中的值
				j = i;//保存当前i 的下标
				//开始移动
				while(j>0 && arr[j-1]>tmp){
					arr[j] = arr[j-1];
					j--;
				}
				arr[j] = tmp;
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