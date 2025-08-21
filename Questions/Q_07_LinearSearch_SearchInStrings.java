package DSA.Questions;

public class Q_07_LinearSearch_SearchInStrings {
    
    public static void main(String[] args) {
        
        String name = "Nouf";
        char target = 'N';
        boolean ans = searchstrig(name, target);
        System.out.println(ans);
    }
    static boolean searchstrig(String str, char target){
        if(str.length() == 0){
            return false;
        }

        for (int i = 0; i < str.length(); i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}