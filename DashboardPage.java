package pomProject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    private WebDriver driver;

    private By reportButton = By.id("generateReport");
    private By adminFunctionalityButton = By.id("adminFunctionality");

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public void generateReport() {
        driver.findElement(reportButton).click();
    }

    public void accessAdminFunctionality() {
        driver.findElement(adminFunctionalityButton).click();
    }
}


