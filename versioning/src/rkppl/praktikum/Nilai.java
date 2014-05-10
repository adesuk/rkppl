package rkppl.praktikum;

public class Nilai {
	private Mahasiswa mhs;
	private Matakuliah matkul;
	private double nilai;
	
	public Nilai() {
		// TODO Auto-generated constructor stub
	}

	public Nilai(Mahasiswa mhs, Matakuliah matkul, double nilai) {
		super();
		this.mhs = mhs;
		this.matkul = matkul;
		this.nilai = nilai;
	}

	public Mahasiswa getMhs() {
		return mhs;
	}

	public void setMhs(Mahasiswa mhs) {
		this.mhs = mhs;
	}

	public Matakuliah getMatkul() {
		return matkul;
	}

	public void setMatkul(Matakuliah matkul) {
		this.matkul = matkul;
	}

	public double getNilai() {
		return nilai;
	}

	public void setNilai(double nilai) {
		this.nilai = nilai;
	}
	
	@Override
	public String toString() {
		return mhs.getNrp().concat("-").concat(matkul.getNamaMatkul()).concat("-").concat(Double.toString(nilai));
	}
}
