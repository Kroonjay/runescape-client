import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hu")
@Implements("PlayerComposition")
public class PlayerComposition {
   @ObfuscatedName("l")
   static final int[] field2594;
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   public static NodeCache field2597;
   @ObfuscatedName("w")
   @Export("equipmentIds")
   int[] equipmentIds;
   @ObfuscatedName("m")
   @Export("bodyPartColours")
   int[] bodyPartColours;
   @ObfuscatedName("q")
   @Export("isFemale")
   public boolean isFemale;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -450132463
   )
   @Export("transformedNpcId")
   public int transformedNpcId;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      longValue = -4201235233235096677L
   )
   @Export("hash")
   long hash;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      longValue = -4026195054363000471L
   )
   long field2593;

   static {
      field2594 = new int[]{8, 11, 4, 6, 9, 7, 10};
      field2597 = new NodeCache(260);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "([I[IZII)V",
      garbageValue = "-966160324"
   )
   public void method4485(int[] var1, int[] var2, boolean var3, int var4) {
      if(var1 == null) {
         var1 = new int[12];

         for(int var5 = 0; var5 < 7; ++var5) {
            for(int var6 = 0; var6 < KitDefinition.field3319; ++var6) {
               KitDefinition var7 = WorldMapManager.getKitDefinition(var6);
               if(var7 != null && !var7.nonSelectable && (var3?7:0) + var5 == var7.bodyPartId) {
                  var1[field2594[var5]] = var6 + 256;
                  break;
               }
            }
         }
      }

      this.equipmentIds = var1;
      this.bodyPartColours = var2;
      this.isFemale = var3;
      this.transformedNpcId = var4;
      this.setHash();
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(IZI)V",
      garbageValue = "-791766651"
   )
   public void method4486(int var1, boolean var2) {
      if(var1 != 1 || !this.isFemale) {
         int var3 = this.equipmentIds[field2594[var1]];
         if(var3 != 0) {
            var3 -= 256;

            KitDefinition var4;
            do {
               do {
                  do {
                     if(!var2) {
                        --var3;
                        if(var3 < 0) {
                           var3 = KitDefinition.field3319 - 1;
                        }
                     } else {
                        ++var3;
                        if(var3 >= KitDefinition.field3319) {
                           var3 = 0;
                        }
                     }

                     var4 = WorldMapManager.getKitDefinition(var3);
                  } while(var4 == null);
               } while(var4.nonSelectable);
            } while(var4.bodyPartId != (this.isFemale?7:0) + var1);

            this.equipmentIds[field2594[var1]] = var3 + 256;
            this.setHash();
         }
      }

   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(IZI)V",
      garbageValue = "2076263971"
   )
   public void method4487(int var1, boolean var2) {
      int var3 = this.bodyPartColours[var1];
      boolean var4;
      if(!var2) {
         do {
            --var3;
            if(var3 < 0) {
               var3 = class185.colorsToReplace[var1].length - 1;
            }

            if(var1 == 4 && var3 >= 8) {
               var4 = false;
            } else {
               var4 = true;
            }
         } while(!var4);
      } else {
         do {
            ++var3;
            if(var3 >= class185.colorsToReplace[var1].length) {
               var3 = 0;
            }

            if(var1 == 4 && var3 >= 8) {
               var4 = false;
            } else {
               var4 = true;
            }
         } while(!var4);
      }

      this.bodyPartColours[var1] = var3;
      this.setHash();
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "-267489993"
   )
   public void method4488(boolean var1) {
      if(this.isFemale != var1) {
         this.method4485((int[])null, this.bodyPartColours, var1, -1);
      }

   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(Lgy;I)V",
      garbageValue = "1570872526"
   )
   public void method4501(Buffer var1) {
      var1.putByte(this.isFemale?1:0);

      int var2;
      for(var2 = 0; var2 < 7; ++var2) {
         int var3 = this.equipmentIds[field2594[var2]];
         if(var3 == 0) {
            var1.putByte(-1);
         } else {
            var1.putByte(var3 - 256);
         }
      }

      for(var2 = 0; var2 < 5; ++var2) {
         var1.putByte(this.bodyPartColours[var2]);
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "0"
   )
   @Export("setHash")
   void setHash() {
      long var1 = this.hash;
      int var3 = this.equipmentIds[5];
      int var4 = this.equipmentIds[9];
      this.equipmentIds[5] = var4;
      this.equipmentIds[9] = var3;
      this.hash = 0L;

      int var5;
      for(var5 = 0; var5 < 12; ++var5) {
         this.hash <<= 4;
         if(this.equipmentIds[var5] >= 256) {
            this.hash += (long)(this.equipmentIds[var5] - 256);
         }
      }

      if(this.equipmentIds[0] >= 256) {
         this.hash += (long)(this.equipmentIds[0] - 256 >> 4);
      }

      if(this.equipmentIds[1] >= 256) {
         this.hash += (long)(this.equipmentIds[1] - 256 >> 8);
      }

      for(var5 = 0; var5 < 5; ++var5) {
         this.hash <<= 3;
         this.hash += (long)this.bodyPartColours[var5];
      }

      this.hash <<= 1;
      this.hash += (long)(this.isFemale?1:0);
      this.equipmentIds[5] = var3;
      this.equipmentIds[9] = var4;
      if(0L != var1 && var1 != this.hash) {
         field2597.remove(var1);
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Ljh;ILjh;II)Ldk;",
      garbageValue = "-1606352773"
   )
   @Export("getModel")
   public Model getModel(Sequence var1, int var2, Sequence var3, int var4) {
      if(this.transformedNpcId != -1) {
         return class59.getNpcDefinition(this.transformedNpcId).getModel(var1, var2, var3, var4);
      } else {
         long var5 = this.hash;
         int[] var7 = this.equipmentIds;
         if(var1 != null && (var1.leftHandItem >= 0 || var1.rightHandItem >= 0)) {
            var7 = new int[12];

            for(int var8 = 0; var8 < 12; ++var8) {
               var7[var8] = this.equipmentIds[var8];
            }

            if(var1.leftHandItem >= 0) {
               var5 += (long)(var1.leftHandItem - this.equipmentIds[5] << 40);
               var7[5] = var1.leftHandItem;
            }

            if(var1.rightHandItem >= 0) {
               var5 += (long)(var1.rightHandItem - this.equipmentIds[3] << 48);
               var7[3] = var1.rightHandItem;
            }
         }

         Model var15 = (Model)field2597.get(var5);
         if(var15 == null) {
            boolean var9 = false;

            int var10;
            for(int var11 = 0; var11 < 12; ++var11) {
               var10 = var7[var11];
               if(var10 >= 256 && var10 < 512 && !WorldMapManager.getKitDefinition(var10 - 256).ready()) {
                  var9 = true;
               }

               if(var10 >= 512 && !class120.getItemDefinition(var10 - 512).readyWorn(this.isFemale)) {
                  var9 = true;
               }
            }

            if(var9) {
               if(this.field2593 != -1L) {
                  var15 = (Model)field2597.get(this.field2593);
               }

               if(var15 == null) {
                  return null;
               }
            }

            if(var15 == null) {
               ModelData[] var17 = new ModelData[12];
               var10 = 0;

               int var12;
               for(int var13 = 0; var13 < 12; ++var13) {
                  var12 = var7[var13];
                  ModelData var14;
                  if(var12 >= 256 && var12 < 512) {
                     var14 = WorldMapManager.getKitDefinition(var12 - 256).getModelData();
                     if(var14 != null) {
                        var17[var10++] = var14;
                     }
                  }

                  if(var12 >= 512) {
                     var14 = class120.getItemDefinition(var12 - 512).getWornModelData(this.isFemale);
                     if(var14 != null) {
                        var17[var10++] = var14;
                     }
                  }
               }

               ModelData var18 = new ModelData(var17, var10);

               for(var12 = 0; var12 < 5; ++var12) {
                  if(this.bodyPartColours[var12] < class185.colorsToReplace[var12].length) {
                     var18.recolor(MapIconReference.colorsToFind[var12], class185.colorsToReplace[var12][this.bodyPartColours[var12]]);
                  }

                  if(this.bodyPartColours[var12] < class76.field1091[var12].length) {
                     var18.recolor(MilliTimer.field1947[var12], class76.field1091[var12][this.bodyPartColours[var12]]);
                  }
               }

               var15 = var18.light(64, 850, -30, -50, -30);
               field2597.put(var15, var5);
               this.field2593 = var5;
            }
         }

         if(var1 == null && var3 == null) {
            return var15;
         } else {
            Model var16;
            if(var1 != null && var3 != null) {
               var16 = var1.applyTransformations(var15, var2, var3, var4);
            } else if(var1 != null) {
               var16 = var1.transformActorModel(var15, var2);
            } else {
               var16 = var3.transformActorModel(var15, var4);
            }

            return var16;
         }
      }
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(I)Ldo;",
      garbageValue = "296620503"
   )
   ModelData method4492() {
      if(this.transformedNpcId != -1) {
         return class59.getNpcDefinition(this.transformedNpcId).method5174();
      } else {
         boolean var1 = false;

         int var2;
         for(int var3 = 0; var3 < 12; ++var3) {
            var2 = this.equipmentIds[var3];
            if(var2 >= 256 && var2 < 512 && !WorldMapManager.getKitDefinition(var2 - 256).method4906()) {
               var1 = true;
            }

            if(var2 >= 512 && !class120.getItemDefinition(var2 - 512).method5143(this.isFemale)) {
               var1 = true;
            }
         }

         if(var1) {
            return null;
         } else {
            ModelData[] var7 = new ModelData[12];
            var2 = 0;

            int var4;
            for(int var5 = 0; var5 < 12; ++var5) {
               var4 = this.equipmentIds[var5];
               ModelData var6;
               if(var4 >= 256 && var4 < 512) {
                  var6 = WorldMapManager.getKitDefinition(var4 - 256).method4901();
                  if(var6 != null) {
                     var7[var2++] = var6;
                  }
               }

               if(var4 >= 512) {
                  var6 = class120.getItemDefinition(var4 - 512).method5150(this.isFemale);
                  if(var6 != null) {
                     var7[var2++] = var6;
                  }
               }
            }

            ModelData var8 = new ModelData(var7, var2);

            for(var4 = 0; var4 < 5; ++var4) {
               if(this.bodyPartColours[var4] < class185.colorsToReplace[var4].length) {
                  var8.recolor(MapIconReference.colorsToFind[var4], class185.colorsToReplace[var4][this.bodyPartColours[var4]]);
               }

               if(this.bodyPartColours[var4] < class76.field1091[var4].length) {
                  var8.recolor(MilliTimer.field1947[var4], class76.field1091[var4][this.bodyPartColours[var4]]);
               }
            }

            return var8;
         }
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1620962582"
   )
   public int method4493() {
      return this.transformedNpcId == -1?(this.equipmentIds[0] << 15) + this.equipmentIds[1] + (this.equipmentIds[11] << 5) + (this.equipmentIds[8] << 10) + (this.bodyPartColours[0] << 25) + (this.bodyPartColours[4] << 20):305419896 + class59.getNpcDefinition(this.transformedNpcId).id;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(IS)I",
      garbageValue = "8211"
   )
   public static int method4514(int var0) {
      return var0 >> 17 & 7;
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(I)[B",
      garbageValue = "1229360672"
   )
   public static byte[] method4515() {
      byte[] var0 = new byte[24];

      try {
         class155.randomDat.seek(0L);
         class155.randomDat.read(var0);

         int var1;
         for(var1 = 0; var1 < 24 && var0[var1] == 0; ++var1) {
            ;
         }

         if(var1 >= 24) {
            throw new IOException();
         }
      } catch (Exception var3) {
         for(int var2 = 0; var2 < 24; ++var2) {
            var0[var2] = -1;
         }
      }

      return var0;
   }
}
