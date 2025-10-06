class SetMatrixZeros {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        List<int[]> pairs = new ArrayList<>();

        // capture cells where 0s have occurred
        for (int row=0; row<n; row++) {
            for (int col=0; col<m; col++) {
                if (matrix[row][col] == 0) {
                    pairs.add(new int[]{row, col});
                }
            }
        }

        for (int[] pos: pairs) {
            int row = pos[0];
            int col = pos[1];

            // fill upward
            for (int i = row - 1; i >= 0; i--) matrix[i][col] = 0;

            // fill downward
            for (int i = row + 1; i < n; i++) matrix[i][col] = 0;

            // fill left
            for (int i = col - 1; i >= 0; i--) matrix[row][i] = 0;

            // fill right
            for (int i = col + 1; i < m; i++) matrix[row][i] = 0;
        }
    }
}