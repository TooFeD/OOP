import java.util.Random;

public class Pickup {
    private int sound;
    final Random random = new Random();
    void setSound(){
        sound = random.nextInt(100);
    }

    public int getSound(){
        return sound;
    }
}
