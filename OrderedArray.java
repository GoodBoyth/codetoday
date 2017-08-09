import java.io.Scanner;
public class OrderedArray
{
	public static void main(String[] args){
        OrderedArray oa = new OrderedArray(5);    
        Scanner sc = new Scanner(System.in);
        int num = sc.read
    }   
    
    private int[] arr;
    private int elements;
    private int size;
    public OrderedArray(int size){
        this.size = size;
        arr = new int[size];
    }
    public void add(int value){
        int j;
        for(j=0;j<elements;j++){
            if(value > arr[j])
                break;
        }
        for(int i = arr.length-1; i>j;i--){
            arr[i] = arr[i-1];
        }
        arr[j] = value;
        elements++;
    }
}