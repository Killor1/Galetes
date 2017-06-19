package potGaletes;
/*cogen galletas*/
import java.util.Random;

public class Fills extends Thread{
	Pot pot;
	Mare mare;
	Random rand;
	
	public Fills(Pot p, String nom, Mare m) {
		super(nom);
		this.pot = p;
		this.rand = new Random();
		this.mare = m;
	}

	@Override
	public void run() {
		//Agafa el pot
		for(;;) {
			if(Pot.galetes == 0){
				mare.start();
			}
			else{
				pot.Agafa();
				int galeta = rand.nextInt(4)+1; // Tria les galetes
				if(galeta > Pot.galetes){
					galeta = Pot.galetes;
				}
				Pot.galetes -= galeta;
				System.out.println(getName() + " ha agafat " + galeta + " galetes. Galetes restants: " + Pot.galetes);
				try {
					Thread.sleep((long) (Math.random()*800)+200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				pot.Deixa();
				try {
					System.out.println(getName() + " ja no vol més galetes");
					Thread.sleep((long) (Math.random()*1000)+500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}