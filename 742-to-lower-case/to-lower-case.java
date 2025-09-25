class Solution {
    public String toLowerCase(String s) {
        //return s.toLowerCase();                     // direct method 


        // char c[] = s.toCharArray();
        // for(int i =0; i< c.length; i++){
        //     if(c[i]>=65 && c[i]<=90){                 // method 2
        //         c[i] =(char) (c[i]+32);
        //     }
        // }
        // return String.valueOf(c);   


        StringBuilder sb = new StringBuilder();
        for(char c: s.toCharArray()){
            if(c>=65 && c<= 90){   //c=b                  // using String Builders
                c = (char)(c+32);  // c=A, c= a
            }
             sb.append(c);
        }
       return sb.toString();
    }

}