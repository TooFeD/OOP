public class ElectricGuitar implements Guitar {
    String body;
    int guitarStrings;
    public VolumeController volContr = new VolumeController(1,1);

    public void setGuitarStrings(int countStrings){
        guitarStrings = countStrings;
    }

    public void setBodyForm(String bodyForm){
        body = bodyForm;
    }

    public void printStatus(){
        volContr.pickup.setSound();
        System.out.println("countStrings:" + guitarStrings + " bodyForm:" + body + " volume = " + volContr.getVolume() + " sound = " + volContr.pickup.getSound());
    }
}
