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
import cadastrocliente.*;

/**
 *
 * @author gisel
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void test1(){ //cidade > 50
    Cadastrocliente cad = new Cadastrocliente();
    assertEquals(false, cad.ValidarCliente(11,"43987844579", "José da Silva", "Rua das Palmeiras, 23", 
            "Curitibaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "jose@gmail.com", "4339987655"));
    }
    
    @Test
    public void test2(){ //cidade < 5
    Cadastrocliente cad = new Cadastrocliente(); //cidade invalida 2
    assertEquals(false, cad.ValidarCliente(11,"43987844579", "José da Silva", "Rua das Palmeiras, 23", 
            "Cur", "jose@gmail.com", "4339987655"));
    }
    
    @Test
    public void test3(){ //nome muito grande
    Cadastrocliente cad = new Cadastrocliente();
    assertEquals(false, cad.ValidarCliente(11,"43987844573", "José da Silva silva silva silva silva silva aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa silva silva silva", "Rua das Palmeiras, 23", 
            "Curitiba", "jose@gmail.com", "4339987655"));
    }
    
    @Test
    public void test4(){
    Cadastrocliente cad = new Cadastrocliente(); //nome muito pequeno
    assertEquals(false, cad.ValidarCliente(11,"43987844573", "José", "Rua das Palmeiras, 23", 
            "Curitiba", "jose@gmail.com", "4339987655"));
    }
    
    @Test
    public void test5(){
    Cadastrocliente cad = new Cadastrocliente(); //nome sem espaço
    assertEquals(false, cad.ValidarCliente(11,"43987844573", "JosédaSilva", "Rua das Palmeiras, 23", 
            "Curitiba", "jose@gmail.com", "4339987655"));
    }
    
    @Test
    public void test6(){
    Cadastrocliente cad = new Cadastrocliente(); //cpf < 11
    assertEquals(false, cad.ValidarCliente(11,"4398784457", "José da Silva", "Rua das Palmeiras, 23", 
            "Curitiba", "jose@gmail.com", "4339987655"));
    }
    
    @Test
    public void test7(){
    Cadastrocliente cad = new Cadastrocliente(); //teste > 11
    assertEquals(false, cad.ValidarCliente(11,"4398784457333", "José da Silva", "Rua das Palmeiras, 23", 
            "Curitiba", "jose@gmail.com", "4339987655"));
    }
   
    @Test
    public void test8(){
    Cadastrocliente cad = new Cadastrocliente(); //tudo certo
    assertEquals(true, cad.ValidarCliente(11,"43987844579", "José da Silva", "Rua das Palmeiras, 23", 
            "Curitiba", "jose@gmail.com", "4339987655"));
    }
    
    @Test
    public void test9(){
    Cadastrocliente cad = new Cadastrocliente(); //telefone > 11
    assertEquals(false, cad.ValidarCliente(11,"43987844579", "José da Silva", "Rua das Palmeiras, 23", 
            "Curitiba", "jose@gmail.com", "433998765544"));
    }
    
    @Test
    public void test10(){
    Cadastrocliente cad = new Cadastrocliente(); //telefone = 11
    assertEquals(true, cad.ValidarCliente(11,"43987844579", "José da Silva", "Rua das Palmeiras, 23", 
            "Curitiba", "jose@gmail.com", "43399876554"));
    }
    
    @Test
    public void test11(){
    Cadastrocliente cad = new Cadastrocliente(); //telefone <10
    assertEquals(false, cad.ValidarCliente(11,"43987844579", "José da Silva", "Rua das Palmeiras, 23", 
            "Curitiba", "jose@gmail.com", "43399876"));
    }
    
    @Test
    public void test12(){
    Cadastrocliente cad = new Cadastrocliente(); //endereco vazio
    assertEquals(false, cad.ValidarCliente(11,"43987844570", "José da Silva", "", 
            "Curitiba", "jose@gmail.com", "4339987655"));
    }
    
    @Test
    public void test13(){
    Cadastrocliente cad = new Cadastrocliente(); //endereco muito grande
    assertEquals(false, cad.ValidarCliente(11,"43987844570", "José da Silva", "                                                                            ", 
            "Curitiba", "jose@gmail.com", "4339987655"));
    }
    
    @Test
    public void test14(){ // email muito pequeno
    Cadastrocliente cad = new Cadastrocliente();
    assertEquals(false, cad.ValidarCliente(11,"43987844579", "José da Silva", "Rua das Palmeiras, 23", 
            "Curitiba", "e@l.m", "4339987655"));
    }
    
    @Test
    public void test15(){ //email valido
    Cadastrocliente cad = new Cadastrocliente();
    assertEquals(true, cad.ValidarCliente(11,"43987844579", "José da Silva", "Rua das Palmeiras, 23", 
            "Curitiba", "jose@gmail.com", "4339987655"));
    }

    @Test
    public void test16(){ //email grande
    Cadastrocliente cad = new Cadastrocliente();
    assertEquals(false, cad.ValidarCliente(11,"43987844579", "José da Silva", "Rua das Palmeiras, 23", 
            "Curitiba", "jose@gmail.commmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm", "4339987655"));
    }
    
    @Test
    public void test17(){ //email sem @
    Cadastrocliente cad = new Cadastrocliente();
    assertEquals(false, cad.ValidarCliente(11,"43987844579", "José da Silva", "Rua das Palmeiras, 23", 
            "Curitiba", "josegmail.com", "4339987655"));
    }
   
    @Test
    public void test18(){ //email invalido 3
    Cadastrocliente cad = new Cadastrocliente();
    assertEquals(false, cad.ValidarCliente(11,"43987844579", "José da Silva", "Rua das Palmeiras, 23", 
            "Curitiba", "jose@gmailcom", "4339987655"));
    }
    

        @Test
    public void test19(){
    Cadastrocliente cad = new Cadastrocliente(); //id invalido
    assertEquals(false, cad.ValidarCliente(-11,"43987844579", "José da Silva", "Rua das Palmeiras, 23", 
            "Curitiba", "jose@gmail.com", "4339987655"));
    }
    
    @Test
    public void test20(){
    Cadastrocliente cad = new Cadastrocliente(); //id invalido
    assertEquals(false, cad.ValidarCliente(99999999,"43987844579", "José da Silva", "Rua das Palmeiras, 23", 
            "Curitiba", "jose@gmail.com", "4339987655"));
    }
    
    
}
