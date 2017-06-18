public class Main {

    public static void main(String[] args) {
        AcousticGuitar yamahaF310 = new AcousticGuitar();
        ElectricGuitar fenderStratocaster = new ElectricGuitar();
        ElectroAcousticGuitar fenderStratoAcoustic = new ElectroAcousticGuitar();

        System.out.println("---=== Acoustic Guitar ===---");
        yamahaF310.setGuitarStrings(6);
        yamahaF310.setBodyForm("symmetrical");
        yamahaF310.printStatus();

        System.out.println("---=== Electric Guitar ===---");
        fenderStratocaster.setGuitarStrings(6);
        fenderStratocaster.setBodyForm("strat");
        fenderStratocaster.printStatus();
        fenderStratocaster.volContr.changeVolume(2);
        fenderStratocaster.printStatus();

        System.out.println("---=== ElectroAcoustic Guitar ===---");
        fenderStratoAcoustic.setGuitarStrings(6);
        fenderStratoAcoustic.setBodyForm("asymmetrical");
        fenderStratoAcoustic.volContr.changeVolume(5);
        fenderStratoAcoustic.printStatus();

    }
}
