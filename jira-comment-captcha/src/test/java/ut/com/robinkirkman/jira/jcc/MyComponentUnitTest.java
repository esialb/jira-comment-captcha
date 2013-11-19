package ut.com.robinkirkman.jira.jcc;

import org.junit.Test;
import com.robinkirkman.jira.jcc.MyPluginComponent;
import com.robinkirkman.jira.jcc.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}