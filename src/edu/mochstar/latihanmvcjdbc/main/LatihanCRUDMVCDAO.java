/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.mochstar.latihanmvcjdbc.main;

import edu.mochstar.latihanmvcjdbc.database.KingsBarberShopDatabase;
import edu.mochstar.latihanmvcjdbc.entity.Pelanggan;
import edu.mochstar.latihanmvcjdbc.error.PelangganException;
import edu.mochstar.latihanmvcjdbc.service.PelangganDao;
import edu.mochstar.latihanmvcjdbc.view.MainViewPelanggan;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/**
 *
 * @author Star Ramadhan
  * 
 * NIM : 10116482
 * Nama : Moch. Star Ramadhan
 * Kelas : PBO-11
 * 
 */
public class LatihanCRUDMVCDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException{
        // TODO code application logic here
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                try {
                    MainViewPelanggan pelanggan = new MainViewPelanggan();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch (SQLException e) {
                } catch (PelangganException ex) {
                    Logger.getLogger(LatihanCRUDMVCDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
    }
    
}
