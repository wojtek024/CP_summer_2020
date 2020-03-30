public class prime_numbers {
    public static void main(String[] args) {
        int liczbaPierwsza = 1;
        int n = 10;
        System.out.println("Pierwsze"+ n+" liczb pierwszych to: ");
        for (int k=1;k<=n;k++) {
            liczbaPierwsza = nastepnaLiczbaPierwsza(liczbaPierwsza);
            System.out.println(k+" liczba pierwsza to: "+liczbaPierwsza);
            }
        }


    public static int nastepnaLiczbaPierwsza(int liczba){
        int wynik = liczba+1;
        int dzielnik = 2;
        while(dzielnik < wynik){
            if(wynik % dzielnik == 0){
                wynik ++;
                dzielnik = 2;
            }
            else {
                dzielnik ++;
            }
        }
        return wynik;
    }
}
