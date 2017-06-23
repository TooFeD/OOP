public class AcousticGuitar extends Guitar {

    private AcousticGuitar(int countStrings, String bodyForm) {
        super(countStrings, bodyForm);
    }

    public static AcousticGuitar createGuitar(int countStrings, String bodyForm) {
        return new AcousticGuitar(countStrings, bodyForm);
    }

    public void getStatus(){
        System.out.println("countStrings:" + getStrings() + " bodyForm:" + getBody());
    }
}
