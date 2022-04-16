class Main {
    public static void main(String args[]) {
        int twoD[][] = new int[4][];
        twoD[0] = new int[1];
        twoD[1] = new int[2];
        twoD[2] = new int[3];
        twoD[3] = new int[4];
        int i, j, k = 0;
        
        //Initialising 2D array
        for(i = 0; i < 4; i++) 
            for(j = 0; j < i + 1; j++) {
                twoD[i][j] = k;
                k++;
            }
        
        //Printing the 2D array
        for(i = 0; i < 4; i++) {
            for(j = 0; j < i + 1; j++)
                System.out.print(twoD[i][j] + " ");
                System.out.println();
        }
        
        //Sum of each row
        for(i = 0; i < 4; i++) {
            int sumRow = 0;
            for(j = 0; j < i + 1; j++) {
                sumRow = sumRow + twoD[i][j];
            }
            System.out.println("Sum of " + (i + 1) + " row: " + sumRow);
        }
    }
}

/*
OUTPUT: 
0 
1 2 
3 4 5 
6 7 8 9 
Sum of 1 row: 0
Sum of 2 row: 3
Sum of 3 row: 12
Sum of 4 row: 30
*/
