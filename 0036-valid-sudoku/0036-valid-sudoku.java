class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, HashSet<Character>> row = new HashMap<>();
        HashMap<Integer, HashSet<Character>> col = new HashMap<>();
        HashMap<Integer, HashSet<Character>> box = new HashMap<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == '.') {
                    continue;
                } else {
                    int currentBox = (i / 3) * 3 + (j / 3);
                    if (!row.computeIfAbsent(i, k -> new HashSet<>()).add(board[i][j])) return false;
                    if (!col.computeIfAbsent(j, k -> new HashSet<>()).add(board[i][j])) return false;
                    if (!box.computeIfAbsent(currentBox, k -> new HashSet<>()).add(board[i][j])) return false;

                }
            }
        }

        return true;
    }
}