// import java.util.*;

public class stringBuilder{
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);     //Tony

        //char at index 
        System.out.println(sb.charAt(0));       //T

        //set char at index
        sb.setCharAt(0, 'S');
        System.out.println(sb);     //Sony

        //to insert char at index
        sb.insert(2, 'n');
        System.out.println(sb);     //Sonny

        //to delete
        sb.delete(2, 3);
        System.out.println(sb);     //Sony

        sb.append("S");
        System.out.println(sb);     //SonyS

        System.out.println(sb.length());       //5

        //to reverse the string
        StringBuilder st = new StringBuilder("Tony");
        for(int i=0; i<st.length()/2; i++){
            int front = i;
            int back = st.length() -1 - i;

            char frontChar = st.charAt(front);
            char backChar = st.charAt(back);

            st.setCharAt(front, backChar);
            st.setCharAt(back, frontChar);
        }
        System.out.println(st);     //ynoT
    }
}