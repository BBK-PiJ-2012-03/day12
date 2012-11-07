public class Comparator {
	public double getMax(int n, int m) {
	double d1 = (double) n;
	double d2 = (double) m;
	return(getMax(d1,d2));
	}
	
	public double getMax(String number1, String number2) {
	double d1 = Double.parseDouble(number1);
	double d2 = Double.parseDouble(number2);
	return(getMax(d1,d2));
	}
	
	public double getMax(double d1, double d2) {
		if (d1 > d2) {
			return d1;
		} else {
			return d2;
		  }
	}
}