package Collection.BaiTap;

public class MyListLinkedList {
    private class Node {
        private Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    private Node head;
    private int size = 0;

    public MyListLinkedList(Object data) {
        head = new Node(data);
    }

    public boolean addLast(Object data) {
        Node temp = head;
        for (int i = 0; temp.next != null; i++) {
            temp = temp.next;
        }
        temp.next = new Node(data);
        size++;
        return true;
    }

    public boolean addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        size++;
        return true;
    }

    public boolean add(int index, Object data) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        Node newNode = temp.next;
        newNode.next = holder;
        size++;
        return true;
    }

    public boolean remove(int index) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        assert holder != null;
        temp.next = holder.next;
        size--;
        return true;
    }

    public boolean remove(Object data) {
        Node temp = head;
        Node holder;
        for (int i = 0; temp.next != null; i++) {
            if (temp.next.data == data) {
                holder = temp.next.next;
                temp.next = holder;
                size--;
                return true;
            }
        }
        return false;
    }

    public int getSize() {
        return size;
    }

    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public Object cloneList() throws CloneNotSupportedException {
        Node temp = head;
        MyListLinkedList newList = new MyListLinkedList(head);
        Node writer = newList.head;
        for (int i = 0;temp.next != null; i++){
            writer.data = temp.data;
            writer.next = temp.next;
            writer = writer.next;
            temp = temp.next;
        }
        newList.size = size;
        return newList;
    }

    public boolean contains(Object o){
        Node temp = head;
        for (int i = 0; temp.next != null; i++){
            if (temp.data == o){
                return true;
            }else temp = temp.next;
        }
        return false;
    }

    public int indexOf(Object o){
        Node temp = head;
        for (int i = 1; temp.next != null; i++){
            if (temp.data == o){
                return i;
            }else temp = temp.next;
        }
        return -1;
    }
}
