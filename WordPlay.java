public class WordPlay {
    public Boolean isVowel (char ch) {
        String vowels = "aeiou";
        if (vowels.indexOf(Character.toLowerCase(ch)) != -1) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public String replaceVowels (String phrase, char ch) {
        StringBuilder replaced = new StringBuilder(phrase);
        for (int i = 0; i < replaced.length(); i++) {
            if (isVowel(replaced.charAt(i))) {
                replaced.setCharAt(i, ch);
            }
        }
        return replaced.toString();
    }
    
    public String emphasize (String phrase, char ch) {
        StringBuilder replaced = new StringBuilder(phrase);
        for (int i = 0; i < replaced.length(); i++) {
            if (Character.toLowerCase(replaced.charAt(i)) == Character.toLowerCase(ch)) {
                if ((i + 1) % 2 == 0) {
                    replaced.setCharAt(i, '+');
                }
                else {
                    replaced.setCharAt(i, '*');
                }
            }
        }
        return replaced.toString();
    }
    
    public void testIsVowel () {
        char ch = 'a';
        Boolean value = isVowel(ch);
        System.out.println(ch + " " + value);
        
        ch = 'A';
        value = isVowel(ch);
        System.out.println(ch + " " + value);
        
        ch = 'B';
        value = isVowel(ch);
        System.out.println(ch + " " + value);
        
        ch = 'c';
        value = isVowel(ch);
        System.out.println(ch + " " + value);
    }
    
    public void testReplaceVowels () {
        String phrase = "Hello World";
        char ch = '*';
        String replaced = replaceVowels(phrase, ch);
        System.out.println("Original phrase: " + phrase + "\nVowels Replaced: " + replaced);
        
        phrase = "I was at a party with my cousin and shocked by all this fashion";
        ch = '0';
        replaced = replaceVowels(phrase, ch);
        System.out.println("Original phrase: " + phrase + "\nVowels Replaced: " + replaced);
    }
    
    public void testEmphasize () {
        String phrase = "dna ctgaaactga";
        char ch = 'a';
        String replaced = emphasize(phrase, ch);
        System.out.println("Original phrase: " + phrase + "\nReplaced: " + replaced);
        
        phrase = "I was at a party with my cousin and shocked by all this fashion";
        ch = 'o';
        replaced = emphasize(phrase, ch);
        System.out.println("Original phrase: " + phrase + "\nReplaced: " + replaced);
        
        phrase = "Mary Bella Abracadabra";
        ch = 'a';
        replaced = emphasize(phrase, ch);
        System.out.println("Original phrase: " + phrase + "\nVowels Replaced: " + replaced);
    }
}
