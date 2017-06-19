package potGaletes;
/*on es posen les galetes*/

public class Pot {
	private boolean lliure;
	public static int galetes = 20;
	
	public Pot() {
		lliure = true;
	}
	
	public synchronized void Agafa() {
		try {
			while(!lliure) wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		lliure = false;
		notifyAll();
	}

	public synchronized void Deixa() {
		lliure = true;
		notifyAll();
	}
}