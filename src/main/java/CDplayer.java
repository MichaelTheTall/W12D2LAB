import java.util.ArrayList;

public class CDplayer extends Component {

    private int numOfCDs;
    private CD currentCD;

    private ArrayList<CD> cds;

    public CDplayer(String make, String model, int numOfCDs){
        super(make, model);
        this.numOfCDs = numOfCDs;
        this.cds = new ArrayList<>();
        this.currentCD = null;
    }

    public int getNumOfCDs() {
        return numOfCDs;
    }

    public ArrayList<CD> getCds() {
        return cds;
    }

    public void cdIn(CD cd){
        if (cds.size() < numOfCDs){
            cds.add(cd);
            currentCD = cd;
        }
    }

    public void eject(CD cd){
        if (cds.contains(cd)) {
            cds.remove(cd);
        }
    }

    public CD getCurrentCD() {
        return currentCD;
    }

    public void changeCD(CD cd) {
        if (cds.contains(cd)) {
            currentCD = cd;
        }
    }
}
