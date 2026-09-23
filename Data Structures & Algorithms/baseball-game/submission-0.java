class Solution {
    public int calPoints(String[] operations) {
        int sum = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < operations.length; i++){
            if (operations[i].equals("D")) {
                Integer s = stack.peek();
                stack.push(2 * s);
            }

            else if (operations[i].equals("C")) {
                stack.pop();

            }

            else if (operations[i].equals("+")) {
                Integer s1 = stack.pop();
                Integer s2 = stack.peek();

                Integer s3 = s1 + s2;

                stack.push(s1);
                stack.push(s3);
            } else {
                stack.push(Integer.parseInt(operations[i]));
            }
        }

        while (!stack.isEmpty()) {
            sum = sum + stack.pop();
        }

        return sum;
    }
}