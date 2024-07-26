package learning;

public class maxoccuringchar {

	public static void main(String[] args) {
		String str = "abcd";
		
		System.out.println(max(str));

	}
	
	static char max(String str) {
		
		char ans ='a';
		int maxfreq = 0;
		int n=str.length();
		int count[]= new int[256];
		for(int i=0;i<n;i++) {
			count[str.charAt(i)]++;
			if(count[str.charAt(i)]>maxfreq) {
				maxfreq= count[str.charAt(i)];
				ans = str.charAt(i);
				
			}else {
				return '0';
			}
			
		}
		return ans;
		
	}

}
