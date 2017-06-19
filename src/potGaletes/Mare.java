package potGaletes;
/*posa galetes*/
public class Mare extends Thread{	
	Pot pot;
	
	public Mare(Pot p,String name){
		super(name);
		this.pot = p;
	}
	
	@Override
	public void start(){
		pot.Agafa();
		System.out.println("Hola! Sóc la " + getName() +". Com que ja no hi ha galetes, en posaré 20 més.");
		Pot.galetes = 20;	
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Ja he posat les galetes!");
		pot.Deixa();
	}	
}