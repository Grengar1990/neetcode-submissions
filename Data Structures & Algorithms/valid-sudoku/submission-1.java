class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int row = 0; row < 9; row++) {
            Set<Character> set = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                char r = board[row][i];
                if (r == '.') continue;
                if (set.contains(r)) return false;
                set.add(r);
            }
        }

        for (int col = 0; col < 9; col++) {
            Set<Character> set = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                char c = board[i][col];
                if (c == '.') continue;
                if (set.contains(c)) return false;
                set.add(c);
            }
        }

        for (int sq = 0; sq < 9; sq++) {
            Set<Character> set = new HashSet<>();
            for (int r = 0; r < 3; r++) {
                for (int c = 0; c < 3; c++) {
                    int row = sq / 3 * 3 + r;
                    int col = sq % 3 * 3 + c;
                    char point = board[row][col];
                    if (point == '.') continue;
                    if (set.contains(point)) return false;
                    set.add(point); 
                }
            }
        }

        return true;
    }
}
