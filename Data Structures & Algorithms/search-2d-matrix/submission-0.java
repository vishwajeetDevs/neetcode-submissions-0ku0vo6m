class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int start = 0;
        int last = row * col - 1;
        while(start <= last) {
            int mid = (start + last) / 2;
            int midRow = mid / col;
            if (target > matrix[midRow][col - 1]) {
                start = (midRow + 1) * col;
            } else if (target < matrix[midRow][0]) {
                last = (midRow - 1) * col + (col - 1);
            } else {
                int startL = 0;
                int lastL = col - 1;
                while(startL <= lastL) {
                    int midR = (startL + lastL) / 2;
                    if(matrix[midRow][midR] == target) {
                        System.out.println("Got the product : " + midR + ", " + midRow);
                        return true;
                    } else if(matrix[midRow][midR] > target) {
                        lastL = midR-1;
                    } else if(matrix[midRow][midR] < target) {
                        startL = midR+1;
                    }
                }
                break;
            }
        }
        System.out.println("Product not found !");
        return false;
    }
}