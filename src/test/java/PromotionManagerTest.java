import org.junit.Assert;
import org.junit.Test;

import fr.bnp.ServiceManager.ArticleManager;
import fr.bnp.ServiceManager.PromotionManager;
import fr.bnp.model.Item;

public class PromotionManagerTest {
	ArticleManager articleManager=new ArticleManager();

	PromotionManager promotionManager=new PromotionManager();
	
    @Test
    public void testInvalidArtileThrowIllegalArgumentException() {
        Item item =new Item("Apple", 4);
        articleManager.defineArticle(item);
        promotionManager.discount(item);
        Assert.assertEquals(0.4, item.getPriceAfterPromotion(), 0);
        
    }
    @Test
    public void testAppleArtileShouldSetPriceTo02() {
        Item item =new Item("Orange", 3);
        articleManager.defineArticle(item);
        promotionManager.discount(item);
        Assert.assertEquals(1.5, item.getPriceAfterPromotion(), 0);
    }
    
    @Test
    public void testOrangeArtileShouldSetPriceTo02() {
        Item item =new Item("Watermelon", 5);
        articleManager.defineArticle(item);
        promotionManager.discount(item);
        Assert.assertEquals(3.2, item.getPriceAfterPromotion(), 0);
    }
    
    @Test
    public void testWatermelonShouldSetPriceTo02() {
        Item item =new Item("Watermelon", 5);
        articleManager.defineArticle(item);
        promotionManager.discount(item);
        Assert.assertEquals(0.8, item.getPrice(), 0);
    }

    
}
