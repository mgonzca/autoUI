package co.com.taller.automatizacion.questions;

import co.com.taller.automatizacion.userinterface.Electronicospage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarNombreCamara implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(Electronicospage.NOMBRE).viewedBy(actor).asString();
    }
    public static ValidarNombreCamara en(){
        return new ValidarNombreCamara();
    }
}
