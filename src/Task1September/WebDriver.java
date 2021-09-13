package Task1September;

public interface WebDriver {

    void open();

    void close();

    String getTitle();
}
interface TakesSecreenShot{

    void getScreenShot();

}
interface RemoteWebDriver extends TakesSecreenShot,WebDriver{

    void navigate();
}
class ChromeDriver implements RemoteWebDriver{

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void getScreenShot() {

    }

    @Override
    public void navigate() {

    }
}
class FirefoxDriver implements RemoteWebDriver{

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void getScreenShot() {

    }

    @Override
    public void navigate() {

    }
}
class SafariDriver implements RemoteWebDriver{

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void getScreenShot() {

    }

    @Override
    public void navigate() {

    }
}