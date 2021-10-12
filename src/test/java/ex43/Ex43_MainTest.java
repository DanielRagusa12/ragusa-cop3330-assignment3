package ex43;

import ex42.Ex42_Main;
import junit.framework.TestCase;

public class Ex43_MainTest extends TestCase
{
    Ex43_Main a=new Ex43_Main();

    public void testCreate_website()
    {
        String site_name="awesomeco";
        Ex43_Main a=new Ex43_Main();
        boolean val=a.create_website(site_name);
        assertEquals(false,val);
    }

    public void testCreate_html()
    {
        String site_name="awesomeco";
        Ex43_Main a=new Ex43_Main();
        boolean val=a.create_html(site_name);
        assertEquals(true,val);
    }

    public void testCreate_js()
    {
        String site_name="awesomeco";
        Ex43_Main a=new Ex43_Main();
        boolean val=a.create_js(site_name);
        assertEquals(true,val);

    }

    public void testCreate_css()
    {
        String site_name="awesomeco";
        Ex43_Main a=new Ex43_Main();
        boolean val=a.create_css(site_name);
        assertEquals(true,val);
    }
}