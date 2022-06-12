package demo;

public class Thermos {
	double liquid;
	double capacity;
public Thermos(){
	capacity = 1.0;
}
public void addLiquid(double juice) {
	liquid = liquid + juice;
	capacity = capacity - liquid;
	
}
public void Display() {
	System.out.println("Liquid in Thermos: "+String.format("%.1f",liquid)+" ltrs");
	System.out.println("Capacity left: "+String.format("%.1f",capacity)+" ltrs");
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thermos t1 = new Thermos();
		t1.addLiquid(0.4);
		t1.Display();

	}

}
