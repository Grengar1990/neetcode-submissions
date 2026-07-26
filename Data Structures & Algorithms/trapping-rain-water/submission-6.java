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
                if (leftBoard < height[i]) leftBoard = height[i];
                else pool += leftBoard - height[i]; 
                
            } else {
                j--;
                if (rightBoard < height[j]) rightBoard = height[j];
                else pool += rightBoard - height[j];
            }
        }

        return pool;
    }
}
