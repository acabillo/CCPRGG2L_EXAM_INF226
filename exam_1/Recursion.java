public class Recursion {

    public static void main(String[] args) {
        String fullName = "anthonette mae navarro";

        removeLetter(fullName);
    }

    static void removeLetter(String str) {
            if (str.isEmpty()) {
                return;
            }
            char first = str.charAt(0);
            if (isVowel(first)) {
                removeLetter(str.substring(1));
            } else {
                System.out.print(first);
                removeLetter(str.substring(1));
            }
        }
        
        public static boolean isVowel(char c) {
            return (c == 'a' || c == 'e' || c == 'o' );
        }
    }
