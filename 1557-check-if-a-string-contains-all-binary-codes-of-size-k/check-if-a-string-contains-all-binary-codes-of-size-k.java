               /// SLIDING WINDOW + HASHMAP    approach




// class Solution {
//     public boolean hasAllCodes(String s, int k) {
//         int n =s.length();
//         if (n-k+1 <(1<<k)) return false;

//         //take hashset for storage of unique binary
//         HashSet <String> set = new HashSet <>();
//          int j =0;
//          // travel k......n
//           for (int i =k; i<=n ; i++){
//             set.add(s.substring(j,i));
//             j++;


//             // check set size == 2ki pwer k
//             if(set.size() == (1<<k)) return true;
            
//           }
//           return false;
//     }
// }




////////// BITMANIPULATION APPROACH /////////////


class Solution{
    public boolean hasAllCodes(String s, int k){
        boolean[] seen = new boolean[1<<k];
        int n = s.length();
          // early check 
          if (n-k+1 < (1<<k)) return false;

          int num =0;
          int  count =0;
           // first window
           for(int i=0; i<k; i++){
            int bit = s. charAt(i)-'0';
            num = (num<<1)|bit;

        }
        // mark seen num and increase count
        seen[num] = true;
        count++;
         // start window
         for (int i =k; i<n; i++){
            //currrent bit
            int bit = s.charAt(i)-'0';
            num= ((num<<1)|bit)%(1<<k);

            //check seen 
            if(!seen[num]){
                seen[num]= true; 
                count++;

            }
            // check iif total seen == total binary code
            if (count==(1<<k)) return true;
         }
         return false;
    }
}