package pomProject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmployeeManagementPage {
    private WebDriver driver;

    private By addEmployeeButton = By.id("addEmployee");
    private By firstNameField = By.id("firstName");
    private By lastNameField = By.id("lastName");
    private By saveButton = By.id("saveEmployee");
    private By editEmployeeButton = By.id("editEmployee");
    private By deleteEmployeeButton = By.id("deleteEmployee");

    public EmployeeManagementPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addEmployee(String firstName, String lastName) {
        driver.findElement(addEmployeeButton).click();
        driver.findElement(firstNameField).sendKeys(firstName);
        driver.findElement(lastNameField).sendKeys(lastName);
        driver.findElement(saveButton).click();
    }

    public void editEmployee(String employeeId, String newFirstName) {
        driver.findElement(By.id(employeeId)).click(); // Select employee
        driver.findElement(editEmployeeButton).click();
        driver.findElement(firstNameField).clear();
        driver.findElement(firstNameField).sendKeys(newFirstName);
        driver.findElement(saveButton).click();
    }

    public void deleteEmployee(String employeeId) {
        driver.findElement(By.id(employeeId)).click(); // Select employee
        driver.findElement(deleteEmployeeButton).click();
    }
}


