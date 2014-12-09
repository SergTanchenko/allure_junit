package com.company.pages;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

import org.openqa.selenium.By;

/**
 * (c) Swissquote 12/9/14
 *
 * @author sergiitanchenko
 */
public class GoogleSearchPage {
	public GoogleResultsPage search(String query) {
		$(By.name("q")).setValue(query).pressEnter();
		return page(GoogleResultsPage.class);
	}
}