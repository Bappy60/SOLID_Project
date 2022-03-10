package SocialMediaProjcet;

public class Skype extends SocialMediaAccount implements VideoCalling{

    public Skype(String accountName, String emailAddress, String profilePicture) {
        super(accountName, emailAddress, profilePicture);
    }

    @Override
    public void videoCall() {
        System.out.println("Video call started");

    }
}
