import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage extends BasePage {
    @FindBy(id = "name")
    private WebElement nameInput;

    @FindBy(id = "email")
    private WebElement emailInput;

    @FindBy(id = "comment")
    private WebElement commentInput;

    @FindBy(id = "submit")
    private WebElement submitButton;

    @FindBy(id = "message-sent")
    private WebElement messageSentMessage;

    public ContactPage(WebDriver driver) {
        super(driver);
    }

    public void fillContactForm(String name, String email, String comment) {
        nameInput.sendKeys(name);
        emailInput.sendKeys(email);
        commentInput.sendKeys(comment);
        submitButton.click();
    }

    public String getMessageSentMessage() {
        return messageSentMessage.getText();
    }
}

