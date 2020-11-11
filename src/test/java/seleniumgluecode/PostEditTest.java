package seleniumgluecode;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class PostEditTest extends  TestBase{

    @Given("^El usuario se encuentra en la pagina Dashboard de opensourcecmsEdit$")
        public void elUsuarioSeEncuentraEnLaPaginaDashboardDeOpensourcecmsEdit() throws Throwable{
        Assert.assertTrue(login.IsTitleLogin());
        login.singIn();
    }

    @When("^Ubica el Post  a Editar$")
    public void ubicaElPostAEditar() throws Throwable {

        postForUpdate.UbicarPostEdit();
    }

    @When("^Edita el post y guarda cambios$")
    public void editaElPostYGuardaCambios() throws Throwable {
        postForUpdate.SavePostEdit();
    }

    @Then("^Se debe redirigir al menu POST y validar cambios$")
    public void seDebeRedirigirAlMenuPOSTYValidarCambios() throws Throwable {
        Assert.assertTrue(postForCreation.IsTitleMenuPost());
    }
}