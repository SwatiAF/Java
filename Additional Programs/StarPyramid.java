class Main {
    public static void main(String args[]) {
        char twoD[][] = new char[4][];
        twoD[0] = new char[1];
        twoD[1] = new char[2];
        twoD[2] = new char[3];
        twoD[3] = new char[4];
        int i, j;
        char k = '*';
        
        for(i = 0; i < 4; i++) 
            for(j = 0; j < i + 1; j++) {
                twoD[i][j] = k;
            }
        
        for(i = 0; i < 4; i++) {
            for(j = 0; j < i + 1; j++)
                System.out.print(twoD[i][j] + " ");
                System.out.println();
        }
    }
}

/*
* 
* * 
* * * 
* * * * 
*/
