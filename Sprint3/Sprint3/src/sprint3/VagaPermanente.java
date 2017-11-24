package sprint3;

public class VagaPermanente {
       
       Veiculo veiculo;
       String data_entrada; //formato dd/mm/aa
       String data_final; //formato dd/mm/aa
       int n = 10; //Numero de vagas permanentes
       
       int[] numeroDeVagasP = new int[n]; //Cria um array para indicar as vagas ocupadas
       
        public boolean temVagaP(){
           for(int i = 0; i < n; i++){
               if(this.numeroDeVagasP[i] == 0){
                   return true;
               }
           }
           return false;
       } 
       
       public void ocupaVagaP(Veiculo veiculo, String data_final){       
           if(this.temVagaP()){
           this.veiculo = veiculo;
           this.data_final = data_final;
           for(int i = 0; i < n; i++){
               if(numeroDeVagasP[i] == 0){
                   numeroDeVagasP[i] = 1;
               }
           }
           }
           else{
               System.out.println("Não há vagas permanentes");
           }
       }
 
}
    