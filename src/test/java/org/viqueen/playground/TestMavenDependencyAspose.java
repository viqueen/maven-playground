package org.viqueen.playground;

import org.junit.Test;

import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;

public class TestMavenDependencyAspose {

    @Test
    public void testUnpackDependencies() throws ClassNotFoundException {
        Class<?> aspose = Class.forName("com.aspose.imaging.internal.gq.aq");
        assertThat(aspose, notNullValue());
    }

}
