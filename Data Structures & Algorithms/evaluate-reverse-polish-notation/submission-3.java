class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].matches("-?\\d+")) {
                stack.push(Integer.parseInt(tokens[i]));
                continue;
            }
            int num = stack.pop();
            int res = stack.pop();
            switch (tokens[i]) {
                case "+":
                    res += num;
                    break;
                case "-":
                    res -= num;
                    break;
                case "*":
                    res *= num;
                    break;
                case "/":
                    res /= num;
                    break;
            } 
            stack.push(res);
        }

        return stack.peek();
    }
}
