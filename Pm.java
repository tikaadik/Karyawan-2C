public class Pm extends Karyawan{
	public void setGaji(int gaji){
		if(gaji<=100){
			System.out.println("Gaji Anda Sebagai Project Manager Sebesar = "+gaji);
		}else{
			System.out.println("Maaf gaji anda terlalu banyak ..!");
		}
	}
}