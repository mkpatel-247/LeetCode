class Solution {
    public String interpret(String command) {
        int size = command.length();
        StringBuilder str = new StringBuilder();
        int i = 0;
        while(i < size){
            if(command.charAt(i) == 'G'){
                str.append("G");
                i++;
            } else if(i+2 <= size && command.substring(i, i+2).equals("()")){
                str.append("o");
                i += 2;
            } else if(i+4 <= size && command.substring(i, i+4).equals("(al)")){
                str.append("al");
                i += 4;
            }
        }

        return str.toString();
    }
}

//Second Approach - Using in-built function
class Solution {
    public String interpret(String command) {
        return command.replace("()", "o").replace("(al)", "al");
    }
}
