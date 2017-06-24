public class ElectricGuitar extends Guitar {

    public VolumeController volContr = new VolumeController();

    private ElectricGuitar(int countStrings, String bodyForm) {
        super(countStrings, bodyForm);
    }

    public static ElectricGuitar createGuitar(int countStrings, String bodyForm) {
        return new ElectricGuitar(countStrings, bodyForm);
    }

    public void getStatus(){
        System.out.println("countStrings:" + getStrings() + " bodyForm:" + getBody() + " volume = " + volContr.getVolume() + " sound = " + volContr.pickup.getSound());
    }

    @Override
    public void play(){
        volContr.pickup.setSound();
        System.out.println("Вжж вжж вжжжжж)");
    }
}
