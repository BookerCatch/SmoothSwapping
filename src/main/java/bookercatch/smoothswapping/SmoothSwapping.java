package bookercatch.smoothswapping;

import com.mojang.logging.LogUtils;
import net.minecraft.item.ItemStack;
import net.minecraft.util.collection.DefaultedList;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import org.slf4j.Logger;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Mod(SmoothSwapping.MODID)
public class SmoothSwapping {
    public static final String MODID = "smoothswapping";
    public static final Logger LOGGER = LogUtils.getLogger();

    public static Map<Integer, List<InventorySwap>> swaps;
    public static DefaultedList<ItemStack> oldStacks;

    public SmoothSwapping() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, Configuration.CLIENT_CONFIG);

        swaps = new HashMap<>();
        oldStacks = DefaultedList.of();
    }
}
