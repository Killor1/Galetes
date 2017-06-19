package potGaletes;

public class Familia {
	
	public static void main(String[] args) {
		Pot pot = new Pot();
		Mare mare = new Mare(pot,"Maria");
        Fills Joan = new Fills(pot,"Joan",mare);
        Fills Ana = new Fills(pot,"Ana",mare);
        Fills Pere = new Fills(pot,"Pere",mare);

        Joan.start();
        Ana.start();
        Pere.start();
	}

}
