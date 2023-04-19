import lists.MyArrayList;
import lists.MyLinkedList;
import lists.MyList;

public class Main {
    public static void main(String[] args) {

        MyList<String> myList = new MyArrayList<>();

        myList.add("Hello");
        myList.add("World");
        myList.add("!");

        System.out.println(myList.get(0));
        System.out.println(myList.get(1));
        System.out.println(myList.get(2));


        myList.remove(1);

        System.out.println(myList.get(0));
        System.out.println(myList.get(1));

        System.out.println(myList.size());

        myList.add("World", 1);
        System.out.println(myList.get(0));
        System.out.println(myList.get(1));
        System.out.println(myList.get(2));

        System.out.println(myList.remove("World"));
        System.out.println(myList.get(0));
        System.out.println(myList.get(1));
        System.out.println(myList.size());

        System.out.println(myList.indexOf("!"));
        System.out.println(myList.indexOf("Hello"));
        System.out.println(myList.indexOf("World"));

        myList.add("Hello");
        System.out.println(myList.lastIndexOf("Hello"));
        System.out.println(myList.lastIndexOf("World"));

        myList.add("World");
        myList.sort();
        System.out.println(myList.get(0));
        System.out.println(myList.get(1));
        System.out.println(myList.get(2));
        System.out.println(myList.get(3));
        System.out.println();
        System.out.println();


        MyLinkedList<String> list = new MyLinkedList<>();

        list.add("Nursultan");
        list.add("Askar");
        list.add("Dayana");

        System.out.println("List after adding 3 elements: " + list);

        System.out.println("List size: " + list.size());

        System.out.println("Element at index 0: " + list.get(0));

        list.remove(1);
        System.out.println("List after removing element at index 1: " + list);

        System.out.println("List contains Askar: " + list.contains("Askar"));
        System.out.println("List contains Nursultan: " + list.contains("Nursultan"));

        list.clear();
        System.out.println("List after clear method: " + list);

        list.add("Nursultan");
        list.add("Askar");
        list.add("Dayana");
        System.out.println("List before sort method: " + list);

        list.sort();
        System.out.println("List after sort method: " + list);



    }
}
