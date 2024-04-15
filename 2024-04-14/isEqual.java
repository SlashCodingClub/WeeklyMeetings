import java.util.*;
public class isEqual {
    public static void StringPool(String str1, String str2){
        System.out.println(str1.equals(str2));
        System.out.println(str1 == str2);
    }
    public static void DifferentStringPool(String str1, String str2){
        System.out.println((str1+ str2) == (str2 + str1));
        System.out.println((str1+ str2).equals(str2 + str1));
    }
    public static void StringBuilderPrint(StringBuilder sb1, StringBuilder sb2){
        System.out.println((sb1.toString()).equals((sb2).toString()));
        System.out.println(sb1 == sb2);
    }
    public static void main(String[] args){
        String str1 = "hello";
        String str2 = "hello";
        String str3 = "ABCABC";
        String str4 = "ABC";
        StringBuilder sb1 = new StringBuilder("hello");
        StringBuilder sb2 = new StringBuilder("hello");
        String str5 = new String("hello");
        System.out.println(str5 == (str2));
        //StringPool(str1, str2);
        
        StringBuilderPrint(sb1, sb2);
        
        //DifferentStringPool(str3, str4);
        
        
        
        
        /*Character c1 = 'a';
        Character c2 = 'a';
        System.out.println(c1.equals(c2));
        System.out.println(c1 == c2);
        Set<Character> set = new HashSet<>();
        set.add(c1);
        Set<Character> set2 = new HashSet<>();
        set2.add(c2);
        System.out.println(set.equals(set2));
        System.out.println(set == set2);
        */

    }
}
