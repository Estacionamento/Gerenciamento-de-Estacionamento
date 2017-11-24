/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sprint2.pkg2.Atendente;

public class AtendenteTest{
    
    @Test
    public void testeValido1(){
        Atendente a = new Atendente();
        assertEquals(a.validaFuncionario("José da Silva","43987844577", "Rua das Palmeiras 23", "jose@gmail.com"), "Cadastro realizado");
    }
    
    @Test
    public void testeInvalidoNome1(){
        Atendente a = new Atendente();
        assertEquals(a.validaFuncionario("Jos","43987844577", "Rua das Palmeiras 23", "jose@gmail.com"), "Nome inválido");
    }
    
    @Test
    public void testeInvalidoNome2(){
        Atendente a = new Atendente();
        assertEquals(a.validaFuncionario("JJJ JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ JJJJJJJJJJJJJJJJJ","43987844577", "Rua das Palmeiras 23", "jose@gmail.com"), "Nome inválido");
    }

    @Test
    public void testeInvalidoNome3(){
        Atendente a = new Atendente();
        assertEquals(a.validaFuncionario("Joseeee","43987844577", "Rua das Palmeiras 23", "jose@gmail.com"), "Nome inválido");
    }
    
    @Test 
    public void testeInvalidoCpf1(){
        Atendente a = new Atendente();
        assertEquals(a.validaFuncionario("José da Silva", "4398784457", "Rua das Palmeiras 23", "jose@gmail.com"), "Cpf inválido");
    }
    
   
    @Test 
    public void testeInvalidoEndereco1(){
        Atendente a = new Atendente();
        assertEquals(a.validaFuncionario("José da Silva", "43987844577", "Rua", "jose@gmail.com"), "Endereço inválido");
    }
    
     @Test 
    public void testeInvalidoEndereco2(){
        Atendente a = new Atendente();
        assertEquals(a.validaFuncionario("José da Silva", "43987844577", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "jose@gmail.com"), "Endereço inválido");
    }
    
    @Test 
    public void testeInvalidoEmail1(){
        Atendente a = new Atendente();
        assertEquals(a.validaFuncionario("José da Silva", "43987844577", "Rua das Palmeiras", "jose@gmail"), "E-mail inválido");
    }
    
     @Test 
    public void testeInvalidoEmail2(){
        Atendente a = new Atendente();
        assertEquals(a.validaFuncionario("José da Silva", "43987844577", "Rua das Palmeiras", "facebook.com"), "E-mail inválido");
    }
    
     @Test 
    public void testeInvalidoEmail3(){
         Atendente a = new Atendente();
        assertEquals(a.validaFuncionario("José da Silva", "43987844577", "Rua das Palmeiras", "emailpontocom"), "E-mail inválido");
    }
    
     @Test 
    public void testeInvalidoEmail4(){
         Atendente a = new Atendente();
        assertEquals(a.validaFuncionario("José da Silva", "43987844577", "Rua das Palmeiras", "jo@."), "E-mail inválido");
    }
    
     @Test 
    public void testeInvalidoEmail5(){
         Atendente a = new Atendente();
        assertEquals(a.validaFuncionario("José da Silva", "43987844577", "Rua das Palmeiras", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa@gmail.com"), "E-mail inválido");
    }
    
     @Test 
    public void testeInvalidoEmail6(){
         Atendente a = new Atendente();
        assertEquals(a.validaFuncionario("José da Silva", "43987844577", "Rua das Palmeiras", ""), "E-mail inválido");
    }
    

   
}
