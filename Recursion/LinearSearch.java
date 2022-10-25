import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr= {45,87,12,12,12, 49,95,67};
        int target=12;

        // RETURNING AN ARRAY OF INDICES CORRESPONDING TO THE TARGET ELEMENT
        ArrayList <Integer> indexList = new ArrayList<Integer>();
        System.out.println(indices(arr, target, 0, indexList ));

        // RETURNING THE FIRST INDEX OF THE RESPECTIVE ELEMENT
        System.out.println(linear(arr, target, 0));

    }

    public static int linear(int[] arr, int target, int index){
        if (index== arr.length-1){
            return -1;
        }

        if (arr[index]== target){
            return index;
        }

        return linear(arr, target, index+1);
    }

    public static ArrayList<Integer> indices(int[] arr, int target, int index, ArrayList<Integer> list){
        if (index== arr.length-1){
            return list;
        }

        if (arr[index]== target){
            list.add(index);
        }

        return indices( arr, target, index+1, list);
    }


}
