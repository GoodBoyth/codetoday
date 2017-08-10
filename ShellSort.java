public class ShellSort
{
	public static void sort1(int[] arr){
		int length = arr.length;
		int group;
		int step = 2;

		int tmp;
		int pos;

		//分组
		for(group=length/step ; group>0 ; group/=step){
			//遍历每个组
			for(int i=0 ; i<group ; i++){
				//遍历组中的数据
				for(int j=i+group ; j<length ; j+=group){
					if(arr[j-group] > arr[j]){
						tmp = arr[j];
						pos = j-group;
						while(pos>=0 && arr[pos]>tmp){
							arr[pos+group] = arr[pos];
							pos -= group;
						}
						arr[pos+group] = tmp;
					}
				}
			}
		}
	}

	public static void sort2(int[] arr){
		int length = arr.length;
		int step = 1;
		int group;
		int tmp;
		int pos;
		while(step <= length/3){
			step = step*3+1;
		}

		while(step > 0){
			for(group=step ; group<length ; group++){
				tmp = arr[group];
				pos = group;
				while(pos>step-1 && arr[pos-step]>=tmp){
					arr[pos] = arr[pos-step];
					pos -= step;
				}
				arr[pos] = tmp;
			}
			step = (step-1)/3;
		}
	}

	public static void main(String[] args){
		int[] arr = {223,23,46,-23,22};
		sort2(arr);
		for(int i=0 ; i<arr.length ; i++){
			System.out.print(arr[i]+",");
		}
	}
}