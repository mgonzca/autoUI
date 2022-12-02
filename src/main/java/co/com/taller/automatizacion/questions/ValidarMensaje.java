package co.com.taller.automatizacion.questions;

import co.com.taller.automatizacion.userinterface.Escritorio;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarMensaje implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(Escritorio.MENSAJE).viewedBy(actor).asString();
    }

    public static ValidarMensaje esigual(){
        return new ValidarMensaje();
    }
}
