package userinterfaces;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://automationpractice.com/index.php")
public class HomePage extends PageObject {

    public static  final Target INPUT_ClICK_SING_IN = Target.the("Input donde click en boton login").located(By.className("login"));

}
