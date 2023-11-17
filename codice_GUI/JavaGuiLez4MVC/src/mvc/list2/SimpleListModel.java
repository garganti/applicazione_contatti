package mvc.list2;

import java.util.*;
import javax.swing.*;
import javax.swing.event.*;

class SimpleListModel<T> implements ListModel<T> {
    private ArrayList<ListDataListener> listenerList = new ArrayList<ListDataListener>();
    private ArrayList<T> dataList = new ArrayList<T>();

    public void addListDataListener(ListDataListener l) {
        listenerList.add(l);
    }

    public void removeListDataListener(ListDataListener l) {
        listenerList.remove(l);
    }

    public int getSize() {
        return dataList.size();
    }

    public T getElementAt(int index) {
        int size = dataList.size();
        if (size > 0 && index > -1 && index < size)
            return dataList.get(index);
        else
            return null;
    }

    public void add(T data) {
        int oldLastIndex = dataList.size() - 1;

        dataList.add(data);
        fireIntervalAddedEvent(oldLastIndex + 1, oldLastIndex + 1);
    }

    public boolean remove(T data) {
        int oldItemIndex = dataList.indexOf(data);

        if (oldItemIndex != -1 && dataList.remove(data)) {
            fireIntervalRemovedEvent(oldItemIndex, oldItemIndex);
            return true;
        }
        return false;
    }

    public void update(T data) {
        int itemIndex = dataList.indexOf(data);

        if (itemIndex != -1) //if object exists
            fireContentsChangedEvent(itemIndex, itemIndex);
    }

    private void fireContentsChangedEvent(int index0, int index1) {
        ListDataEvent lde = new ListDataEvent(
            this,
            ListDataEvent.CONTENTS_CHANGED,
            index0,
            index1
        );
        for (ListDataListener listener : listenerList)
            listener.contentsChanged(lde);
    }

    private void fireIntervalAddedEvent(int index0, int index1) {
        ListDataEvent lde = new ListDataEvent(
            this,
            ListDataEvent.INTERVAL_ADDED,
            index0,
            index1
        );
        for (ListDataListener listener : listenerList)
            listener.intervalAdded(lde);
    }

    private void fireIntervalRemovedEvent(int index0, int index1) {
        ListDataEvent lde = new ListDataEvent(
            this,
            ListDataEvent.INTERVAL_REMOVED,
            index0,
            index1
        );
        for (ListDataListener listener : listenerList)
            listener.intervalRemoved(lde);
    }
}
