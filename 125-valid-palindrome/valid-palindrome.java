class Solution {
    public boolean isPalindrome(String s) {
       s= s.toLowerCase();  // converting ever uppercase element to lower case
       StringBuilder sb =  new StringBuilder(); // creating a stringbuilder
       for (int i=0; i<s.length(); i++){    // iterating over string 

      // now for ascai values of  all lower case alphabets and alphanumeric charaters (one check condition is applied over here)
        if((s.charAt(i)>=97 && s.charAt(i)<=122)  ||  (s.charAt(i)>=48 && s.charAt(i)<=57) ){  
            sb.append(s.charAt(i));  // to add chareter to string
        }
       } 
       for (int i=0; i< sb.length()/2; i++){  // for iteration of i over string for comparision with s.length
        if(sb.charAt(i)!= sb.charAt(sb.length()-1-i)){  // check for (i isequals or not with /from last elements )
            return false;
        }
       }
       return true ;
    }
}