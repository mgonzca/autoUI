package co.com.taller.automatizacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Escritorio {

    public static final Target RAM = Target.the("DEspliegue Ram").located(By.id("product_attribute_2"));
    public static final Target RAM2 = Target.the("Selecionar Ram").located(By.xpath("//option[@data-attr-value=\"3\"]"));
    public static final Target HDD = Target.the("Selecionar HDD").located(By.id("product_attribute_3_6"));
    public static final Target SOFTWARE = Target.the("Selecionar Software").located(By.id("product_attribute_5_11"));
    public static final Target ADICIONAR = Target.the("Agregar al carrito").located(By.id("add-to-cart-button-1"));
    public static final Target MENSAJE = Target.the("Mensaje de adicion correcto").located(By.xpath("//p[@class=\"content\"]"));
    public static final Target  CART= Target.the("Carrito de compras").located(By.xpath("(//a[@href=\"/cart\"])[1]"));
    public static final Target PRECIO = Target.the("Precio Total").located(By.xpath("(//span[@class=\"product-subtotal\"])[1]"));
}
