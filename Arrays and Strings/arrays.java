import java.util.*;
class Solution {
    public int firstUniqChar(String s) {
        Map <Character, Integer> mapStr = new HashMap<>();
        for(int i = 0; i < s.length() ; i++){
           if(!mapStr.containsKey(s.charAt(i))){
               mapStr.put(s.charAt(i),1);
           } else {
               int value = mapStr.get(s.charAt(i));
               value++;
               mapStr.put(s.charAt(i),value);
           }
        }
        int flag = 0;
        int i;
        for(i = 0 ; i < s.length() ; i++){
             if(mapStr.get(s.charAt(i)) == 1){
                 flag = 1;
                 break;
             }
        }
        if(flag == 1){
        return i;
        } else {
            return -1;
        }
    }
    public static void main(String[] agrs){
        Solution c = new Solution();
        System.out.println(c.firstUniqChar("loveleetcode"));
    }
}