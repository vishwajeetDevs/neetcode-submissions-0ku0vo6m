class Solution {
    public boolean isAnagram(String s, String t) {
         if (s.length() != t.length()) {
           return false;
            // System.out.println(false);
        }
        boolean flag = true;
        ArrayList <Character> list = new ArrayList <> () ;
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }
        System.out.println(list.toString());

        for (int i = 0; i < t.length(); i++) {
            if (list.contains(t.charAt(i))) {
                list.remove(Character.valueOf(t.charAt(i)));
            } else {
                flag = false;
                break;
            }
        }
        if (flag) {
           return true;
            // System.out.println("True");
        } else {
            // System.out.println("False");
            return false;
        }
    }
}
