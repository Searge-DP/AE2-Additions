package com.dyonovan.ae2additions.lib;

public class Constants {

    public static final String MODID = "ae2additions";
    public static final String MODNAME = "AE2-Additions";
    public static final String VERSION = "@VERSION@";
    public static final String DEPENDENCIES = "required-after:Forge@[" // require forge.
            + net.minecraftforge.common.ForgeVersion.majorVersion + '.' // majorVersion
            + net.minecraftforge.common.ForgeVersion.minorVersion + '.' // minorVersion
            + net.minecraftforge.common.ForgeVersion.revisionVersion + '.' // revisionVersion
            + net.minecraftforge.common.ForgeVersion.buildVersion + ",);" +
            "required-after:appliedenergistics2@[rv2-beta-32,);";
}
