/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chintia_uts_strukturdata;

/**
 *
 * @author Asus
 */
class Mahasiswa {

    int id;
    String name;
    String kelas;
    int tglmasuk;

    public Mahasiswa(int Id, String Name, String Kelas, int tglmasuk) {
        this.id = Id;
        this.name = Name;
        this.kelas = Kelas;
        this.tglmasuk = tglmasuk;
    }

    public int getId() {
        return id;
    }

    public void setId(int Id) {
        this.id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public int gettglmasuk() {
        return tglmasuk;
    }

    public void setTglmasuk(int tglmasuk) {
        this.tglmasuk = tglmasuk;
    }

    public String toString() {
        return "" + "Id = " + id + ", Nama = " + name + ", Kelas = " + kelas + ", TglMasuk = " + tglmasuk;
    }
}
