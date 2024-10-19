package oops;

class Bike {
	int speedlimit = 90;
}

class OverrideDataMembers extends Bike {
	int speedlimit = 150;

	public static void main(String args[]) {
		Bike obj = new OverrideDataMembers();
		System.out.println(obj.speedlimit);// 90
	}
}