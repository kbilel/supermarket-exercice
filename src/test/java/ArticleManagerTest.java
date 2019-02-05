import org.junit.Assert;
import org.junit.Test;

import fr.bnp.ServiceManager.ArticleManager;
import fr.bnp.model.Item;

public class ArticleManagerTest {

	ArticleManager articleManager=new ArticleManager();
	
    @Test(expected=IllegalArgumentException.class)
    public void testInvalidArtileThrowIllegalArgumentException() {
        Item item =new Item("banane", 4);
        articleManager.defineArticle(item);
        
    }
    @Test
    public void testAppleArtileShouldSetPriceTo02() {
        Item item =new Item("Apple", 4);
        articleManager.defineArticle(item);
        Assert.assertEquals(0.2, item.getPrice(), 0);
    }
    
    @Test
    public void testOrangeArtileShouldSetPriceTo02() {
        Item item =new Item("Orange", 4);
        articleManager.defineArticle(item);
        Assert.assertEquals(0.5, item.getPrice(), 0);
    }
    
    @Test
    public void testWatermelonShouldSetPriceTo02() {
        Item item =new Item("Watermelon", 4);
        articleManager.defineArticle(item);
        Assert.assertEquals(0.8, item.getPrice(), 0);
    }

    
}
