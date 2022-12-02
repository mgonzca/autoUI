package co.com.taller.automatizacion.tasks;

import co.com.taller.automatizacion.userinterface.Escritorio;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class CarritoCompra implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Escritorio.CART)
        );
    }
    public static CarritoCompra page(){
        return Tasks.instrumented(CarritoCompra.class);
    }
}
