/**
 * Created by Vitalii_Yatsenko on 18.06.2017.
 */
public class VolumeController {

    private static final int VOLUME_TONE_STEP = 1;
    private static final int MAX_VOLUME_TONE = 10;
    private int volume = 0;
    private int tone = 0;

    public Pickup pickup = new Pickup();

    public void incVolume(){
        if (volume < MAX_VOLUME_TONE){
            this.volume += VOLUME_TONE_STEP;
        }
    }

    public void decVolume(){
        if (volume > 0){
            volume -= VOLUME_TONE_STEP;
        }
    }

    public void incTone(){
        if (tone < MAX_VOLUME_TONE){
            tone += VOLUME_TONE_STEP;
        }
    }

    public void decTone(){
        if (tone > 0){
            tone -= VOLUME_TONE_STEP;
        }
    }


    public int getVolume(){
        return volume;
    }

    public int getTone(){
        return tone;
    }
}
