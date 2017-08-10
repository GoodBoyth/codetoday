public class SingleDirList
{
	private Node first;
	private Node cur;
	public static void main(String[] args){
		SingleDirList sing = new SingleDirList();
		sing.insertLast(33);
		sing.insertLast(22);
		sing.insertLast(11);
		sing.insertLast(0);
		sing.insertLast(-11);
		sing.show();
	}

	public SingleDirList(){
		first = null;
		cur = null;
	}

	public boolean isEmpty(){
		return first == null;
	}

	public void insertLast(int data){
		Node node = new Node(data);
		if(isEmpty()){
			first = node;
			cur = first;
		}
		cur.next = node;
		cur = node;
	}
	public void show(){
		if(isEmpty())
			return;
		Node tmp = first;
		while(tmp != null){
			System.out.print(tmp.data+",");
			tmp = tmp.next;
		}
	}
}
class Node
{
	public int data;
	public Node next;
	public Node(){}
	public Node(int data){
		this.data = data;
	}
}