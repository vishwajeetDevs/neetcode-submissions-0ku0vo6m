class Solution {

    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        boolean flag = false;
        for (int i = 0; i < asteroids.length; i++) {

            if ((st.size() == 0 && asteroids[i] < 0) || (asteroids[i] < 0 && st.peek() < 0)) {
                System.out.println("running");
                st.push(asteroids[i]);
            }

            else if (asteroids[i] > 0) {
                st.push(asteroids[i]);
            }

            if (!st.isEmpty() && asteroids[i] < 0 && st.peek() > 0) {
                int current = asteroids[i];

                while (!st.isEmpty() && current < 0 && st.peek() > 0) {
                    int top = st.peek();

                    if (top < -current) {
                        st.pop(); 
                    } else if (top == -current) {
                        st.pop(); 
                        current = 0;
                        break;
                    } else {
                        current = 0;
                        break;
                    }
                }

                if (current != 0) {
                    st.push(current);
                }

                flag = true;
            }

        }
        int[] arr = new int[st.size()];
        for (int j = st.size() - 1; j >= 0; j--) {
            arr[j] = st.pop();
        }
        return arr;
    }
}