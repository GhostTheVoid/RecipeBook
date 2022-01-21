/** Required package class namespace */
package recipebook;

import java.net.URL;

/**
 * WriteRecipes.java - Writes each of the recipes and puts them into arrays.
 *
 * @author Marissa Rowles
 * @teacher Mr. Wachs
 * @since 5-Nov-2021
 */
public class WriteRecipes {
    
    public static ReadCustoms readCustoms;
    
    public final static String[] ORIGINAL
            = {""};

    public final static String[] INTERNATIONAL
            = {"American", "Mexican", "British", "French", 
                "Italian", "Japanese", "Original"};
    
    private int recipeCount;

    // The arrays which contain all of the recipes.
    public static Recipe[] american = new Recipe[6];
    public static Recipe[] mexican  = new Recipe[5];
    public static Recipe[] british  = new Recipe[6];
    public static Recipe[] french   = new Recipe[6];
    public static Recipe[] italian  = new Recipe[6];
    public static Recipe[] japanese = new Recipe[6];
    public static Recipe[] custom;
    
    /**
     * Default constructor, set class properties
     */
    public WriteRecipes() {
        readCustoms = new ReadCustoms();
        setupRecipes();
    }

    /**
     * Through instancing writes each of the recipes.
     */
    private void setupRecipes() {
        
        // <editor-fold defaultstate="collapsed" desc="American (DONE)">
        Recipe onionRings = new Recipe("Onion Rings",
                "1 large onion, cut into 1/4-inch slices| "
                + "1 ¼ cups all-purpose flour| "
                + "1 teaspoon baking powder| "
                + "1 teaspoon salt| "
                + "1 egg| "
                + "1 cup milk, or as needed| "
                + "¾ cup dry bread crumbs| "
                + "seasoned salt to taste| "
                + "1 quart oil for frying, or as needed",
                "Heat the oil in a deep-fryer to 365 degrees F (185 degrees C).|"
                + "Separate the onion slices into rings, and set aside. "
                        + "In a small bowl, stir together the flour, "
                        + "baking powder and salt.|"
                + "Dip the onion slices into the flour mixture until they "
                        + "are all coated; set aside.|"
                + "Whisk the egg and milk into the flour mixture using a fork. "
                        + "Dip the floured rings into the batter to coat, "
                        + "then place on a wire rack to drain until "
                        + "the batter stops dripping. "
                        + "The wire rack may be placed over a "
                        + "sheet of aluminum foil for easier clean up. "
                        + "Spread the bread crumbs out on a plate or "
                        + "shallow dish. Place rings one at a time into the "
                        + "crumbs, and scoop the crumbs up over "
                        + "the ring to coat. Give it a hard tap as "
                        + "you remove it from the crumbs. "
                        + "The coating should cling very well. "
                        + "Repeat with remaining rings.|"
                + "Deep fry the rings a few at a time for 2 to 3 minutes, "
                        + "or until golden brown.|"
                + "Remove to paper towels to drain. Season with seasoning salt, "
                        + "and serve.",
                "https://www.allrecipes.com/recipe/82659/old-fashioned-onion-rings/");

        Recipe chickenWings = new Recipe("Chicken Wings",
                "3 Tbsp olive oil| 3 cloves garlic, pressed| 2 tsp chili powder|"
                + "1 tsp garlic powder| "
                + "salt and ground black pepper to taste| "
                + "10 chicken wings",
                "Preheat the oven to 375 degrees F (190 degrees C).|"
                + "Combine the olive oil, garlic, chili powder, garlic powder, "
                        + "salt, and pepper in a large, resealable bag; "
                        + "seal and shake to combine. Add the chicken wings; "
                        + "reseal and shake to coat. "
                        + "Arrange the chicken wings on a baking sheet.|"
                + "Cook the wings in the preheated oven 1 hour, "
                        + "or until crisp and cooked through.",
                "https://www.allrecipes.com/recipe/187822/baked-chicken-wings/");

        Recipe cheeseburger = new Recipe("Cheeseburger",
                "2 lbs freshly ground chuck, (at least 80% lean, a.k.a. 80/20)|"
                + "1 Tbsp onion powder| 1 tsp salt|"
                + "1 tsp freshly ground black pepper| "
                + "12 slices deli-counter American cheese| "
                + "6 large burger buns (preferably homemade) toasted if desired",
                "In a large bowl, mix ground beef, onion powder, "
                        + "salt and pepper until just combined. "
                        + "Do not overmix, or your patties will be tough.|" // 1
                + "Divide into six portions and form patties, "
                        + "without pressing too hard. "
                        + "They should be uniform in thickness. "
                        + "Smooth out any cracks using your fingers. "
                        + "Make these right before you grill them, "
                        + "so they stay at room temperature.|" // 2
                + "Preheat your grill, grill pan or cast-iron skillet to "
                        + "high heat and add burger patties. "
                        + "If using a grill, cover with the lid.|" //3
                + "Cook until the crust that forms on the bottom of "
                        + "the burger releases it from the "
                        + "pan or grate — about 2 minutes. "
                        + "Gently test, but don't flip it until it gets to this "
                        + "point. When burgers lift up easily, "
                        + "flip, add two slices of cheese "
                        + "to each, close lid if using a grill, "
                        + "and cook on the other side for another 2-3 minutes "
                        + "for medium to medium rare.|" //4 
                + "Remove burgers with a sturdy metal spatula and transfer "
                        + "to a plate. Allow to rest for several minutes, "
                        + "then transfer to buns.|" //5
                + "Garnish as desired and serve immediately.",
                "https://www.foodrepublic.com/recipes/all-american-cheeseburger-recipe/");

        Recipe hotdog = new Recipe("Hotdog",
                "Hotdog weiners| Hotdog buns|"
                + "Toppings (relish, mustard, ketchup, onions, etc.)",
                "Using a large saucepan add 1 qt of water and bring it to a boil.|"
                        + "Add 8 hot dogs to the water."
                        + "Bring to a full boil and heat for 4-5 minutes.|"
                + "If you are using frozen hot dogs boil for about 8 minutes.|",
                "https://lilluna.com/how-to-boil-hot-dogs/");

        Recipe macNCheese = new Recipe("Mac N' Cheese",
                "16 oz elbow macaroni, cooked (or other tubular pasta)|"
                + "1 tbsp extra virgin olive oil|"
                + "6 tbsp unsalted butter|"
                + "⅓ cup all purpose flour|"
                + "3 cups whole milk|"
                + "1 cup heavy whipping cream|"
                + "4 cups sharp cheddar cheese shredded|"
                + "2 cups Gruyere cheese shredded|"
                + "salt and pepper to taste|"
                + "1½ cups panko crumbs|"
                + "4 tbsp butter melted|"
                + "½ cup Parmesan cheese shredded|"
                + "¼ tsp smoked paprika (or regular paprika)",
                "Preheat oven to 350F. Lightly grease a large 3 qt or 4 qt "
                        + "baking dish and set aside. Combine shredded cheeses "
                        + "in a large bowl and set aside.|" 
                + "Cook the pasta one minute shy of al-dente according to the "
                        + "package instructions. Remove from heat, drain, "
                        + "and place in a large bowl.|"
                + "Drizzle pasta with olive oil and stir to coat pasta. "
                        + "Set aside to cool while preparing cheese sauce.|" 
                + "Melt butter in a deep saucepan, dutch oven, or stock pot.|"
                + "Whisk in flour over medium heat and continue whisking "
                        + "for about 1 minute until bubbly and golden.|" 
                + "Gradually whisk in the milk and heavy cream "
                        + "until nice and smooth. Continue whisking until you "
                        + "see bubbles on the surface and then continue "
                        + "cooking and whisking for another 2 minutes. "
                        + "Whisk in salt and pepper.|" // 6
                + "Add two cups of shredded cheese and whisk until smooth. "
                        + "Add another two cups of shredded cheese and "
                        + "continue whisking until creamy and smooth. "
                        + "The sauce should be nice and thick.|" //7
                + "Stir in the cooled pasta until combined and "
                        + "pasta is fully coated with the cheese sauce.|" //8
                + "Pour half of the mac and cheese into the prepared "
                        + "baking dish. Top with remaining 2 cups of "
                        + "shredded cheese and then the "
                        + "remaining mac and cheese.|" // 9
                + "In a small bowl, combine panko crumbs, "
                        + "Parmesan cheese, melted butter and paprika. "
                        + "Sprinkle over the top and bake until bubbly "
                        + "and golden brown, about 30 minutes. "
                        + "Serve immediately.",
                "https://www.momontimeout.com/best-homemade-baked-mac-and-cheese-recipe/");

        Recipe bbqRibs = new Recipe("BBQ Ribs",
                "¼ cup brown sugar| 2 tbsp chili powder| "
                + "Kosher salt and freshly ground black pepper|"
                + "1 tsp dried oregano| ½ tsp cayenne pepper| "
                + "½ tsp garlic powder| ½ tsp onion powder| "
                + "2 racks baby back ribs| 2 racks baby back ribs|"
                + "2 Tbsp apple cider vinegar| 1 cup barbecue sauce",
                "Combine the brown sugar, chili powder, 1 Tbsp salt, "
                        + "1 tsp black pepper, the oregano, cayenne, "
                        + "garlic powder and onion powder in a small bowl and "
                        + "rub the mixture on both sides of the ribs. "
                        + "Cover and refrigerate 1 hour or overnight.|" // 1
                + "Preheat the oven to 250 degrees F. In a roasting pan, "
                        + "combine the broth and vinegar. "
                        + "Add the ribs to the pan. "
                        + "Cover with foil and tightly seal. Bake 2 hours. "
                        + "Remove the ribs from the pan and "
                        + "place them on a platter. "
                        + "Pour the liquid from the pan into a saucepan and "
                        + "bring to a boil. Lower the heat to a simmer and cook "
                        + "until reduced by half. Add the barbecue sauce.|" // 2
                + "Preheat an outdoor grill to medium high. Put the ribs "
                        + "on the grill and cook about 5 minutes on each side, "
                        + "until browned and slightly charred. "
                        + "Cut the ribs between the bones and toss them in a "
                        + "large bowl with the sauce. Serve hot.",
                "https://www.foodnetwork.com/recipes/katie-lee/best-barbecue-ribs-ever-3364398");

        american[0] = onionRings;
        american[1] = chickenWings;
        american[2] = cheeseburger;
        american[3] = hotdog;
        american[4] = macNCheese;
        american[5] = bbqRibs;

        // </editor-fold>    
        
        // <editor-fold defaultstate="collapsed" desc="Mexican (DONE)">
        Recipe nachos = new Recipe("Nachos",
                "<b>Spice mix</b>|"
                + "2 Tbsp chili powder| 1 ½ tsps kosher salt|"
                + "1 tsp granulated garlic| 1 tsp granulated onion|"
                + "1 tsp ground cumin| ½ tsp dried oregano|"
                + "¼ tsp black pepper | *Pinch of cayenne pepper|"
                + "<b>Nachos</b>|"
                + "1 tsp vegetable oil| "
                + "1 pound ground beef (80:20 lean-to-fat ratio)|"
                + "16 oz (2 cups) refried beans, canned or homemade|"
                + "¼ cup water| 1 large bag of tortilla chips|"
                + "4 oz cheddar cheese, grated (about 2 cups), plus more for topping|"
                + "4 oz Colby Jack cheese, grated (about 2 cups), plus more for topping|"
                + "1 cup pico de gallo, store-bought or homemade, plus more for topping|"
                + "¼ cup chopped cilantro| "
                + "1 jalapeño (pickled or fresh), sliced",
                "Preheat the oven to 350°F.| " //1
                + "Combine all of the spices (chili powder through cayenne) "
                        + "together in a small bowl.|" // 2
                + "Heat the vegetable oil on medium high heat until it "
                        + "begins to shimmer. Add the ground beef to the "
                        + "pan and season it with all of the taco spice blend. "
                        + "As the meat cooks, use a spoon to break "
                        + "the meat up into crumbles. "
                        + "Cook 8 minutes until meat has browned. "
                        + "Drain the fat using a colander. "
                        + "Return the meat to the pan and add "
                        + "the refried beans and the water. Heat the mixture "
                        + "until the beans are smooth and warmed through. "
                        + "Reduce the heat to low and keep the beef-bean mixture "
                        + "warm while you prepare the chips.| " // 3
                + "On a 13x18-inch oven-safe platter or sheet pan, "
                        + "arrange the tortilla chips in a single layer, "
                        + "overlapping them slightly. Toast the chips in the "
                        + "preheated oven for 5 minutes, or just until you begin "
                        + "to smell their aroma.| " // 4
                + "Carefully remove the pan from the oven and top with one half "
                        + "of the shredded cheeses. Allow the heat from the "
                        + "chips to melt the cheese slightly before "
                        + "topping the chips with the beef and bean mixture. "
                        + "Sprinkle the remaining cheese over the "
                        + "beef and return the pan to the oven for 5 minutes, "
                        + "or until the cheese has fully melted.",
                "https://www.simplyrecipes.com/recipes/nachos/");
        
        Recipe tacos = new Recipe("Taco",
                "2 tablespoons reduced sodium soy sauce|"
                + "2 tablespoons freshly squeezed lime juice|"
                + "2 tablespoons canola oil, divided|"
                + "3 cloves garlic, minced|"
                + "2 teaspoons chili powder|"
                + "1 teaspoon ground cumin|"
                + "1 teaspoon dried oregano|"
                + "1 1/2 pounds skirt steak, cut into 1/2-inch pieces|"
                + "12 mini flour tortillas, warmed|"
                + "3/4 cup diced red onion|"
                + "1/2 cup chopped fresh cilantro leaves|"
                + "1 lime, cut into wedges",
                "In a medium bowl, combine soy sauce, lime juice, "
                        + "1 tablespoon canola oil, garlic, chili powder, "
                        + "cumin and oregano.|"
                + "In a gallon size Ziploc bag or large bowl, "
                        + "combine soy sauce mixture and steak; "
                        + "marinate for at least 1 hour up to 4 hours, "
                        + "turning the bag occasionally.|"
                + "Heat remaining 1 tablespoon canola oil in a "
                        + "large skillet over medium high heat. "
                        + "Add steak and marinade, and cook, stirring often, "
                        + "until steak has browned and marinade has reduced, "
                        + "about 5-6 minutes, or until desired doneness.|"
                + "Serve steak in tortillas, topped with onion, "
                        + "cilantro and lime.",
                "https://damndelicious.net/2019/04/18/mexican-street-tacos/");
        Recipe fajitas = new Recipe("Fajitas",
                "<b>Chicken Fajitas</b>|"
                        + "3 boneless skinless chicken breasts|"
                        + "1 onion thinly sliced|"
                        + "3 bell peppers thinly sliced|"
                        + "2 tablespoons olive oil|"
                        + "1/2 lime|"
                + "<b>Fajita Seasoning</b>|"
                        + "1/2 tablespoon chili powder|"
                        + "1/2 tablespoon ground cumin|"
                        + "1 teaspoon garlic powder|"
                        + "1/2 teaspoon paprika|"
                        + "1/2 teaspoon oregano|"
                        + "1/2 teaspoon salt|"
                        + "1/4 teaspoon pepper|"
                + "<b>For Serving</b>|"
                        + "tortillas|"
                        + "sour cream|"
                        + "pico de gallo|"
                        + "avocado",
                "Add the fajitas seasoning ingredients to a "
                        + "small mixing bowl and stir together.|"
                + "Generously sprinkle the fajita seasoning on both sides of "
                        + "the chicken and use your fingers to press "
                        + "it into the chicken.|"
                + "Heat the oil in a large skillet over medium heat. "
                        + "Sear the chicken breasts for about "
                        + "7-8 minutes on each side.|"
                + "While your chicken is cooking, cut the bell peppers "
                        + "and onion into thin slices.|"
                + "Once the chicken has finished cooking, remove it to a "
                        + "plate and let it rest for a couple of minutes. "
                        + "Add the bell peppers and onion to the same skillet "
                        + "over medium heat and saute for 4-5 minutes, "
                        + "stirring frequently.|"
                + "When the bell peppers are just about done sauteing, "
                        + "slice the chicken breasts into strips.|"
                + "Add the chicken back into the skillet, add a squeeze of "
                        + "fresh lime juice and stir everything together.|"
                + "Serve immediately with tortillas and extra toppings "
                        + "such as sour cream, pico de gallo and guacamole.",
                "https://downshiftology.com/recipes/chicken-fajitas/");
        Recipe quesadillas = new Recipe("Quesadillas",
                "1 tbsp. extra-virgin olive oil|"
                + "*2 bell peppers, thinly sliced|"
                + "1/2 onion, thinly sliced|"
                + "Kosher salt|"
                + "Freshly ground black pepper|"
                + "1 lb. boneless skinless chicken breasts, sliced into strips|"
                + "1/2 tsp. chili powder|"
                + "1/2 tsp. ground cumin|"
                + "1/2 tsp. dried oregano|"
                + "4 medium flour tortillas|"
                + "2 cups shredded Monterey jack|"
                + "2 cups shredded cheddar|"
                + "1 avocado, sliced|"
                + "*1 tbsp. vegetable oil|"
                + "2 green onions, thinly sliced|"
                + "Sour cream, for serving",
                "In a large skillet over medium-high heat, heat olive oil. "
                        + "Add peppers and onion and season with salt and pepper. "
                        + "Cook until soft, 5 minutes. Transfer to a plate.|"
                + "Heat remaining tablespoon vegetable oil over medium-high heat. "
                        + "Season chicken with spices, salt, and pepper and cook, "
                        + "stirring occasionally, until golden and cooked through, "
                        + "8 minutes. Transfer to a plate.|"
                + "Add 1 flour tortilla to skillet and top half of the tortilla "
                        + "with a heavy sprinkling of both cheeses, "
                        + "cooked chicken mixture, pepper-onion mixture, "
                        + "a few slices of avocado, and green onions. "
                        + "Fold the other half of the tortilla over and cook, "
                        + "flipping once, until golden, 3 minutes per side. "
                        + "Repeat to make 4 quesadillas.|"
                + "Slice into wedges and serve with sour cream.",
                "https://www.delish.com/cooking/recipe-ideas/recipes/a54465/easy-chicken-quesadilla-recipe/");
        Recipe chiliConCarne = new Recipe("Chili con Carne",
                "2 pounds ground beef|"
                + "2 tablespoons olive oil|"
                + "2 medium onions, chopped|"
                + "2 garlic cloves, minced|"
                + "1 medium green pepper, chopped| "
                + "1-1/2 teaspoons salt| "
                + "2 tablespoons chili powder| "
                + "3 teaspoons beef bouillon granules| "
                + "1/8 teaspoon cayenne pepper| "
                + "1/4 teaspoon ground cinnamon| "
                + "1 teaspoon ground cumin| "
                + "1 teaspoon dried oregano| "
                + "2 cans (14-1/2 ounces each) diced tomatoes, undrained| "
                + "1 cup water| "
                + "1 can (16 ounces) kidney beans, rinsed and drained| "
                + "*Sour cream and jalapeno slices",
                "In a Dutch oven, cook beef over medium heat until no "
                        + "longer pink, 5-7 minutes; crumble beef. "
                        + "Drain and set aside.|"
                + "In the same pot, heat oil; saute onions until tender. "
                        + "Add garlic; cook 1 minute longer. "
                        + "Stir in the green pepper, salt, chili powder, "
                        + "bouillon, cayenne, cinnamon, cumin and oregano. "
                        + "Cook for 2 minutes, stirring until combined.|"
                + "Add tomatoes and browned beef. Stir in water. "
                        + "Bring to a boil. Reduce heat; cover and simmer "
                        + "for about 1 hour. Add beans and heat through. "
                        + "If desired top with sour cream and jalapeno.",
                "https://www.tasteofhome.com/recipes/chili-con-carne/");

        mexican[0] = nachos;
        mexican[1] = tacos;
        mexican[2] = fajitas;
        mexican[3] = quesadillas;
        mexican[4] = chiliConCarne;

        // </editor-fold>  
        
        // <editor-fold defaultstate="collapsed" desc="British (DONE)">
        Recipe steakAndKidneyPie = new Recipe("Steak and Kidney Pie",
                "<b>Filling</b>|"
                    + "1/3 cup all-purpose flour|"
                    + "Salt, to taste|"
                    + "Black pepper, to taste|"
                    + "1 1/2 pounds beef chuck steak (or other tough beef), "
                        + "cut into 1-inch cubes|"
                    + "1/2 pound beef kidney, cleaned and chopped into "
                        + "1-inch cubes|"
                    + "2 tablespoons butter|"
                    + "1 tablespoon vegetable oil|"
                    + "2 large onions, thinly sliced|"
                    + "2 carrots, cut into 1-inch cubes|"
                    + "3 1/2 cups beef stock, hot|"
                + "<b>Pastry</b>|"
                    + "2 1/4 cups all-purpose flour|"
                    + "Pinch of salt|"
                    + "8 tablespoons (1 stick) butter, cubed, "
                        + "or an equal mix of butter and lard|"
                    + "2 to 3 tablespoons water, cold|"
                    + "1 large egg, beaten",
                "In a large bowl, place the flour, salt, and pepper.|"
                + "Add the cubes of steak and kidneys and toss well "
                        + "in the flour until evenly coated.|"
                + "In a large flameproof casserole dish or ceramic saucepan, "
                        + "heat the butter and oil until the butter has melted.|"
                + "Add the floured meats in small batches and stir quickly "
                        + "for about 1 minute, or until the cubes have browned. "
                        + "Remove the cooked beef with a slotted spoon and "
                        + "repeat the process until all cubes have been browned. "
                        + "Set the beef aside.|"
                + "Add the onions and carrots to the same casserole dish "
                        + "and gently sauté for about 5 minutes."
                + "Return the meat to the pan, stir, and add the stock.|"
                + "Season with plenty of black pepper and a little salt. "
                        + "Bring to a gentle boil.|"
                + "Cover with a lid and reduce to a gentle simmer.|"
                + "Cook slowly for about 2 hours or until the meat is "
                        + "tender and the sauce has thickened.|"
                + "Remove from the heat, place into a 6-cup deep pie dish, "
                        + "and let cool completely.|",
                "https://www.thespruceeats.com/ultimate-steak-and-kidney-pie-recipe-435671");
        Recipe fishChips = new Recipe("Fish N' Chips",
                "<b>Fish</b>|"
                        + "7 tablespoons (55 grams) all-purpose flour, divided|"
                        + "7 tablespoons (55 grams) cornstarch|"
                        + "1 teaspoon baking powder|"
                        + "Sea salt, to taste|"
                        + "1 pinch freshly ground black pepper, to taste|"
                        + "1/3 cup dark beer, cold|"
                        + "1/3 cup sparkling water, cold|"
                        + "4 (7-ounce) fish fillets (thick, white fish)|"
                + "<b>Chips</b>|"
                        + "2 pounds potatoes, peeled|"
                        + "1 quart (1 liter) vegetable oil , or lard, for frying",
                "Set aside 2 tablespoons of flour. In a large, roomy bowl, "
                        + "mix the remaining flour with the cornstarch and "
                        + "baking powder. Season lightly with a tiny pinch "
                        + "of salt and pepper.|"
                + "Using a fork to whisk continuously, add the beer and "
                        + "the sparkling water to the flour mixture and "
                        + "continue mixing until you have a thick, "
                        + "smooth batter. Place the batter in the fridge to "
                        + "rest for between 30 minutes and 1 hour.|"
                + "Meanwhile, cut the potatoes into a little less than "
                        + "1/2-inch-thick slices, "
                        + "then slice these into 1/2-inch-wide chips. "
                        + "Place the chips into a colander and rinse under "
                        + "cold running water.|"
                + "Place the washed chips into a pan of cold water. "
                        + "Bring to a gentle boil and simmer for "
                        + "3 to 4 minutes.|"
                + "Drain carefully through a colander, "
                        + "then dry with paper towels. "
                        + "Keep in the fridge covered with "
                        + "paper towels until needed.|"
                + "Meanwhile, lay the fish fillets on a paper towel "
                        + "and pat dry. Season lightly with a little sea salt.|"
                + "Heat the oil to 350 F in a deep-fat fryer or large, "
                        + "deep saucepan. Cook the chips a few handfuls "
                        + "at a time in the fat for about 2 minutes. "
                        + "Do not brown them. Once the chips are slightly "
                        + "cooked, remove them from the fat and drain. "
                        + "Keep to one side.|"
                + "Place the 2 tablespoons of flour reserved from the batter "
                        + "mix into a shallow bowl. Toss each fish "
                        + "fillet in the flour and shake off any excess.|"
                + "Dip into the batter, coating the entire fillet.|"
                + "Check that the oil temperature is still 350 F. "
                        + "Carefully lower each fillet into the hot oil. "
                        + "Fry for approximately 8 minutes, or until the "
                        + "batter is crisp and golden, turning the fillets "
                        + "from time to time with a large slotted spoon.|"
                + "Once cooked, remove the fillets from the hot oil and "
                        + "drain on paper towels. Sprinkle with salt. "
                        + "Cover with greaseproof paper (parchment paper) "
                        + "and keep hot.|"
                + "Heat the oil to 400 F, then cook the chips until golden "
                        + "and crisp, or about 5 minutes. "
                        + "Remove from the oil and drain. Season with salt.",
                "https://www.thespruceeats.com/best-fish-and-chips-recipe-434856");
        Recipe tomatoSoup = new Recipe("Tomato Soup",
                "4 cups chopped fresh tomatoes|"
                + "1 sliced onion| 4 whole cloves| 2 cups chicken broth|"
                + "2 tablespoons butter| 2 tablespoons all-purpose flour|"
                + "1 teaspoon salt| 2 teaspoons white sugar, or to taste",
                "In a stockpot, over medium heat, combine the tomatoes, onion, "
                        + "cloves and chicken broth. Bring to a boil, "
                        + "and gently boil for about 20 minutes to blend all "
                        + "of the flavors. Remove from heat and run the mixture "
                        + "through a food mill into a large bowl, or pan. "
                        + "Discard any stuff left over in the food mill.|"
                + "In the now empty stockpot, melt the butter over medium heat. "
                        + "Stir in the flour to make a roux, "
                        + "cooking until the roux is a medium brown."
                        + "Gradually whisk in a bit of the tomato mixture, "
                        + "so that no lumps form, then stir in the rest. "
                        + "Season with sugar and salt, and adjust to taste.",
                "https://www.allrecipes.com/recipe/39544/garden-fresh-tomato-soup/");
        Recipe veggieSoup = new Recipe("Vegetable Soup",
                "2 Tbsp olive oil| "
                + "1 1/2 cups chopped yellow onion (1 medium)|"
                + "2 cups peeled and chopped carrots (about 5)|"
                + "1 1/4 cups chopped celery (about 3)| "
                + "4 cloves garlic, minced|"
                + "4 (14.5 oz) cans low-sodium chicken broth or vegetable broth|"
                + "2 (14.5 oz) cans diced tomatoes (undrained)|"
                + "3 cups peeled and 1/2-inch thick diced potatoes "
                        + "(from about 3 medium)|"
                + "1/3 cup chopped fresh parsley| "
                + "2 bay leaves| "
                + "1/2 tsp dried thyme, or 1 Tbsp fresh thyme leaves| "
                + "Salt and freshly ground black pepper|"
                + "1 1/2 cups chopped frozen or fresh green beans|"
                + "1 1/4 cups frozen or fresh corn|"
                + "1 cup frozen or fresh peas",
                "Heat olive oil in a large pot over medium-high heat.|"
                + "Add onions, carrots, and celery and saute 4 minutes then "
                        + "add garlic and saute 30 seconds longer.|"
                + "Add in broth, tomatoes, potatoes, parsley, bay leaves, "
                        + "thyme and season with salt and pepper to taste.*|"
                + "Bring to a boil, then add green beans.|"
                + "Reduce heat to medium-low, cover and simmer until potatoes "
                        + "are almost fully tender, about 20 - 30 minutes.|"
                + "Add corn and peas and cook 5 minutes longer. Serve warm.",
                "https://www.cookingclassy.com/vegetable-soup/");
        Recipe porkPie = new Recipe("Pork Pie",
                "2 (9 inch) unbaked pie shells|"
                + "2 pounds lean ground pork|"
                + "1 pound lean ground beef|"
                + "1 ½ cups mashed potatoes|"
                + "salt to taste|"
                + "ground black pepper to taste|"
                + "1 teaspoon ground nutmeg|"
                + "1 egg white",
                "Brown ground beef and ground pork over medium heat until thoroughly cooked. Drain off grease.|"
                + "Mix together cooked meat, potatoes, salt, pepper, and nutmeg.|"
                + "Line a 9 inch pie dish with pastry. Spoon pork mixture into "
                        + "pie crust, and top with second pie crust. "
                        + "Brush top crust with egg white. Shield crust edges "
                        + "with aluminum foil to prevent burning.|"
                + "Bake at 375 degrees F (190 degrees C) for 45 minutes. "
                        + "Remove foil for final 15 minutes of baking to "
                        + "brown edges.",
                "https://www.allrecipes.com/recipe/9251/pork-pie/");
        Recipe roastDinner = new Recipe("Roast Dinner",
                "1 pound red potatoes (3-4 medium), cubed| "
                + "1-1/2 cups fresh baby carrots| "
                + "1 medium green pepper, chopped| "
                + "1 medium parsnip, chopped| "
                + "1/4 pound small fresh mushrooms|"
                + "1 small red onion, chopped| "
                + "1 beef rump roast or bottom round roast (3 pounds)|"
                + "1 can (14-1/2 ounces) beef broth|"
                + "3/4 teaspoon salt|"
                + "3/4 teaspoon dried oregano|"
                + "1/4 teaspoon pepper|"
                + "3 tablespoons cornstarch|"
                + "1/4 cup cold water",
                "Place vegetables in a 5-qt. slow cooker. "
                        + "Cut roast in half; place over vegetables. "
                        + "Mix broth and seasonings; pour over roast. "
                        + "Cook, covered, on low until meat and vegetables "
                        + "are tender, 7-9 hours.|"
                + "Remove roast and vegetables from slow cooker; keep warm. "
                        + "Transfer cooking juices to a small saucepan; "
                        + "bring to a boil. Mix cornstarch and water until "
                        + "smooth; stir into cooking juices. "
                        + "Return to a boil; cook and stir until thickened, "
                        + "1-2 minutes. Serve with roast and vegetables.",
                "https://www.tasteofhome.com/recipes/beef-roast-dinner/");

        british[0] = steakAndKidneyPie;
        british[1] = fishChips;
        british[2] = tomatoSoup;
        british[3] = veggieSoup;
        british[4] = porkPie;
        british[5] = roastDinner;
        // </editor-fold>  

        // <editor-fold defaultstate="collapsed" desc="French (DONE)">
        Recipe croissant = new Recipe("Croissant",
                "<b>Détrempe (Dough)</b>|"
                + "4 ⅔ cups/605 grams all-purpose or bread flour, "
                        + "plus more for dusting|"
                + "⅓ cup/66 grams granulated sugar|"
                + "1 tablespoon plus 1/2 teaspoon/12 grams kosher salt|"
                + "2 ¼ teaspoons/7 grams active dry yeast|"
                + "¾ cup plus 2 tablespoons/214 grams water,"
                        + " at room temperature|"
                + "½ cup/120 grams whole milk, at room temperature|"
                + "¼ cup/57 grams unsalted butter, "
                        + "cut into 1/2-inch pieces, chilled|"
                + "<b>Butter Block and Assembly</b>|"
                    + "1 ½ cups/340 grams unsalted European or European-style "
                        + "butter (3 sticks), chilled|"
                    + "All-purpose flour, for rolling|"
                    + "1 large egg yolk|"
                    + "1 tablespoon heavy cream",
                "Twenty-four hours before serving, start the détrempe: "
                        + "In the bowl of a stand mixer fitted with the "
                        + "dough hook, combine the flour, sugar, salt "
                        + "and yeast, and stir to combine. "
                        + "Create a well in the center, and pour in the "
                        + "water and milk. Mix on low speed until a tight, "
                        + "smooth dough comes together around the hook, "
                        + "about 5 minutes. Remove the hook and cover "
                        + "the bowl with a damp towel. "
                        + "Set aside for 10 minutes.|"
                + "Reattach the dough hook and turn the mixer on medium-low "
                        + "speed. Add the butter pieces all at once and "
                        + "continue to mix, scraping down the bowl and hook "
                        + "once or twice, until the dough has formed a very "
                        + "smooth, stretchy ball that is not the least bit "
                        + "sticky, 8 to 10 minutes.|"
                + "Form the dough into a ball and place seam-side down on a "
                        + "lightly floured work surface. Using a sharp knife, "
                        + "cut two deep perpendicular slashes in the dough, "
                        + "forming a “+.” (This will help the dough expand "
                        + "into a square shape as it rises, making it easier "
                        + "to roll out later.) Place the dough slashed-side "
                        + "up inside the same mixing bowl, cover with plastic "
                        + "wrap and let rise at room temperature until about "
                        + "1 1/2 times its original size, 45 minutes to "
                        + "1 hour. Transfer the bowl to the refrigerator "
                        + "and chill for at least 4 hours and up to 12.|"
                + "As the dough chills, make the butter block: "
                        + "Place the sticks of butter side-by-side "
                        + "in the center of a large sheet of parchment "
                        + "paper, then loosely fold all four sides of "
                        + "the parchment over the butter to form a packet. "
                        + "Turn the packet over and use a rolling pin to "
                        + "lightly beat the cold butter into a flat scant "
                        + "1/2-inch-thick layer, fusing the sticks and making "
                        + "it pliable. (Don’t worry about the shape at this "
                        + "point.) The parchment may tear. Turn over the "
                        + "packet and unwrap, replacing the parchment with "
                        + "a new sheet if needed. Fold the parchment paper "
                        + "over the butter again, this time making neat, "
                        + "clean folds at right angles (like you’re wrapping "
                        + "a present), forming an 8-inch square. Turn the "
                        + "packet over again and roll the pin across the "
                        + "packet, further flattening the butter into a "
                        + "thin layer that fills the entire packet while "
                        + "forcing out any air pockets. The goal is a level "
                        + "and straight-edged square of butter. "
                        + "Transfer the butter block to the refrigerator.|"
                + "Eighteen hours before serving, remove the dough from "
                        + "the refrigerator, uncover and transfer to a "
                        + "clean work surface. (It will have doubled in size.) "
                        + "Deflate the dough with the heel of your hand. "
                        + "Using the four points that formed where you "
                        + "slashed the dough, stretch the dough outward "
                        + "and flatten into a rough square measuring no "
                        + "more than 8 inches on one side.|"
                + "Place 2 pieces of plastic wrap on the work surface "
                        + "perpendicular to each other, and place the "
                        + "dough on top. Wrap the dough rectangle, "
                        + "maintaining the squared-off edges, then roll "
                        + "your pin over top as you did for the butter, "
                        + "forcing the dough to fill in the plastic and "
                        + "form an 8-inch square with straight sides and "
                        + "right angles. Freeze for 20 minutes.|"
                + "Remove the butter from the refrigerator and the dough "
                        + "from the freezer. Set aside the butter. Unwrap "
                        + "the dough (save the plastic, as you’ll use "
                        + "it again) and place on a lightly floured surface. "
                        + "Roll the dough, dusting with flour if necessary, "
                        + "until 16 inches long, maintaining a width of 8 "
                        + "inches (barely wider than the butter block). "
                        + "With a pastry brush, brush off any flour from "
                        + "the surface of the dough and make sure none "
                        + "sticks to the surface.|"
                + "You’re going to enclose the butter block in the dough "
                        + "and roll them out together. To ensure they do "
                        + "so evenly, they should have the same firmness, "
                        + "with the dough being slightly colder than the "
                        + "butter. The butter should be chilled but able "
                        + "to bend without breaking. If it feels stiff or "
                        + "brittle, let sit at room temperature for a few "
                        + "minutes. Unwrap the butter just so the top is "
                        + "exposed, then use the parchment paper to "
                        + "carefully invert the block in the center of "
                        + "the dough rectangle, ensuring all sides are "
                        + "parallel. Press the butter gently into the "
                        + "dough and peel off the parchment paper. "
                        + "You should have a block of butter with "
                        + "overhanging dough on two opposite sides and "
                        + "a thin border of dough along the other two.|"
                + "Grasp the overhanging dough on one side and bring it "
                        + "over the butter toward the center, then repeat "
                        + "with the other side of the dough, enclosing the "
                        + "butter. You don’t need the dough to overlap, "
                        + "but you want the two sides to meet, so stretch it "
                        + "if necessary, and pinch the dough together along "
                        + "all seams so no butter peeks out anywhere. "
                        + "Lift the whole block and dust a bit of flour "
                        + "underneath, then rotate the dough 90 degrees, "
                        + "so the center seam is oriented vertically.|"
                + "Orient the rolling pin perpendicular to the seam and "
                        + "lightly beat the dough all along the surface to "
                        + "lengthen and flatten. Roll out the dough "
                        + "lengthwise along the seam into a 24-inch-long, "
                        + "1/4-inch-thick narrow slab, lightly dusting "
                        + "underneath and over top with more flour as needed "
                        + "to prevent sticking. Rather than applying pressure "
                        + "downward, try to push the dough toward and away "
                        + "from you with the pin, which will help maintain "
                        + "even layers of dough and butter. "
                        + "Remember to periodically lift the dough and make "
                        + "sure it’s not sticking to the surface, and try "
                        + "your best to maintain straight, parallel sides. "
                        + "(It’s OK if the shorter sides round a bit — "
                        + "you’re going to trim them.)|"
                + "Use a wheel cutter or long, sharp knife to trim the "
                        + "shorter ends, removing excess dough where the "
                        + "butter doesn’t fully extend and squaring off the "
                        + "corners for a very straight-edged, even rectangle "
                        + "of dough. Maintaining the rectangular shape, "
                        + "especially at this stage, will lead to the most "
                        + "consistent and even lamination. If at any point in "
                        + "the process you see air bubbles in the dough while "
                        + "rolling, pierce them with a cake tester or the tip "
                        + "of a paring knife to deflate and proceed.|"
                + "Dust any flour off the dough’s surface. Grasp the short "
                        + "side of the rectangle farther from you and fold "
                        + "it toward the midline of the dough slab, "
                        + "aligning the sides. Press gently so the dough "
                        + "adheres to itself. Repeat with the other side "
                        + "of the dough, leaving an 1/8-inch gap where the "
                        + "ends meet in the middle. Now, fold the entire "
                        + "slab in half crosswise along the gap in the center. "
                        + "You should now have a rectangular packet of dough, "
                        + "called a “book,” that’s four layers thick. "
                        + "This is a “double turn,” and it has now quadrupled "
                        + "the number of layers of butter inside the dough.|"
                + "Wrap the book tightly in the reserved plastic. "
                        + "If it is thicker than about 1 1/2 inches, "
                        + "or if it’s lost some of its rectangularity, "
                        + "roll over the plastic-wrapped dough to flatten "
                        + "it and reshape it. Freeze the book for 15 minutes, "
                        + "then refrigerate for 1 hour.|"
                + "Let the dough sit at room temperature for about 5 minutes. "
                        + "Unwrap and place on a lightly floured surface. "
                        + "Beat the dough and roll out as before (Step 10) "
                        + "into another long, narrow 3/8-inch-thick slab. "
                        + "It should be nice and relaxed, and extend easily. "
                        + "Dust off any excess flour.|"
                + "Fold the dough in thirds like a letter, "
                        + "bringing the top third of the slab "
                        + "down and over the center third, "
                        + "then the bottom third up and over. "
                        + "This is a “simple turn,” tripling the layers. "
                        + "Press gently so the layers adhere. "
                        + "Wrap tightly in plastic again and freeze for "
                        + "15 minutes, then refrigerate for 1 hour.|"
                + "Let the dough sit at room temperature for about "
                        + "5 minutes, then unwrap and place on a "
                        + "lightly floured surface. Beat the dough and "
                        + "roll out as before, but into a 14-by-17-inch slab "
                        + "(15-by-16-inch for pain au chocolat or ham and "
                        + "cheese croissants). The dough will start to "
                        + "spring back, but try to get it as close to "
                        + "those dimensions as possible. Brush off any "
                        + "excess flour, wrap tightly in plastic, and slide "
                        + "onto a baking sheet or cutting board. "
                        + "Freeze for 20 minutes, then chill overnight "
                        + "(8 to 12 hours).|"
                + "Four and a half hours before serving, arrange racks "
                        + "in the upper and lower thirds of the oven. "
                        + "Bring a skillet of water to a simmer over "
                        + "medium-high heat. Transfer the skillet to the "
                        + "floor of the oven and close the door. "
                        + "(The steam released inside the oven will "
                        + "create an ideal proofing environment.)|"
                + "As the steam releases in the oven, line two rimmed "
                        + "baking sheets with parchment paper and set "
                        + "aside. Let the dough sit at room temperature "
                        + "for about 5 minutes. Unwrap (save the "
                        + "plastic for proofing), place on a very lightly "
                        + "floured surface, and, if necessary, roll out "
                        + "to 17-by-14 inches. Very thoroughly dust off "
                        + "any excess flour with a pastry brush. "
                        + "Use a wheel cutter or long knife and ruler "
                        + "to cut the shorter sides, trimming any "
                        + "irregular edges where not all the layers "
                        + "of dough fully extend and creating a rectangle "
                        + "that’s exactly 16 inches long, then cut into "
                        + "four 4-by-14-inch rectangles.|"
                + "Separate the rectangles, then use the ruler and wheel "
                        + "cutter to slice a straight line from opposite "
                        + "corners of one rectangle to form two long, "
                        + "equal triangles. Repeat with the remaining "
                        + "rectangles to make 8 triangles. Trim the short "
                        + "side of each triangle at a slight angle, making "
                        + "them into triangles with longer "
                        + "sides of equal length.|"
                + "Working one triangle at a time, grasp the two corners "
                        + "of the shorter end, the base of the crescent, "
                        + "and tug gently outward to extend the points "
                        + "and widen the base to about 3 inches. "
                        + "Then, gently tug outward from about halfway "
                        + "down the triangle all the way to the point, "
                        + "to both lengthen the triangle and thin the "
                        + "dough as it narrows. Starting at the base "
                        + "(the short end), snugly roll up the dough, "
                        + "keeping the point centered and applying "
                        + "light pressure. Try not to roll tightly or "
                        + "stretch the dough around itself. "
                        + "Place the crescent on one of the "
                        + "parchment-lined baking sheets, resting it "
                        + "on the point of the triangle. If the dough "
                        + "gets too soft while you’re working, cover the "
                        + "triangles and freeze for a few minutes before "
                        + "resuming rolling. Space them evenly on the "
                        + "baking sheets, four per sheet. "
                        + "Very loosely cover the baking "
                        + "sheets with plastic wrap, "
                        + "so the croissants have some room to expand.|"
                + "Three and a half hours before serving, open the oven "
                        + "and stick your hand inside: It should be humid "
                        + "but not hot, as the water in the skillet will "
                        + "have cooled. You want the croissants to proof "
                        + "at 70 to 75 degrees. (Any hotter and the butter "
                        + "will start to melt, "
                        + "leading to a denser croissant.) "
                        + "Place the baking sheets inside the oven "
                        + "and let the croissants proof until they’re "
                        + "about doubled in size, extremely puffy, "
                        + "and jiggle delicately when the baking sheet is "
                        + "gently shaken, 2 to 2 1/2 hours. "
                        + "Resist the urge to touch or poke the croissants "
                        + "as they proof: They’re very delicate. "
                        + "Try not to rush this process, either, as an "
                        + "underproofed croissant will not be as "
                        + "light and ethereal.|"
                + "Remove the baking sheets from the oven and carefully "
                        + "uncover them, then transfer to the refrigerator "
                        + "and chill for 20 minutes while you heat the oven. "
                        + "Remove the skillet from the "
                        + "oven and heat to 375 degrees.|"
                + "In a small bowl, stir the yolk and heavy cream until "
                        + "streak-free. Using a pastry brush, "
                        + "gently brush the smooth surfaces of each "
                        + "crescent with the yolk and cream mixture, "
                        + "doing your best to avoid the cut "
                        + "sides with exposed layers of dough.|"
                + "Transfer the sheets to the oven and bake for 20 minutes. "
                        + "Rotate the baking sheets and switch racks, "
                        + "and continue to bake until the croissants are "
                        + "deeply browned, another 10 to 15 minutes. "
                        + "Remove from the oven and let cool "
                        + "completely on the baking sheets.",
                "https://cooking.nytimes.com/recipes/1022053-croissants");
        Recipe quiche = new Recipe("Quiche",
                "2 cups milk|"
                + "4 eggs|"
                + "¾ cup biscuit baking mix|"
                + "¼ cup butter, softened|"
                + "1 cup grated Parmesan cheese|"
                + "1 (10 ounce) package chopped frozen broccoli, "
                        + "thawed and drained|"
                + "1 cup cubed cooked ham|"
                + "8 ounces shredded Cheddar cheese",
                "Preheat oven to 375 degrees F (190 degrees C). Lightly grease a 10 inch quiche dish.|"
                + "In a large bowl, beat together milk, eggs, baking mix, "
                        + "butter and parmesan cheese. Batter will be lumpy. "
                        + "Stir in broccoli, ham and Cheddar cheese. "
                        + "Pour into prepared quiche dish.|"
                + "Bake in preheated oven for 50 minutes, until eggs "
                        + "are set and top is golden brown.|",
                "https://www.allrecipes.com/recipe/23389/easy-quiche/");
        Recipe rataouille = new Recipe("Rataouille",
                "1 (6 ounce) can tomato paste|"
                + "½ onion, chopped|"
                + "¼ cup minced garlic|"
                + "1 tablespoon olive oil|"
                + "¾ cup water|"
                + "salt and ground black pepper to taste|"
                + "1 small eggplant, trimmed and very thinly sliced|"
                + "1 zucchini, trimmed and very thinly sliced|"
                + "1 yellow squash, trimmed and very thinly sliced|"
                + "1 red bell pepper, cored and very thinly sliced|"
                + "1 yellow bell pepper, cored and very thinly sliced|"
                + "3 tablespoons olive oil, or to taste|"
                + "1 teaspoon fresh thyme leaves, or to taste|"
                + "3 tablespoons mascarpone cheese",
                "Preheat the oven to 375 degrees F (190 degrees C).|"
                + "Spread tomato paste into the bottom of a 10x10-inch "
                        + "baking dish. Sprinkle with onion and garlic "
                        + "and stir in 1 tablespoon olive oil and water "
                        + "until thoroughly combined. Season with salt "
                        + "and black pepper.|"
                + "Arrange alternating slices of eggplant, zucchini, "
                        + "yellow squash, red bell pepper, "
                        + "and yellow bell pepper, starting at the "
                        + "outer edge of the dish and working "
                        + "concentrically towards the center. "
                        + "Overlap the slices a little to display "
                        + "the colors. Drizzle the vegetables with "
                        + "3 tablespoons olive oil and season with "
                        + "salt and black pepper. Sprinkle with thyme leaves. "
                        + "Cover vegetables with a piece "
                        + "of parchment paper cut to fit inside.|"
                + "Bake in the preheated oven until vegetables "
                        + "are roasted and tender, about 45 minutes. "
                        + "Serve with dollops of mascarpone cheese.",
                "https://www.allrecipes.com/recipe/222006/disneys-ratatouille/");
        Recipe lobsterBisque = new Recipe("Lobster Bisque",
                "3 tablespoons butter|"
                + "¼ cup chopped fresh mushrooms|"
                + "2 tablespoons chopped onion|"
                + "2 tablespoons chopped celery|"
                + "2 tablespoons chopped carrot|"
                + "1 (14.5 ounce) can chicken broth|"
                + "⅛ teaspoon salt|"
                + "⅛ teaspoon cayenne pepper|"
                + "1 ½ cups half-and-half|"
                + "½ cup dry white wine|"
                + "½ pound cooked lump lobster meat",
                "Melt the butter in a large saucepan over medium-low heat. "
                        + "Add the mushrooms, onion, celery, and carrot. "
                        + "Cook and stir until tender, about 10 minutes. "
                        + "Stir in the chicken broth, and season with salt "
                        + "and cayenne pepper. Bring to a boil, "
                        + "then simmer for 10 minutes.|"
                + "Pour the vegetable and broth mixture into the "
                        + "container of a blender, and add 1/4 cup "
                        + "of the lobster meat. Cover, and process "
                        + "until smooth. Return to the saucepan, "
                        + "and stir in the half-and-half, white wine, "
                        + "and remaining lobster meat. Cook over low heat, "
                        + "stirring frequently until thickened, "
                        + "about 30 minutes.",
                "https://www.allrecipes.com/recipe/76637/perfect-lobster-bisque/");
        Recipe omelette = new Recipe("Omelette",
                "3 eggs, warmed in hot water for 5 minutes|"
                + "Pinch salt|"
                + "1 teaspoon room temperature butter, "
                        + "plus 1/2 teaspoon for finishing omelet|"
                + "1/2 teaspoon fresh chopped chives",
                "Crack the warm eggs into a bowl, add salt and "
                        + "blend with a fork. Heat a 10-inch "
                        + "nonstick aluminum pan over medium-high heat. "
                        + "Once the pan is hot, add the butter and "
                        + "brush around the surface of the pan. "
                        + "Pour the eggs into the center of the pan "
                        + "and stir vigorously with a rubber spatula "
                        + "for 5 seconds. As soon as a semi-solid mass "
                        + "begins to form, lift the pan and move it "
                        + "around until the excess liquid pours off "
                        + "into the pan. Using your spatula, move it "
                        + "around the edge of the egg mixture to help "
                        + "shape into a round and loosen the edge. "
                        + "Let the omelet sit in the pan for "
                        + "10 seconds without touching.|"
                + "Shake the pan to loosen from the pan. "
                        + "Lift up the far edge of the pan and snap "
                        + "it back toward you. Using your spatula, "
                        + "fold over one-third of the omelet. "
                        + "Slide the omelet onto a plate and fold "
                        + "over so that the omelet is a tri-fold. "
                        + "Coat with the remaining butter and sprinkle "
                        + "with the chives. Serve immediately.",
                "https://www.foodnetwork.com/recipes/alton-brown/omelet-recipe-1914282");
        Recipe crepes = new Recipe("Crepes",
                "1 cup all-purpose flour|"
                + "2 eggs|"
                + "½ cup milk|"
                + "½ cup water|"
                + "¼ teaspoon salt|"
                + "2 tablespoons butter, melted",
                "In a large mixing bowl, whisk together the flour "
                        + "and the eggs. Gradually add in the milk "
                        + "and water, stirring to combine. Add the "
                        + "salt and butter; beat until smooth.|"
                + "Heat a lightly oiled griddle or frying pan over "
                        + "medium high heat. Pour or scoop the batter "
                        + "onto the griddle, using approximately 1/4 "
                        + "cup for each crepe. Tilt the pan with a "
                        + "circular motion so that the batter coats "
                        + "the surface evenly.|"
                + "Cook the crepe for about 2 minutes, until the bottom "
                        + "is light brown. Loosen with a spatula, "
                        + "turn and cook the other side. Serve hot.",
                "https://www.allrecipes.com/recipe/16383/basic-crepes/");

        french[0] = croissant;
        french[1] = quiche;
        french[2] = rataouille;
        french[3] = lobsterBisque;
        french[4] = omelette;
        french[5] = crepes;
        // </editor-fold>  

        // <editor-fold defaultstate="collapsed" desc="Italian (DONE)">
        Recipe garlicBread = new Recipe("Garlic Bread",
                "4 cloves garlic, minced| ½ cup (1 stick) butter, softened|"
                + "1 baguette or French bread, cut lengthwise|"
                + "½ tsp. kosher salt| "
                + "2 tbsp. freshly chopped parsley|"
                + "¼ cup grated Parmesan",
                "Preheat oven to 425° and line a large baking sheet with foil. "
                    + "Make garlic compound butter: In a small bowl, "
                    + "mix softened butter with garlic, salt, "
                    + "and parsley until well combined.|"
                + "Spread cut sides of bread liberally with "
                    + "garlic butter. Sprinkle with Parmesan.|"
                + "Bake until bread is toasty and golden at the edges, "
                    + "about 10 minutes.",
                "https://www.delish.com/cooking/recipe-ideas/a24803098/easy-garlic-bread-recipe/");
        Recipe italianSalad = new Recipe("Italian Salad",
                "<b>Salad</b>|"
                    + "5 ounces mixed spring greens "
                        + "(or whatever greens you prefer)|"
                    + "half a small red onion, peeled and thinly sliced|"
                    + "2 cups cherry tomatoes|"
                    + "2 cups croutons, homemade or store-bought|"
                    + "1/2 cup freshly-grated Parmesan cheese, "
                        + "plus extra for topping|"
                    + "1/3 cup sliced pepperoncini peppers|"
                + "<b>Vinaigrette</b>|"
                    + "3 tablespoons olive oil|"
                    + "1 tablespoon red wine vinegar|"
                    + "1 teaspoon Dijon mustard|"
                    + "1/2 teaspoon dried oregano|"
                    + "1/2 teaspoon fine sea salt|"
                    + "1/4 teaspoon freshly-cracked black pepper|"
                    + "1 small clove garlic, pressed or minced "
                        + "(or 1/2 teaspoon garlic powder)",
                " Whisk all ingredients together in a bowl "
                        + "(or shake together in a mason jar) until combined. "
                        + "Taste and add additional sweetener if desired. "
                        + "Use immediately or refrigerate in a sealed "
                        + "container for up to 3 days.|"
                + "Combine all ingredients in a large salad bowl, "
                        + "drizzle evenly with the vinaigrette, "
                        + "and toss until evenly combined.  "
                        + "Serve sprinkled with extra "
                        + "Parmesan cheese and enjoy!",
                "https://www.gimmesomeoven.com/everyday-italian-salad/");
        Recipe spaghettiB = new Recipe("Spaghetti Bolognese",
                "1 tablespoon vegetable oil|"
                + "3 tablespoons butter plus "
                        + "1 tablespoon for tossing the pasta|"
                + "½ cup chopped onion|"
                + "⅔ cup chopped celery|"
                + "⅔ cup chopped carrot|"
                + "¾ pound ground beef chuck (or you can use "
                        + "1 part pork to 2 parts beef)|"
                + "Salt|"
                + "Black pepper, ground fresh from the mill|"
                + "1 cup whole milk|"
                + "Whole nutmeg|"
                + "1 cup dry white wine|"
                + "1 ½ cups canned imported Italian plum tomatoes, "
                        + "cut up, with their juice|"
                + "1 ¼ to 1 ½ pounds pasta|"
                + "Freshly grated parmigiano-reggiano cheese at the table",
                "Put the oil, butter and chopped onion in the pot and "
                        + "turn the heat on to medium. "
                        + "Cook and stir the onion until it "
                        + "has become translucent, "
                        + "then add the chopped celery and carrot. "
                        + "Cook for about 2 minutes, "
                        + "stirring vegetables to coat them well.|"
                + "Add ground beef, a large pinch of salt and a few "
                        + "grindings of pepper. Crumble the meat with a fork, "
                        + "stir well and cook until the beef has lost its raw, "
                        + "red color.|"
                + "Add milk and let it simmer gently, stirring frequently, "
                        + "until it has bubbled away completely. "
                        + "Add a tiny grating -- about 1/8 teaspoon "
                        + "-- of nutmeg, and stir.|"
                + "Add the wine, let it simmer until it has evaporated, "
                        + "then add the tomatoes and stir thoroughly "
                        + "to coat all ingredients well. "
                        + "When the tomatoes begin to bubble, "
                        + "turn the heat down so that the sauce "
                        + "cooks at the laziest of simmers, "
                        + "with just an intermittent bubble "
                        + "breaking through to the surface. "
                        + "Cook, uncovered, for 3 hours or more, "
                        + "stirring from time to time. "
                        + "While the sauce is cooking, "
                        + "you are likely to find that it "
                        + "begins to dry out and the fat "
                        + "separates from the meat."
                        + " To keep it from sticking, "
                        + "add 1/2 cup of water whenever necessary. "
                        + "At the end, however, "
                        + "no water at all must be left and the "
                        + "fat must separate from the sauce. "
                        + "Taste and correct for salt.|"
                + "Toss with cooked drained pasta, "
                        + "adding the tablespoon of butter, "
                        + "and serve with freshly grated "
                        + "Parmesan on the side.|",
                "https://cooking.nytimes.com/recipes/1015181-marcella-hazans-bolognese-sauce");
        Recipe pizza = new Recipe("Pepperoni Pizza",
                "2 ½ cups warm water(600 mL)|"
                + "1 teaspoon sugar|"
                + "2 teaspoons active dry yeast|"
                + "7 cups all-purpose flour(875 g), plus more for dusting|"
                + "6 tablespoons extra virgin olive oil, "
                        + "plus more for greasing|"
                + "1 ½ teaspoons kosher salt|"
                + "¼ cup semolina flour(30 g)|"
                + "tomato sauce|"
                + "fresh mozzarella cheese, torn into small pieces|"
                + "spicy pepperoni slice|"
                + "freshly grated parmesan cheese",
                "“Bloom” the yeast by sprinkling the sugar and yeast "
                        + "in the warm water. Let sit for 10 minutes, "
                        + "until bubbles form on the surface.|"
                + "In a large bowl, combine the flour and salt. "
                        + "Make a well in the middle and add "
                        + "the olive oil and bloomed yeast mixture. "
                        + "Using a spoon, mix until a "
                        + "shaggy dough begins to form.|"
                + "Once the flour is mostly hydrated, turn the "
                        + "dough out onto a clean work surface "
                        + "and knead for 10-15 minutes. "
                        + "The dough should be soft, smooth, "
                        + "and bouncy. Form the dough into a taut round.|"
                + "Grease a clean, large bowl with olive oil and "
                        + "place the dough inside, "
                        + "turning to coat with the oil. "
                        + "Cover with plastic wrap. "
                        + "Let rise for at least an hour, or up to 24 hours.|"
                + "Punch down the dough and turn it out onto a "
                        + "lightly floured work surface. "
                        + "Knead for another minute or so, "
                        + "then cut into 4 equal portions "
                        + "and shape into rounds.|"
                + "Lightly flour the dough, then cover with a "
                        + "kitchen towel and let rest for another "
                        + "30 minutes to an hour while you "
                        + "prepare the sauce and any other ingredients.|"
                + "Preheat the oven as high as your oven will allow, "
                        + "between 450-500˚F (230-260˚C). "
                        + "Place a pizza stone, heavy baking sheet "
                        + "(turn upside down so the surface is flat), "
                        + "or cast iron skillet in the oven.|"
                + "Meanwhile, make the tomato sauce: Add the salt to the "
                        + "can of tomatoes and puree with an "
                        + "immersion blender, or transfer to a "
                        + "blender or food processor, "
                        + "and puree until smooth.|"
                + "Once the dough has rested, take a portion and "
                        + "start by poking the surface with your fingertips, "
                        + "until bubbles form and do not deflate.|"
                + "Then, stretch and press the dough into a thin round. "
                        + "Make it thinner than you think it should be, "
                        + "as it will slightly shrink and "
                        + "puff up during baking.|"
                + "Sprinkle semolina onto an upside down baking sheet "
                        + "and place the stretched crust onto it. "
                        + "Add the sauce and ingredients of your choice.|"
                + "Slide the pizza onto the preheated pizza stone or pan. "
                        + "Bake for 15 minutes, or until the crust "
                        + "and cheese are golden brown.|"
                + "Add any garnish of your preference.",
                "https://tasty.co/recipe/pizza-dough");
        Recipe spaghettiM = new Recipe("Spaghetti and Meatballs",
                "<b>Meatballs</b>|"
                        + "1 pound lean ground beef|"
                        + "1 cup fresh bread crumbs|"
                        + "1 tablespoon dried parsley|"
                        + "1 tablespoon grated Parmesan cheese|"
                        + "¼ teaspoon ground black pepper|"
                        + "⅛ teaspoon garlic powder|"
                        + "1 egg, beaten|"
                + "<b>Sauce</b>|"
                        + "¾ cup chopped onion|"
                        + "5 cloves garlic, minced|"
                        + "¼ cup olive oil|"
                        + "2 (28 ounce) cans whole peeled tomatoes|"
                        + "2 teaspoons salt|"
                        + "1 teaspoon white sugar|"
                        + "1 bay leaf|"
                        + "1 (6 ounce) can tomato paste|"
                        + "¾ teaspoon dried basil|"
                        + "½ teaspoon ground black pepper",
                "In a large bowl, combine ground beef, bread crumbs, parsley, "
                        + "Parmesan, 1/4 teaspoon black pepper, "
                        + "garlic powder and beaten egg. "
                        + "Mix well and form into 12 balls. "
                        + "Store, covered, in refrigerator until needed.|"
                + "In a large saucepan over medium heat, saute onion and "
                        + "garlic in olive oil until onion is translucent. "
                        + "Stir in tomatoes, salt, sugar and bay leaf. "
                        + "Cover, reduce heat to low, and simmer 90 minutes. "
                        + "Stir in tomato paste, basil, "
                        + "1/2 teaspoon pepper and meatballs and "
                        + "simmer 30 minutes more. Serve.",
                "https://www.allrecipes.com/recipe/21353/italian-spaghetti-sauce-with-meatballs/");
        Recipe lasagna = new Recipe("Lasagna",
                "1 pound sweet Italian sausage|"
                + "¾ pound lean ground beef|"
                + "½ cup minced onion|"
                + "2 cloves garlic, crushed|"
                + "1 (28 ounce) can crushed tomatoes|"
                + "2 (6 ounce) cans tomato paste|"
                + "2 (6.5 ounce) cans canned tomato sauce|"
                + "½ cup water|"
                + "2 tablespoons white sugar|"
                + "1 ½ teaspoons dried basil leaves|"
                + "½ teaspoon fennel seeds|"
                + "1 teaspoon Italian seasoning|"
                + "1 ½ teaspoons salt, divided, or to taste|"
                + "¼ teaspoon ground black pepper|"
                + "4 tablespoons chopped fresh parsley|"
                + "12 lasagna noodles|"
                + "16 ounces ricotta cheese|"
                + "1 egg|"
                + "¾ pound mozzarella cheese, sliced|"
                + "¾ cup grated Parmesan cheese",
                "In a Dutch oven, cook sausage, ground beef, onion, "
                        + "and garlic over medium heat until well browned. "
                        + "Stir in crushed tomatoes, tomato paste, "
                        + "tomato sauce, and water. Season with sugar, "
                        + "basil, fennel seeds, Italian seasoning, "
                        + "1 teaspoon salt, pepper, and 2 tablespoons parsley. "
                        + "Simmer, covered, for about 1 1/2 hours, "
                        + "stirring occasionally.|"
                + "Bring a large pot of lightly salted water to a boil. "
                        + "Cook lasagna noodles in boiling water for "
                        + "8 to 10 minutes. Drain noodles, and rinse "
                        + "with cold water. In a mixing bowl, combine "
                        + "ricotta cheese with egg, remaining parsley, "
                        + "and 1/2 teaspoon salt.|"
                + "Preheat oven to 375 degrees F (190 degrees C).|"
                + "To assemble, spread 1 1/2 cups of meat sauce in the "
                        + "bottom of a 9x13-inch baking dish. "
                        + "Arrange 6 noodles lengthwise over meat sauce. "
                        + "Spread with one half of the ricotta cheese mixture. "
                        + "Top with a third of mozzarella cheese slices. "
                        + "Spoon 1 1/2 cups meat sauce over mozzarella, "
                        + "and sprinkle with 1/4 cup Parmesan cheese. "
                        + "Repeat layers, and top with remaining mozzarella "
                        + "and Parmesan cheese. Cover with foil: "
                        + "to prevent sticking, either spray foil with "
                        + "cooking spray, or make sure the foil does "
                        + "not touch the cheese.|"
                + "Bake in preheated oven for 25 minutes. Remove foil, "
                        + "and bake an additional 25 minutes. "
                        + "Cool for 15 minutes before serving.",
                "https://www.allrecipes.com/recipe/23600/worlds-best-lasagna/");

        italian[0] = garlicBread;
        italian[1] = italianSalad;
        italian[2] = spaghettiB;
        italian[3] = pizza;
        italian[4] = spaghettiM;
        italian[5] = lasagna;
        // </editor-fold>   

        // <editor-fold defaultstate="collapsed" desc="Japanese (DONE)">
        Recipe sushi = new Recipe("Sushi Roll",
                "<b>Base</b>|"
                        + "100g sushi rice|"
                        + "1 sheet nori seaweed|"
                        + "2 tbsp sushi vinegar|"
                        + "soy sauce|"
                        + "wasabi|"
                        + "sushi ginger|"
                        + "*roasted white sesame seeds|"
                + "<b>Possible Fillings</b>|"
                        + "tuna – sashimi grade, raw|"
                        + "salmon – sashimi grade, raw|"
                        + "avocado|"
                        + "cucumber|"
                        + "crab sticks|"
                        + "canned tuna mixed with mayo|"
                        + "prawns",
                "To make sushi rice, Japanese white rice is mixed with "
                        + "a special sushi rice vinegar.|"
                + "Once you have your sushi rice prepared, "
                        + "you will need to begin by laying out a "
                        + "preparation area with your makisu rolling mat|"
                + "Place a sheet or nori on the mat and cover two thirds "
                        + "of one side of your nori seaweed with your sushi "
                        + "rice approximately 1cm high.|"
                + "Add your ingredients in a line on top of the rice in the "
                        + "centre. You can choose any combination of "
                        + "ingredients that compliment each other well. "
                        + "We went for salmon, "
                        + "salad and mayonnaise for this one.|"
                + "Now for the fun bit. Using the wooden rolling mat, "
                        + "start rolling up the ingredients away from you, "
                        + "while keeping the roll tight. "
                        + "The moisture from the rice will "
                        + "help it stick together.|"
                + "You can then cut your roll into 6-8 pieces and serve with "
                        + "some soy sauce, wasabi, sushi ginger and "
                        + "cup of sencha green tea.",
                "https://www.japancentre.com/en/recipes/18-maki-sushi-rolls");
        Recipe ramen = new Recipe("Ramen Noodles",
                "2 3 Ounce Packages of Ramen Noodles, Seasoning Packet Discarded|"
                + "2 Teaspoons Sesame Oil|"
                + "2 Cloves Garlic, Minced|"
                + "¼ Cup Soy Sauce (Low Sodium is Best)|"
                + "1 Teaspoon Brown Sugar|"
                + "2 teaspoons Sriracha*",
                "Cook the ramen noodles without the seasoning packet "
                        + "as directed on package. Drain and set aside.|"
                + "Heat the sesame oil in a small skillet or "
                        + "saucepan over medium heat.|"
                + "Cook the garlic, stirring constantly for 2 minutes.|"
                + "Remove the pan from the heat and whisk in the soy sauce, "
                        + "brown sugar, and sriracha until combined.|"
                + "Toss the noodles with the sauce.|"
                + "Garnish with green onions if desired.",
                "https://thesaltymarshmallow.com/sesame-garlic-ramen-noodles-recipe/");
        Recipe misoSoup = new Recipe("Miso Soup",
                "<b>Base</b>|"
                        + "2 teaspoons dashi granules|"
                        + "4 cups water|"
                        + "3 tablespoons miso paste|"
                        + "1 (8 ounce) package silken tofu, diced|"
                        + "2 green onions, sliced diagonally into 1/2 inch pieces",
                "In a medium saucepan over medium-high heat, "
                        + "combine dashi granules and water; "
                        + "bring to a boil. Reduce heat to medium, "
                        + "and whisk in the miso paste. "
                        + "Stir in tofu. Separate the layers of the "
                        + "green onions, and add them to the soup. "
                        + "Simmer gently for 2 to 3 minutes before serving.",
                "https://www.allrecipes.com/recipe/13107/miso-soup/");
        Recipe nigiri = new Recipe("Nigiri",
                "<b>Base</b>|"
                        + "320g sushi rice|"
                        + "80ml sushi vinegar|"
                        + "nori seaweed|"
                        + "nigiri sushi mould|"
                        + "wasabi paste|"
                        + "soy sauce|"
                        + "pickled sushi ginger"
                + "<b>Possible Toppings</b>|"
                        + "fresh raw fish such as salmon, tuna or yellowtail|"
                        + "smoked salmon|"
                        + "cooked prawns|"
                        + "cooked octopus or squid|"
                        + "grilled eel|"
                        + "crab sticks|"
                        + "tamagoyaki japanese style omelette|"
                        + "avocado|"
                        + "shiitake mushrooms",
                "Before we make nigiri sushi, we need to prepare the sushi "
                        + "rice that will be used. You can follow our "
                        + "online rice recipe to find out how to make "
                        + "perfect sticky Japanese rice and then how to "
                        + "add sushi vinegar to turn that into sushi rice. "
                        + "If you’re a Japanese food fan, you may also have "
                        + "a useful rice cooker that makes cooking perfect "
                        + "rice for sushi much quicker and easier. "
                        + "If you really don’t want to spend too much "
                        + "time with rice preparation, you can try our "
                        + "microwavable rice. Just mix 250g cooked rice "
                        + "with 1 tablespoon of sushi rice vinegar.|"
                + "While the rice is cooking, you can prepare the slices "
                        + "of fish, vegetables or any other toppings "
                        + "you want to use. You can also check our fabulous "
                        + "recipe for tamagoyaki, a delicious Japanese style "
                        + "omelette that is a popular sushi topping. "
                        + "If you don’t want raw fish, "
                        + "why not try smoked salmon, parma ham, "
                        + "deep-fried tofu, shiitake mushrooms, pickles, "
                        + "sun-dried tomatoes, avocado… No need to be be "
                        + "too precise with the size of the slice, "
                        + "just make it big enough to cover most of the "
                        + "rice pod and thick enough to get the full flavour.|"
                + "Now we can make the rice pods. Sushi masters usually rinse "
                        + "their hands in a mix of water and sushi "
                        + "vinegar which keeps them clean and helps "
                        + "to stop the rice sticking. If you want the "
                        + "easy way to make perfect rice pods every time, "
                        + "try using a nigiri sushi mould. Put the rice "
                        + "evenly inside, press down the lid, flip the mould "
                        + "over and press the rice out.|"
                + "If you like the fiery taste of wasabi, add a little "
                        + "to the underside of the topping. "
                        + "Then, while keeping your hands moist with "
                        + "water and sushi vinegar, press the topping "
                        + "onto a pod of sushi rice firmly. "
                        + "Some ingredients like the tamagoyaki usually "
                        + "have a very thin strip of nori seaweed to "
                        + "keep the topping from falling off the rice pod.<br>"
                        + "The traditional way to serve sushi is with a "
                        + "little wasabi paste and a dish of soy sauce. "
                        + "Mix some wasabi with the soy sauce and then "
                        + "dip the sushi in it before eating. "
                        + "Pickled sushi ginger is eaten in between bites "
                        + "to cleanse the palate so you can appreciate the "
                        + "delicate flavours of different toppings.",
                "https://www.japancentre.com/en/recipes/217-nigiri-sushi");
        Recipe yakitori = new Recipe("Yakitori",
                "1 pound chicken livers, gizzards or boneless thigh meat|"
                + "½ cup dark soy sauce or tamari|"
                + "¼ cup mirin|"
                + "2 tablespoons sake or dry sherry|"
                + "1 tablespoon brown sugar|"
                + "2 garlic cloves, peeled and smashed|"
                + "½ teaspoon grated fresh ginger|"
                + "Scallions, thinly sliced, for garnish",
                "Cut chicken into one-inch pieces and place in a shallow dish.|"
                + "In a small saucepan, combine soy sauce or tamari, mirin, "
                        + "sake or sherry, brown sugar, garlic and ginger. "
                        + "Bring to a simmer and cook for 7 minutes, "
                        + "until thickened. Reserve 2 tablespoons sauce "
                        + "for serving. Pour remaining sauce over chicken, "
                        + "cover, and chill for at least one hour "
                        + "(and up to 4 hours).|"
                + "If using wooden or bamboo skewers, "
                        + "soak them in water for one hour. "
                        + "Preheat grill or broiler. "
                        + "Thread chicken pieces onto skewers, "
                        + "and grill or broil, turning halfway, "
                        + "for about 3 minutes for livers, "
                        + "10 minutes for gizzards and 6 minutes for thighs. "
                        + "Serve drizzled with reserved "
                        + "sauce and garnished with scallions.",
                "https://cooking.nytimes.com/recipes/1013201-yakitori-chicken-with-ginger-garlic-and-soy-sauce");
        Recipe chickenTeriyaki = new Recipe("Chicken Teriyaki",
                "1 tablespoon cornstarch|"
                + "1 tablespoon cold water|"
                + "½ cup white sugar|"
                + "½ cup soy sauce|"
                + "¼ cup cider vinegar|"
                + "1 clove garlic, minced|"
                + "½ teaspoon ground ginger|"
                + "¼ teaspoon ground black pepper|"
                + "12 skinless chicken thighs",
                "In a small saucepan over low heat, combine the cornstarch, "
                        + "cold water, sugar, soy sauce, vinegar, garlic, "
                        + "ginger and ground black pepper. Let simmer, "
                        + "stirring frequently, "
                        + "until sauce thickens and bubbles.|"
                + "Preheat oven to 425 degrees F (220 degrees C).|"
                + "Place chicken pieces in a lightly greased 9x13 inch "
                        + "baking dish. Brush chicken with the sauce. "
                        + "Turn pieces over, and brush again.|"
                + "Bake in the preheated oven for 30 minutes. "
                        + "Turn pieces over, and bake for another 30 minutes, "
                        + "until no longer pink and juices run clear. "
                        + "Brush with sauce every 10 minutes during cooking.|",
                "https://www.allrecipes.com/recipe/9023/baked-teriyaki-chicken/");

        japanese[0] = sushi;
        japanese[1] = ramen;
        japanese[2] = misoSoup;
        japanese[3] = nigiri;
        japanese[4] = yakitori;
        japanese[5] = chickenTeriyaki;
        // </editor-fold>  
        
        write();
        System.out.println("++Set up Complete++");
        
        Globals.start();
        //System.exit(0);
    }

