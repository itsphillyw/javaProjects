import java.lang.Math;
import java.util.Scanner;
public class TaskFive {


		public static void main(String[] args) {
			Scanner reader = new Scanner(System.in);
			System.out.println("Enter the room's surface area: ");
			double RoomArea = reader.nextInt(); 
			Paints CheapoMax = new Paints(200,0.10,19.99);
			System.out.println("CheapoMax tins required: " + CheapoMax.TotalPaints (RoomArea));
			System.out.println("CheapoMax cost of wasted paint: " + CheapoMax.PaintWastedCost (RoomArea));
			System.out.println("CheapoMax toal cost: " + CheapoMax.costTotal (RoomArea));
			Paints AverageJoes = new Paints(165,0.109,17.99);
			System.out.println("AverageJoes tins required: " + AverageJoes.TotalPaints (RoomArea));
			System.out.println("AverageJoes cost of wasted paint: " + AverageJoes.PaintWastedCost (RoomArea));
			System.out.println("AverageJoes toal cost: " + AverageJoes.costTotal (RoomArea));
			Paints Dulux = new Paints(200,0.125,25.0);
			System.out.println("Duluxourous tins required: " + Dulux.TotalPaints (RoomArea));
			System.out.println("Duluxourous cost of wasted paint: " + Dulux.PaintWastedCost (RoomArea));
			System.out.println("Duluxourous toal cost: " + Dulux.costTotal (RoomArea));
		
		}

}

class Paints {
	private static int TinCoverage;
	private static double CostPerMeter;
	private static double TinCost;
	private static double Tinsneeded;
	private static double PaintCost;
	public static double WastedCost; 
	
	public Paints(int t, double c, double tin){
		TinCoverage = t;
		CostPerMeter = c;
		TinCost = tin; 

}
	public static double TotalPaints(double RoomArea){ //Calculates tins needed for the room
		Tinsneeded = Math.ceil(RoomArea/TinCoverage);
		return Tinsneeded;
	}
	
	public static double PaintWastedCost(double RoomArea){ //Calculates the cost of unused paint
		WastedCost = ((Tinsneeded*TinCoverage)-RoomArea)*CostPerMeter;
		return WastedCost;
	}
	public static double costTotal(double tinsNeeded){ //cost of required tins	
	PaintCost =  Tinsneeded*TinCost;
		return PaintCost;
	}

		
	
}



