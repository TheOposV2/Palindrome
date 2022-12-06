public class Main {
)
    {
        for (int i = 0; i < (word.length() + 1) / 2; i++) //definition of for loop which is needed for typing in chars to arrays
            if(word.charAt(i) != word.charAt(word.length() - 1 - i) return false; //comparing opposing chars to determinate if it is a palindrome and if is not return false
        return true;
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
