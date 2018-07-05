package pages;

import framework.Helper;
import framework.Page;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class IndexSliderPage extends Page {

    private void addISBtn() {
        clickOnElement(By.linkText("Add index Slide"));
    }

    private void addTitle() {
        sendTextOnField(By.id("title"), Helper.getRandomText());
    }

    private void addDescription() {
        sendTextOnField(By.id("description"), Helper.getRandomText());
    }

    private void chooseLink() {
        Select linkType = new Select(getDriver().findElement(By.name("link_type")));
        linkType.selectByValue("ExternalLink");
    }

    private void linkLabel() {
        sendTextOnField(By.id("link_label"), Helper.getRandomText());
    }

    private void linkUrl() {
        sendTextOnField(By.id("external_link_url"), Helper.getRandomUrl());
    }

    private void uploadPhoto() {
        WebElement choosePhoto = waitForElementVisibility(By.id("index_slide_photo"));
        choosePhoto.sendKeys("/Users/mica/NetBeansProjects/EcoTest/Images/octopus.jpg");
    }

    private void addNewPhoto() {
        WebElement pickNewPhoto = waitForElementVisibility(By.id("index_slide_photo"));
        pickNewPhoto.sendKeys("/Users/mica/NetBeansProjects/EcoTest/Images/austin.jpg");
    }

    private void saveBtn() {
        clickOnElement(By.id("new_indexSlide_submit"));
    }

    private void editBtn(WebElement row) {
        WebElement editButton = row.findElement(By.className("glyphicon-pencil"));
        editButton.click();
    }

    private void deleteBtn(WebElement row) {
        WebElement deleteButton = row.findElement(By.cssSelector("button[title='delete']"));
        deleteButton.click();
    }

    private List<WebElement> getRow() {
        WebElement tableBody = waitForElementVisibility(By.cssSelector("#rows-table > tbody"));
        List<WebElement> rows = tableBody.findElements(By.tagName("tr"));
        System.out.println("Number of rows: " + rows.size());
        return rows;
    }

    private WebElement pickFirstRow() {
        List<WebElement> rows = getRow();
        WebElement firstRow = rows.get(0);
        return firstRow;
    }

    private WebElement pickLastRow() {
        List<WebElement> rows = getRow();
        WebElement lastRow = rows.get(rows.size() - 1);
        return lastRow;
    }

    private WebElement pickRandomRow() {
        List<WebElement> rows = getRow();
        WebElement randomRow = rows.get(Helper.getRandomInteger(rows.size()));
        return randomRow;
    }

    public void addIS() {
        addISBtn();
        addTitle();
        addDescription();
        chooseLink();
        linkLabel();
        linkUrl();
        uploadPhoto();
        saveBtn();
    }

    public void editFirstSlide() {
        WebElement firstRow = pickFirstRow();
        editBtn(firstRow);
        addTitle();
        addDescription();
        chooseLink();
        linkLabel();
        linkUrl();
        addNewPhoto();
        saveBtn();

    }

    public void editLastSlide() {
        WebElement lastRow = pickLastRow();
        editBtn(lastRow);
        addTitle();
        addDescription();
        chooseLink();
        linkLabel();
        linkUrl();
        addNewPhoto();
        saveBtn();

    }

    public void editRandomSlide() {
        WebElement randomRow = pickRandomRow();
        editBtn(randomRow);
        addTitle();
        addDescription();
        chooseLink();
        linkLabel();
        linkUrl();
        addNewPhoto();
        saveBtn();

    }
}
