package pom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PostForUpdate extends  BasePage{
    public PostForUpdate(WebDriver driver) {
        super(driver);
    }

   private By menuPost     = By.xpath("//*[@id=\"menu-posts\"]/a/div[2]");
   private By ubiTitlePost = By.className("wp-heading-inline");
   private By editPost     = By.xpath("//*[@id=\"post-1\"]/td[1]/strong/a");

   private By txtDescPost     = By.id("post-title-0");

   private By btnPreviewPost  = By.xpath("//*[@id=\"editor\"]/div/div/div/div[1]/div[2]/button[2]");

    public void UbicarPostEdit() throws Exception {
        click(menuPost);
        click(editPost);
       }


    public void SavePostEdit() throws Exception {
        if (isDisplayed(txtDescPost)){
            type("Edit - Post Test ",txtDescPost);
            click(btnPreviewPost);
            Thread.sleep(2000);
            click(menuPost);
        }
        else
        {
            System.out.println("La page no fue encontrada");
        }
    }


    public boolean IsTitleMenuPost() throws Exception {
        Thread.sleep(2000);
        return  this.getText(ubiTitlePost).equals("Posts");
    }

    public boolean IsTitleEditPostDashboard() throws Exception {
        return  this.getTitle().equals("Edit Post ‹ opensourcecms — WordPress");
    }
}

