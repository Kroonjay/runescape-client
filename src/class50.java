import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("al")
public final class class50 {

   @ObfuscatedName("w")
   static int[][][] field447 = new int[4][105][105];
   @ObfuscatedName("m")
   static byte[][][] field445 = new byte[4][104][104];
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -1846767625
   )
   static int field446 = 99;
   @ObfuscatedName("b")
   static byte[][][] field450;
   @ObfuscatedName("h")
   static byte[][][] field448;
   @ObfuscatedName("x")
   static byte[][][] field449;
   @ObfuscatedName("a")
   static int[] field460;
   @ObfuscatedName("d")
   static int[] field451;
   @ObfuscatedName("p")
   static int[] field452;
   @ObfuscatedName("t")
   static final int[] field454 = new int[]{1, 2, 4, 8};
   @ObfuscatedName("u")
   static final int[] field453 = new int[]{16, 32, 64, 128};
   @ObfuscatedName("i")
   static final int[] field456 = new int[]{1, 0, -1, 0};
   @ObfuscatedName("z")
   static final int[] field457 = new int[]{0, -1, 0, 1};
   @ObfuscatedName("k")
   static final int[] field458 = new int[]{1, -1, -1, 1};
   @ObfuscatedName("r")
   static final int[] field459 = new int[]{-1, -1, 1, 1};
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -1482262967
   )
   static int field462 = (int)(Math.random() * 17.0D) - 8;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = -1253487083
   )
   static int field461 = (int)(Math.random() * 33.0D) - 16;
   @ObfuscatedName("am")
   @ObfuscatedSignature(
      signature = "Llj;"
   )
   public static class315 field455;


   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IILfu;Lfm;I)Z",
      garbageValue = "1879592193"
   )
   public static final boolean method1059(int var0, int var1, class166 var2, class164 var3) {
      int var4 = var0;
      int var5 = var1;
      byte var6 = 64;
      byte var7 = 64;
      int var8 = var0 - var6;
      int var9 = var1 - var7;
      class165.field2059[var6][var7] = 99;
      class165.field2058[var6][var7] = 0;
      byte var10 = 0;
      int var11 = 0;
      class165.field2061[var10] = var0;
      byte var10001 = var10;
      int var18 = var10 + 1;
      class165.field2060[var10001] = var1;
      int[][] var12 = var3.field2055;

      while(var18 != var11) {
         var4 = class165.field2061[var11];
         var5 = class165.field2060[var11];
         var11 = var11 + 1 & 4095;
         int var16 = var4 - var8;
         int var17 = var5 - var9;
         int var13 = var4 - var3.field2049;
         int var14 = var5 - var3.field2050;
         if(var2.vmethod3457(2, var4, var5, var3)) {
            class310.field3748 = var4;
            class51.field463 = var5;
            return true;
         }

         int var15 = class165.field2058[var16][var17] + 1;
         if(var16 > 0 && class165.field2059[var16 - 1][var17] == 0 && (var12[var13 - 1][var14] & 19136782) == 0 && (var12[var13 - 1][var14 + 1] & 19136824) == 0) {
            class165.field2061[var18] = var4 - 1;
            class165.field2060[var18] = var5;
            var18 = var18 + 1 & 4095;
            class165.field2059[var16 - 1][var17] = 2;
            class165.field2058[var16 - 1][var17] = var15;
         }

         if(var16 < 126 && class165.field2059[var16 + 1][var17] == 0 && (var12[var13 + 2][var14] & 19136899) == 0 && (var12[var13 + 2][var14 + 1] & 19136992) == 0) {
            class165.field2061[var18] = var4 + 1;
            class165.field2060[var18] = var5;
            var18 = var18 + 1 & 4095;
            class165.field2059[var16 + 1][var17] = 8;
            class165.field2058[var16 + 1][var17] = var15;
         }

         if(var17 > 0 && class165.field2059[var16][var17 - 1] == 0 && (var12[var13][var14 - 1] & 19136782) == 0 && (var12[var13 + 1][var14 - 1] & 19136899) == 0) {
            class165.field2061[var18] = var4;
            class165.field2060[var18] = var5 - 1;
            var18 = var18 + 1 & 4095;
            class165.field2059[var16][var17 - 1] = 1;
            class165.field2058[var16][var17 - 1] = var15;
         }

         if(var17 < 126 && class165.field2059[var16][var17 + 1] == 0 && (var12[var13][var14 + 2] & 19136824) == 0 && (var12[var13 + 1][var14 + 2] & 19136992) == 0) {
            class165.field2061[var18] = var4;
            class165.field2060[var18] = var5 + 1;
            var18 = var18 + 1 & 4095;
            class165.field2059[var16][var17 + 1] = 4;
            class165.field2058[var16][var17 + 1] = var15;
         }

         if(var16 > 0 && var17 > 0 && class165.field2059[var16 - 1][var17 - 1] == 0 && (var12[var13 - 1][var14] & 19136830) == 0 && (var12[var13 - 1][var14 - 1] & 19136782) == 0 && (var12[var13][var14 - 1] & 19136911) == 0) {
            class165.field2061[var18] = var4 - 1;
            class165.field2060[var18] = var5 - 1;
            var18 = var18 + 1 & 4095;
            class165.field2059[var16 - 1][var17 - 1] = 3;
            class165.field2058[var16 - 1][var17 - 1] = var15;
         }

         if(var16 < 126 && var17 > 0 && class165.field2059[var16 + 1][var17 - 1] == 0 && (var12[var13 + 1][var14 - 1] & 19136911) == 0 && (var12[var13 + 2][var14 - 1] & 19136899) == 0 && (var12[var13 + 2][var14] & 19136995) == 0) {
            class165.field2061[var18] = var4 + 1;
            class165.field2060[var18] = var5 - 1;
            var18 = var18 + 1 & 4095;
            class165.field2059[var16 + 1][var17 - 1] = 9;
            class165.field2058[var16 + 1][var17 - 1] = var15;
         }

         if(var16 > 0 && var17 < 126 && class165.field2059[var16 - 1][var17 + 1] == 0 && (var12[var13 - 1][var14 + 1] & 19136830) == 0 && (var12[var13 - 1][var14 + 2] & 19136824) == 0 && (var12[var13][var14 + 2] & 19137016) == 0) {
            class165.field2061[var18] = var4 - 1;
            class165.field2060[var18] = var5 + 1;
            var18 = var18 + 1 & 4095;
            class165.field2059[var16 - 1][var17 + 1] = 6;
            class165.field2058[var16 - 1][var17 + 1] = var15;
         }

         if(var16 < 126 && var17 < 126 && class165.field2059[var16 + 1][var17 + 1] == 0 && (var12[var13 + 1][var14 + 2] & 19137016) == 0 && (var12[var13 + 2][var14 + 2] & 19136992) == 0 && (var12[var13 + 2][var14 + 1] & 19136995) == 0) {
            class165.field2061[var18] = var4 + 1;
            class165.field2060[var18] = var5 + 1;
            var18 = var18 + 1 & 4095;
            class165.field2059[var16 + 1][var17 + 1] = 12;
            class165.field2058[var16 + 1][var17 + 1] = var15;
         }
      }

      class310.field3748 = var4;
      class51.field463 = var5;
      return false;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(II)Ljava/lang/String;",
      garbageValue = "846947629"
   )
   static String method1060(int var0) {
      return "<col=" + Integer.toHexString(var0) + ">";
   }
}
