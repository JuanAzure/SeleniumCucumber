package seleniumgluecode;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class PostNewTest extends  TestBase{

    @Given("^El usuario se encuentra en la pagina login de opensourcecms$")
        public void elUsuarioSeEncuentraEnLaPaginaDashboardDeOpensourcecms() throws Throwable{
           Assert.assertTrue(login.IsTitleLogin());
    }


    @When("^Ingresa un usuario y una contraseña hace click sobre el boton Login in$")
    public void ingresaUnUsuarioYUnaContraseñaHaceClickSobreElBotonLoginIn() throws Throwable {
        login.singIn();
        Assert.assertTrue(login.IsTitleDashboard());

    }
    @Then("Se debe redirigir a la pantalla Dashboard$")
    public void SeDebeRedirigirAlaPantallaDashboard() throws  Throwable{
        Assert.assertTrue(login.IsTitleDashboard());
    }

    @When("^Se ubica en el modulo de post y Agrega un nuevo post$")
    public void seUbicaEnElModuloDePostYAgregaUnNuevoPost() throws Throwable {
        postForCreation.registarPost();
    }

    @When("^Guarda cambios y regresa al modulo post$")
    public void GuardaCambiosYRegresaAlModuloPost() throws Throwable {
        Assert.assertTrue(postForCreation.IsTitleMenuPost());
    }

}
