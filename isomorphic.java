package guvi;

import java.util.HashMap;

public class isomorphic
{
	public static void main(String[] args) 
	{
		String s="egg" ;
		String t="ball" ; 
    {
        HashMap<Character,Character> map = new HashMap<>();
        for (int i=0; i<s.length(); i++){
            if (map.containsKey(s.charAt(i))){
                if (t.charAt(i)==map.get(s.charAt(i))) 
                	continue;
                else 
                	System.out.println("false");
            }
            else if (map.containsValue(t.charAt(i))) 
            	System.out.println("false");
            map.put(s.charAt(i),t.charAt(i));
        }
      System.out.println("true");
    }
}
}