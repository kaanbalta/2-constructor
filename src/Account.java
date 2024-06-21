public class Account {

    private String hesapNo;
    private String isim;
    private String email;
    private String telefonNo;
    private double bakiye;


    public Account(String hesapNo, String isim, String email, String telefonNo, double bakiye) {
        this.hesapNo = hesapNo;
        this.isim = isim;
        this.email = email;
        this.telefonNo = telefonNo;
        this.bakiye = bakiye;
    }

    public Account(){
        this.bakiye = 0;
        this.email = "Bilgi yok";
        this.telefonNo = "Bilgi yok";
        this.isim = "Bilgi yok";
        this.hesapNo = "Bilgi yok";
    }

    public Account(String isim,String telefonNo){
        this("Bilgi yok",isim,"Bilgi yok",telefonNo,0);
    }

    public void bilgileriGoster(){
        System.out.println("Hesap No : " + this.hesapNo);
        System.out.println("İsim : " + this.isim);
        System.out.println("Telefon No : " + this.telefonNo);
        System.out.println("Bakiye : " + this.bakiye);
        System.out.println("E-mail : " + this.email);
    }

    public void paraYatir(double miktar){
        bakiye+=miktar;
        System.out.println("Bakiyeniz : " + bakiye);
    }

    public void paraCek(double miktar){
        if (miktar>1500) {
            System.out.println("Bir günde 1500 TLden fazla para çekemezsiniz");
        }

        else {
            if(bakiye-miktar<0){
                System.out.println("Yeterli bakiyeniz bulunmamakta şuanki bakiyeniz " + bakiye + " TL");
            }

            else {
                bakiye-=miktar;
                System.out.println("Yeni bakiyeniz : " + bakiye);
            }
        }
    }


    public String getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefonNo() {
        return telefonNo;
    }

    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }
}
