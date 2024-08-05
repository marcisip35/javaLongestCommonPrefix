import java.util.*;

class Main{
    public static void main(String[] args){
        /* LeetCode Question #14
         * LeetCode Easy Question #4
         */
        String[] input = {"flowers","flow","flight"};
        System.out.println(longestCommonPrefix(input));
    }

    public static String longestCommonPrefix(String[] strs){
        //If array is empty, return nothing
        if(strs.length == 0){
            return "";
        }

        // set first element as prefix
        String prefix = strs[0]; 

        //Keep taking off lets in the prefix, using indexOf, indexOf will check if the prefix is in the start of the String
        for(int i = 1; i < strs.length; i++){ 
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }

        return prefix;
    }
}