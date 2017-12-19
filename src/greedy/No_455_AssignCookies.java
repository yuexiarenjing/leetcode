package greedy;

import java.util.Arrays;

public class No_455_AssignCookies {
	
	public static int findContentChildren(int[] g, int[] s) {
		Arrays.sort(g);
		Arrays.sort(s);
		int g1 = g.length-1, s1 = s.length-1;
		int res = 0;
		while(g1 >= 0 && s1 >= 0) {
			if(g[g1] <= s[s1]) {
				res++;
				g1--;
				s1--;
			} else {
				g1--;
			}
		}
		return res;
    }
	
	public static void main(String[] args) {
		System.out.println(findContentChildren( new int[]{1,2,3}, new int[] {1,1} ));
	}
	
}
