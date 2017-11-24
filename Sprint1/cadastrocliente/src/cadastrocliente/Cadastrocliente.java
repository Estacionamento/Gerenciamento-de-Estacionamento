package cadastrocliente;


public class Cadastrocliente {
    private String nome;
    private String cpf;
    private int id;
    private String cidade;
    private String endereco;
    private String email;
    private String telefone;
   

  public Boolean ValidarCliente(int id, String cpf, String nome, String ende, String cidade, String mail, String tlfo){
      
      if (id > 0 && id <= 1000000){
            if( mail.length() > 7 && mail.length() < 50 && mail.contains("@") && mail.contains(".")){                
                
                if(ende.length()>0 && ende.length()<50){
                    
                    if (tlfo.length() == 11 || tlfo.length() == 10){  //celular tem 11, fixo 10
                        
                        if (cpf.length()== 11){
                            
                            if (nome.length() > 5 && nome.length() < 70 && nome.contains (" ")){
                                
                                if(cidade.length()> 5 && cidade.length()< 50){
                                    
                                    return true;
                                } else {
                                   return false;}                                
                            }else{
                                return false;}  
                        }else{
                            return false;}                                    
                    } else {
                        return false;}
                }else {
                    return false;}
            }else {
                return false;}
        }else {
            return false;}   
    }
  
}