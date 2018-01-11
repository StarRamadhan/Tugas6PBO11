/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mochstar.latihanmvcjdbc.service;

import edu.mochstar.latihanmvcjdbc.entity.Pelanggan;
import edu.mochstar.latihanmvcjdbc.error.PelangganException;
import java.util.List;

/**
 *
 * @author Star Ramadhan
  * 
 * NIM : 10116482
 * Nama : Moch. Star Ramadhan
 * Kelas : PBO-11
 * 
 */
public interface PelangganDao {

    public void insertPelanggan(Pelanggan pelanggan) throws PelangganException;

    public void updatePelanggan(Pelanggan pelanggan) throws PelangganException;

    public void deletePelanggan(Integer id) throws PelangganException;

    public Pelanggan getPelanggan(Integer id) throws PelangganException;

    public Pelanggan getpPelanggan(String email) throws PelangganException;

    public List<Pelanggan> selectAllPelanggan() throws PelangganException;
}
