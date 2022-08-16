import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		System.out.println("Instantiate objects here!");

		MelonType musk = new MelonType("musk", "Muskmelon", 1998, "green", true, true);

		MelonType casaba = new MelonType("cas", "Casaba", 2003, "orange", false, false);

		MelonType crenshaw = new MelonType("cren", "Crenshaw", 1996, "green", false, false);

		MelonType yellowWatermelon = new MelonType("yw", "Yellow Watermelon",2013, "yellow", false, true);

		ArrayList<MelonType> types = new ArrayList<>();

		types.add(musk);

		types.add(casaba);

		types.add(crenshaw);

		types.add(yellowWatermelon);

		ArrayList<Melon> melons = new ArrayList<>();


		melons.add(new Melon(types.get(types.indexOf(yellowWatermelon)), 8, 7, 2, "Sheila"));

		melons.add(new Melon(types.get(types.indexOf(yellowWatermelon)), 3, 4, 2, "Sheila"));

		melons.add(new Melon(types.get(types.indexOf(casaba)), 10, 6, 35, "Sheila"));

		melons.add(new Melon(types.get(types.indexOf(crenshaw)), 8, 9, 35, "Michael"));

		melons.add(new Melon(types.get(types.indexOf(crenshaw)), 8, 2, 35, "Michael"));

		melons.add(new Melon(types.get(types.indexOf(musk)), 6, 7, 4, "Michael"));

		melons.add(new Melon(types.get(types.indexOf(yellowWatermelon)), 7, 10, 3, "Sheila"));

		getSellabilityReport(melons);

	}

	public static void getSellabilityReport(ArrayList<Melon> arr)
	{
		String sellable;
		for (Melon melon: arr)
		{
			if(melon.isSellable())
				sellable = "CAN BE SOLD";
			else
				sellable = "NOT SELLABLE";

			System.out.println("Harvested by " +
					melon.harvester +
					" from Field " +
					melon.field + "(" +
					sellable + ")"
			);
		}
	}

}
