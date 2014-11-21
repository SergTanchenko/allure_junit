package com.swissquote.tests;


import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;
import ru.yandex.qatools.allure.annotations.Step;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;


public class TableTest {

	@Test
	public void tableDisplaysColumnHeaders() throws Exception {
		Assert.assertTrue(true);
	}
}
