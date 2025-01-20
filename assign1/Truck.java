package assign1;

public class Truck implements  Vehicle{
    public int getOffset() {
        return 4;
    }
    @Override
    public String findWheelCount(){
        return "8 Wheels";
    }

    @Override
    public int getAvg() {
        return 40;
    }
}
