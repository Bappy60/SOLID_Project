package SocialMediaProjcet;

public class Main {
    public static void main(String[] args) {
        Facebook fb = new Facebook("Bappy","xyz@gmail.com",":)");
        System.out.println(fb.getAccountName());
        MyAccounts bappy = new MyAccounts("Bappy");
        bappy.addAccounts(fb);
        bappy.showAccounts();

    }
}
