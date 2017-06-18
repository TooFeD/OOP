public class AcousticGuitar implements Guitar {
    String body;
    int guitarStrings;

    public void setGuitarStrings(int countStrings){
        guitarStrings = countStrings;
    }

    public void setBodyForm(String bodyForm){
        body = bodyForm;
    }

    public void printStatus(){
        System.out.println("countStrings:" + guitarStrings + " bodyForm:" + body);
    }
}
