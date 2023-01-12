/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS_A_model;

import java.util.List;

/**
 *
 * @author Abennaya
 */
public class NasabahDaoImpl {
public interface NasabahDao {
    void save(Nasabah nasabah);
    void update(int index, Nasabah nasabah);
    void delete (int index);
    Nasabah getAnggota(int index);
    List<Nasabah> getAll();
}

}
