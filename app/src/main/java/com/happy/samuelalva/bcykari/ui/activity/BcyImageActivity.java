/*
 * Copyright 2015 SamuelGjk <samuel.alva@outlook.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.happy.samuelalva.bcykari.ui.activity;

import com.happy.samuelalva.bcykari.support.adapter.ImagePagerAdapter;
import com.happy.samuelalva.bcykari.ui.activity.base.BaseImageActivity;

/**
 * Created by Samuel.Alva on 2015/6/15.
 */
public class BcyImageActivity extends BaseImageActivity {
    @Override
    protected ImagePagerAdapter getAdapter() {
        for (int i = 0; i < urls.size(); i++) {
            urls.set(i, urls.get(i).replace("/2X3", ""));
        }
        return new ImagePagerAdapter(this, urls, null);
    }
}
