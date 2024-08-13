public class sort_selection {
    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {7, 8, 3, 1, 2, 30, 1, 5};

        for(int i=0; i<arr.length-1; i++){
            int smallest = i;
            for(int j=i; j<arr.length; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
                int temp = arr[smallest];
                arr[smallest] = arr[i];
                arr[i] = temp;
            }
            printArray(arr);
        }
}
