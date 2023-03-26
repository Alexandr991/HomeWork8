package someSite.pageObjects;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class ScatterPlotPage {
    private static final SelenideElement ELEMENT_SCATTER_PLOT = $x("//div[@class='app-title' and text()='Scatter-plot']");
    private static final SelenideElement SCATTER_PLOT_X_ATTRIBUTE = $x("//div[@class='app-title' and text()='X Attribute']//..//button");
    private static final SelenideElement SCATTER_PLOT_Y_ATTRIBUTE = $x("//div[@class='app-title' and text()='Y Attribute']//..//button");
    private static final SelenideElement SCATTER_PLOT_INTERVAL = $x("//div[@class='app-title' and text()='Intervals']//..//input[@class='autocomplete-input ng-untouched ng-pristine ng-valid']");

    ElementsCollection allIntervalsInScatterPot = $$x("//div[@class='autocomplete-dropdown-menu-wrapper']//li");
    ElementsCollection allAttributesXAndY = $$x("//div[@class='autocomplete-dropdown-menu-wrapper']//li");

public void openScatterPlot (){
    ELEMENT_SCATTER_PLOT.click();
}
public void openXAttributeWindow(){
    SCATTER_PLOT_X_ATTRIBUTE.click();
}
    public void openYAttributeWindow(){
        SCATTER_PLOT_Y_ATTRIBUTE.click();
    }
    public void openIntervalWindow(){
        SCATTER_PLOT_INTERVAL.click();
    }
}
