package com.tutorial.tutorialmod;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.tutorial.tutorialmod.init.blockInit;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("tutorialmod")
public class TutorialMod
{
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "tutorialmod";
    public static TutorialMod instance;

    public TutorialMod() {
    	
    	//final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus(); //This line negates the use of 
    												//'FMLJavaModLoadingContext.get().getModEventBus()' for the '
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register the doClientStuff method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        
        instance = this;

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {

    }

    private void doClientStuff(final FMLClientSetupEvent event) {

    }
    
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {

    }
    
    
    public static class TutorialItemGroup extends ItemGroup {
    	
        public static final TutorialItemGroup instance = new TutorialItemGroup(ItemGroup.GROUPS.length, "ItemGroup");

    	
    	private TutorialItemGroup(int index, String label) {
    		super(index, label);
    	}

		@Override
		public ItemStack createIcon() {
			return new ItemStack(blockInit.example_block);
		}
    	
    }

}
