/*
 Nome: Vinicius Gutierrez Gomes
 RA: 10425609
 */
public class CampanhaRedeSocial extends Campanha {
   private long curtidas;
   private long compartilhamentos;
   private long comentarios;
    
   
    public CampanhaRedeSocial(long curtidas, long compartilhamentos, long comentarios) {
    this.curtidas = curtidas;
    this.compartilhamentos = compartilhamentos;
    this.comentarios = comentarios;
}
    @Override
    public void configurar(){
        System.out.println("Configurando campanha de rede social.");
    }   
    
    @Override
    public void executar(){
        System.out.println("Configurando campanha de rede social.");
    }
    @Override
    public void avaliar(){
        System.out.println("Configurando avaliar de rede social.");
    }
    
}