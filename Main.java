
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CustomArrayList customList = new CustomArrayList();


        customList.add(5);
        customList.add(10);
        customList.add(15);
        customList.add(20);


        System.out.println("Size of the list: " + customList.size());


        System.out.println("Is the list empty? " + customList.isEmpty());


        System.out.println("Element at index 2: " + customList.get(2));


        System.out.println("Does 15 exist in the list? " + customList.isln(15));
        System.out.println("Does 25 exist in the list? " + customList.isln(25));


        System.out.println("Index of element 10: " + customList.find(10));
        System.out.println("Index of element 25: " + customList.find(25));


        customList.remove(15);


        System.out.println("Size of the list after removal: " + customList.size());
    }
}