/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author julisanchez
 */
@Entity
public class curso extends clase implements Serializable {
    private String profesores;

    public curso() {
    }
}
