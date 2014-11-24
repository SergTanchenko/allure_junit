package com.swissquote.tests;

import org.junit.Assert;
import org.junit.Test;

import com.swissquote.lib.SqFeatures;
import com.swissquote.lib.SqStories;

import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;


@Features(SqFeatures.SEARCH_ENGINE)
public class ResultTableTest {

	@Features(SqFeatures.SIMPLE_TABLE_OF_RESULTS)
	@Stories(SqStories.PST_96)
	@Test
	public void display100RowsAsAMaximum() throws Exception {
		Assert.assertTrue("150 rows are displayed", false);
	}

	@Stories(SqStories.PST_124)
	@Test
	public void ifNoResultsThenAllTabsAreHidden() throws Exception {
		Assert.assertTrue(true);
	}

	@Stories(SqStories.PST_150)
	@Test
	public void ifNoResultsThenFollowingTextIsDisplayed() throws Exception {
		Assert.assertTrue(true);
	}


	@Stories(SqStories.PST_150)
	@Test
	public void secondTestForPst150() throws Exception {
		Assert.assertTrue(true);
	}
}

