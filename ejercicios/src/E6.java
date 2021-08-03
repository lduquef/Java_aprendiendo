public class E6 {
    public static void main(String[] args) {
        char [] vector = new char[] {' ','P', 'r','o',' ', 'g', 'r','a',' ','m','a', 'r'}; 
        String vectorConcatenado = "";
        for (int i = 0; i < vector.length; i++) {
            vectorConcatenado = vectorConcatenado+vector[i];
        }
        System.out.println(vectorConcatenado);
    }
}
