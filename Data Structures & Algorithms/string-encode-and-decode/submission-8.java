class Solution {

    public String encode(List<String> strs) {
        StringBuffer str = new StringBuffer();
//appending special charater and also the length of the string stored        
     for(String s : strs){
        str.append(s.length());
        str.append("#");
        str.append(s);
     }
     String str1 = str.toString();

     return str1;
    }
//Eg: str1 = 5#Hello5#World.
    public List<String> decode(String str) {
        List<String> l = new ArrayList<>();
//creating an empty arraylist and then using while loop to iterate over the string
        int i=0;
        while(i<str.length()){
//taking index of special character using indexOf() method            
            int spchar = str.indexOf("#", i); //1
//taking size of String eg: from str 5#Hello it will fetch '5' using Integer.parseInt method.
            int size = Integer.parseInt(str.substring(i, spchar));//5
//again changing the value of i to fetch a correct substring.
            i = spchar + 1;
            String str2= str.substring(i, i + size);
            i += size;
            l.add(str2);          
        }
        return l;

    }
}
