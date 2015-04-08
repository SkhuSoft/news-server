package com.soft.news.category;

import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cate")
public class CategoryController {
	// private static final Logger logger =
	// LoggerFactory.getLogger(CategoryController.class);
	@Autowired
	private CategoryRepository categoryRepository;

	@RequestMapping("/")
	public List<Category> list() {
		return categoryRepository.findAll();
	}

	@RequestMapping("/get")
	public HashMap<String, Object> get() {
		System.out.println("test : " + categoryRepository.findByCateId(1));
		return null;
	}
	/*
	 * if (sitePreference == SitePreference.NORMAL) { //
	 * logger.info("Site preference is normal"); return "home"; } else if
	 * (sitePreference == SitePreference.MOBILE) { //
	 * logger.info("Site preference is mobile"); return "home-mobile"; } else if
	 * (sitePreference == SitePreference.TABLET) { //
	 * logger.info("Site preference is tablet"); return "home-tablet"; } else {
	 * // logger.info("no site preference"); return "home"; }
	 */
}
