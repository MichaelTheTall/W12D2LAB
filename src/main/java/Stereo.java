public class Stereo {
    private String name;
    private String make;
    private String model;
    private Radio radio;
    private CDplayer cdplayer;
    private AUX aux;

    public Stereo(String name, String make, String model, Radio radio, CDplayer cdplayer, AUX aux){
        this.name = name;
        this.make = make;
        this.model = model;
        this.radio = radio;
        this.cdplayer = cdplayer;
        this.aux = aux;
    }

    public String getName() {
        return name;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Radio getRadio() {
        return radio;
    }

    public CDplayer getCdplayer() {
        return cdplayer;
    }

    public AUX getAux() {
        return aux;
    }



}
