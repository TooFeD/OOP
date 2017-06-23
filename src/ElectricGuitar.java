public class ElectricGuitar extends Guitar {

    public VolumeController volContr = new VolumeController();

    private ElectricGuitar(int countStrings, String bodyForm) {
        super(countStrings, bodyForm);
    }
//    @Override
//    public ElectricGuitar(int countStrings, String bodyForm) {
//        this(guitarStrings = countStrings,body=bodyForm);
//    }


    public static ElectricGuitar createGuitar(int countStrings, String bodyForm) {
        return new ElectricGuitar(countStrings, bodyForm);
    }

    public void getStatus(){
        volContr.pickup.setSound();
        System.out.println("countStrings:" + getStrings() + " bodyForm:" + getBody() + " volume = " + volContr.getVolume() + " sound = " + volContr.pickup.getSound());
    }

    @Override
    public void play(){
        System.out.println("Вжж вжж вжжжжж)");
    }
}
