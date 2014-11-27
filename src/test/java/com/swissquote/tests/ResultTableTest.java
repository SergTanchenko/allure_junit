package com.swissquote.tests;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Assert;
import org.junit.Test;

import com.swissquote.lib.SqFeatures;
import com.swissquote.lib.SqStories;

import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;


@Features(SqFeatures.SEARCH_ENGINE)
public class ResultTableTest {

	@Features(SqFeatures.SIMPLE_TABLE_OF_RESULTS)
	@Stories(SqStories.PST_96)
	@Test
	public void display100RowsAsAMaximum() throws Exception {
		Assert.assertTrue("150 rows are displayed", false);
	}

	@Stories(SqStories.PST_124)
	@Title("If data is missing for current active tab switch to the first visible tab with data")
	@Test
	public void testTabVisibility() {
		Assert.assertTrue(true);
	}

	@Stories(SqStories.PST_150)
	@Test
	public void ifNoResultsThenFollowingTextIsDisplayed() {
		Assert.assertTrue(true);
	}
}

