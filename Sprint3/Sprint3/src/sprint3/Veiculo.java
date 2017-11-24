
package veiculo;

public class Veiculo {
    public String placa;
    public String modelo;
    public String anoLanc;
    public String cor;
    public String marca;
    
    public void setPlaca (String placa){
        this.placa=placa;
    }
    public String getPlaca(){
        return placa;
    }
    
    public void setModelo(String modelo){
    this.modelo=modelo;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void setAnoLanc(String anoLanc){
        this.anoLanc=anoLanc;
    }
    public String getAnoLanc(){
        return anoLanc;
    }
    
        public void setCor(String cor){
        this.cor=cor;
    }
    public String getCor(){
        return cor;
    }
    
        public void setMarca(String marca){
        this.marca=marca;
    }
    public String getMarca(){
        return marca;
    }
    
    public String validaVeiculo(String placa, String modelo, String anoLanc, String cor, String marca ){
        
        if(placa.length()==8 && placa.contains("-")){
            if(modelo.length()>1 && modelo.length()<15){
                if(anoLanc.length()==4 ){
                    if(cor.length()>3 && cor.length()<15){
                        if(marca.length()>2 && marca.length()<15){
                            return ("Veiculo cadastrado");
                        }
                        else{
                            return ("Marca inválida");
                        }
                    }
                    else{
                        return ("Cor inválida");
                    }
                }else{
                    return ("Ano de lançamento inválido");
                }
            }else{
                return ("Modelo inválido");
            }
        }else{
            return ("Placa inválida");
        }
        
        
    }
}

