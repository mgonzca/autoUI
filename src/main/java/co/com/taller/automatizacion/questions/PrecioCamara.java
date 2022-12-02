package co.com.taller.automatizacion.questions;

import co.com.taller.automatizacion.userinterface.Electronicospage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class PrecioCamara implements Question<String> {
    //CAMBIO REALIZADO PARA PRUEBA GIT #4
    //CAMBIO REALIZADO PARA PRUEBA GIT #3
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(Electronicospage.PRECIO).viewedBy(actor).asString();
    }
    public static PrecioCamara Leica(){
        return new PrecioCamara();
    }
}
