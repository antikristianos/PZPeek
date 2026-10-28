package antikristianos.pzpeek;

import me.zed_0xff.zombie_buddy.Patch;

/** Boot and ResetLua both initialize Lua after the complete Java mod-loading pass. */
@Patch(className="zombie.Lua.LuaManager",methodName="init",strictMatch=true)
public final class PatchStartup {
    @Patch.OnEnter public static void enter(){Main.initializeAfterModsLoaded();}
}
