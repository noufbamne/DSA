/*You are given an mx n integer grid accounts where accounts [i][j] is the amount of money the ith customer has in the jth bank. Return the wealth that the richest customer has.

A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth. */

package DSA.Questions;

public class Q_12_LinearSearch_Maxwealth {
    public static void main(String[] args) {
        int [][] accounts = {
            {1, 2, 3},
            {4, 5 ,6},
        };
        int maxwealth = maximumwealth(accounts);
        System.out.println(maxwealth);
    }
    static int maximumwealth(int[][] accounts){
        //person
        //account
        int ans = Integer.MIN_VALUE;
        for(int person = 0; person < accounts.length; person ++){
            int sum = 0;
            for(int account = 0; account < accounts[person].length; account++ ){
                sum = sum + accounts[person][account];
            }
            // now we have sum of accounts of person 
            // check with overall answer
            if(sum > ans){
                ans = sum;
            }
        } 
        return ans;   
    }
}
