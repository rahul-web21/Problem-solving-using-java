class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length())
        {
            return false;
        }

        char[] s_a = s.toCharArray();
        char[] t_a = t.toCharArray();

        Arrays.sort(s_a);
        Arrays.sort(t_a);

        return Arrays.equals(s_a,t_a);

    }
}
