package appPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class BaseAction {
    private static final String dateFormatter = "dd/MM/yyyy HH:mm";

    public void selectDropDownValue(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }

    public String getCurrentSystemDate(int noOfHours) {
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        c.add(Calendar.HOUR, noOfHours);
        return new SimpleDateFormat(dateFormatter).format(c.getTime());
    }

    public void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}