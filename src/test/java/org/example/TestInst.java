package org.example;

import FlaNium.WinAPI.elements.Button;
import FlaNium.WinAPI.elements.TabItem;
import FlaNium.WinAPI.elements.TreeItem;
import FlaNium.WinAPI.webdriver.DesktopOptions;
import FlaNium.WinAPI.webdriver.FlaNiumDriver;
import org.openqa.selenium.By;
import java.io.File;

public class TestInst extends InitFlanium {
    public static void main(String[] args) throws InterruptedException {
        DesktopOptions options = new DesktopOptions();
        options.setApplicationPath(String.valueOf(new File(APP_PATH)));
        options.setLaunchDelay(10);
        options.setDebugConnectToRunningApp(true);
        FlaNiumDriver driver = new FlaNiumDriver(service, options);

//        Thread.sleep(5000);

        TabItem tabItem = new TabItem(driver.findElement(By.xpath("//Tab/TabItem[3]")));
        tabItem.click();

        Button button = new Button(driver.findElement(By.xpath("//*[(@Name = 'Установить сертификат')]")));
        button.click();

        Button view = new Button(driver.findElement(By.xpath("//Window/Pane/Button")));
        view.click();

        Thread.sleep(2000);

        TreeItem treeItem = new TreeItem(driver.findElement(By.xpath("//Window/Window/Pane[1]/Pane[1]/Tree/TreeItem[2]/TreeItem[3]")));
        treeItem.click();

        Button listItem = new Button(driver.findElement(By.xpath("//*[(@Name = 'testCSP.cer')]")));
        listItem.click();

        Button open = new Button(driver.findElement(By.xpath("//Window/Window/Button[1]")));
        open.click();

        Button next = new Button(driver.findElement(By.xpath("//Window/Button[2]")));
        next.click();
        next.click();
        next.click();
        next.click();

        driver.findElement(By.xpath("//Window[1]/Edit[2]")).sendKeys("111111");

        Button ok = new Button(driver.findElement(By.xpath("//Window[1]/Button[1]")));
        ok.click();

        Thread.sleep(1000);

        Button ok2 = new Button(driver.findElement(By.xpath("//Window[1]/Button")));
        ok2.click();

        Button yes = new Button(driver.findElement(By.xpath("//Window[1]/Button[2]")));
        yes.click();

    }
}
