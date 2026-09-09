class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int repeated = 0, actual = 0;
        int n = grid.length;
        int ans[] = new int[2];
        

        Set<Integer>set = new HashSet<>();

        for(int i =0; i<n ; i++){
            for(int j = 0; j<n ; j++){
                int x = grid[i][j];
                actual = actual + x;  // to calculate sum of all numbers in grid 
                if(set.contains(x)){  // if it contains repeated then use set
                    repeated = x;
                }
                set.add(x);
            }

            int expectedSum = (n * n) * (n * n + 1) / 2;  // business logic
            int b = expectedSum - actual + repeated;
            
            ans[0]= repeated;
            ans[1]= b;
            
        }
     return ans;
    }
}