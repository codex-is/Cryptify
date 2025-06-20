public class Decrypt {
    public static String decrypt(String text, int shift){
        StringBuilder result = new StringBuilder();
        for(char character : text.toCharArray()){
            if(Character.isLetter(character)){
                char base = Character.isLowerCase(character)? 'a' : 'A';
                char shiftedString =(char)((character-base - shift+26) %26 + base);
                result.append(shiftedString);
            }else{
                result.append(character);
            }
        }return result.toString();
    }
}
