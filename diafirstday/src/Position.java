public class Position {
    private int PosId;
    private String PosName;

    public Position(int PosId, String PosName) {
        this.PosId = PosId;
        this.PosName = PosName;
    }

    public int getPosId() {
        return PosId;
    }

    public void setPosId(int posId) {
        PosId = posId;
    }

    public String getPosName() {
        return PosName;
    }

    @Override
    public String toString() {
        return "Position ID: " + PosId + ", Position Name: " + PosName;
    }

    public void setPosName(String posName) {
        PosName = posName;
    }
}
