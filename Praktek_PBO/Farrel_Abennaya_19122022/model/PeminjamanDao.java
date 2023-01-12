/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Farrel_Abennaya_19122022.model;

import java.util.List;

/**
 *
 * @author Abennaya
 */
public class PeminjamanDao {
    void save(Peminjaman peminjaman);
    void update(int index,Peminjaman peminjaman);
    void delete (int index); 
    Buku getBuku(int index);
    List<Buku>getAll();
}
