/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.compuventas.prueba;
import java.util.List;
import pe.egcc.compuventas.model.Promocion;
import pe.egcc.compuventas.service.espec.PromocionServiceEspec;
import pe.egcc.compuventas.service.impl.PromocionServiceImpl;

/**
 *
 * @author Carlos
 */
public class Prueba08 {
    public static void main(String[] args) {
        try {
      // Dato
      Promocion bean = new Promocion();
      bean.setNombre("");
      // Proceso
            PromocionServiceEspec service;
      service = new PromocionServiceImpl();
      List<Promocion> lista = service.getPromociones();
      for (Promocion p : lista) {
        System.out.println(p.getIdprod() + " - " +  " - " +  p.getPrecio() + " - " + p.getOferta());
      }
    } catch (Exception e) {
      System.err.println(e.getMessage());
    }
    }
}
