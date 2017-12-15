package Items.Instruments;

public enum GuitarType {

    ACOUSTIC("Acoustic"),
    ELECTRIC("Electric"),
    SEMI_ACCOUSTIC("Semi-acoustic");

    private String type;

    GuitarType(String type){
        this.type = type;
    }

    String getGuitarTypeName(){
        return this.type;
    }



}


