/**
 * Created by Vitalii_Yatsenko on 18.06.2017.
 */
public class VolumeController {

    public VolumeController(int volumeStart, int toneStart){
        volume = volumeStart;
        tone = toneStart;
    }

    private int volume;
    private int tone;
    public Pickup pickup = new Pickup();

    public void changeVolume(int volChangeCount){
        if ((volume+volChangeCount)<=0){
            System.out.println("Volume have minimal value");
        }
        else volume += volChangeCount;
    }

    public void changeTone(int toneChangeCount){
        tone += toneChangeCount;
    }

    public int getVolume(){
        return volume;
    }

    public int getTone(){
        return tone;
    }
}
