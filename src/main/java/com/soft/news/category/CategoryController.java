package com.soft.news.category;

import org.springframework.mobile.device.site.SitePreference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CategoryController {

//	  private static final Logger logger = 
//	            LoggerFactory.getLogger(CategoryController.class);

	    @RequestMapping("/")
	    public String home(SitePreference sitePreference, Model model) {
	    	
	    	System.out.println("test");
	        if (sitePreference == SitePreference.NORMAL) {
//	            logger.info("Site preference is normal");
	            return "home";
	        } else if (sitePreference == SitePreference.MOBILE) {
//	            logger.info("Site preference is mobile");
	            return "home-mobile";
	        } else if (sitePreference == SitePreference.TABLET) {
//	            logger.info("Site preference is tablet");
	            return "home-tablet";
	        } else {
//	            logger.info("no site preference");
	            return "home";
	        }
	    }
	    
}
