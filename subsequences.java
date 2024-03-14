public class subsequences{
    public static void SubsequentString(String str, int idx, String newString){
        if(idx==str.length()){
            System.err.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        SubsequentString(str, idx+1, newString+currChar);
        SubsequentString(str, idx+1, newString);
    }

    public static void main(String[] args) {
        String str="abc";
        SubsequentString(str, 0, "");
    }
}