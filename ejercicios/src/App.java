
public class App {
    public static void main(String[] args) {
        int[] vector = new int[] {0, 2, 1, 65, 66, 78, 12, 11, 90, 13};
        int l = vector.length;
        int var;
        for (int i = 0; i < l; i++) {
            if (i<l/2){
                for (int j = 0; j < l/2 -1 ; j++) {
                    if (vector[j]>vector[j+1]) {
                        var = vector[j];
                        vector[j]=vector[j+1];
                        vector[j+1] = var;
                    }
                }
            }else{
                for (int j =l-1 ; j >l/2; j--) {
                    if (vector[j]>vector[j-1]) {
                        var = vector[j];
                        vector[j]=vector[j-1];
                        vector[j-1] = var;
                    }
                } 
            }
            System.out.println(vector[i]);
            }
        }
    }


