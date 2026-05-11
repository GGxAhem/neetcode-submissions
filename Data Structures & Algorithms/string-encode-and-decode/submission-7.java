class Solution {

    public String encode(List<String> strs) {
        StringBuffer str1 = new StringBuffer();
        for(int i=0; i<strs.size(); i++){
            String s = strs.get(i);
            str1.append(s.length());
            str1.append("#");
            str1.append(s);
        }
        String str = str1.toString();

        return str;
    }

    public List<String> decode(String str) {
        List<String> l = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int dash = str.indexOf('#', i);
            int size = Integer.parseInt(str.substring(i, dash));
            i = dash + 1;
            l.add(str.substring(i, i + size));
            i += size;
            }
            return l;
            //{Hello, World} --> 5#####Hello5#####World :encoder
        // dash = 6
        // size = 5

        // substring (7, 12) --> "Hello"

        }
        
    }

