public class Tower {
    private Floor koma1;
    private Floor koma2;

    public Tower(Floor fl1, Floor fl2) {
        this.koma1 =fl1;
        this.koma2 = fl2;
    }

    @Override
    public String toString(){
        return "tower:\n" + this.koma1.toString() + "\n" + this.koma2.toString();
    }
}
