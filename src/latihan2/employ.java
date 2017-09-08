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
public class employ extends person{
    private final String noKaryawan;
    
    public employ (String noKaryawan, String nama, int usia)
    {
        super(nama, usia);
        this.noKaryawan = noKaryawan;
    }        

    public void info ()
    {
        System.out.println("No. Karyawan: " + this.noKaryawan);
        super.info();
    }
}
