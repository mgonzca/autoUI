package co.com.taller.automatizacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Electronicospage {
public static final Target ELECTRONICS = Target.the("Opcion menu electronico").located(By.xpath("(//a[@href=\"/electronics\"])[1]"));
public static final Target CAMERA = Target.the("Camara y foto").located(By.xpath("(//a[@href=\"/camera-photo\"])[1]"));
public static final Target LEICA = Target.the("Seleccion camara leica").located(By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])[2]"));
public static final Target NOMBRE = Target.the("Nombre Camara").located(By.xpath("(//a[@class=\"product-name\"])[2]"));
public static final Target PRECIO = Target.the("PrecioCamara").located(By.xpath("(//span[@class=\"product-subtotal\"])[2]"));


}
