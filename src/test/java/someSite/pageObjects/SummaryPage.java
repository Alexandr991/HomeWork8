package someSite.pageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class SummaryPage {
    private static final SelenideElement ELEMENT_SUMMARY = $x("//div[@class='app-title' and text()='Summary']");
    private static final SelenideElement ELEMENT_ALGO_PERFORMANCE =$x("//div[@class='app-title flex-1 widget__header' and text()='Algo performance timeline (by 6 hours)']//..//div[@class='widget-icon']");
    private static final SelenideElement ELEMENT_ORDERS_BY_ALGO =$x("//div[@class='app-title flex-1 widget__header' and text()='Orders by algo timeline (by 6 hours)']//..//div[@class='widget-icon']");

    public void openSummary (){
       ELEMENT_SUMMARY.click();
   }
   public void openAlgoPerformance (){
        ELEMENT_ALGO_PERFORMANCE.click();
   }
    public void openOrdersByAlgo (){
        ELEMENT_ORDERS_BY_ALGO.click();
    }
}
