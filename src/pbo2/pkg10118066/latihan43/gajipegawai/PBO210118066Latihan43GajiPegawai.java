/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118066.latihan43.gajipegawai;

/**
 *
 * @author
 * NAMA    : Tegar Lucky'q Oakley
 * KELAS   : IF 2
 * NIM     : 10118066
 */
public class PBO210118066Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GajiPegawai gape = new GajiPegawai();
        gape.setNama("Tegar Lucky'q Oakley");
        gape.setAlamat("Jl. Unikom weh lah");
        gape.setUangTunjangan(300000);
        gape.setUangTransport(250000);
        gape.setGajiPokok(4500000);
        gape.totalGaji(gape.getUangTunjangan(), gape.getUangTransport(), gape.getGajiPokok());
        gape.tampilData(gape.getNama(), gape.getAlamat(), gape.getUangTunjangan(), gape.getUangTransport(), gape.getGajiPokok(), gape.getTotalGaji());
    }
    
}
