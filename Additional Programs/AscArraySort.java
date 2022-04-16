class Main {
    public static void main(String args[]) {
        int [] arr = new int[]{8, 3, 5, 9, 4, 1, 6};
        int temp;
        
        System.out.println("Unsorted Array: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        
        System.out.println();
        
        System.out.println("Sorted Array (Ascending order): ");
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

/*
Unsorted Array: 
8 3 5 9 4 1 6 
Sorted Array (Ascending order): 
1 3 4 5 6 8 9 
*/
