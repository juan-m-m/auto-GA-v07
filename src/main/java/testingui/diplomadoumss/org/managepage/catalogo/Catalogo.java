package testingui.diplomadoumss.org.managepage.catalogo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;
import testingui.diplomadoumss.org.utilsfiles.PropertyAccesor;

/**
 * @author Juan Montaño
 */
public class Catalogo extends BasePage {

    @FindBy(xpath = "//a[@routerlink='/catalogo' and @class='mat-button']")
    private WebElement catalogo;

    public void clickCatalogo() {
        catalogo.click();
    }

    public void initBrowser() {
        webDriver.get(PropertyAccesor.getInstance().getURL());
    }

    public void finish() {
        webDriver.quit();
    }
}
