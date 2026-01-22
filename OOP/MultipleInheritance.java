//5. MULTIPLE INHERITANCE 

// INTERFACE 1
interface Camera {
    void takePhoto();
}

// INTERFACE 2
interface MusicPlayer {
    void playMusic();
}

// INTERFACE 3
interface Phone {
    void makeCall(String number);
}

// CLASS IMPLEMENTING MULTIPLE INTERFACES
class Smartphone implements Camera, MusicPlayer, Phone {

    public void takePhoto() {
        System.out.println("PHOTO CLICKED!");
    }

    public void playMusic() {
        System.out.println("MUSIC IS PLAYING");
    }

    public void makeCall(String number) {
        System.out.println("CALLING " + number + "...");
    }
}

// MAIN CLASS
public class MultipleInheritance {
    public static void main(String[] args) {
        Smartphone myPhone = new Smartphone();

        myPhone.takePhoto();
        myPhone.playMusic();
        myPhone.makeCall("9876543210");
    }
}
