public class Main {

    public static void main(String[] args) {
        AcousticGuitar yamahaF310 = AcousticGuitar.createGuitar(6,"symmetrical");
        ElectricGuitar fenderStratocaster = ElectricGuitar.createGuitar(6,"strat");
        AcousticGuitar gibsonAcoustic = AcousticGuitar.createGuitar(12,"asymmetrical");

        System.out.println("---=== Acoustic Guitar Yamaha F310 ===---");
        yamahaF310.getStatus();
        yamahaF310.play();

        System.out.println("---=== Electric Guitar Fender Stratocaster ===---");
        fenderStratocaster.play();
        fenderStratocaster.volContr.incVolume();
        fenderStratocaster.volContr.incVolume();
        fenderStratocaster.getStatus();
        fenderStratocaster.volContr.decVolume();
        fenderStratocaster.volContr.incTone();
        fenderStratocaster.getStatus();

        System.out.println("---=== Acoustic Guitar Gibson ===---");
        gibsonAcoustic.getStatus();
        gibsonAcoustic.play();

    }
}
