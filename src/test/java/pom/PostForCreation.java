package pom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PostForCreation  extends  BasePage{
    public PostForCreation(WebDriver driver) {
        super(driver);
    }

    By menuPost = By.xpath("//*[@id=\"menu-posts\"]/a/div[2]");
    By ubiTitlePost = By.className("wp-heading-inline");
    By newPost = By.className("page-title-action");
    By descPost = By.id("post-title-0");
    By previewPost =   By.xpath("//*[@id=\"editor\"]/div/div/div/div[1]/div[2]/button[2]");
    By pblPost =   By.xpath("//*[@id=\"editor\"]/div/div/div/div[3]/div/div/div[1]/div/button");

    public void registarPost() throws Exception {
        click(menuPost);
        click(newPost);
        Thread.sleep(2000);
        if (isDisplayed(descPost)){
            type("New Post Test",descPost);
            click(previewPost);
            Thread.sleep(2000);
            click(pblPost);
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
}

