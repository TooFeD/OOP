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
    public String play(){
        volContr.pickup.setSound();
        return "Вжж вжж вжжжжж";
    }
}
