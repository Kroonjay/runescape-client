import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("d")
public class class11 {

   @ObfuscatedName("el")
   @ObfuscatedGetter(
      intValue = 671000199
   )
   static int field82;


   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "2110796291"
   )
   public static int method113(int var0) {
      int var1 = 0;
      if(var0 < 0 || var0 >= 65536) {
         var0 >>>= 16;
         var1 += 16;
      }

      if(var0 >= 256) {
         var0 >>>= 8;
         var1 += 8;
      }

      if(var0 >= 16) {
         var0 >>>= 4;
         var1 += 4;
      }

      if(var0 >= 4) {
         var0 >>>= 2;
         var1 += 2;
      }

      if(var0 >= 1) {
         var0 >>>= 1;
         ++var1;
      }

      return var0 + var1;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;S)V",
      garbageValue = "255"
   )
   static final void method112(String var0) {
      class164.method3448("Please remove " + var0 + " from your ignore list first");
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "1807417821"
   )
   static final void method115(String var0) {
      class164.method3448(var0 + " is already on your ignore list");
   }

   @ObfuscatedName("gc")
   @ObfuscatedSignature(
      signature = "(Lbs;II)V",
      garbageValue = "1179021925"
   )
   static final void method110(class63 var0, int var1) {
      class39.method745(var0.field900, var0.field918, var1);
   }

   @ObfuscatedName("ij")
   @ObfuscatedSignature(
      signature = "(Lhl;II)I",
      garbageValue = "595775225"
   )
   static final int method114(class230 var0, int var1) {
      if(var0.field2736 != null && var1 < var0.field2736.length) {
         try {
            int[] var2 = var0.field2736[var1];
            int var3 = 0;
            int var4 = 0;
            byte var5 = 0;

            while(true) {
               int var6 = var2[var4++];
               int var7 = 0;
               byte var8 = 0;
               if(var6 == 0) {
                  return var3;
               }

               if(var6 == 1) {
                  var7 = client.field724[var2[var4++]];
               }

               if(var6 == 2) {
                  var7 = client.field725[var2[var4++]];
               }

               if(var6 == 3) {
                  var7 = client.field764[var2[var4++]];
               }

               int var9;
               class230 var10;
               int var11;
               int var12;
               if(var6 == 4) {
                  var9 = var2[var4++] << 16;
                  var9 += var2[var4++];
                  var10 = class61.method1188(var9);
                  var11 = var2[var4++];
                  if(var11 != -1 && (!class120.method2784(var11).field3462 || client.field628)) {
                     for(var12 = 0; var12 < var10.field2758.length; ++var12) {
                        if(var11 + 1 == var10.field2758[var12]) {
                           var7 += var10.field2743[var12];
                        }
                     }
                  }
               }

               if(var6 == 5) {
                  var7 = class225.field2578[var2[var4++]];
               }

               if(var6 == 6) {
                  var7 = class234.field2798[client.field725[var2[var4++]] - 1];
               }

               if(var6 == 7) {
                  var7 = class225.field2578[var2[var4++]] * 100 / '\ub71b';
               }

               if(var6 == 8) {
                  var7 = class150.field1948.field566;
               }

               if(var6 == 9) {
                  for(var9 = 0; var9 < 25; ++var9) {
                     if(class234.field2797[var9]) {
                        var7 += client.field725[var9];
                     }
                  }
               }

               if(var6 == 10) {
                  var9 = var2[var4++] << 16;
                  var9 += var2[var4++];
                  var10 = class61.method1188(var9);
                  var11 = var2[var4++];
                  if(var11 != -1 && (!class120.method2784(var11).field3462 || client.field628)) {
                     for(var12 = 0; var12 < var10.field2758.length; ++var12) {
                        if(var11 + 1 == var10.field2758[var12]) {
                           var7 = 999999999;
                           break;
                        }
                     }
                  }
               }

               if(var6 == 11) {
                  var7 = client.field757;
               }

               if(var6 == 12) {
                  var7 = client.field758;
               }

               if(var6 == 13) {
                  var9 = class225.field2578[var2[var4++]];
                  int var13 = var2[var4++];
                  var7 = (var9 & 1 << var13) != 0?1:0;
               }

               if(var6 == 14) {
                  var9 = var2[var4++];
                  var7 = class138.method3159(var9);
               }

               if(var6 == 15) {
                  var8 = 1;
               }

               if(var6 == 16) {
                  var8 = 2;
               }

               if(var6 == 17) {
                  var8 = 3;
               }

               if(var6 == 18) {
                  var7 = (class150.field1948.field900 >> 7) + class178.field2315;
               }

               if(var6 == 19) {
                  var7 = (class150.field1948.field918 >> 7) + class71.field1051;
               }

               if(var6 == 20) {
                  var7 = var2[var4++];
               }

               if(var8 == 0) {
                  if(var5 == 0) {
                     var3 += var7;
                  }

                  if(var5 == 1) {
                     var3 -= var7;
                  }

                  if(var5 == 2 && var7 != 0) {
                     var3 /= var7;
                  }

                  if(var5 == 3) {
                     var3 *= var7;
                  }

                  var5 = 0;
               } else {
                  var5 = var8;
               }
            }
         } catch (Exception var14) {
            return -1;
         }
      } else {
         return -2;
      }
   }

   @ObfuscatedName("kj")
   @ObfuscatedSignature(
      signature = "(Lhl;I)Ljava/lang/String;",
      garbageValue = "885848022"
   )
   static String method111(class230 var0) {
      int var2 = class95.method2252(var0);
      int var1 = var2 >> 11 & 63;
      return var1 == 0?null:(var0.field2703 != null && var0.field2703.trim().length() != 0?var0.field2703:null);
   }
}
