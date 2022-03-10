package SocialMediaProjcet;

public class Facebook extends SocialMediaAccount implements Post, VideoCalling, UpdateProfilePicture {


    public Facebook(String accountName, String emailAddress, String profilePicture) {
        super(accountName, emailAddress, profilePicture);
    }

    @Override
    public void postStatus() {
        System.out.println("Post Updated in Social Media");

    }

    @Override
    public void videoCall() {
        System.out.println("Video call started");

    }

    @Override
    public void UpdateProfile() {
        System.out.println("Your Facebook Profile Picture Updated");
    }
}
