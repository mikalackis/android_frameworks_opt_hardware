/*
 * Copyright (C) 2015 The CyanogenMod Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ariel.hardware;

import android.os.FileUtils;
import android.util.Slog;

import java.io.File;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.MessageDigest;

import com.android.server.am.BatteryStatsService;

/**
 * Support for storage of key-value pairs which persists across device wipes /
 * factory resets. This is used for various security related features. A
 * reasonable implementation of this needs to store items on a partition which
 * is unaffected by factory reset. The actual format of the storage is left up
 * to the implementation. The implementation in this file is suitable for
 * devices which have a /persist partition (recent QCOM devices fit this
 * criteria).
 */
public class DeviceBattery {

    private static final String TAG = "DeviceBattery";

    private static final boolean DEBUG = false;

    private static IBatteryStats mBatteryStats;

    public long getRemainingBatteryTime(){
        return -99;
    }

    public static long getChargeRemainingTime(){ return -99; }

    public static boolean isCharging(){ return false; }

    public static long getScreenOnTime() { return -99; }

}
