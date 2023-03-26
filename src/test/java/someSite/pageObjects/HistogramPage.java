package someSite.pageObjects;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class HistogramPage {
    private static final SelenideElement ELEMENT_HISTOGRAM = $x("//div[@class='app-title' and text()='Histogram']");
    private static final SelenideElement ELEMENT_HISTOGRAM_INTERVAL = $x("//div[@class='app-title' and text()='Interval']//..//div[@class='autocomplete-container']");
    private static final SelenideElement ELEMENT_HISTOGRAM_ATTRIBUTE = $x("//div[@class='app-title' and text()='Attribute']//..//button");
    ElementsCollection allIntervalsInHistogram = $$x("//ul[@class='autocomplete-dropdown-menu']/li");
    ElementsCollection allAttributesInHistogram = $$x("//li[@class='autocomplete-dropdown-item']");

    public void openHistogram() {
        ELEMENT_HISTOGRAM.click();
    }

    public void openHistogramAttribute() {
        ELEMENT_HISTOGRAM_ATTRIBUTE.click();
    }

    public void openHistogramInterval() {
        ELEMENT_HISTOGRAM_INTERVAL.click();
    }
}
