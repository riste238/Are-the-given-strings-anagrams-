import java.util.HashMap;
import java.util.Set;

public class Anagrams {

    public static boolean areAnagrams(String a, String b){

        HashMap<Character,Integer> map = new HashMap<Character,Integer>();

        for (int i = 0; i<a.length(); i++){
            if (map.containsKey(a.charAt(i))){
                map.put(a.charAt(i), map.get(a.charAt(i)) +1);
            }
            else {
                map.put(a.charAt(i), 1);
            }
        }

        for (int i = 0; i<b.length(); i++){
            if(map.containsKey(b.charAt(i))){
                map.put(b.charAt(i), map.get(b.charAt(i))-1);
            }
            else {
                return false;
            }
        }
        Set<Character> keys = map.keySet();
        for ( Character key: keys
             ) {
            if(map.get(key) != 0){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        String str1 = "riste";
        String str2 = "iters";
        if(areAnagrams(str1,str2)){
            System.out.println("These strings are anagrams");
        }
        else {
            System.out.println("These strings are not anagrams");
        }
    }
}
