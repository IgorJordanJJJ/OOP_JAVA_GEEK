
public class main {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();
        
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(6);
        
        System.out.println("Size of the list: " + list.size());
        
        System.out.println("Iterating over the list:");
        for (int value : list) {
            System.out.println(value);
        }
        
        list.remove(2);
        
        System.out.println("Size of the list after removing 2: " + list.size());
        
        System.out.println("Iterating over the list:");
        for (int value : list) {
            System.out.println(value);
        }
        list.remove(6);
        
        System.out.println("Size of the list after removing 6: " + list.size());
        
        System.out.println("Iterating over the list:");
        for (int value : list) {
            System.out.println(value);
        }
    }
}
