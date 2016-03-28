public class calculate {
	public static void main(String[] arg){

        System.out.println("calculate...");
        int first = Integer.valueOf(arg[0]);
        int second = Integer.valueOf(arg[1]);
        int summ = first + second;
        int sqr = first * second;
        int minus = first - second;
            System.out.println("Sum "+ summ);
            System.out.println("sqr "+ sqr);
            System.out.println("minus "+ minus);
    }
}