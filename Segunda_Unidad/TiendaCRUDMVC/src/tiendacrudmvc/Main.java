/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiendacrudmvc;

/**
 *
 * @author antho
 */

import Controlador.ControladorPrincipal;
import Controlador.ControladorProducto;
import Modelo.Conexion;
import Modelo.ConsultasProducto;
import Modelo.Producto;
import Vista.VPrincipal;

import Vista.VProducto;

public class Main {


    public static void main(String[] args) {
        Producto pro = new Producto();
        ConsultasProducto proC = new ConsultasProducto();
        VProducto frmPro = new VProducto();
        ControladorProducto ctrlPro = new ControladorProducto(pro,frmPro, proC);
        VPrincipal frmPri = new VPrincipal();
        ControladorPrincipal ctrlPri = new ControladorPrincipal(frmPri, frmPro);
        ctrlPri.inciar();
        frmPri.setVisible(true);

    }
    
}
