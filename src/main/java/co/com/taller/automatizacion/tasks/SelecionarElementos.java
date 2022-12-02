package co.com.taller.automatizacion.tasks;

import co.com.taller.automatizacion.userinterface.Escritorio;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelecionarElementos implements Task{
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Escritorio.RAM),
                Click.on(Escritorio.RAM2),
                Click.on(Escritorio.HDD),
                Click.on(Escritorio.SOFTWARE),
                Click.on(Escritorio.ADICIONAR)

        );
    }
    public static SelecionarElementos PC(){
        return Tasks.instrumented(SelecionarElementos.class);
    }
}
