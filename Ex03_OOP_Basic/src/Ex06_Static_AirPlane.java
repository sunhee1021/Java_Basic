import kr.or.bit.AirPlane;

public class Ex06_Static_AirPlane {

    public static void main(String[] args) {
        AirPlane air = new AirPlane();
        air.makeAirPlane(707, "대한");
        
        AirPlane air2 = new AirPlane();
        air2.makeAirPlane(708, "대한");
        
        air2.airPlaneTotalCount();
        
        AirPlane air3 = new AirPlane();
        air3.makeAirPlane(709, "대한");
        
        air3.airPlaneTotalCount();
    }

}
