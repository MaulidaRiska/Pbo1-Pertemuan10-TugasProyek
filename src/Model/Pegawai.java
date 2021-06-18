package Model;

import java.time.*;

public class Pegawai {

    // atribut
    String idPegawai;
    String nama;
    LocalDate tglLahir;
    String Alamat;
    int NoTelp;
    String Status;
    int gol;
    String AwalKerja;

    // constructor
    Pegawai(String id, String nama,LocalDate tgllhr, String Alamat, int NoTelp, String Status, int gol, String AwalKerja){
        this.idPegawai = id;
        this.nama = nama;
        this.tglLahir = tgllhr;
        this.Alamat = Alamat;
        this.NoTelp = NoTelp;
        this.Status = Status;
        this.gol = gol;
        this.AwalKerja = AwalKerja;
    }

}
