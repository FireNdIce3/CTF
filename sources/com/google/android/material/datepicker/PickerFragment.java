package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

abstract class PickerFragment<S> extends Fragment {
    protected final LinkedHashSet<OnSelectionChangedListener<S>> onSelectionChangedListeners = new LinkedHashSet<>();

    /* access modifiers changed from: package-private */
    public abstract DateSelector<S> getDateSelector();

    PickerFragment() {
    }

    /* access modifiers changed from: package-private */
    public boolean addOnSelectionChangedListener(OnSelectionChangedListener<S> listener) {
        return this.onSelectionChangedListeners.add(listener);
    }

    /* access modifiers changed from: package-private */
    public boolean removeOnSelectionChangedListener(OnSelectionChangedListener<S> listener) {
        return this.onSelectionChangedListeners.remove(listener);
    }

    /* access modifiers changed from: package-private */
    public void clearOnSelectionChangedListeners() {
        this.onSelectionChangedListeners.clear();
    }
}
