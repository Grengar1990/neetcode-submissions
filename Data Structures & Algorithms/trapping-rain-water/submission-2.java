class Solution {
    public int trap(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int leftPool = 0;
        int rightPool = 0; 

        if (height.length < 2) 
        return 0;

        while (height[i] == 0) i++;
        int leftBoard = height[i];
        while (height[j] == 0) j--;
         int rightBoard = height[j];

        while (i < j) {
            if (leftBoard < rightBoard) {
                i++;
                while (height[i] < leftBoard)  
                    leftPool += leftBoard - height[i++];
                leftBoard = height[i];
            } else {
                j--;
                while (height[j] < rightBoard)
                    rightPool += rightBoard - height[j--];
                rightBoard = height[j];
            }
        }

        return leftPool + rightPool;
    }
}
