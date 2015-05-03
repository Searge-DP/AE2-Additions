package com.dyonovan.ae2additions;

import com.dyonovan.ae2additions.common.CommonProxy;
import com.dyonovan.ae2additions.lib.Constants;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

@Mod(name = Constants.MODNAME, modid = Constants.MODID, version = Constants.VERSION, dependencies = Constants.DEPENDENCIES)
public class AE2Additions {

    @Instance(Constants.MODID)
    public static AE2Additions instance;

    @SidedProxy(clientSide = "com.dyonovan." + Constants.MODID + ".client.ClientProxy",
            serverSide = "com.dyonovan." + Constants.MODID + ".common.CommonProxy")
    public static CommonProxy proxy;

    public static CreativeTabs tabAE2Additions = new CreativeTabs("tabAE2Additions") {
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return Items.diamond;
        }
    };

    @SuppressWarnings("unused")
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }

    @SuppressWarnings("unused")
    @EventHandler
    public void init(FMLInitializationEvent event) { }

    @SuppressWarnings("unused")
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) { }
}
