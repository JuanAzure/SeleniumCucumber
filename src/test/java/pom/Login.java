package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public  class Login extends  BasePage {

   By userLocator = By.name("log");
   By passLocator = By.name("pwd");
   By singBtnLocator = By.name("wp-submit");
   By ubicTextoPost = By.className("wp-heading-inline");


   public Login(WebDriver driver) {
      super(driver);
   }

   public  void singIn() throws Exception {
      if(isDisplayed(userLocator)){
         type("opensourcecms",userLocator);
         type("opensourcecms",passLocator);
         click(singBtnLocator);
         Thread.sleep(2000);
      }
      else {
         System.out.println("username o pass incorrect");
      }

   }

   public boolean IsTitleLogin() throws Exception {
       return  this.getTitle().equals("Log In ‹ opensourcecms — WordPress");
   }
   public boolean IsTitleDashboard() throws Exception {
      return  this.getTitle().equals("Dashboard ‹ opensourcecms — WordPress");
   }

   public boolean IsTitleMenuPost() throws Exception {
      return  this.getText(ubicTextoPost).equals("Posts");
   }

}