    /**
     * Custom will get the files written which contain the custom recipes.
     * It will read the files and determine the
     * name, ingredients, and directions from 'readFile()', 
     * using the arrays to split it into 
     */
    private void write() {
        recipeCount = readCustoms.getPackCount();
        custom = new Recipe[recipeCount];
        System.out.println("\t" + recipeCount + " files");
        
        // Get the name of each file + its address
        String[] directory = readCustoms.getPackNames();

        for (int i = 0; i < recipeCount; i++) {
            writeRecipe(directory[i], i);
        }
        
        System.out.println("\n+++++ NAMES +++++");
        for (int i = 0; i < recipeCount; i++) {
            if (getCustomRecipeNames(i).length() < 10) {
                System.out.println("+ " + getCustomRecipeNames(i) + "\t\t+");
            } else {
                System.out.println("+ " + getCustomRecipeNames(i) + "\t+");
            }
        }
        System.out.println("+++++++++++++++++");
    }
    
    /**
     * Writes the recipes, by reading the file, 
     * and then placing the content into a String Array. 
     * From there it puts the arrays into a recipe
     * 
     * @param address the directory address of the file
     * @param index the recipe being referenced from customrecipes 
     *              (number lines up with file names ex. cr_2)
     */
    private void writeRecipe(String address, int index){
        // Create a placeholder String which will contain the needed info
        String[] recipe = new String[3];
        
        // With the directory name, read the file
        recipe = readCustoms.readRecipe(address);

        // If a null is detected after deleting a file, the program will
        // restart this method.
        if (recipe == null) {
            try {
                new WriteRecipes();
                this.finalize();
            } catch (Throwable e) {
                e.printStackTrace();
            }
        } 
        
        if (index >= recipeCount) {
            System.out.println("OVERCOUNT");
        }
        //Makes a New recipe with the directory files
        custom[index] = new Recipe(recipe[0], recipe[1], recipe[2]);
        System.out.println("Recipe " + index);
        custom[index].toOutput();
    }
    
    /**
     * returns the amount of custom recipes available
     * @return the amount of custom recipes
     */
    public int getCustomRecipeCount (){
        return recipeCount;
    }
    
    /**
     * returns the name of a specified custom recipe
     * 
     * @param which which recipe is being chosen
     * @return the name of this custom recipe
     */
    public String getCustomRecipeNames (int which){
        return custom[which].getName();
    }
}
