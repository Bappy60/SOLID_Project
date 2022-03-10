package SocialMediaProjcet;

public class SocialMediaAccount implements ISocialMediaAccount {
   private  String accountName;
   private String emailAddress;
   private String profilePicture;

    public SocialMediaAccount(String accountName, String emailAddress, String profilePicture) {
        this.accountName = accountName;
        this.emailAddress = emailAddress;
        this.profilePicture = profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

}
