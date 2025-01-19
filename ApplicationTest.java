package pomProject.tests;

import org.testng.annotations.Test;

import pomProject.pages.BaseClass;
import pomProject.pages.DashboardPage;
import pomProject.pages.EmployeeManagementPage;
import pomProject.pages.LeaveManagementPage;
import pomProject.pages.LoginPage;
import pomProject.pages.TimeTrackingPage;

public class ApplicationTest extends BaseClass {

    @Test(priority = 1)
    public void invalidTestLogin() {
        // Invalid Login functionality
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("InvalidUser"); // Invalid credentials
        loginPage.enterPassword("wrongP121");
        loginPage.clickLoginButton();
        System.out.println("Invalid login test passed!");
    }

    @Test(priority = 2)
    public void testLogin() {
        // Valid Login functionality
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin1233");
        loginPage.clickLoginButton();
        System.out.println("Login test passed!");
    }

    @Test(priority = 3)
    public void employeeManagement() {
        // Employee Management
        EmployeeManagementPage empPage = new EmployeeManagementPage(driver);
        empPage.addEmployee("MD", "ADNAN");
        empPage.editEmployee("1234", "Mohammad");
        empPage.deleteEmployee("123");
    }

    @Test(priority = 4)
    public void leaveManagement() {
        // Leave Management
        LeaveManagementPage leavePage = new LeaveManagementPage(driver);
        leavePage.applyLeave("Sick Leave", "Feeling unwell");
        leavePage.approveLeave("leave123");
        leavePage.rejectLeave("leave124");
    }

    @Test(priority = 5)
    public void timeTracking() {
        // Time Tracking
        TimeTrackingPage timePage = new TimeTrackingPage(driver);
        timePage.clockIn();
        timePage.addTimeEntry("Worked on project A");
    }

    @Test(priority = 6)
    public void dashboardAccess() {
        // Dashboard Access
        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.generateReport();
        dashboardPage.accessAdminFunctionality();
    }
}


