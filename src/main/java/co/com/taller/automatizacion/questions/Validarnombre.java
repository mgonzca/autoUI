package co.com.taller.automatizacion.questions;

import co.com.taller.automatizacion.userinterface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Validarnombre implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(HomePage.TITULO).viewedBy(actor).asString();
    }
    public static Validarnombre igual(){
        return new Validarnombre();
    }
}
