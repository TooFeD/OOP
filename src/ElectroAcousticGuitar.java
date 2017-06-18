/**
 * Created by Vitalii_Yatsenko on 18.06.2017.
 */
public class ElectroAcousticGuitar extends AcousticGuitar {
    public VolumeController volContr = new VolumeController(1,2);

    @Override
    public void printStatus(){
        volContr.pickup.setSound();
        System.out.println("countStrings:" + guitarStrings + " bodyForm:" + body + " volume = " + volContr.getVolume() + " sound = " + volContr.pickup.getSound());
    }
}
