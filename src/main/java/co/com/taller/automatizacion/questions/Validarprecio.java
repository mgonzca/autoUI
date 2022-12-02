package co.com.taller.automatizacion.questions;

import co.com.taller.automatizacion.userinterface.Escritorio;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Validarprecio implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(Escritorio.PRECIO).viewedBy(actor).asString();
    }
    public static Validarprecio pc(){
        return new Validarprecio();
    }
}
