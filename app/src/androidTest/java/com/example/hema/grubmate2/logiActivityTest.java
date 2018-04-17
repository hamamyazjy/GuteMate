package com.example.hema.grubmate2;

/**
 * Created by Hema on 4/15/2018.
 */


import android.os.RemoteException;
        import android.support.test.InstrumentationRegistry;
        import android.support.test.rule.ActivityTestRule;
        import android.support.test.runner.AndroidJUnit4;
        import android.support.test.uiautomator.UiDevice;
        import android.support.test.uiautomator.UiObject;
        import android.support.test.uiautomator.UiObjectNotFoundException;
        import android.support.test.uiautomator.UiSelector;

        import org.junit.Ignore;
        import org.junit.Rule;
        import org.junit.Test;
        import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class logiActivityTest {


    @Rule
    public ActivityTestRule<SignIn> activityTestRule = new ActivityTestRule<SignIn>(SignIn.class);



    @Test
    public void testUiAutomatorAPI() throws UiObjectNotFoundException, InterruptedException {
        UiDevice device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        while (true)
        {
            //enter username
            UiSelector usernameSelector = new UiSelector().className("android.widget.EditText").instance(0);
            UiObject usernameWidget = device.findObject(usernameSelector);
            usernameWidget.setText("admin1");
            Thread.sleep(2000);

            //enter Password
            UiSelector PasswordSelector = new UiSelector().className("android.widget.EditText").instance(1);
            UiObject PasswordWidget = device.findObject(PasswordSelector);
            PasswordWidget.setText("admin");
            Thread.sleep(2000);

            UiSelector buLoginSelector = new UiSelector().className("android.widget.Button").text("LOGIN").clickable(true);
            UiObject buLoginWidget = device.findObject(buLoginSelector);
            buLoginWidget.click();

            Thread.sleep(2000);
        }

    }

}
