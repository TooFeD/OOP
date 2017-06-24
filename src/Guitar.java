public abstract class Guitar implements Instruments{
    //void setGuitarStrings(int countStrings);

    //void setBodyForm(String bodyForm);
    private int guitarStrings;
    private String body;

    Guitar(int countStrings, String bodyForm){
        guitarStrings = countStrings;
        body = bodyForm;
    }

    public int getStrings(){
        return guitarStrings;
    }

    public String getBody(){
        return body;
    }

    public String play (){
        return "До ре ми";
    }
/*
static Guitar createGuitar(int guitarStrings, String body) {
// return new Guitar(guitarStrings, body);
}
*/


}
