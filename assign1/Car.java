package assign1;

public class Car implements Vehicle{
    public int getOffset() {
        return 2;
    }
    @Override
    public String findWheelCount(){
        return "4 Wheels";
    }
    @Override
    public int getAvg() {
        return 20;
    }
}
