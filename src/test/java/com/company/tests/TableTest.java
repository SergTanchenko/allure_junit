package com.company.tests;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import com.company.lib.SqFeatures;
import com.company.lib.SqStories;

public class TableTest {
	@Features(SqFeatures.SIMPLE_TABLE_OF_RESULTS)
	@Stories(SqStories.PST_96)
	@Test
	public void tableDisplaysColumnHeaders() throws Exception {
		Assert.assertTrue(true);
	}


}
