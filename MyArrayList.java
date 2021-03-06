import java.util.Arrays;

public class MyArrayList<E> {

	private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyArrayList() {
    	elements = new Object[DEFAULT_CAPACITY];
    }



	private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }


    public void add(E e) {
    	if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = e;
    }

	@SuppressWarnings("unchecked")
    public E get(int i) {
    	if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }

	public static void main(String[] args) {

		MyArrayList myList = new MyArrayList();

        for (int i=10; i<21; i++) {
            myList.add(i);
        }


        for (int i=0; i<=10; i++) {
            System.out.println("myList["+i+"] = " + myList.get(i));
        }

	}

}