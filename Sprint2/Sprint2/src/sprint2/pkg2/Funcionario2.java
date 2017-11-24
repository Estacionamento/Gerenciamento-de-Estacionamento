
package sprint2.pkg2;
public class Funcionario2 {
    protected String nome;
    protected String cpf;
    protected String endereco;
    protected String email;

        public void setNome (String nome){
        this.nome=nome;
    }
    public String getNome(){
        return nome;
    }
    public void setCpf (String cpf){
        this.cpf = cpf;
    }
    public String getCpf(){
        return cpf;
    }
   
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public String getEndereco(String endereco){
        return endereco;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(String email){
        return email;
    }
    
    
    public String validaFuncionario(String nome, String cpf, String endereco, String email){
        if(nome.length() > 5 && nome.length() < 70 && nome.contains (" ")){
            if (cpf.length()== 11){
                if(endereco.length() > 10 && endereco.length() < 200){
                    if((email.length()>7 && email.length()<50)&&(email.contains("@") && email.contains("."))){
                        return ("Cadastro realizado");
                    }
                    else{ 
                        return ("E-mail inválido");
                    }
                }
                else{
                    return ("Endereço inválido");
                }
            }
            else{
                return ("Cpf inválido");
            }
        }else{
            return("Nome inválido");
        }

    }
        
    
}

