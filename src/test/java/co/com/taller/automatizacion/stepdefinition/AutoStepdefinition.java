package co.com.taller.automatizacion.stepdefinition;

import co.com.taller.automatizacion.questions.*;
import co.com.taller.automatizacion.tasks.Adicionarcamara;
import co.com.taller.automatizacion.tasks.AgregarProducto;
import co.com.taller.automatizacion.tasks.CarritoCompra;
import co.com.taller.automatizacion.tasks.SelecionarElementos;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.*;


public class AutoStepdefinition {
    @Managed
    private WebDriver myDirver;

        @Before
         public void setUp(){
            WebDriverManager.chromedriver().setup();
            setTheStage(new OnlineCast());
        }

    @Given("^El usuario se logea en la pagina$")
    public void elUsuarioSeLogeaEnLaPagina() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Esteban");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(myDirver));
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://demo.nopcommerce.com/"));
    }


    @When("^el usuario selecciona el escritorio y adciciona un articulo$")
    public void elUsuarioSeleccionaElEscritorioYAdcicionaUnArticulo() {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().attemptsTo(AgregarProducto.computador());
    }


    @Then("^El usuario deberia visualziar (.*)$")
    public void elUsuarioDeberiaVisualziarBuildYourOwnComputer(String nombre) {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Validarnombre.igual(),Matchers.containsString(nombre)));
    }

    @When("^el usuario selecciona el escritorio y selecciona ram$")
    public void elUsuarioSeleccionaElEscritorioYSeleccionaRam() {
        OnStage.theActorInTheSpotlight().attemptsTo(AgregarProducto.computador());
        OnStage.theActorInTheSpotlight().wasAbleTo(SelecionarElementos.PC());
    }


    @Then("^El usuario  deberia visualziar un mensaje (.*)$")
    public void elUsuarioDeberiaVisualziarUnMensajeProductoAdicionadoAlCarrito(String mensaje) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarMensaje.esigual(), Matchers.containsString(mensaje)));
    }
    @When("^el usuario selecciona el carrito de compras$")
    public void elUsuarioSeleccionaElCarritoDeCompras() {
        OnStage.theActorInTheSpotlight().attemptsTo(AgregarProducto.computador());
        OnStage.theActorInTheSpotlight().wasAbleTo(SelecionarElementos.PC());
        OnStage.theActorInTheSpotlight().wasAbleTo(CarritoCompra.page());
    }


    @Then("^El usuario  deberia visualizar el precio de compra es (.*)$")
    public void elUsuarioDeberiaVisualizarElPrecioDeCompraEs(String valor) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Validarprecio.pc(),Matchers.containsString(valor)));
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarRAM.pc(),Matchers.containsString(RAM)));
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarHDD.pc(),Matchers.containsString(HDD)));
    }

    @When("^el usuario agrega una camara a la compra$")
    public void elUsuarioAgregaUnaCamaraALaCompra() {
        OnStage.theActorInTheSpotlight().attemptsTo(AgregarProducto.computador());
        OnStage.theActorInTheSpotlight().wasAbleTo(SelecionarElementos.PC());
        OnStage.theActorInTheSpotlight().wasAbleTo(CarritoCompra.page());
        OnStage.theActorInTheSpotlight().wasAbleTo(Adicionarcamara.compra());

    }


    @Then("^El usuario  deberia visualizar nombre de la camara (.*)$")
    public void elUsuarioDeberiaVisualizarNombreDeLaCamaraLeicaTMirrorlessDigitalCamera(String pagina) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarNombreCamara.en(),Matchers.containsString(pagina)));


    }

    @Then("^El usuario  deberia visualizar el precio de compra camara es (.*)$")
    public void elUsuarioDeberiaVisualizarElPrecioDeCompraCamaraEs(String precio) {
     OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(PrecioCamara.Leica(),Matchers.containsString(precio)));
    }
}





