//VALID ANAGRAM

class ValidAnagram {

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] count = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }
        for(int c:count){
            if(c!=0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "saifi";
        String s2 = "iasif";
        System.out.println(isAnagram(s1, s2));

    }
}
