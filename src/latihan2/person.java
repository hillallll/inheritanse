/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

/**
 *
 * @author Hillal
 */
public class person {
    private final String nama;
    private final int usia;
    
    public person (String nama, int usia)
    {
        this.nama = nama;
        this.usia = usia;
    }
    
    public void info ()
    {
        System.out.println("Nama: " + this.nama);
        System.out.println("Usia: " + this.usia);
    }
}
