class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {

            List<Integer> row = new ArrayList<>();

            // First element
            row.add(1);

            // Middle elements
            if (i > 1) {
                List<Integer> prev = ans.get(i - 1);

                for (int j = 1; j < i; j++) {
                    row.add(prev.get(j - 1) + prev.get(j));
                }
            }

            // Last element
            if (i > 0) {
                row.add(1);
            }

            ans.add(row);
        }

        return ans;
    }
}