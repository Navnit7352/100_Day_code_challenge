class Solution {
    String removeDuplicates(String str) {
        // code here
         List<Character> li = new ArrayList<Character>();
        for(int i=0;i<str.length();i++)
        {
            if(!li.contains(str.charAt(i)))
            li.add(str.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
 
        // Appends characters one by one
        for (Character ch : li) {
            sb.append(ch);
        }
 
        // convert in string
        String string = sb.toString();
         return string;
    }
}

