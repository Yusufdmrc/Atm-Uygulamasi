import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        String userName,password;
        Scanner inp=new Scanner(System.in);
        int right=3;
        int balance=5000;
        int select;

        while(right>0){
            System.out.println("Kullanici adinizi giriniz");
            userName=inp.nextLine();
            System.out.println("Sifrenizi giriniz");
            password=inp.nextLine();

            if(userName.equals("patika") && password.equals("patika123")){
                System.out.println("Merhaba,bankamıza hoşgeldiniz ");
                do {
                    System.out.println("1-Para Yatırma\n"+"2-Para Çekme\n"+"3-Bakiye Sorgulama\n"+"4-Çıkış");
                    System.out.println("Yapmak istediğiniz işlemi seçiniz");
                    select=inp.nextInt();
                    if(select==1){
                        System.out.println("Yatırmak isteğiniz parayı giriniz");
                        int price=inp.nextInt();
                        balance+=price;
                        System.out.println("Yeni bakiye:"+balance);
                    }else if(select==2){
                        System.out.println("Çekmek istediğiniz parayı giriniz");
                        int price=inp.nextInt();
                        if(price >balance) {
                            System.out.println("Bakiye yetersiz");
                        }else{
                            balance-=price;
                            System.out.println("Yeni bakiye:"+balance);
                        }
                    }else if(select==3){
                        System.out.println("Bakiyeniz:"+balance);
                    }
                }while (select !=4);
                System.out.println("Kendinize iyi bakın");
                break;
            }else{
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre girdiniz.Tekrar giriniz");
                if(right==0){
                    System.out.println("Hesabınız bloke olmuştur.Bankamızla iletişime geçiniz");
                }else{
                    System.out.println("Kalan Hakkınız:"+right);
                }
            }
        }

    }
}
