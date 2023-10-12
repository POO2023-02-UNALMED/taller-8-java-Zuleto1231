package futbol;

public class prueba {

	public static void main(String[] args) {
		Portero p = new Portero("Santiago", 23, (short) 6, (byte) 8);
		Jugador  j = new Jugador();
		Futbolista f = new Futbolista() {
		
			@Override
			public int compareTo(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public boolean jugarConLasManos() {
				// TODO Auto-generated method stub
				return false;
			}
		};
		System.out.println(f);
		System.out.println(j);
		System.out.println(p);
	}

}
