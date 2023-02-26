package arrays;
public  class twoDimensionalArray2 {
    public static void main(String[] args) {
        int[] [] abu = { {5,2,3,4},
                     {8,2,3,2},
                     {8,2,3,9}
        };
        for (int i = 0; i < 3; i++) {
            int max = abu[i][0];
            for (int j = 1; j < 4; j++)
                max = (abu[i][j] > max ? abu[i][j] : max);
            System.out.println("the sum of row "+ (i + 1) + ": " + max);
        }
    }
}