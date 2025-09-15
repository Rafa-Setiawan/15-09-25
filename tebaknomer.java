import java.util.Scanner;


public class tebaknomer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Boolean kondisi = true;
        int tebaknomer = 7;
        int counter = 0;
        String jawab;
        int userinput; 
         do {
            System.out.println("tebak nomer antara 1-10: ");
            userinput = input.nextInt();
            counter++;
            if(userinput == tebaknomer) {
                System.out.println("selamat anda benar");
                kondisi = false;
            } else {
                System.out.println("maaf, nomer yang anda masukkan salah");
            }
        } while (kondisi);
        System.out.println("anda sudah menebak sebanyak: " + counter + " kali");
    }
}
    

