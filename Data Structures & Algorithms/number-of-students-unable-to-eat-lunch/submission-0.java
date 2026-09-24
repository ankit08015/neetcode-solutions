class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> stack = new Stack<>();

        for (int i = sandwiches.length -1; i >= 0; i--){
            stack.push(sandwiches[i]);
        }

        Queue<Integer> queue = new LinkedList<>();

        for ( int i = 0; i < students.length; i++) {
            queue.offer(students[i]);
        }

        int rotations = 0;
        while (!stack.isEmpty() && rotations < queue.size()) {
            if (queue.peek() == stack.peek()) {
                queue.poll();
                stack.pop();
                rotations = 0;
            } else {
                int student = queue.poll();
                queue.offer(student);
                rotations++;
            }
        }

        return queue.size();
    }
}