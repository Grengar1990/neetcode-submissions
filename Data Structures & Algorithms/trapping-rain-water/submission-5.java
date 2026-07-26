class Solution {
    public int trap(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int pool = 0;

        if (height.length < 2) 
        return 0;

        int leftBoard = height[i];
        int rightBoard = height[j];

        while (i < j) {
            if (leftBoard < rightBoard) {
                i++;
                leftBoard = Math.max(leftBoard, height[i]); 
                pool += leftBoard - height[i];
            } else {
                j--;
                rightBoard = Math.max(rightBoard, height[j]);
                pool += rightBoard - height[j];
            }
        }

        return pool;
    }
}
