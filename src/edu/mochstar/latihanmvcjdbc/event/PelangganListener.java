/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mochstar.latihanmvcjdbc.event;

import edu.mochstar.latihanmvcjdbc.entity.Pelanggan;
import edu.mochstar.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author Star Ramadhan
  * 
 * NIM : 10116482
 * Nama : Moch. Star Ramadhan
 * Kelas : PBO-11
 * 
 */
public interface PelangganListener {

    public void onChange(PelangganModel model);

    public void onInsert(Pelanggan pelanggan);

    public void onDelete();

    public void onUpdate(Pelanggan pelanggan);
}
