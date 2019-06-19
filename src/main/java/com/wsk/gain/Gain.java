package com.wsk.gain;

import basemod.BaseMod;
import basemod.interfaces.*;
import com.evacipated.cardcrawl.modthespire.lib.SpireInitializer;

import static basemod.DevConsole.logger;

/**
 * @author wsk1103
 * @date 2019/3/8
 * @description 启动程序
 */
@SpireInitializer
public class Gain implements PostInitializeSubscriber,
        EditCharactersSubscriber, EditCardsSubscriber,
        EditRelicsSubscriber, EditStringsSubscriber,
        EditKeywordsSubscriber {
    public Gain() {
        BaseMod.subscribe(this);
    }

    public static void initialize() {
        logger.info("=========================初始化角色Mod数据=========================");
        new Gain();
        logger.info("===========================角色Mod初始化成功===========================");
    }

    @Override
    public void receiveEditCards() {

    }

    @Override
    public void receiveEditCharacters() {

    }

    @Override
    public void receiveEditKeywords() {

    }

    @Override
    public void receiveEditRelics() {

    }

    @Override
    public void receiveEditStrings() {

    }

    @Override
    public void receivePostInitialize() {

    }
}
