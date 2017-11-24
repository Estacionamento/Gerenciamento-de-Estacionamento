package sprint3;

public class VagaRotativa {
    int vr = 100; //Numero de vagas rotativas
       
       int[] numeroDeVagasR = new int[vr]; //Numero de vagas rotativas do estacionamento
       
       public boolean temVagaR(){
           for(int i = 0; i < 10; i++){
               if(this.numeroDeVagasR[i] == 0){
                   return true;
               }
           }
           return false;
       }    
       
       public void ocupaVagaR(){
           if(this.temVagaR()){
               for(int i = 0; i < vr; i++){
                   if(numeroDeVagasR[i] == 0){
                       numeroDeVagasR[i] = 1;
                   }
               }
           }
               else{
                       System.out.println("Não há vagas rotativas");
                       }
       }
}
