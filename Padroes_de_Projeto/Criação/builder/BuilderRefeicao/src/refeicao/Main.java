
package refeicao;

/**
 *
 * @author felipe
 */
public class Main {
    
    public static void main(String[] args) {
        
        DiretorRefeicao criaRefeicao = new DiretorRefeicao();      
        //controi uma refeicao.
        Refeicao refeicao1 = criaRefeicao.preparaNaoVegetariana("laranja", "suco","sem batata");                
        Refeicao refeicao2 = criaRefeicao.preparaVegetariana("guarana", "refrigerante", "com batata");       
    }    
}
