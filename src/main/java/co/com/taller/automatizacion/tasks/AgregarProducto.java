package co.com.taller.automatizacion.tasks;

import co.com.taller.automatizacion.userinterface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;


public class AgregarProducto implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                MoveMouse.to(HomePage.COMPUTADORES),
                Click.on(HomePage.ESCRITORIO),
                Click.on(HomePage.AGREGAR)

        );
    }
    public static AgregarProducto computador(){
        return Tasks.instrumented(AgregarProducto.class);
    }
}
