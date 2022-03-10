package SocialMediaProjcet;

import java.util.ArrayList;

public class MyAccounts {
    private String owner;
    private ArrayList<SocialMediaAccount> myAccounts;

    public MyAccounts(String owner) {
        this.owner = owner;
        this.myAccounts = new ArrayList<>();
    }


    public void addAccounts(SocialMediaAccount socialMediaAccount) {
        this.myAccounts.add(socialMediaAccount);
    }

    public void showAccounts() {
        if(myAccounts.isEmpty()) {
            System.out.println("Currently there is no social accounts");
            return;
        }
        int i = 1;
        for(SocialMediaAccount x : myAccounts){
            System.out.println(i + ". " + x.getAccountName());
            i++;
        }
    }
}
