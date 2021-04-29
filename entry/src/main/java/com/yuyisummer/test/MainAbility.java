package com.yuyisummer.test;

import com.yuyisummer.test.slice.MainAbilitySlice;
import com.yuyisummer.test.utils.LOG;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;
import ohos.hiviewdfx.HiLog;
import ohos.hiviewdfx.HiLogLabel;

public class MainAbility extends Ability {
    private static final HiLogLabel LABEL_LOG = new HiLogLabel(0, 0, "MainAbility.class");

    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(MainAbilitySlice.class.getName());

        LOG.logI(">>第一个APK开始工作啦");
        LOG.logE(">>打印一个异常");
        LOG.logD(">>调试一个异常");

    }

    @Override
    protected void onActive() {
        super.onActive();
        LOG.logI(">>应用活跃中");
    }

    @Override
    protected void onStop() {
        super.onStop();

        HiLog.info(LABEL_LOG,">>onStop yujiahui");

        LOG.logI(">>第一个APK停止啦");
    }


}
