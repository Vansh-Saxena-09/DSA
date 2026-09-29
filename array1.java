import java.util.*;

public class pali{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            System.out.println("Enter the element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the operation you want to perform: ");
        System.out.println("1. Insert");
        System.out.println("2. Delete");
        System.out.println("3. Update");
        System.out.println("4. Search");
        System.out.println("5. Display");
        int operation = sc.nextInt();
        switch(operation){
            case 1:
                System.out.println("Enter the element to insert: ");
                int insert = sc.nextInt();
                arr[size] = insert;
                size++;
                break;
            case 2:
                System.out.println("Enter the element to delete: ");
                int delete = sc.nextInt();
                for(int i = 0; i < size; i++){
                    if(arr[i] == delete){
                        for(int j = i; j < size - 1; j++){
                            arr[j] = arr[j + 1];
                        }
                        size--;
                        break;
                    }
                }
                break;
            case 3:
                System.out.println("Enter the element to update: ");
                int update = sc.nextInt();
                System.out.println("Enter the new element: ");
                int newElement = sc.nextInt();
                for(int i = 0; i < size; i++){
                    if(arr[i] == update){
                        arr[i] = newElement;
                        break;
                    }
                }
                break;
            case 4:
                System.out.println("Enter the element to search: ");
                int search = sc.nextInt();
                for(int i = 0; i < size; i++){
                    if(arr[i] == search){
                        System.out.println("Element found at index " + i);
                        break;
                    }
                }
                break;
            case 5:
                for(int i = 0; i < size; i++){
                    System.out.print(arr[i] + " ");
                }
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
    }
}
