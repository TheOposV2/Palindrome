public class Main {
    public static boolean isItPalidrome(String word)
    {
        int length = word.length(); //counting the number of letters in a word
        int halfLength; //variable definition

        if (length%2 == 0) halfLength= length/2; // checking the parity condition and determining position of middle chars
        else halfLength= (length+1)/2; //else statement and determining position of middle chars for odd numbers of letters input

        char forward[] = new char[halfLength]; //definition of arrays which holds chars
        char backward[] = new char[halfLength];

        for (int i = 0; i < halfLength; i++) //definition of for loop which is needed for typing in chars to arrays
        {
            forward[i]=word.charAt(i); //populating arrays with chars of selected positions
            backward[i]=word.charAt((length-1)-i);
        }

        return Arrays.equals(forward,backward); //comparison of two arrays to check if they are equal
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
