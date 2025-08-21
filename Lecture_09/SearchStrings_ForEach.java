package DSA.Lecture_09;

import java.util.Arrays;

public class SearchStrings_ForEach {
    public static void main(String[] args) {
        
        String name = "Nouf";
        char target = 'N';
        String ans = (Arrays.toString(name.toCharArray()));
        System.out.println(ans);
    }
    static boolean searchstrig(String str, char target){
        if(str.length() == 0){
            return false;
        }

        for (char ch : str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }
}
