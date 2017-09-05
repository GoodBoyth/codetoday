import java.util.Stack;

public class AboutLinkList {
    public static void main(String[] args){
        AboutLinkList.LinkList linkList = new AboutLinkList().new LinkList();
        linkList.hashDelNode(5);
        linkList.hashDelNode(3);
        linkList.hashDelNode(4);
        linkList.trace();
    }

    class LinkList
    {
        Node n1;
        Node n2;
        Node n3;
        Node n4;
        private Node head;
        private int len = 7;
        private Node[] hash;
        public LinkList(){
            head = new Node(5);
            n1 = new Node(2);
            n2 = new Node(1);
            n3 = new Node(4);
            n4 = new Node(3);
            head.next = n1;
            n1.next = n2;
            n2.next = n3;
            n3.next = n4;
            n4.next = null;
            hash = new Node[len];
            prepareHashDelNode();
        }

        //正向遍历链表
        public void trace(){
            System.out.println("trace link!");
            Node cur = head;
            while(cur != null){
                System.out.print(cur.data+",");
                cur = cur.next;
            }
            System.out.println();
        }

        //反向遍历链表
        public void backTrace(){
            System.out.println("back trace link!");
            Stack<Node> stack = new Stack<>();
            Node cur = head;
            while (cur != null){
                stack.push(cur);
                cur = cur.next;
            }
            Node del;
            while(!stack.isEmpty()){
                del = stack.pop();
                System.out.print(del.data+",");
            }
            System.out.println();
        }

        //先对链表hash
        public void prepareHashDelNode(){
            Node last = head;
            Node cur = last.next;
            while(cur != null){
                hash[cur.data] = last;
                last = cur;
                cur = cur.next;
            }
        }
        // hash 删除节点
        public boolean hashDelNode(int data){
            if(data == head.data){//删除头节点
                hash[head.next.data] = null;
                head = head.next;
                return true;
            }else if(data!=head.data && hash[data]==null){
                System.out.println("no such node!");
                return false;
            }
            Node delPre = hash[data];
            //如果是删除最后一个节点
            if(delPre.next.next == null){
                delPre.next = null;
                hash[data] = null;
            }else{//不是最后一个节点
                hash[delPre.next.next.data] = delPre;
                delPre.next = delPre.next.next;
                hash[data] = null;
            }

            //打印hash 数组验证
            for(int i=0 ; i<hash.length ; i++){
                System.out.print("index:"+i);
                if(hash[i] != null){
                    System.out.print("==>"+hash[i].data);
                }
                System.out.println();
            }
            return true;
        }
    }

    
    class Node
    {
        int data;
        Node next;
        public Node(){}
        public Node(int data){this.data = data;}
    }
}
