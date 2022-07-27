/*
  $ javac Stats.java
  $ java Stats --product 2 3 4
  24.0
  $ java Stats --mean 5 9 7
  7.0
  $ java Stats --total 1 9 4
  14.0
  $ java Stats --max 9 1 4 0
  9.0
  $ java Stats --min 9 1 4 0
  0.0
  $ java Stats --mix 3 4 5
  Bad option --mix
 */
public class Stats {
	static double sumOfArgs(String[] args) {
		double sum = 0.0;
		for(int index = 1; index < args.length; index += 1) {
			sum = sum + Double.parseDouble(args[index]);
		}
		return sum;
	}
	public static void main(String[] args) {
		if(args[0].equals("--product")) { // Don't use == on strings
			double product = 1.0;
			for(int index = 1; index < args.length; index += 1) {
				product = product * Double.parseDouble(args[index]);
			}
			System.out.println(product);
		}
		else if(args[0].equals("--mean")) {
			double sum = sumOfArgs(args);
			double mean = sum / (args.length - 1);
			System.out.println(mean);
		}
		else if(args[0].equals("--total")) {
			double sum = sumOfArgs(args);
			System.out.println(sum);
		}
		else if(args[0].equals("--min")) {
			double min = Double.parseDouble(args[1]); /// what is the initial value for min?
			for(int index = 1; index < args.length; index += 1) {
				double value = Double.parseDouble(args[index]);
				if(value < min) {
					min = value;
				}
			}
			System.out.println(min);
		}
		else {
			System.out.println("Bad option " + args[0]);
		}
	}
}
