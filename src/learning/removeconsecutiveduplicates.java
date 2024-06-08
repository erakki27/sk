package learning;

public class removeconsecutiveduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="abbaca";
		System.out.println(removeDuplicates(s));

	}
	
	static String removeDuplicates(String s) {
		StringBuilder sb=new StringBuilder();
		
        for(int i=0;i<s.length();i++){
        	System.out.println(sb.length());
            if(sb.length()>0&&sb.charAt(sb.length()-1)==s.charAt(i))
                    sb.deleteCharAt(sb.length()-1);
             else
                    sb.append(s.charAt(i));
            System.out.println(sb);
        }
        return sb.toString();
}

}
