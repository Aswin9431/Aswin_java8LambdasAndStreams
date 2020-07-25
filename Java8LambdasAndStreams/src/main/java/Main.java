import java.util.*;
public class Main
{
    public static void helper(int n,ArrayList<String> a,ArrayList<String> ans){
        for(int i=0;i<n;i++){
            String s=a.get(i);
            if(s.charAt(0)=='a' && s.length()==3){
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
	    helper(n,a,ans);
	    System.out.println(ans);
		
	}
}
