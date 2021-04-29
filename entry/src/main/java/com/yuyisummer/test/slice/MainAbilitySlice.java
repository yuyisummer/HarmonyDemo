package com.yuyisummer.test.slice;

import com.yuyisummer.test.ResourceTable;
import com.yuyisummer.test.utils.LOG;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;

public class MainAbilitySlice extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main);

        LOG.logI("Slice start");

    }

    @Override
    public void onActive() {
        super.onActive();

        LOG.logI("Slice onActive");

    }

    @Override
    public void onForeground(Intent intent) {

        super.onForeground(intent);

        LOG.logI("Slice onForeground");

    }
}
