package github.com.quebecmod1;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Quebecmod1 implements ModInitializer {
    public static final String MOD_ID = "quebecmod1";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Quebec Mod!");
        ModItems.initialize();
    }
}