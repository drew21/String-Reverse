import java.util.*;

public class characters{
    static Scanner reverse = new Scanner(System.in);

    public static void main(String[] args){

        System.out.println("Enter an String?");
      
        String words = reverse.nextLine();
        Reverse(words);
    }

    public static void Reverse(String reverse){
        int length = reverse.length();
        int scount = 1;
        String word = "";
		int i =0, zero=0;
        while ((length-1) >= zero)
        {
			word += reverse.charAt(length-1); 
			length--;
        }
    System.out.println(word);    
        
    }//end Reverse
}


