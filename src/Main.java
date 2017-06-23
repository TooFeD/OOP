public class Main {

    public static void main(String[] args) {
        AcousticGuitar yamahaF310 = AcousticGuitar.createGuitar(6,"symmetrical");
        ElectricGuitar fenderStratocaster = ElectricGuitar.createGuitar(6,"strat");
        AcousticGuitar gibsonAcoustic = AcousticGuitar.createGuitar(12,"asymmetrical");

        System.out.println("---=== Acoustic Guitar ===---");
        yamahaF310.getStatus();
        yamahaF310.play();

        System.out.println("---=== Electric Guitar ===---");
        fenderStratocaster.getStatus();
        fenderStratocaster.volContr.incVolume();
        fenderStratocaster.volContr.incTone();
        fenderStratocaster.getStatus();
        fenderStratocaster.play();

        System.out.println("---=== Acoustic Guitar ===---");
        gibsonAcoustic.getStatus();
        gibsonAcoustic.play();

    }
}
