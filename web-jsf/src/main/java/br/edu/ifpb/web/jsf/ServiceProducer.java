package br.edu.ifpb.web.jsf;

import br.edu.ifpb.shared.Mensagem;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 22/01/2018, 10:54:45
 */
@Named
@ApplicationScoped
public class ServiceProducer {

    @Produces
    public Mensagem LookupDeMensagem() {
        return new ServiceLocator().lookup("java:global/core/MensagemTexto");

    }
}
