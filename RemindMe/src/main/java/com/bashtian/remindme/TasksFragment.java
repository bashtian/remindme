/*
 * Copyright 2013 Google Inc.
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

package com.bashtian.remindme;

import android.app.ListFragment;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.bashtian.remindme.util.Static;

public class TasksFragment extends ListFragment {


    public TasksFragment() {
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        getListView().setDivider(null);
        getListView().setPadding(16,16,16,16);
    }

    @Override
    public void onResume() {
        super.onResume();

        setListAdapter(new ArrayAdapter<String>(getActivity(),
                R.layout.item,
                android.R.id.text1,
                Static.tasks));
    }
}
