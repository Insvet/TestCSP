package org.example;

import FlaNium.WinAPI.webdriver.FlaNiumDriverService;
import java.io.File;

public class InitFlanium {
    static String DRIVER_PATH = "C:\\Users\\Test\\IdeaProjects\\inst\\src\\main\\resources\\FlaNium.Desktop.Driver-v1.6.0/FlaNium.Driver.exe";
    static String APP_PATH = "C:\\Program Files\\Security Code\\CSP/cspconfig.exe";
    static int driverPort = 9980;
    static FlaNiumDriverService service = new FlaNiumDriverService.Builder()
            .usingDriverExecutable(new File(DRIVER_PATH).getAbsoluteFile())
            .usingPort(driverPort)
            .withVerbose(false)
            .withSilent(false)
            .buildDesktopService();

}
