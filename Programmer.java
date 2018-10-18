public class Programmer extends Karyawan{
	public void setGaji(int gaji){
		if(gaji<=90){
			System.out.println("Gaji anda sebagai programmer sebesar = "+gaji);
		}else {
			System.out.println("Maaf gaji anda terlalu banyak ..!");
		}
	}
}