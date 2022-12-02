package co.com.taller.automatizacion.tasks;

import co.com.taller.automatizacion.userinterface.Electronicospage;
import co.com.taller.automatizacion.userinterface.Escritorio;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;

public class Adicionarcamara implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MoveMouse.to(Electronicospage.ELECTRONICS),
                Click.on(Electronicospage.CAMERA),
                Click.on(Electronicospage.LEICA),
                Click.on(Escritorio.CART)
        );
    }

    public static Adicionarcamara compra(){
        return Tasks.instrumented(Adicionarcamara.class);
    }
}
