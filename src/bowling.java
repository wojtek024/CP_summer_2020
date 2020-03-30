public class bowling {
    public static void main(String[] args) {
        int n = 6;
        int w=0;
        for (int i=1;i<=n;i++) {
            w=w+i;
        }
        System.out.println("policzyłem kręgle: "+ w);
        System.out.print("wynik to: "+n*(n+1)/2);
    }
}
