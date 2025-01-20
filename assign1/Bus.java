package assign1;

public class Bus implements Vehicle {
    public int getOffset() {
        return 3;
    }
    @Override
    public String findWheelCount(){
        return "6 Wheels";
    }

    @Override
    public int getAvg() {
        return 30;
    }
}
