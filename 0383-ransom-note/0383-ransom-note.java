import java.util.HashMap;
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer>map=new HashMap<>();
            for(int i=0;i<magazine.length();i++){
                char ch= magazine.charAt(i);
                int count = map.getOrDefault(ch,0);
                count ++;
                map.put(ch,count);
                   
            }
            for(int i=0;i<ransomNote.length();i++){
                char ch=ransomNote.charAt(i);
                if(!map.containsKey(ch)|| map.get(ch)==0){
                    return false;
                }
                map.put(ch,map.get(ch)-1);

            }
            return true;
        
    }
}