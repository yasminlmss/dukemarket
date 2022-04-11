/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package local.yls.dukemarket.app;

import local.yls.dukemarket.bean.Produto;
import local.yls.dukemarket.dao.ProdutoDAO;

/**
 *
 * @author devsys-b
 */
public class DukeMarketApp {
    
    
    public static void main(String[] args) {
    
        Produto pAux;
        ProdutoDAO pDAO = new ProdutoDAO();
 
/*        
        //Teste de inclusão de produto
        pAux = new Produto();
        pAux.setCodBarras("11111111111");
        pAux.setDescricao("Mouse Logitec Bluetooth");
        pAux.setQtd(50);
        pAux.setValorCompra(80.00);
        pAux.setValorVenda(167.00);

        pDAO.create(pAux);

        pAux = new Produto();
        pAux.setCodBarras("222222222");
        pAux.setDescricao("Teclado USB Gamer");
        pAux.setQtd(80);
        pAux.setValorCompra(104.00);
        pAux.setValorVenda(220.00);

        pDAO.create(pAux);

          pAux = new Produto();
        pAux.setCodBarras("3333333333");
        pAux.setDescricao("Moicrocomputador Dell");
        pAux.setQtd(50);
        pAux.setValorCompra(2400.00);
        pAux.setValorVenda(3200.00);

        pDAO.create(pAux);
*/        

/*     
        // delete
        pDAO.delete(3);
        
        //update
        pDAO.getResults().forEach(p -> {
            System.out.println(p.toString());
        });
*/

        //Teste de alteração de produto
        pAux = pDAO.getResultById(1);
        pAux.setQtd(100);
        pDAO.update(pAux);
        
        

        //Lista geral
        pDAO.getResults().forEach(p -> {
            System.out.println(p.toString());
        });
    }
}
    
    

    

