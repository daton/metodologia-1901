/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author campitos
 */
public class TarjetaCredito extends Tarjeta{
    public void pagar(float deposito){
        setSaldo((getSaldo()+deposito)-deposito*0.03f); 
    }
}

   