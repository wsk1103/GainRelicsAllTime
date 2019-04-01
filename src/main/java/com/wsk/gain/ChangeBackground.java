/*
package com.wsk.gain;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.evacipated.cardcrawl.modthespire.lib.SpireReturn;
import com.megacrit.cardcrawl.core.Settings;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
import com.megacrit.cardcrawl.powers.StrengthPower;
import com.megacrit.cardcrawl.scenes.TheBottomScene;

*/
/**
 * @author wsk1103
 * @date 2019/3/9
 * @description 改变背景图片
 *//*

@SpirePatch(
        clz = TheBottomScene.class,
        method = "renderCombatRoomBg",
        paramtypez = {SpriteBatch.class}
)
public class ChangeBackground {

    private static int a = 0;

    public ChangeBackground() {
    }

    */
/**
     * 方法名必须为Prefix
     * @param tbs
     * @param sb
     * @return SpireReturn<Object>
     *//*

    public static SpireReturn<Object> Prefix(TheBottomScene tbs, SpriteBatch sb) {
        a++;
//        if (AbstractDungeon.player.hasPower("Group")) {
//            sb.setColor(Color.WHITE);
//            sb.draw(MaxHandSizePatch.Load.bg.getTexture(), Load.bg.offsetX * Settings.scale, Load.bg.offsetY * Settings.scale + AbstractDungeon.sceneOffsetY, 0.0F, 0.0F, (float) Load.bg.packedWidth, (float) Load.bg.packedHeight, Settings.scale, Settings.scale, 0.0F, Load.bg.getRegionX(), Load.bg.getRegionY(), Load.bg.getRegionWidth(), Load.bg.getRegionHeight(), false, false);
//            return SpireReturn.Return((Object) null);
//        } else if (AbstractDungeon.player.hasPower("NightmarePower")) {
//            sb.setColor(Color.WHITE);
//            sb.draw(Load.bg2.getTexture(), Load.bg2.offsetX * Settings.scale, Load.bg2.offsetY * Settings.scale + AbstractDungeon.sceneOffsetY, 0.0F, 0.0F, (float) Load.bg2.packedWidth, (float) Load.bg2.packedHeight, Settings.scale, Settings.scale, 0.0F, Load.bg2.getRegionX(), Load.bg2.getRegionY(), Load.bg2.getRegionWidth(), Load.bg2.getRegionHeight(), false, false);
//            return SpireReturn.Return((Object) null);
//        } else if (AbstractDungeon.player.hasPower("ForestPower")) {
//            sb.setColor(Color.WHITE);
//            sb.draw(Load.bg3.getTexture(), Load.bg3.offsetX * Settings.scale, Load.bg3.offsetY * Settings.scale + AbstractDungeon.sceneOffsetY, 0.0F, 0.0F, (float) Load.bg3.packedWidth, (float) Load.bg3.packedHeight, Settings.scale, Settings.scale, 0.0F, Load.bg3.getRegionX(), Load.bg3.getRegionY(), Load.bg3.getRegionWidth(), Load.bg3.getRegionHeight(), false, false);
//            return SpireReturn.Return((Object) null);
//        } else if (AbstractDungeon.player.hasPower("DarkSidePower")) {
//            sb.setColor(Color.WHITE);
//            sb.draw(Load.bg4.getTexture(), Load.bg4.offsetX * Settings.scale, Load.bg4.offsetY * Settings.scale + AbstractDungeon.sceneOffsetY, 0.0F, 0.0F, (float) Load.bg4.packedWidth, (float) Load.bg4.packedHeight, Settings.scale, Settings.scale, 0.0F, Load.bg4.getRegionX(), Load.bg4.getRegionY(), Load.bg4.getRegionWidth(), Load.bg4.getRegionHeight(), false, false);
//            return SpireReturn.Return((Object) null);
//        } else if (AbstractDungeon.player.hasPower("ValleyPower")) {
//            sb.setColor(Color.WHITE);
//            sb.draw(Load.bg5.getTexture(), Load.bg5.offsetX * Settings.scale, Load.bg5.offsetY * Settings.scale + AbstractDungeon.sceneOffsetY, 0.0F, 0.0F, (float) Load.bg5.packedWidth, (float) Load.bg5.packedHeight, Settings.scale, Settings.scale, 0.0F, Load.bg5.getRegionX(), Load.bg5.getRegionY(), Load.bg5.getRegionWidth(), Load.bg5.getRegionHeight(), false, false);
//            return SpireReturn.Return((Object) null);
//        } else {
//            return SpireReturn.Continue();
//        }
        if (AbstractDungeon.player.hasPower(StrengthPower.POWER_ID)) {
            sb.setColor(Color.WHITE);
            sb.draw(Load.bg5.getTexture(), Load.bg5.offsetX * Settings.scale, Load.bg5.offsetY * Settings.scale + AbstractDungeon.sceneOffsetY, 0.0F, 0.0F, (float) Load.bg5.packedWidth, (float) Load.bg5.packedHeight, Settings.scale, Settings.scale, 0.0F, Load.bg5.getRegionX(), Load.bg5.getRegionY(), Load.bg5.getRegionWidth(), Load.bg5.getRegionHeight(), false, false);
            System.out.println("进来的次数:" + a + "   " + StrengthPower.POWER_ID);
            return SpireReturn.Return( null);
        } else {
            System.out.println("进来的次数:" + a);
            return SpireReturn.Continue();
        }
    }
}
*/
