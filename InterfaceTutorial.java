
public class InterfaceTutorial implements Tutorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Tutorial a = new InterfaceTutorial();
a.TrafficLightsGreen();
a.TrafficLightsRed();
a.TrafficLightsYellow();

	}

	@Override
	public void TrafficLightsGreen() {
		// TODO Auto-generated method stub
		System.out.println("Go");
	}

	@Override
	public void TrafficLightsRed() {
		// TODO Auto-generated method stub
		System.out.println("stop");
	}

	@Override
	public void TrafficLightsYellow() {
		// TODO Auto-generated method stub
		System.out.println("dont know");
	}

}
