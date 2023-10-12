package futbol;

public class Portero extends Futbolista {
	public short golesRecibidos;
	public byte dorsal;
	

	public Portero(String nombre,int edad, short golesRecibidos,byte dorsal) {
		super(nombre,edad,"Portero");
		this.golesRecibidos=golesRecibidos;
		this.dorsal=dorsal;
		}
		
	@Override
	public int compareTo(Object o) {
	    if (o instanceof Portero) {
	        Portero portero = (Portero) o; // Realizamos un casting a tipo Portero
	        return Math.abs(this.golesRecibidos - portero.golesRecibidos);
	    } else {
	        
	        return 0; 
	    }
	}
	
	@Override
	public boolean jugarConLasManos() {
		
		return true;
	}
	
	public String toString() {
return "El futbolista "+this.getNombre()+" tiene "+this.getEdad()+ ", y juega de "+this.getPosicion()+" con el dorsal "+this.dorsal+ ". Le han marcado "+this.golesRecibidos;
	}
	
	
	

}
