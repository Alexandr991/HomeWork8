package someSite.pageObjects;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class GridPage {
    private static final SelenideElement ELEMENT_GRID_AND_TITLE = $x("//div[@class='app-title' and text()='Grid & chart']");
    private static final SelenideElement ELEMENT_GRID_CELL = $x("//div[@role='gridcell']");
    private static final SelenideElement ELEMENT_GRID_TABLE = $x("//div[contains(@class, 'fullscreen')]");
    private static final SelenideElement ELEMENT_CHART_LINES = $x("//span[@class='chart-settings__title chart-mobile-title']");

    ElementsCollection allCellsInGrid = $$x("//div[@role='gridcell']");

    public void openGridAndTitle() {
        ELEMENT_GRID_AND_TITLE.click();
    }

    public void openChartLines() {
        ELEMENT_CHART_LINES.click();
    }
}
