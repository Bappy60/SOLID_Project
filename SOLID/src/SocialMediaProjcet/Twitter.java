package SocialMediaProjcet;

public class Twitter extends SocialMediaAccount implements Post, UpdateProfilePicture {

    public Twitter(String accountName, String emailAddress, String profilePicture) {
        super(accountName, emailAddress, profilePicture);
    }

    @Override
    public void postStatus() {

    }

    @Override
    public void UpdateProfile() {
        System.out.println("Your Twitter Profile Picture Updated");
    }
}
