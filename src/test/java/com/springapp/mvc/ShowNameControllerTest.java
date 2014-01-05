package com.springapp.mvc;

import org.junit.Test;
import org.springframework.ui.ModelMap;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by _ashao2321919 on 14-1-5.
 */
public class ShowNameControllerTest {
    @Test
    public void test_display_name() {
        ModelMap model = new ModelMap();
        String returnView = new NameController().showName(model);
        assertThat(returnView, is("name"));
        assertThat(model.get("name").toString(), is("Li Chenyang"));
    }
}
