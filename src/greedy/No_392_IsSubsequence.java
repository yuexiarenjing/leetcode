package greedy;

public class No_392_IsSubsequence {

	public boolean isSubsequence(String s, String t) {
		if(s == null || t == null) return false;
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        int si = 0, ti = 0;
        int length = 0;
        while(si < s1.length && ti < t1.length) {
        	if(s1[si] == t1[ti]) {
        		length++;
        		si++;
        		ti++;
        	} else {
        		ti++;
        	}
        }
        if(s1.length == length) return true;
        else return false;
    }

}
