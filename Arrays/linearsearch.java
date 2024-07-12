package DSAarray;

public class linearsearch {

    public static int lsearch(int numbers[] , int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){ // if i is written then i is considered as counter. numbers[i] indicates number present at i index
                return i;
            }
        }
        return -1; //if not found


    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14,16,18,20};
        int key = 10;//output -> Key is at index 4

        int index = lsearch(numbers, key);
        if(index==-1){
            System.out.println("Element not found");
        }else{
            System.out.println("Key is at index "+ index);
        }
   
    }

}

// package DSAarray; 
//LINEAR SEARCH IN CASE OF STRINGS

// public class fruits {
//     public static int linearsearch(String fruit[] , String key){
//         for(int i=0;i<fruit.length;i++){
//             if(fruit[i]==key){
//                 return i;
//             }

//         }
//         return -1;

//     }
//     public static void main(String[] args){
//         String fruit[] = {"apple","mango","litchi","amla","guava","banana","avocado"};
//         String key = "amla";

//         int index = linearsearch(fruit, key);
//         if(index== -1){
//             System.out.println(key + "is not present");
//         }else{
//             System.out.println(key+"is at index "+index);
//         }
//     }
// }

