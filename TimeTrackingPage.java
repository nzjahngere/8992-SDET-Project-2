package pomProject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TimeTrackingPage {
    private WebDriver driver;

    private By clockInButton = By.id("clockIn");
    private By clockOutButton = By.id("clockOut");
    private By timeEntryField = By.id("timeEntry");

    public TimeTrackingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clockIn() {
        driver.findElement(clockInButton).click();
    }

    public void clockOut() {
        driver.findElement(clockOutButton).click();
    }

    public void addTimeEntry(String timeDetails) {
        driver.findElement(timeEntryField).sendKeys(timeDetails);
    }
}

