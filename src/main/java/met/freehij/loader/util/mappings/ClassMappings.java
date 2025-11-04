package met.freehij.loader.util.mappings;

import java.util.HashMap;
import java.util.Map;

public class ClassMappings {
    private static final Map<String, String> classRefmap = new HashMap<>();
    public static final String MINECRAFT = "net/minecraft/client/Minecraft";

    public static void initRefmap() {
        add("MovementInputFromOptions",
                "net/minecraft/unmapped/C_5637855", "net/minecraft/src/MovementInputFromOptions", "lr");
        add("GuiIngame",
                "net/minecraft/unmapped/C_8651652", "net/minecraft/src/GuiIngame", "uq");
        add("FontRenderer",
                "net/minecraft/unmapped/C_3831727", "net/minecraft/src/FontRenderer", "sj");
        add("EntityPlayer",
                "net/minecraft/unmapped/C_9590849", "net/minecraft/src/EntityPlayer", "gs");
        add("GameSettings",
                "net/minecraft/src/GameSettings", "kv");
        add("KeyBinding",
                "net/minecraft/src/KeyBinding", "qb");
        add("GuiChat",
                "net/minecraft/src/GuiChat", "gc");
        add("GuiControls",
                "net/minecraft/src/GuiControls", "up");
        add("GuiScreen",
                "net/minecraft/src/GuiScreen", "da");
        add("ScaledResolution",
                "net/minecraft/src/ScaledResolution", "qq");
        add("Gui",
                "net/minecraft/src/Gui", "ub");
        add("IBlockAccess",
                "net/minecraft/src/IBlockAccess", "xp");
        add("Block",
                "net/minecraft/src/Block", "uu");
        add("RenderGlobal",
                "net/minecraft/src/RenderGlobal", "n");
        add("BlockFluid",
                "net/minecraft/src/BlockFluid", "rp");
        add("World",
                "net/minecraft/src/World", "fd");
        add("MovementInput",
                "net/minecraft/src/MovementInput", "uo");
        add("EntityPlayerSP",
                "net/minecraft/src/EntityPlayerSP", "dc");
        add("Entity",
                "net/minecraft/src/Entity", "sn");
        add("EntityLiving",
                "net/minecraft/src/EntityLiving", "ls");
        add("Packet10Flying",
                "net/minecraft/src/Packet10Flying", "ig");
        add("Packet",
                "net/minecraft/src/Packet", "ki");
        add("AxisAlignedBB",
                "net/minecraft/src/AxisAlignedBB", "eq");
        add("PlayerController",
                "net/minecraft/src/PlayerController", "ob");
        add("EntityAnimal",
                "net/minecraft/src/EntityAnimal", "bg");
        add("EntityMob",
                "net/minecraft/src/EntityMob", "gz");
        add("NetClientHandler",
                "net/minecraft/src/NetClientHandler", "nb");
        add("Packet28EntityVelocity",
                "net/minecraft/src/Packet28EntityVelocity", "gj");
        add("PlayerControllerMP",
                "net/minecraft/src/PlayerControllerMP", "xk");
        add("GuiTextField",
                "net/minecraft/src/GuiTextField", "ro");
        add("GuiMainMenu",
                "net/minecraft/src/GuiMainMenu", "fu");
        add("GuiButton",
                "net/minecraft/src/GuiButton", "ke");
        add("RenderGlobal",
                "net/minecraft/src/RenderGlobal", "n");
        add("Vec3D",
                "net/minecraft/src/Vec3D", "bt");
        add("ICamera",
                "net/minecraft/src/ICamera", "yn");
        add("Session",
                "net/minecraft/src/Session", "gr");
        add("EntityClientPlayerMP",
                "net/minecraft/src/EntityClientPlayerMP", "tk");
    }

    private static void add(String reference, String... entries) {
        classRefmap.put(reference, MappingResolver.resolveClass(entries));
    }

    public static String get(String reference) {
        String className = classRefmap.get(reference);
        return className == null ? reference : className;
    }
}
