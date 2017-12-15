package Items.Instruments;

public enum FamilyType {

    PERCUSSION("Percussion"),
    STRING("String"),
    BRASS("Brass"),
    WOODWIND("Woodwind"),
    KEYBOARD("Keyboard");


    private String name;

    FamilyType(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

}
