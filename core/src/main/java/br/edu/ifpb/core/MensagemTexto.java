package br.edu.ifpb.core;

import br.edu.ifpb.shared.Mensagem;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 22/01/2018, 09:59:48
 */
@Stateless
@Remote(Mensagem.class)
public class MensagemTexto implements Mensagem {

    @Override
    public String ler() {
        return "Sou um EJB, ou não?";
    }

}
