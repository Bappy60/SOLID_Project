package SocialMediaProjcet;

public class Instagram extends SocialMediaAccount implements Post, UpdateProfilePicture {

    public Instagram(String accountName, String emailAddress, String profilePicture) {
        super(accountName, emailAddress, profilePicture);
    }

    @Override
    public void postStatus() {
        System.out.println("Post Updated in Social Media");

    }


    @Override
    public void UpdateProfile() {
        System.out.println("Your Instagram Profile Picture Updated");
    }
}
