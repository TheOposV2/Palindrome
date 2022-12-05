public class Main {
    public static boolean isItPalidrome(String word)
    {
        int length = word.length(); //counting the number of letters in a word
        int halfLength; //variable definition

        if (length%2 == 0) halfLength= length/2; // checking the parity condition and determining position of middle chars
        else halfLength= (length+1)/2; //else statement and determining position of middle chars for odd numbers of letters input

        for (int i = 0; i < halfLength; i++) //definition of for loop which is needed for typing in chars to arrays
        {
            if(word.charAt(i) != word.charAt((length-1)-i)) return false; //comparing opposing chars to determinate if it is a palindrome and if is not return false

        }
        return true; //comparison of two arrays to check if they are equal
    }

    public static void main(String args[])
    {
        String first = "abba";
        String second = "ala";
        String third = "sedes";
        String fourth="łukasz";

        System.out.println(isItPalidrome(first));
        System.out.println(isItPalidrome(second));
        System.out.println(isItPalidrome(third));
        System.out.println(isItPalidrome(fourth));
    }
}
