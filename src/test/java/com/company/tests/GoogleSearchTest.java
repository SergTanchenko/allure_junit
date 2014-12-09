package com.company.tests;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

import org.junit.Test;

import com.company.pages.GoogleSearchPage;

import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;

/**
 * (c) Swissquote 12/9/14
 *
 * @author sergiitanchenko
 */
public class GoogleSearchTest {


	@Features("Google search")
	@Stories("Result")
	@Test
	public void searchResultShouldHaveExpectedResult() throws Exception {
		open("http://google.com", GoogleSearchPage.class)
			.search("selenide")
			.results().get(0).shouldHave(text("Selenide: лаконичные UI тесты на Java"));
	}


}
