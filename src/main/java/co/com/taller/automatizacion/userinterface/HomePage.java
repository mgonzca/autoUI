package co.com.taller.automatizacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    public static final Target COMPUTADORES = Target.the("Menu computadores").located(By.xpath("(//a[@href=\"/computers\"])[1]"));
    public static final Target ESCRITORIO = Target.the("Opcion Escritorio").located(By.xpath("(//a[@href=\"/desktops\"])[1]"));
    public static final Target AGREGAR = Target.the("Agregar al carrito producto").located(By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])[1]"));
    public static final Target TITULO = Target.the("Titulo a validar").located(By.xpath("//div[@class='product-name']/h1"));
}
