
import Quilometragem.OpcaoQuilometragem;
import Quilometragem.RecebeQuilometragem;
import gerais.Menu;

public class InputsQuilometragem {
    /**
     * @return
     */
    public String menu() {
        Menu menu = new Menu();
        String resposta = menu.showMenu();
        return resposta;
    }

    public String opcaoQuilometragem(){
        final OpcaoQuilometragem opcaoQuilometragem = new OpcaoQuilometragem();
        String opcoes = opcaoQuilometragem.showOptions();
        return opcoes;
    }

    public double RecebeQuilometragem(String opcaoQuilometragem) {
        RecebeQuilometragem entrada = new RecebeQuilometragem();
        double valor = entrada.entradaDoValor(opcaoQuilometragem);
        return valor;

    }
        
}