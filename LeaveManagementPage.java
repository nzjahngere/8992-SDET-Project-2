package pomProject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeaveManagementPage {
    private WebDriver driver;

    private By applyLeaveButton = By.id("applyLeave");
    private By leaveTypeDropdown = By.id("leaveType");
    private By leaveReasonField = By.id("leaveReason");
    private By submitLeaveButton = By.id("submitLeave");

    private By approveLeaveButton = By.id("approveLeave");
    private By rejectLeaveButton = By.id("rejectLeave");

    public LeaveManagementPage(WebDriver driver) {
        this.driver = driver;
    }

    public void applyLeave(String leaveType, String reason) {
        driver.findElement(applyLeaveButton).click();
        driver.findElement(leaveTypeDropdown).sendKeys(leaveType);
        driver.findElement(leaveReasonField).sendKeys(reason);
        driver.findElement(submitLeaveButton).click();
    }

    public void approveLeave(String leaveId) {
        driver.findElement(By.id(leaveId)).click(); // Select leave request
        driver.findElement(approveLeaveButton).click();
    }

    public void rejectLeave(String leaveId) {
        driver.findElement(By.id(leaveId)).click(); // Select leave request
        driver.findElement(rejectLeaveButton).click();
    }
}
