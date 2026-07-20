class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();
        int result = 0;
        int num;

        for (String s : operations) {
            if (s.equals("+")) {
                int top = stack.pop();
                num = top + stack.peek();
                stack.push(top);
            } else if (s.equals("D")) {
                num = stack.peek() * 2;
            } else if (s.equals("C")) {
                stack.pop();
                continue;
            } else {
                num = Integer.parseInt(s);
            }
            stack.push(num);
        }
        
        while (!stack.isEmpty()) {
            result += stack.pop();
        }

        return result;
    }
}