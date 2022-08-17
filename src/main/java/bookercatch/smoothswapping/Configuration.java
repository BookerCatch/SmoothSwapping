package bookercatch.smoothswapping;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class Configuration {
	public static ForgeConfigSpec CLIENT_CONFIG;

	// CLIENT
	public static final String CATEGORY_CLIENT = "client";

	public static ForgeConfigSpec.BooleanValue NOURISHED_HUNGER_OVERLAY;
	public static ForgeConfigSpec.BooleanValue COMFORT_HEALTH_OVERLAY;
	public static ForgeConfigSpec.BooleanValue FOOD_EFFECT_TOOLTIP;

    private int animationSpeed = 100;
    private String easeMode = "linear";
    private int easeSpeed = 400;

    public int getAnimationSpeed() {
        return animationSpeed;
    }

    public void setAnimationSpeed(int animationSpeed) {
        this.animationSpeed = animationSpeed;
    }

    public float getAnimationSpeedFormatted() {
        return animationSpeed / 100F;
    }

    public int getEaseSpeed() {
        return easeSpeed;
    }

    public void setEaseSpeed(int easeSpeed) {
        this.easeSpeed = easeSpeed;
    }

    public float getEaseSpeedFormatted() {
        return easeSpeed / 100F;
    }

    public String getEaseMode() {
        return easeMode;
    }

    public void setEaseMode(String easeMode) {
        this.easeMode = easeMode;
    }

	static {
		ForgeConfigSpec.Builder CLIENT_BUILDER = new ForgeConfigSpec.Builder();

		CLIENT_BUILDER.comment("Client settings").push(CATEGORY_CLIENT);
		NOURISHED_HUNGER_OVERLAY = CLIENT_BUILDER.comment("Should the hunger bar have a gilded overlay when the player has the Nourishment effect?")
				.define("nourishmentHungerOverlay", true);
		COMFORT_HEALTH_OVERLAY = CLIENT_BUILDER.comment("Should the health bar have a silver sheen when the player has the Comfort effect?")
				.define("comfortHealthOverlay", true);
		FOOD_EFFECT_TOOLTIP = CLIENT_BUILDER.comment("Should meal and drink tooltips display which effects they provide?")
				.define("foodEffectTooltip", true);
		CLIENT_BUILDER.pop();

		CLIENT_CONFIG = CLIENT_BUILDER.build();
	}
}