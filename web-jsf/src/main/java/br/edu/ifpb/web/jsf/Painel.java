package br.edu.ifpb.web.jsf;

import br.edu.ifpb.shared.Mensagem;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 22/01/2018, 10:01:17
 */
@Named
@RequestScoped
public class Painel {

//    @EJB
    @Inject
    private Mensagem mensagens;
//    private Mensagem mensagens = 
//            new ServiceLocator().lookup("java:global/core/MensagemTexto");

    public String lerMensagem() {
        return mensagens.ler();
    }
}
