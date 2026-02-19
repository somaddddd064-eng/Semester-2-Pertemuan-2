public class StudentMain17 {

    public static void main(String[] args){
        Mahasiswa17 mhs1 = new Mahasiswa17();
        mhs1.nama = "Muhamad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa17 mhs2 = new Mahasiswa17("Anisa Nabila","2141720160","TI 2l",3.25);
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();


    }
}