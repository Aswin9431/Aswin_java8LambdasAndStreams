import java.util.*;
public class Palindrome
{
    public static boolean isPalindrome(String s){
        int n=s.length();
        for(int i=0;i<n/2;i++){
            if(s.charAt(i)!=s.charAt(n-i-1)) return false;
        }
        return true;
    }
    public static void palindromeList(int n,ArrayList<String> a,ArrayList<String> ans){
        for(int i=0;i<n;i++){
            String s=a.get(i);
            if(isPalindrome(s)){
                ans.add(s);
            }
        }
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter no of values u want:");
	    int n=sc.nextInt();
	    ArrayList<String> a=new ArrayList<String>();
	    System.out.println("Enter the strings:");
	    for(int i=0;i<n;i++){
	        a.add(sc.next());
	    }
	    ArrayList<String> ans=new ArrayList<String>();
	    palindromeList(n,a,ans);
	    System.out.println(ans);
		
	}
}
