package ut.com.ricksoft_inc.plugins.myPlugin;

import org.junit.Test;
import com.ricksoft_inc.plugins.myPlugin.api.MyPluginComponent;
import com.ricksoft_inc.plugins.myPlugin.impl.MyPluginComponentImpl;

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