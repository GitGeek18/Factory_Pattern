package assign1;

public class Bike implements Vehicle{


    @Override
    public int getOffset() {
        return 1;
    }
    @Override
    public String findWheelCount(){
        return "2 Wheels";
    }

    @Override
    public int getAvg() {
        return 10;
    }
}
