public class Position {
    private int posId;
    private String posName;

    public Position(int posId, String posName) {
        this.posId = posId;
        this.posName = posName;
    }

    public int getPosId() {
        return posId;
    }

    public void setPosId(int posId) {
        posId = posId;
    }

    public String getPosName() {
        return posName;
    }

    @Override
    public String toString() {
        return " Position ID: " + posId + ", Position Name: " + posName;
    }

    public void setPosName(String posName) {
        posName = posName;
    }
}
