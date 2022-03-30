package com.smktelkom.fragmrnt;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PageViewModel extends ViewModel {
    private MutableLiveData<String> mName = new MutableLiveData<>();

    public void setmName (String name) {
        mName.setValue(name);
    }
    public LiveData<String> getName() {
        return mName;
    }
}
