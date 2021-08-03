public class E5 {
    public static void main(String[] args) {
        int [] v1 = new int[]{0, 2, 1, 65, 66, 78, 12, 11, 90, 13};
        int [] v2 = new int[]{0, -2, 1, 9, 4, 78, 12, 11, 90, 13};
        int [] v3 = new int[v1.length];
        for (int j = 0; j < v2.length; j++) {
            v3[j]= v2[j]+v1[j];
            System.out.println(v3[j]);
        } 
        
    }
}
