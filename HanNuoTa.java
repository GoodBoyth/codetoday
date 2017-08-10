public class HanNuoTa
{
	public static void han(int num,char a,char b,char c){
		if(num == 1){
			System.out.printf("\nmove %d from %c to %c",1,a,c);
		}else{
			han(num-1,a,c,b);
			System.out.printf("\nmove %d from %c to %c",num,a,c);
			han(num-1,b,a,c);
		}
	}
	public static void main(String[] args){
		han(3,'a','b','c');
	}
}