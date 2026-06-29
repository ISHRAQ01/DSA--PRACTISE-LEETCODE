
public class MaximumBalloon{

    public static int MaxBalloon(String text){
        int[] charFreq=new int[26];
        for (char c:text.toCharArray()){
            charFreq[c-'a']++;
        }
        int b=charFreq['b'-'a'];
        int a=charFreq['a'-'a'];
        int l=charFreq['l'-'a']/2;
        int o=charFreq['o'-'a']/2;
        int n=charFreq['n'-'a'];

        return Math.min(Math.min(b,a),Math.min(Math.min(o,l),n));
    }
    public static void main(String args[]){
        String text="balloon";
        System.out.println(MaxBalloon(text));
    }
}