public class Floor {

    private int num;
    private String floorName;
    private Animal animal;

    public Floor(int num, Animal animal) {
        this.animal=animal;
        this.num = num;
        this.floorName = String.valueOf(this.num);
    }

    @Override
    public String toString(){
        return "in floor " + this.floorName + " you hear: " + this.animal.getSound();
    }

    


}
