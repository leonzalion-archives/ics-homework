class ReviewP11 {
	public static void main(String[] args) {
		int h = 1;
		int m = 40;
		int s = 35;

		double runningTimeInHours = h + m / 60.0 + s / 60.0 / 60.0;

		double kilometers = 24 * 1.6;

		double kilometersPerHour = kilometers / runningTimeInHours;

		System.out.println("The average speed of the runner is " + kilometersPerHour + " kilometers/hour");
	}	
}
