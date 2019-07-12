package testingui.diplomadoumss.org.core;

import testingui.diplomadoumss.org.managepage.catalogo.Catalogo;

import java.util.HashMap;
import java.util.Map;

public class FirstExample {
    public static void main(String[] args) {

//        WebDriver webDriver = DriverManager.getInstance().getWebDriver();
//        webDriver.get(PropertyAccesor.getInstance().getURLstore());
//        Catalogo catalogo = new Catalogo();
//        catalogo.clickCatalogo();
//        webDriver.quit();
        //BasePage basePage = new BasePage();

        Catalogo catalogo = new Catalogo();
        catalogo.init();

        //Thread.sleep(30000);

        catalogo.clickCatalogo();
        catalogo.finish();
    }

    public static void exampleMap() {
        Map<String, String> students = new HashMap<>();
        students.put("101", "nombre 1");
        students.put("102", "nombre 2");
        students.put("103", "nombre 3");

        System.out.println(students.get("102"));
    }
}
