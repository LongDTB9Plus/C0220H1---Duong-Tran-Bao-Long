package Collection.BaiTap;

import java.util.Arrays;

public class MyListArrayList<E> {
    int size = 0;

    public int getSize() {
        return size;
    }

    static final int DEFAULT_CAPACITY = 10;
    Object elements[];

    public MyListArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyListArrayList(int Capacity) {
        elements = new Object[Capacity];
    }

    void add(int index, E e) {
        for (int i = size; i > index; i--) {
            elements[size++] = elements[size];
        }
        elements[index] = e;
    }

    void remove(int index) {
        for (int i = index; i < size; i++) {
            elements[i] = elements[i++];
        }
    }

    @Override
    public Object[] clone() {
        Object[] cloned = new Object[size];
        for (Object i : elements
        ) {
            cloned[(int) i] = elements[(int) i];
        }
        return cloned;
    }

    boolean contain(E e) {
        for (int i = 0; i< elements.length; i++) {
            if ((elements[i] == e)) {
                return true;
            }
        }
        return false;
    }

    int indexOf(E e) {
        for (Object i : elements
        ) {
            if ((elements[(int) i]) == e) {
                return (int) i;
            }
        }
        return -1;
    }

    void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    boolean add(E e) {
        if (size == elements.length) {
            ensureCapacity();
        }
        if (this.contain(e)) {
            elements[size++] = e;
            return true;
        } else {
            elements[size++] = e;
            return false;
        }
    }

    E get(int index){
        if ( index > size || index < 0){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index );
        }
        return (E) elements[index];
    }

    void clear(){
        size = 0;
        Arrays.fill(elements, null);
    }

    void display(){
        for (int i = 0; i< elements.length;i++){
            System.out.printf("\nPostion Index: %d \t Value: %s",i,elements[i]);
        }
    }

    public static void main(String[] args) {
        MyListArrayList<Integer> myListArrayList = new MyListArrayList<Integer>();
        boolean add = myListArrayList.add(12);
        myListArrayList.add(11);
        myListArrayList.add(0,20);
        myListArrayList.display();
        System.out.println(myListArrayList.contain(20));
        myListArrayList.clear();
        myListArrayList.display();
    }
}

